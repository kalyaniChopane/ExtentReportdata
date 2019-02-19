package com.mavenproject.org.ExtentReport;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportDemaout {
		WebDriver driver;
		ExtentReports extent;
		ExtentTest test;
	  @Test
	  public void signinMethod() throws IOException 
	  {
		  Utilitycommon utility=new Utilitycommon(driver);
		  try 
		  {
			  UpdateDemaouat update=new UpdateDemaouat(driver);
			  update.registerdemouatMethod();
			  test.pass("Update Demouat site");
		  } 
		  catch (Exception e) {
			test.fail("error in upadtesite").addScreenCaptureFromPath(utility.screenshot("problem1"));
		  }
		  
		  try 
		  {
			  DemaouatNextpage nxtpage=new DemaouatNextpage(driver);
			  nxtpage.signinMethod();
			  test.pass("go to next page");
		  } 
		  catch (Exception e) 
		  {
			  test.fail("error in next page").addScreenCaptureFromPath(utility.screenshot("media"));
		  }
		  
		  try 
		  {
			  TourDetailsdemouat tour=new TourDetailsdemouat(driver);
			  tour.tourdetailsMethod();
			  test.pass("Details of tour");
		  } 
		  catch (Exception e) 
		  {
			test.fail("fail to show details").addScreenCaptureFromPath(utility.screenshot("problem2"));
		  }
	  }
	  @Parameters("browser")
	  @BeforeTest
	  public void setupMethod(String value) 
	  {
		  ExtentHtmlReporter extendreport=new ExtentHtmlReporter("resource/extentreport.html");
		  extendreport.config().setTheme(Theme.DARK);
		  extendreport.config().setChartVisibilityOnOpen(true);
		  extendreport.setAppendExisting(true);
		  
		   extent = new ExtentReports();
		   extent.attachReporter(extendreport);
		   test=extent.createTest("kalyaniReport");
		   test.pass("Started My Test");
		  
		  String bro=value;
		  
		  if (bro.equalsIgnoreCase("chrome")) 
		  {
			System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
			driver=new ChromeDriver();
			test.info("chrome started");
		  }
		  else if (bro.equalsIgnoreCase("firefox")) 
		  {
			System.setProperty("webdriver.gecko.driver", "resource/geckodriver.exe");
			driver=new FirefoxDriver();
			test.info("firefox stated");
		  }
		  else if (bro.equalsIgnoreCase("ie")) 
		  {
			System.setProperty("webdriver.ie.driver", "resource/IDEriverServer.exe");
			driver=new InternetExplorerDriver();
			test.info("internet explore started");
		  }
		  else 
		  {
			System.out.println("No such Browser");
			test.info("No such Browser");
			
		  }
		  test.info("maximized browser");
		  driver.manage().window().maximize();
		  driver.get("http://newtours.demoaut.com/mercuryregister.php");
	  }

	  @AfterTest
	  public void quitMethod() 
	  {
		  extent.flush();
		  driver.quit();
	  }

	}


