package com.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PageDriver {
	
	private WebDriver driver;
	Configuration _config;
	
	public PageDriver(Configuration _config) {
		this._config = _config;
		start();
	}
	
	private void start()
	{
		String browser =  _config.BROWSER;
		switch(browser)
		{
		case "firefox":
			driver = startFirefox();
			break;
		case "chrome":
			driver = startChrome();
			break;
		case "ie":
			driver = startIE();
			break;
		 default:
			driver = startHtmlUnit();
			break;
		}
		
		driver.get(_config.URL);
	}
	
	private WebDriver startFirefox()
	{
		return new FirefoxDriver();
	}
	
	private WebDriver startChrome()
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		return new ChromeDriver();
	}
	private WebDriver startIE()
	{
		System.setProperty("webdriver.ie.driver", "lib/IEServerDriver.exe");
		return new InternetExplorerDriver();
	}
	private WebDriver startHtmlUnit()
	{
		return new HtmlUnitDriver();
	}
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public WebElement findElement(String locator)
	{
		WebElement elem = driver.findElement(Locators.get(locator));
		return elem;
	}
	
	//testNG-xml,dataprovider
	public List<WebElement> findElements(String locator)
	{
		List<WebElement> list = driver.findElements(Locators.get(locator));
		
		return list;
	}

	public void quit()
	{
		driver.quit();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
}
