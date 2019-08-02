package com.atmecs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;

public class EnterpriseAnalyticsPage {
	Helper helperobject=new Helper();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	public String propertyfilepath=Constants.PROJECT_ENTERPRISEANALYTICS_PATH;
	public void Enterprise_Analytics_Menu(WebDriver driver)
	{
		digitallifepageobject.clickservicemenu(driver);
		By reading_enterprise_analytics_xpath=helperobject.read_xpath(driver, "enterprise_analytics_submenu",propertyfilepath);
		commmon_utility.click(driver, reading_enterprise_analytics_xpath);
		
		By reading_title_xpath=helperobject.read_xpath(driver, "enterprise_analytics_title",propertyfilepath);
		String enterprise_analytics_title=commmon_utility.getTitle(driver, reading_title_xpath);
		commmon_utility.verifyAssert(enterprise_analytics_title, "Enterprise Analytics");
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
}
