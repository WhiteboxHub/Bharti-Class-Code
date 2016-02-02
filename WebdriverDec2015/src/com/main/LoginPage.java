package com.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class LoginPage {

	public static void driverAPISample()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
		List<WebElement> elements = driver.findElements(By.xpath("html/body/header/div[1]/div/ul/li/a"));
		
		for(WebElement e : elements)
		{
			e.click();
		}
		
		System.out.println(elements.size());
		
		System.out.println("the url is" + driver.getCurrentUrl());
		System.out.println("the source" + driver.getPageSource());
		System.out.println("the page title  "+ driver.getTitle());
		
	}
	
	
	public static void elementsSample()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/login.php");
		WebElement uname = driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys("asdasdfasf");
		System.out.println(uname.getAttribute("class") + " lovation is " + uname.getLocation()
		+ " size is " + uname.getSize() + "tag  name is " + uname.getTagName());
		
		
		/*if(uname.isDisplayed())
			uname.isEnabled();*/
		
		
		
		//uname.
		//driver.findElement(By.id("password")).sendKeys("asdasdfasf");
		System.out.println(driver.findElement(By.id("login")).getCssValue("padding"));
		
		
	}
	
	
	public static void performLogin()
	{
		//opening a browser
		WebDriver driver = new FirefoxDriver();
		
		//get the website--whiteboxqa
		driver.get("https://www.facebook.com/");
		
		//click on login link
		
		WebElement email = driver.findElement(By.id("email"));
		
		//enter email/pwd
		email.sendKeys("bharti@whitebox-learning.com");
		
		
		//
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("bharti");
		WebElement loginBtn = driver.findElement(By.id("u_0_n"));
		loginBtn.click();
		driver.findElement(By.xpath(".//*[@id='u_0_1']"));
		By.cssSelector("#u_0_1");
		driver.quit();
		
	}
	
	
	public static void navigateSample()
	{
	   
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://whiteboxqa.com");
		/*try {
			driver.navigate().to(new URL("http://whiteboxqa.com"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		WebElement element = driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[3]/a"));
		element.click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	}
	
	static void waitEx()
	{
		//opening a browser
				WebDriver driver = new FirefoxDriver();
				
				//get the website--whiteboxqa
				driver.get("http://whiteboxqa.com");
				//implicit wait
			//	driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
				//explicit wait
				WebDriverWait  wait = new WebDriverWait(driver, 10);
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='navbar-collapse']/ul/li[3]/a")));
				
				
				//fluent wait
				Wait w = new FluentWait(driver)
				.withTimeout(100,TimeUnit.SECONDS)
				.pollingEvery(10,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
				
				WebElement foo = (WebElement) w.until(new Function() {
					 public WebElement apply(WebDriver driver) {
					       return driver.findElement(By.id("foo"));
					     }

					@Override
					public Object apply(Object paramF) {
						// TODO Auto-generated method stub
						return null;
					}
				});
				//WebElement element = driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[3]/a"));
				element.click();
	}
	
	public static void main(String[] args) {
		
		//LoginPage.performLogin();
		//LoginPage.driverAPISample();
		//LoginPage.elementsSample();
		//LoginPage.navigateSample();
		LoginPage.waitEx();
	}
}
