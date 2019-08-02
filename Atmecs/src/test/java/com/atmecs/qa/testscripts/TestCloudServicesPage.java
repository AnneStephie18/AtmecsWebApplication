package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.CloudServicesPage;
import com.atmecs.qa.testbase.Base;

public class TestCloudServicesPage extends Base {
	CloudServicesPage cloud_services_page= new CloudServicesPage();
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	@Test
	public void testCloudServicesPageClick()
	{
		cloud_services_page.cloud_Services_Menu(driver);
	}
	@AfterTest
	public void tearDown()
	{
		quitBrowser();
	}
}
