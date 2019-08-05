package com.atmecs.qa.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtilityMethods;

/**
 * This class is used to validate services page navigation with data of each page navigated  
 * Perform click operation on hyper link and validate page navigation is navigated 
 * Perform click operation on read more button and validate page navigation is navigated  
 * Perform click operation on home icon validate the home page is navigated back  
 * verify page navigation with the title of the page
 * 
 * @author Anne.Sivakumar
 *
 */
public class ServicePage 
{

	Base base = new Base();
	Helper helperobject = new Helper();
	public WebElement servicemenuxpath;
	public WebElement servicepagetitle;
	CommonUtilityMethods commmon_utility = new CommonUtilityMethods();
	public String propertyfilepath = Constants.PROJECT_SERVICE_PATH;

	/**
	 * validate service page navigation by verifying page service title
	 * click read more button and validate page navigation by verifying each page title
	 * click hyper link and validate page navigation by verifying each page title
	 * Perform click operation on home icon validate the home page is navigated back  
	 * @param driver
	 */
	public void ServiceMenu(WebDriver driver) 
	{

		By reading_services_xpath = helperobject.read_xpath(driver, "servicemenu", propertyfilepath);
		commmon_utility.click(driver, reading_services_xpath);

		printtitle(driver, "Services");

		By hyperlink = helperobject.read_xpath(driver, "servicepage_hyperlink_count", propertyfilepath);
		List<String> actual_hyperlink = commmon_utility.counthyperlink(driver, hyperlink);
		commmon_utility.verifyAssertListOfText(actual_hyperlink, servicepage_hyperlink());

		By readmore = helperobject.read_xpath(driver, "servicepage_readmore_count", propertyfilepath);
		List<String> actual_readmore = commmon_utility.countReadMoreButton(driver, readmore);
		commmon_utility.verifyAssertListOfText(actual_readmore, servicepage_readmore());

		By reading_enterprise_anlaytics_xpath = helperobject.read_xpath(driver, "enterprise-anlaytics-hyperlink",propertyfilepath);
		commmon_utility.click(driver, reading_enterprise_anlaytics_xpath);

		printtitle(driver, "Enterprise Analytics");
		service_icon(driver);

		By reading_cloud_services_xpath = helperobject.read_xpath(driver, "cloud-services-hyperlink", propertyfilepath);
		commmon_utility.click(driver, reading_cloud_services_xpath);

		printtitle(driver, "Cloud Services");
		service_icon(driver);

		By reading_product_engineering_xpath = helperobject.read_xpath(driver, "product-engineering-hyperlink",propertyfilepath);
		commmon_utility.click(driver, reading_product_engineering_xpath);

		printtitle(driver, "Product Engineering");
		service_icon(driver);

		By reading_automation_engineering_xpath = helperobject.read_xpath(driver, "automation-engineering-hyperlink",
				propertyfilepath);
		commmon_utility.click(driver, reading_automation_engineering_xpath);

		printtitle(driver, "Quality Engineering");
		service_icon(driver);

		By reading_mobile_computing_xpath = helperobject.read_xpath(driver, "mobile-computing-hyperlink",
				propertyfilepath);
		commmon_utility.click(driver, reading_mobile_computing_xpath);

		printtitle(driver, "Mobile Computing");
		service_icon(driver);

		By reading_digital_life_xpath = helperobject.read_xpath(driver, "digital-life-hyperlink", propertyfilepath);
		commmon_utility.click(driver, reading_digital_life_xpath);

		printtitle(driver, "Digital Life");
		service_icon(driver);

		By reading_infrastructure_services_xpath = helperobject.read_xpath(driver, "infrastructure-services-hyperlink",
				propertyfilepath);
		commmon_utility.click(driver, reading_infrastructure_services_xpath);

		printtitle(driver, "Infrastructure Services");
		service_icon(driver);

		clickReadMoreButton(driver, "enterprise-anlaytics_readmore_button", propertyfilepath);
		printtitle(driver, "Enterprise Analytics");
		service_icon(driver);

		clickReadMoreButton(driver, "cloud-services_readmore_button", propertyfilepath);
		printtitle(driver, "Cloud Services");
		service_icon(driver);

		clickReadMoreButton(driver, "product-engineering_readmore_button", propertyfilepath);
		printtitle(driver, "Product Engineering");
		service_icon(driver);

		clickReadMoreButton(driver, "automation-engineering_readmore_button", propertyfilepath);
		printtitle(driver, "Quality Engineering");
		service_icon(driver);

		clickReadMoreButton(driver, "mobile-computing_readmore_button", propertyfilepath);
		printtitle(driver, "Mobile Computing");
		service_icon(driver);

		clickReadMoreButton(driver, "digital-life_readmore_button", propertyfilepath);
		printtitle(driver, "Digital Life");
		service_icon(driver);

		clickReadMoreButton(driver, "infrastructure-services_readmore_button", propertyfilepath);
		printtitle(driver, "Infrastructure Services");
		service_icon(driver);
		home_icon(driver);
	}

	//perform click operation for service icon 
	public void service_icon(WebDriver driver) 
	{
		By backward_services_xpath = helperobject.read_xpath(driver, "backward_services", propertyfilepath);
		commmon_utility.click(driver, backward_services_xpath);
	}

	//perform click operation for home icon 
	public void home_icon(WebDriver driver) 
	{
		By backward_homepage_xpath = helperobject.read_xpath(driver, "home_icon", propertyfilepath);
		commmon_utility.click(driver, backward_homepage_xpath);
	}

	//add the list of elements into the list 
	public List<String> servicepage_hyperlink() 
	{
		List<String> hyperlink_content_expexted = new ArrayList<String>();
		hyperlink_content_expexted.add("Enterprise Analytics");
		hyperlink_content_expexted.add("Cloud Services");
		hyperlink_content_expexted.add("Product Engineering");
		hyperlink_content_expexted.add("Automation Engineering");
		hyperlink_content_expexted.add("Mobile Computing");
		hyperlink_content_expexted.add("Digital Life");
		hyperlink_content_expexted.add("Infrastructure Services");
		hyperlink_content_expexted.add("Sitemap");
		hyperlink_content_expexted.add("Services");
		hyperlink_content_expexted.add("Careers");
		hyperlink_content_expexted.add("Contact Us");
		return hyperlink_content_expexted;
	}

	//add the list of elements into the list 
	public List<String> servicepage_readmore() 
	{
		List<String> readmore_content_expexted = new ArrayList<String>();
		readmore_content_expexted.add("Read More");
		readmore_content_expexted.add("Read More");
		readmore_content_expexted.add("Read More");
		readmore_content_expexted.add("Read More");
		readmore_content_expexted.add("Read More");
		readmore_content_expexted.add("Read More");
		readmore_content_expexted.add("Read More");
		return readmore_content_expexted;
	}

	//perform click operation by passing xpath
	public void clickReadMoreButton(WebDriver driver, String key_xpath, String propertypath) 
	{
		By click_readmore = helperobject.read_xpath(driver, key_xpath, propertypath);
		commmon_utility.click(driver, click_readmore);

	}

	/**
	 * get the xpath 
	 * perform get title and verify assert operation
	 * @param driver
	 * @param expextedtitle
	 */
	public void printtitle(WebDriver driver, String expectedtitle) 
	{
		By reading_title_xpath = helperobject.read_xpath(driver, "servicetitle", propertyfilepath);
		String servicepagetitle = commmon_utility.getTitle(driver, reading_title_xpath);
		commmon_utility.verifyAssert(servicepagetitle, expectedtitle);

	}

}
