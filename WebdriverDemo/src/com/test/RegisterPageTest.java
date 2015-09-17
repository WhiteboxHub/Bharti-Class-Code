package com.test;

import static org.testng.AssertJUnit.assertEquals;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.RegisterPage;

public class RegisterPageTest {
	WebDriver driver;
	RegisterPage page;
	
	@BeforeClass
	public void init()
	{
		driver = new FirefoxDriver();
		page = new RegisterPage(driver);
	}

	@Test
	public void testValidateRegistration()
	{
		WebElement testElement = page.validateRegistration();
		String actual = testElement.getText();
		String expected = "You can't leave this empty.";
		assertEquals(expected,actual);
	}
	
	@AfterClass
	public void exit()
	{
		page = null;
		if(driver != null)
		{
			driver.quit();
		}
	}
}
