package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import com.base.BaseTest;
import com.pages.HomePage;

public class HomePageTest extends BaseTest{
	
	
	HomePage _hp;
	
	@BeforeClass
	public void createObj()
	{
		_hp = new HomePage(driver);
	}
	
	
	@Test
	public void testLogo()
	{
		assertTrue(_hp.isLogoAvailable());
	}
	
	@Test
	public void testNavBar()
	{
		int actual  = _hp.getNavBar();
		assertEquals(actual,6);
	}
	
	@Test
	public void testLogin()
	{
		assertEquals(_hp.clickLogin(), "http://www.whiteboxqa.com/login.php");
	}

}
