package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.main.PrintMessage;

public class PrintMessageTest {

	@Test
	@Parameters("myName")
	public void testParameters(String user)
	{
		System.out.println(user);
	}
	/*String message = "Hi";
	PrintMessage pm = new PrintMessage(message);
	
	@BeforeSuite
	public void init()
	{
		System.out.println("inside before suite");
	}
	@Test
	public void testPrintMessage()
	{
		System.out.println("inside test print message");
		message = "Bharti";
		assertEquals(message,pm.printMsg());
	}
	
	@Test(dependsOnMethods={"testByeMessage"})
	public void testPrintWelcomeMessage()
	{
		System.out.println("inside test welcome message");
		message = "welcomeBharti";
		assertEquals(message,pm.printWelcomeMessage());
	}
	
	@Test
	public void testByeMessage()
	{
		System.out.println("inside test bye message");
		message = "byenull";
		assertEquals(message,pm.printByeMessage());
	}
	
	@AfterSuite
	public void exit()
	{
		System.out.println("inside after suite");
	}*/
}
