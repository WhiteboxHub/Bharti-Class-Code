package com.test;

import org.testng.annotations.BeforeClass;
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
	
	@Test
	public void testInvalidLogin()
	{
		String actString = lp.invalidLogin("asdasfda","adsasdasfs");
		assertEquals("Something went wrong...Please try again.",actString);
		
	}
	
	

}
