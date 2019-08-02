package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.MobileComputingPage;
import com.atmecs.qa.testbase.Base;

public class TestMobileComputingPage extends Base{
	MobileComputingPage mobile_computing_page= new MobileComputingPage();
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	@Test
	public void testServicePageClick()
	{
		mobile_computing_page.Mobile_Computing_Menu(driver);
		
	}
	@AfterTest
	public void tearDown()
	{
		quitBrowser();
	}
}
