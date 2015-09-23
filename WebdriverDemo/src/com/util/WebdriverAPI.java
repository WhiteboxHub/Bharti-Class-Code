package com.util;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverAPI {

	//example of navtgation interface

	static void navidateEx()
	{
		WebDriver driver = new FirefoxDriver();
		Navigation navigate = driver.navigate();
		navigate.to("http://www.ebay.com/");
		driver.findElement(By.linkText("Motors")).click();
		navigate.back();
		navigate.forward();
		navigate.refresh();
	}
	
	static void timeout()
	{
		WebDriver driver = new FirefoxDriver();
		Navigation navigate = driver.navigate();
		navigate.to("http://www.ebay.com/");
		long startTime = System.currentTimeMillis();
	   // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = driver.findElement(By.linkText("Fashion")); 
		wait.until(ExpectedConditions.textToBePresentInElementValue(element, "Fashion"));
	
		
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println(timeElapsed);
		element.click();
	}
	
	static void windows()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.pinterest.com/");
		Iterator<String> windows = driver.getWindowHandles().iterator();
		while(windows.hasNext())
		{
			String child = windows.next();
			driver.switchTo().window(child);
		}
	/*	Window window = driver.manage().window();
		window.maximize();
		System.out.println("the size of window is : " + window.getSize() + " the postion is : " + window.getPosition());
		Dimension paramDimension = new Dimension(300, 300);
		window.setSize(paramDimension);
		Point paramPoint = new Point(100, 100);
		window.setPosition(paramPoint);
		System.out.println("the size of window is : " + window.getSize() + " the postion is : " + window.getPosition());*/
		
	}
	public static void main(String[] args) {
		
		windows();
		//timeout();
		//navidateEx();
	//	System.out.println("the url of page is " + driver.getCurrentUrl());
		//System.out.println("the page source of the website is : " + driver.getPageSource());
		//System.out.println("The title of page is : " + driver.getTitle());
		
		/*List<WebElement> elements = driver.findElements(By.cssSelector("#mainMenu li a"));
		System.out.println("the elemnt size : " + elements.size());
		for(WebElement element : elements)
		{
			System.out.println("the attribute values are : " + element.getAttribute("href"));
			System.out.println("the text on the element : " + element.getText());
			System.out.println("the size of the element : " + element.getSize());
			System.out.println("the location of an element is : " + element.getLocation());
			System.out.println("the css value of an element is : " + element.getCssValue("color"));
			System.out.println("the tag name of an element is : " + element.getTagName());
			
		} */
		
		
	}
	
}
