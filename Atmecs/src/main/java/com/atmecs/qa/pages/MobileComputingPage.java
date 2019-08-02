package com.atmecs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;

public class MobileComputingPage {
	Helper helperobject=new Helper();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	public String propertyfilepath=Constants.PROJECT_MOBILECOMPUTING_PATH;
	public void Mobile_Computing_Menu(WebDriver driver)
	{
		digitallifepageobject.clickservicemenu(driver);
		By reading_mobile_computing_xpath=helperobject.read_xpath(driver, "mobile_computing_submenu",propertyfilepath);
		commmon_utility.click(driver, reading_mobile_computing_xpath);
		
		By reading_title_xpath=helperobject.read_xpath(driver, "mobile_computing_title",propertyfilepath);
		String mobile_computing_title=commmon_utility.getTitle(driver, reading_title_xpath);
		commmon_utility.verifyAssert(mobile_computing_title, "Mobile Computing");
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
}
