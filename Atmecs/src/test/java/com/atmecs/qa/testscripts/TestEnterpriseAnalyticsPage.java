package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.EnterpriseAnalyticsPage;
import com.atmecs.qa.testbase.Base;

public class TestEnterpriseAnalyticsPage extends Base {
	EnterpriseAnalyticsPage enterprise_analytics_page= new EnterpriseAnalyticsPage();
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	@Test
	public void testServicePageClick()
	{
		
		enterprise_analytics_page.Enterprise_Analytics_Menu(driver);
		
	}
	@AfterTest
	public void tearDown()
	{
		quitBrowser();
	}
}
