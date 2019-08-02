package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.DigitalLifePage;
import com.atmecs.qa.testbase.Base;

public class TestDigitalLifePage extends Base{
	DigitalLifePage digital_life_page= new DigitalLifePage();
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	@Test(priority=1)
	public void testDigitalLifePageClick()
	{
		
		digital_life_page.digital_Life_Menu(driver);
		digital_life_page.artificial_intelligence_submenu(driver);
	}
	@Test(priority=2)
	public void testVirtualRealityPageClick()
	{
		
		digital_life_page.virtual_reality_submenu(driver);
	}
	@Test(priority=3)
	public void testBlockchainPageClick()
	{
		
		digital_life_page.blockchain_submenu(driver);
	}
	@Test(priority=4)
	public void testRoboticPageClick()
	{
		
		digital_life_page.robotic_submenu(driver);
	}
	@Test(priority=5)
	public void testInternetOfThingsPageClick()
	{
		
		digital_life_page.internetofthings_submenu(driver);
	}
	
	
	@AfterTest
	public void tearDown()
	{
		quitBrowser();
	}
}
