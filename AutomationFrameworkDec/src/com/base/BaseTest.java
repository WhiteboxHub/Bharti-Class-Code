package com.base;


import org.testng.annotations.BeforeSuite;

import com.util.Configuration;
import com.util.Locators;
import com.util.PageDriver;

public abstract class BaseTest {

	public static final Configuration _config;
	
	static
	{
		_config = new Configuration();
	}
	
	public PageDriver driver;
	
	
	
	@BeforeSuite
	public void setUp()
	{
		driver = new PageDriver(_config);
	    Locators.getElements();
	}
	
	
}
