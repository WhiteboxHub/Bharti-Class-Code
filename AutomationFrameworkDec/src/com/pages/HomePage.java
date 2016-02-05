package com.pages;

import java.util.List;






import org.junit.AfterClass;
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
	
	/*public void openPage()
	{
		driver.get("http://whiteboxqa.com/");
	}*/
	
	
	public int countSocialIcons()
	{
		int count = 0;
		driver.maximize();
		List<WebElement> elements = driver.findElements(By.cssSelector(Locators.loc.get("header-social-icons")));
		
		if(!elements.isEmpty())
		{
		 count = elements.size();
		}
		
		
		return count;
	}
	
	public String clickLogin()
	{
		String url = null;
		driver.maximize();
		driver.findElement(By.cssSelector(Locators.loc.get("header-login-link"))).click();
		
		url = driver.getCurrentUrl();
		
		return url;
		
		
	}
	
	@AfterClass
	public void quit()
	{
		driver.quit();
	}
	
}
