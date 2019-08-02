package com.atmecs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;

public class ProductEngineeringPage {
	Helper helperobject=new Helper();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	public String propertyfilepath=Constants.PROJECT_PRODUCTENGINEERING_PATH;
	public void Product_Engineering_Menu(WebDriver driver)
	{
		digitallifepageobject.clickservicemenu(driver);
		By reading_product_engineering_xpath=helperobject.read_xpath(driver, "product_enginnering_submenu",propertyfilepath);
		commmon_utility.click(driver, reading_product_engineering_xpath);
		
		By reading_title_xpath=helperobject.read_xpath(driver, "product_enginnering_title",propertyfilepath);
		String product_engineering_title=commmon_utility.getTitle(driver, reading_title_xpath);
		commmon_utility.verifyAssert(product_engineering_title, "Product Engineering");
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
}
