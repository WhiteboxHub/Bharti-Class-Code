package com.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class APIExamples {
	
	static void windowEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
		driver.manage().window().maximize();
		System.out.println("position is " + driver.manage().window().getPosition()
				 + "size is " + driver.manage().window().getSize());
	    Point pt = new Point(300, 500);
		driver.manage().window().setPosition(pt);
		Dimension dim = new Dimension(40,40);
		driver.manage().window().setSize(dim);
	}
	
	
	static void alertEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Sampath/Desktop/prompsEx.html");
		
		
		driver.findElement(By.id("myId")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("the text" + alert.getText());
		alert.sendKeys("Bharti");
		alert.accept();
		try {
			Thread.sleep(2000);
		
		driver.findElement(By.id("test")).click();
		Thread.sleep(2000);
		alert.dismiss();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void windowSwitchEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.pinterest.com/");
		
		String win = driver.getWindowHandle();
		
		
		driver.switchTo().window(win);
		
		driver.findElement(By.id("userEmail")).sendKeys("asfdsdfsdf");
		
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String> it = s.iterator();
		while(it.hasNext())
		{
			String child = it.next();
			driver.switchTo().window(child);
			driver.close();
		}
	}
	
	
	static void selectEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Sampath/Desktop/try.html");
		
		WebElement dd  = driver.findElement(By.name("Mobiles"));
		
		Select select = new Select(dd);	
		select.selectByValue("samsung");
		
	}
	
	static void cookiesEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
	   Set<Cookie> cookies = 	driver.manage().getCookies();
	   Iterator<Cookie> it = cookies.iterator();
	   while(it.hasNext())
	   {
		   Cookie cookie = it.next();
		   System.out.println("NAME" + cookie.getName() + "value" + cookie.getValue());
	   }
	   
	   System.out.println(driver.manage().getCookieNamed("PHPSESSID"));
	   
	   Cookie ck = new Cookie("Wedriver", "decbatchcookie");
	   driver.manage().addCookie(ck);
	   
	}
	
	static void screenshotEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		if(file.exists())
		{
			System.out.println(file.getAbsolutePath());
			try {
				FileUtils.copyFile(file,new File("C:\\Users\\Sampath\\screen1.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static void actionEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
		
		WebElement element = driver.findElement(By.cssSelector(".dropdown-toggle"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(element).build().perform();
		
		//dragDropEx();
		
	}
	
	static void dragDropEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		WebElement from = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[4]/span"));
		WebElement to = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		
		Actions actions = new Actions(driver);
		
		//actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		actions.dragAndDrop(from, to).build().perform();;
		
	}
	
	static void jsExecEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
		driver.manage().window().maximize();
		WebElement element  = driver.findElement(By.xpath(".//*[@id='loginButton']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("alert('hello');");
		js.executeAsyncScript("arguments[0].click();", element);
		
	}
	
	static void browserEx()
	{
		//System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//System.setProperty("webdriver.ie.driver", "lib/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		
		//WebDriver driver = new Remotewe
		driver.get("http://google.com");
	}
	
	static void capbEx()
	{
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setJavascriptEnabled(true);
		//cap.setCapability(InternetExplorerDriver., value);
	}
	
	static void mobileEmulationEx()
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		  
		  Map<String, Object> chromeOptions = new HashMap<String, Object>();
          Map<String, String> mobileEmulation = new HashMap<String, String>();
          mobileEmulation.put("deviceName","Google Nexus 5" );
          chromeOptions.put("mobileEmulation", mobileEmulation);
          capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("http://google.com");
	}
	public static void main(String[] args) {
		//APIExamples.windowEx();
	//	APIExamples.alertEx();
		//APIExamples.windowSwitchEx();
		//APIExamples.selectEx();
		//APIExamples.cookiesEx();
		//APIExamples.screenshotEx();
	//	APIExamples.actionEx();
		//APIExamples.dragDropEx();
		//APIExamples.jsExecEx();
		//APIExamples.browserEx();
		//APIExamples.mobileEmulationEx();
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.freeonlinephotoeditor.com/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath(".//*[@id='fileForm']/div/span[1]/span/input")).click();
		try {
			Runtime.getRuntime().exec("C:/Users/Sampath/upload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
