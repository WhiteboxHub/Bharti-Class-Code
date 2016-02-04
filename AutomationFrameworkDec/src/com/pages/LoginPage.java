package com.pages;

import org.openqa.selenium.By;

import com.base.BasePage;
import com.util.PageDriver;

public class LoginPage extends BasePage{
	
	public LoginPage(PageDriver driver)
	{
		super(driver);
		HomePage hp = new HomePage(driver);
		hp.clickLogin();
	}
	
	
	public String invalidLogin(String uName,String pwd)
	{
		String error = null;
		driver.maximize();
		driver.findElement(By.cssSelector("#username")).sendKeys(uName);
		driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#login")).click();
		
		error = driver.findElement(By.cssSelector(".text-danger")).getText();
		return error;
	}

}
