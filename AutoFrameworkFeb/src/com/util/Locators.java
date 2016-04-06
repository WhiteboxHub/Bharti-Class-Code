package com.util;

import java.io.FileReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;

public class Locators {

	public static HashMap<String,String> _loc;
	public static void loadLocators()
	{
		_loc = new HashMap<String, String>();
		FileReader reader;
		Properties prop = new Properties();
		try {
			reader = new FileReader("locators.properties");
		    prop.load(reader);
		    
		  Enumeration<?> en = prop.propertyNames();
		  while(en.hasMoreElements())
		  {
			  String key = (String)en.nextElement();
			  String value = prop.getProperty(key);
			  _loc.put(key, value);
		  }
		    
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static By get(String key)
	{
       //id-logo
		//xpath-.//**
		//css-#hhhh
		if(key.contains("-"))
		{
			String[] vals = key.split("-");
			if(vals[0].equals("id"))
			{
				return By.id(_loc.get(key));
			}
			else if(vals[0].equals("name"))
			{
				return By.name(_loc.get(key));
			}
			else if(vals[0].equals("xpath"))
			{
				return By.xpath(_loc.get(key));
			}
			else if(vals[0].equals("class"))
			{
				return By.className(_loc.get(key));
			}
			else if(vals[0].equals("link"))
			{
				return By.linkText(_loc.get(key));
			}
			else if(vals[0].equals("partial"))
			{
				return By.partialLinkText(_loc.get(key));
			}
			else if(vals[0].equals("tag"))
			{
				return By.tagName(_loc.get(key));
			}
			else
			{
				return By.cssSelector(_loc.get(key));
			}
			
			

		}
		return By.cssSelector(_loc.get(key));
		
		
	}
	
	
}
