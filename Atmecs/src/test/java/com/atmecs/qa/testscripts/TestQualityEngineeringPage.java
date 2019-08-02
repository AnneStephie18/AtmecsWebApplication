package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.QualityEngineeringPage;
import com.atmecs.qa.testbase.Base;

public class TestQualityEngineeringPage extends Base{
	QualityEngineeringPage quality_engineering_page= new QualityEngineeringPage();
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	@Test
	public void testServicePageClick()
	{
		quality_engineering_page.Quality_Engineering_Menu(driver);
		
	}
	@AfterTest
	public void tearDown()
	{
		quitBrowser();
	}
}
