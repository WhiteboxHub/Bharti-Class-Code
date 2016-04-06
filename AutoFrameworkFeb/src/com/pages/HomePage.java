package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BasePage;
import com.util.Locators;
import com.util.PageDriver;

public class HomePage extends BasePage{

	
	public HomePage(PageDriver driver)
	{
		super(driver);
	}
	
	
	public boolean isLogoAvailable()
	{
		boolean isPresent = false;
		WebElement elem = driver.findElement("id-logo");
		if(elem != null)
			isPresent = true;
		return isPresent;
	}
	
	 public int getNavBar()
	 {
		return driver.findElements("xpath-navBar").size();
	 }
	 
	  public String clickLogin()
	  {
		  driver.findElement("xpath-loginLink").click();
		  return driver.getCurrentUrl();
	  }
	
}
