package com.mavenproject.org.ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemaouatNextpage {

WebDriver driver;
	
	By locator_sign=By.linkText("sign-in");
	By locator_username=By.name("userName");
	By locator_pass=By.name("password");
	By locator_submit=By.name("login");
	
	public DemaouatNextpage(WebDriver driver3) {
		driver=driver3;
		
	}
	public void signinMethod() 
	{
			/*Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");//hard assert=title does not match then stop execution
		
			SoftAssert soft=new SoftAssert();
			soft.assertEquals(driver.getTitle(), "Register: Mercury Tours");//soft-assert=if title does not match it will check the code 
			line-by-line and at the end of the program or code will executed*/
				
			WebElement sign=driver.findElement(locator_sign);
			sign.click();
				
			WebElement useremail=driver.findElement(locator_username);
			useremail.sendKeys("jacks@gmail.com");
				
			WebElement passuser=driver.findElement(locator_pass);
			passuser.sendKeys("password123");
				
			WebElement submitbtn=driver.findElement(locator_submit);
			submitbtn.click();
			//soft.assertAll();
		
	}
}
