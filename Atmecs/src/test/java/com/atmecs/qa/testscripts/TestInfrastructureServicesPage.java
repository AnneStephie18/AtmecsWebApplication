package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.InfrastructureServicesPage;
import com.atmecs.qa.testbase.Base;

public class TestInfrastructureServicesPage extends Base {
	InfrastructureServicesPage infrastructure_services_page= new InfrastructureServicesPage();
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	@Test
	public void testServicePageClick()
	{
		infrastructure_services_page.Infrastructure_Services_Menu(driver);
		
	}
	@AfterTest
	public void tearDown()
	{
		quitBrowser();
	}
}
