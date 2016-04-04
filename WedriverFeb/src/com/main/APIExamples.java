package com.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class APIExamples {

	static void driverAPIs() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com/");
		WebElement element = driver.findElement(By.linkText("Fashion"));
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
				
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='navigationFragment'/div/table/tbody/tr]"));
		
		for(WebElement elm : elements)
		{
			System.out.println("in loop");
		}
		driver.quit();
		driver.close();
	}
	
	
	static void webelementEx()
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com/");
		//implicit wait--2000ms
		WebElement element = driver.findElement(By.linkText("Fashion1"));
		System.out.println(element.getAttribute("href"));
		System.out.println(element.getCssValue("color"));
		System.out.println(element.getLocation());
		System.out.println(element.getText());
		
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		System.out.println(element.isSelected());
		
		element.submit();
		
	}
	
	static void navigateEx() throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.ebay.com/");
		//implicit wait--2000ms 
		WebElement element = driver.findElement(By.linkText("Fashion1"));
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		URL url = new URL("http://www.ebay.com/");
		driver.navigate().to(url);*/
	}
	
	static void waitEx()
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().setScriptTimeout(1000,TimeUnit.MILLISECONDS);
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.linkText("Fashion")));
		
		//fluent Wait
		Wait w = new FluentWait(driver)
		         .withTimeout(30,TimeUnit.MILLISECONDS)
		         .pollingEvery(5, TimeUnit.MILLISECONDS)
		         .ignoring(NoSuchElementException.class);
		
		
		
		WebElement elem = (WebElement) w.until(new Function()
									{
									@Override
									public WebElement apply(Object paramF) {
										
										WebDriver driver = (WebDriver)paramF;
										return driver.findElement(By.linkText("Fashion"));
									}
									});
		
		
		
		
		
		
	}
	
	static void windowEx()
	{
		
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com/");
		/*driver.manage().window().maximize();
		driver.manage().window().fullscreen();*/
		
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim.getHeight() + dim.getWidth());
		
		Point p  = driver.manage().window().getPosition();
		System.out.println(p.getX() + p.getY());
		
		Dimension dim1 = new Dimension(400,600);
		driver.manage().window().setSize(dim1);
		
		Point p1 = new Point(300,900);
		driver.manage().window().setPosition(p1);
		
		
	}
	
	
	static void windowHandleEx()
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pinterest.com/");
		String child  = driver.getWindowHandle();
		driver.switchTo().window(child);
		driver.findElement(By.id("userEmail")).sendKeys("asdasdas");
		
		Set<String> childSet =  driver.getWindowHandles();
		for(String s : childSet)
		{
			driver.switchTo().window(s);
		}
	}
	
	static void alertEx() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Sampath/Desktop/alert.html");
		
		driver.findElement(By.id("myId")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("bharti");
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();
		//alert.dismiss();
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		//APIExamples.driverAPIs();
		//APIExamples.webelementEx();
		//APIExamples.navigateEx();
		//APIExamples.windowEx();
	     //APIExamples.windowHandleEx();
		APIExamples.alertEx();
		/*System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");*/
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		//WebElement element = driver.findElement(By.id("FirstName"));
	//	element.click();
		
		/*WebElement uname = driver.findElement(By.name("FirstName"));
		WebElement lname = driver.findElement(By.cssSelector("#LastName"));
		
		
		uname.clear();
		lname.clear();
		
		uname.sendKeys("bharti@gmail.com");
		lname.sendKeys("test123");
		
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id='submitbutton']"));
		loginBtn.click();*/
		
		
		
		
		
	}
}
