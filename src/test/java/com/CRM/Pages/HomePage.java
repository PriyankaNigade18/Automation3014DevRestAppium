package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	// encapsulation=private data+public method

	private WebDriver driver;

	// initialize driver

	public HomePage(WebDriver driver)//base class driver
	{
		this.driver=driver;
	}

	// data member(locator)

	private By link = By.linkText("Sign In");

//method(functionality to test)

	public String getAppUrl() 
	{
		return driver.getCurrentUrl();
	}
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getStatusOfLink()
	{
		driver.findElement(link).click();
		return driver.getCurrentUrl();
	}

}
