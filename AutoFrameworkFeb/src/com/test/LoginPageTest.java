package com.test;

import static org.testng.AssertJUnit.assertTrue;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.LoginPage;
import com.util.ExcelUtils;

public class LoginPageTest extends BaseTest {

	
	LoginPage _lp;
	
	
	@BeforeTest
	public void createObj()
	{
		_lp = new LoginPage(driver);
		
	}
	
	@DataProvider(name="user-data")
	public Object[][] getUsers()
	{
		Object[][] data = excelUtils.getData();
		return data;
	}
	
	@Test(dataProvider="user-data")
	public void testLogin(String username,String passwd)
	{
		boolean isLoggedIn = _lp.performLogin(username, passwd);
		assertTrue(isLoggedIn);
	}
}
