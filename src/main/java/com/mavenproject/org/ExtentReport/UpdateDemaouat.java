package com.mavenproject.org.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateDemaouat {
	
WebDriver driver;
	
	@FindBy(name="firstName")
	WebElement Firstname_locator;
	
	@FindBy(name="lastName")
	WebElement Lastname_locator;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phone_locator;
	
	@FindBy(css="input[name='userName']")
	WebElement email_locator;
	
	@FindBy(name="address1")
	WebElement address_locator;
	
	@FindBy(name="city")
	WebElement city_locator;
	
	@FindBy(css="input[name='state']")
	WebElement state_locator;
	
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement pincode_locator;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement username_locators;
	
	@FindBy(name="password")
	WebElement pass_locator;
	
	@FindBy(name="confirmPassword")
	WebElement confirm_locator;
	
	@FindBy(name="register")
	WebElement button_locator;
	public UpdateDemaouat(WebDriver driver1) 
	{
		driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public void registerdemouatMethod() 
	{
		Firstname_locator.sendKeys("jacks");
		
		Lastname_locator.sendKeys("steve");
		
		phone_locator.sendKeys("1234567890");
		
		email_locator.sendKeys("jacks@gmail.com");
		
		city_locator.sendKeys("amravati");
		
		address_locator.sendKeys("karve nagar");
		
		pincode_locator.sendKeys("765438");
		
		username_locators.sendKeys("jacks@gmail.com");
		
		pass_locator.sendKeys("password123");
		
		confirm_locator.sendKeys("password123");
		
		button_locator.click();
			
	}
}



