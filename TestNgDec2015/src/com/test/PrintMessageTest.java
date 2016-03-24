package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import com.main.PrintMesage;

@Test(groups={"checkintest","functest"})
public class PrintMessageTest extends GetTestData{

	@BeforeGroups({"checkintest","functest"})
	public void setGp()
	{
		System.out.println("in before gp");
	}
	
	@Test(groups={"checkintest"})
	public void method1()
	{
		System.out.println("in method1");
		String expextecd = "hi Bharti";
		PrintMesage pm = new PrintMesage();
		assertEquals(expextecd,pm.printHi("nnBharti"));
	}
	@Test(groups={"functest"})
	public void method2()
	{
		System.out.println("in method2");
		String expextecd = "bye Bharti";
		PrintMesage pm = new PrintMesage();
		assertEquals(expextecd,pm.printBye("Bharti"));
	}
	@Test(groups={"checkintest","functest"})
	public void method3()
	{
		System.out.println("in method3");
		String expextecd = "Bharti";
		PrintMesage pm = new PrintMesage();
		assertEquals(expextecd,pm.printStr("Bharti"));
	}
	
	@Test(dependsOnGroups={"checkintest"})
	public void method4()
	{
		System.out.println("in method 4");
	}
	
	@AfterGroups
	public void clearGp()
	{
		System.out.println("in after gp");
	}
}
