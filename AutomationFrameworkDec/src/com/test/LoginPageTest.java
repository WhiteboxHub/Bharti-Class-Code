package com.test;

import org.junit.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import com.base.BaseTest;
import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	LoginPage lp;
	
	@BeforeClass
	public void initialize()
	{
		lp = new LoginPage(driver);
	}
	
	
	@DataProvider(name="user-data")
	public Object[][] getUserData()
	{
		Object[][] data = {{"geeta","geeta"},{"nilam","nilam"}};
		
		return data;
	}
	
	@Test(dataProvider="user-data")
	public void testInvalidLogin(String userName,String pwd)
	{
		String actString = lp.invalidLogin(userName,pwd);
		assertEquals("Something went wrong...Please try again.",actString);
		
	}
	
	@AfterClass
	public void quit()
	{
		driver.quit();
	}
	

}
