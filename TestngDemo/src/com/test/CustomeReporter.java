package com.test;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class CustomeReporter implements IReporter {
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory)
	{
		for(ISuite suite : suites)
		{
			String suiteName = suite.getName();
			Map<String,ISuiteResult> suiteResults = suite.getResults();
			for(ISuiteResult sr : suiteResults.values())
			{
				ITestContext tc = sr.getTestContext();
				System.out.println("Passed tests for suite'" + suiteName + "is" + 
				tc.getPassedTests().getAllResults().size());
				System.out.println("Failed tests for suitr'" + suiteName + "is" + 
						tc.getFailedTests().getAllResults().size());
			}
		}
	}
}
