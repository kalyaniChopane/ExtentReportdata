package com.mavenproject.org.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TourDetailsdemouat {
	
	WebDriver driver;
	
	@FindBy(name="tripType")
	WebElement locator_onewaytrip;
	
	@FindBy(name="passCount")
	WebElement locator_passengerdrop;
	
	@FindBy(name="fromPort")
	WebElement locator_deparrtment;
	
	@FindBy(name="fromMonth")
	WebElement locator_monthOn;
	
	@FindBy(name="toPort")
	WebElement locator_arrivetime;
	
	@FindBy(name="toMonth")
	WebElement locator_tomonth;
	
	@FindBy(name="servClass")
	WebElement locator_businessclass;
	
	@FindBy(name="airline")
	WebElement locator_airline;
	
	@FindBy(name="findFlights")
	WebElement locator_findflight;
	
	public TourDetailsdemouat(WebDriver driver4) 
	{
		
	driver=driver4;
	PageFactory.initElements(driver, this);
	
	}
	public void tourdetailsMethod() 
	{
		locator_onewaytrip.click();
		
		Select passenger=new Select(locator_passengerdrop);
		passenger.selectByValue("3");
		
		Select departtime=new Select(locator_deparrtment);
		departtime.selectByVisibleText("Portland");
		
		Select monthon=new Select(locator_monthOn);
		monthon.selectByVisibleText("February");;
		
		Select arrive=new Select(locator_arrivetime);
		arrive.selectByVisibleText("Frankfurt");
		
		Select returing=new Select(locator_tomonth);
		returing.selectByVisibleText("March");
		
		locator_businessclass.click();
		
		Select airline=new Select(locator_airline);
		
		airline.selectByVisibleText("Unified Airlines");
	
		locator_findflight.click();
	}
}


