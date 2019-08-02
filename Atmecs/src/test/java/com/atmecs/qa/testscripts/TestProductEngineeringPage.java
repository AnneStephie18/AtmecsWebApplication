package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.ProductEngineeringPage;
import com.atmecs.qa.testbase.Base;

public class TestProductEngineeringPage extends Base{
	ProductEngineeringPage product_engineering_page= new ProductEngineeringPage();
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	@Test
	public void testServicePageClick()
	{
		
		product_engineering_page.Product_Engineering_Menu(driver);
	}
	@AfterTest
	public void tearDown()
	{
		quitBrowser();
	}
}
