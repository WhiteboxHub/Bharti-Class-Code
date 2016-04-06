package com.pages;

import org.openqa.selenium.WebElement;

import com.base.BasePage;
import com.util.PageDriver;

public class LoginPage extends BasePage{

	
	public LoginPage(PageDriver driver)
	{
		super(driver);
		
		
	}
	
	
	public boolean performLogin(String username,String passwd)
	{
		driver.findElement("xpath-loginLink").click();
		WebElement uName  =  driver.findElement("name-username");
		WebElement pwd = driver.findElement("css-password");
		
		
		uName.clear();
		pwd.clear();
		
		uName.sendKeys(username);
		pwd.sendKeys(passwd);
		
		driver.findElement("id-loginBtn");
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		return driver.findElement("link-logout").isDisplayed();
	}
	

}
