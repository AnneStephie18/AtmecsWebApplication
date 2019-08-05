package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.DigitalLifePage;
import com.atmecs.qa.testbase.Base;
/**
 * 
 * @author Anne.Sivakumar
 *
 */
public class TestDigitalLifePage extends Base{
	DigitalLifePage digital_life_page= new DigitalLifePage();
	
	/**
	 * open the browser
	 */
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	/**
	 * call digital_Life_Menu method
	 */
	@Test(priority=1)
	public void testDigitalLifePageClick()
	{
		
		digital_life_page.digital_Life_Menu(driver);
		
	}
	/**
	 * call artificial_intelligence_submenu method
	 */
	@Test(priority=2)
	public void testArtificialIntelligencePageClick()
	{
		
		
		digital_life_page.artificial_intelligence_submenu(driver);
	}
	/**
	 * call virtual_reality_submenu method
	 */
	@Test(priority=3)
	public void testVirtualRealityPageClick()
	{
		
		digital_life_page.virtual_reality_submenu(driver);
	}
	/**
	 * call blockchain_submenu method
	 */
	@Test(priority=4)
	public void testBlockchainPageClick()
	{
		
		digital_life_page.blockchain_submenu(driver);
	}
	/**
	 * call robotic_submenu method
	 */
	@Test(priority=5)
	public void testRoboticPageClick()
	{
		
		digital_life_page.robotic_submenu(driver);
	}
	/**
	 * call internetofthings_submenu method
	 */
	@Test(priority=6)
	public void testInternetOfThingsPageClick()
	{
		
		digital_life_page.internetofthings_submenu(driver);
	}
	
	/**
	 * quit the browser 
	 */
	@AfterTest
	public void tearDown()
	{
		quitBrowser();
	}
}
