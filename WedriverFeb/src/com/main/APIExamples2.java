package com.main;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class APIExamples2 {
	
	static void upload() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       driver.get("https://www.freeonlinephotoeditor.com/");
       Thread.sleep(2000);
       driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
       WebElement elem = driver.findElement(By.name("file"));
       Thread.sleep(2000);
       elem.click();
       Runtime.getRuntime().exec("C:\\Users\\Sampath\\Documents\\upload.exe");
	}
	
	static void actionsEx() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Actions act = new Actions(driver);
		WebElement from = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		WebElement to  = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		act.dragAndDrop(from, to).build().perform();
		//act.clickAndHold(from).perform();
		//Action dragDrop =  act.clickAndHold(from).moveToElement(to).release(to).build();
		//dragDrop.perform();
	}

	static void optionsEx()
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.whiteboxqa.com");
		driver.manage().getCookieNamed("PHPSESSID");
		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie c:cookies)
		{
			System.out.println(c.getName());
		}
		
		Cookie cookie = new Cookie("teest", "webdriver");
		driver.manage().addCookie(cookie);
		driver.manage().logs();
				
	}
	
	static void selectEX()
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Sampath/Desktop/select.html");
		WebElement elem = driver.findElement(By.name("Mobiles"));
		Select sel = new Select(elem);
		sel.selectByVisibleText("Nokia");
		sel.deselectByVisibleText("Nokia");
	}
	
	static void screenshot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.whiteboxqa.com");
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(file.getAbsolutePath());
		FileUtils.copyFile(file,new File("C:\\Users\\Sampath\\Desktop\\screen1.png"));
	}
	
	static void JSExceutor()
	{
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.whiteboxqa.com");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("loginButton"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeAsyncScript("alert('Learning Webdriver')");
		js.executeScript("arguments[0].click()", element);
		String title = js.executeScript("return document.title").toString();
				System.out.println(title);
	}
	
	
	static void browseres()
	{
		/*System.setProperty("webdriver.ie.driver", "lib/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();*/
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.whiteboxqa.com");
	}
	
	
	static void caps()
	{
		FirefoxProfile profile = new FirefoxProfile();
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		profile.setAcceptUntrustedCertificates(true);
		profile.setPreference("browser.download.downloadDir", "C:\\Users\\Sampath\\Desktop");
		caps.setCapability(FirefoxDriver.PROFILE,profile);
		
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("190.90.34.79:8080");
		caps.setCapability("proxy", proxy);
		ChromeOptions opt = new ChromeOptions();
		
		
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		
		APIExamples2.upload();
		
	}

}
