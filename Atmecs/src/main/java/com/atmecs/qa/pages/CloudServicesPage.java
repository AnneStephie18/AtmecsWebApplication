package com.atmecs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;

public class CloudServicesPage {
	Helper helperobject=new Helper();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	public String propertyfilepath=Constants.PROJECT_CLOUDSERVICES_PATH;
	public void cloud_Services_Menu(WebDriver driver)
	{
		digitallifepageobject.clickservicemenu(driver);
		By reading_cloud_services_xpath=helperobject.read_xpath(driver, "cloud_services_submenu",propertyfilepath);
		commmon_utility.click(driver, reading_cloud_services_xpath);
		
		By reading_title_xpath=helperobject.read_xpath(driver, "cloud_services_title",propertyfilepath);
		String cloud_services_title=commmon_utility.getTitle(driver, reading_title_xpath);
		commmon_utility.verifyAssert(cloud_services_title, "Cloud Services");
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
	
}
