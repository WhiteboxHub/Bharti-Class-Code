package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement validateRegistration()
	{
		driver.get("https://www.gmail.com/intl/en/mail/help/about.html");
		
		WebElement createAcctBtn = driver.findElement(By.id("gmail-create-account"));
		createAcctBtn.click();
		
		WebElement fName = driver.findElement(By.name("FirstName"));
		fName.sendKeys("bharti");
		
		WebElement lName = driver.findElement(By.name("LastName"));
		lName.sendKeys("sinha");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='GmailAddress']"));
		userName.sendKeys("bharti0687");
		
		WebElement pwd = driver.findElement(By.cssSelector("input[name='Passwd']"));
		pwd.sendKeys("bharti0687");
		
		WebElement cnfPwd = driver.findElement(By.cssSelector("input[name='PasswdAgain']"));
		pwd.sendKeys("bharti0687");
		
		WebElement nextBtn = driver.findElement(By.id("submitbutton"));
		nextBtn.click();
		
		WebElement errorMessage = driver.findElement(By.id("errormsg_0_BirthYear"));
		
		return errorMessage;
		
	}
}
