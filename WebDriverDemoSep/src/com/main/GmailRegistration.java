package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.WebdriverUtil;

public class GmailRegistration {
	
	WebdriverUtil util;
	WebDriver driver;
	
	public GmailRegistration(WebDriver driver) {
		this.driver = driver;
		util = new WebdriverUtil(driver);
	}
	

	public String validateForm(){
		
		String errorMessage = null;
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		
		//WebdriverUtil util =  new WebdriverUtil(driver);
		util.implicitWait();
		
		WebElement firstName =   driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Bharti");
		
		util.implicitWait();
		WebElement lastName = driver.findElement(By.name("LastName"));
		
		lastName.sendKeys("Sinha");
		
		WebElement userName = driver.findElement(By.xpath(".//*[@id='GmailAddress']"));
		
		userName.sendKeys("bhartisinha0987");
		
		
		driver.findElement(By.id("submitbutton")).click();
		
		
		WebElement error = driver.findElement(By.xpath(".//*[@id='errormsg_0_Passwd']"));
		
		errorMessage = error.getText();
		driver.quit();
		
		return errorMessage;
		
		//driver.close();
		
		
		
		
	}
	
	
	public void checkPage()
	{
		util.implicitWait();
	}
}
