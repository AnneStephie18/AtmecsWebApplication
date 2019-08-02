package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.ServicePage;
import com.atmecs.qa.testbase.Base;
public class TestServicePage extends Base {
	ServicePage servicepage= new ServicePage();
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	@Test
	public void testServicePageClick()
	{
		
		servicepage.ServiceMenu(driver);
		
	}
	@AfterTest
	public void tearDown()
	{
		quitBrowser();
	}
}
