package com.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.util.Configuration;
import com.util.ExcelUtils;
import com.util.Locators;
import com.util.PageDriver;

public abstract class BaseTest {

	public PageDriver driver;
	public ExcelUtils excelUtils;
	public static final Configuration _config;
	
	static
	{
		_config = new Configuration();
		
	}
	
	@BeforeSuite
	public void setup()
	{
		driver = new PageDriver(_config);
		Locators.loadLocators();
		excelUtils = new ExcelUtils();
		
	}
	
	@AfterSuite
	public void clear()
	{
		driver.quit();
	}
}
