package com.atmecs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;
/**
 * This class is used to validate quality engineering page navigation with data of each page navigated 
 * Perform click operation on service icon and validate the service page is navigated back 
 * Perform click operation on home icon and validate the home page is navigated back 
 * verify page navigation with the title of the page
 * @author Anne.Sivakumar
 *
 */
public class QualityEngineeringPage {
	Helper helperobject=new Helper();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	public String propertyfilepath=Constants.PROJECT_QUALITYENGINEERING_PATH;
	/**
	 * validate quality engineering page navigation by verifying page quality engineering title 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * 
	 * @param driver
	 */
	public void Quality_Engineering_Menu(WebDriver driver)
	{
		digitallifepageobject.clickservicemenu(driver);
		By reading_quality_engineering_xpath=helperobject.read_xpath(driver, "quality_enginnering_submenu",propertyfilepath);
		commmon_utility.click(driver, reading_quality_engineering_xpath);
		
		By reading_title_xpath=helperobject.read_xpath(driver, "quality_enginnering_title",propertyfilepath);
		String quality_engineering_title=commmon_utility.getTitle(driver, reading_title_xpath);
		commmon_utility.verifyAssert(quality_engineering_title, "Quality Engineering");
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
}
