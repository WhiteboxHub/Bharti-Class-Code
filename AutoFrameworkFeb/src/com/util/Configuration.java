package com.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;


public class Configuration {
	
	public String URL;
	public String BROWSER;
	
	public Configuration() {
	loadProperties();
	}
	
	public void loadProperties()
	{
		FileReader reader;
		Properties prop = new Properties();
		try {
			reader = new FileReader("config.properties");
		    prop.load(reader);
		    
		    URL = prop.getProperty("url");
		    BROWSER = prop.getProperty("browser");
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
