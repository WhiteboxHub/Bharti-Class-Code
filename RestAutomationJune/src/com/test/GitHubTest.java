package com.test;

import static org.testng.AssertJUnit.assertEquals;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.util.RestUtil;

public class GitHubTest extends BaseTest{
	
	RestUtil util;
	
	@BeforeClass
	public void beforeClass()
	{
		util = new RestUtil();
		
		
	}
	
	@Test
	public void testStatusCode()
	{
	  util.getRequest("users/whiteboxhub");
	  assertEquals(HttpStatus.SC_OK,util.validateStatusCode());
	}
}
