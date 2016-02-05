package com.pages;

import org.openqa.selenium.By;

import com.base.BasePage;
import com.util.Locators;
import com.util.PageDriver;

public class LoginPage extends BasePage{
	
	public LoginPage(PageDriver driver)
	{
		super(driver);
		driver.findElement(By.cssSelector(Locators.loc.get("header-login-link"))).click();
	}
	
	
	public String invalidLogin(String uName,String pwd)
	{
		String error = null;
		driver.maximize();
		driver.findElement(By.cssSelector(Locators.loc.get("login-username"))).sendKeys(uName);
		driver.findElement(By.cssSelector(Locators.loc.get("login-password"))).sendKeys(pwd);
		driver.findElement(By.cssSelector(Locators.loc.get("login-submit"))).click();
		
		error = driver.findElement(By.cssSelector("login-eror")).getText();
		return error;
	}

}
