package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_PF {
	
	WebDriver driver;
	
	@FindBy(how=How.ID,using="username")
	WebElement username;
	@FindBy(how=How.ID,using="password")
	WebElement pswd;
	@FindBy(how=How.ID,using="login")
	WebElement loginBtn;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver = driver;
	}

	
	public void performLogin(String userName,String pwd)
	{
		username.sendKeys(userName);
		pswd.sendKeys(pwd);
		loginBtn.click();
	}
}
