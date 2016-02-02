package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.LoginPage_PF;

public class LoginPage_PFTest {

	WebDriver driver;
	LoginPage_PF lp;
	
	
	
	@BeforeMethod
	public void initialize()
	{
		driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/login.php");
		
		lp = PageFactory.initElements(driver, LoginPage_PF.class);
		
		
	}
	
	@Test
	public void method1()
	{
		lp.performLogin("bahrti", "pwd");
		System.out.println("error");
	}
	
}
