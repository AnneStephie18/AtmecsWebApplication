package com.atmecs.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;
/**
 * This class is used to validate infrastructure services page navigation with data of each page navigated 
 * Perform click operation on read more button and validate page navigation is navigated 
 * Perform click operation on service icon and validate the service page is navigated back
 * Perform click operation on home icon and validate the home page is navigated back
 * verify page navigation with the title of the page
 * @author Anne.Sivakumar
 *
 */
public class InfrastructureServicesPage {
	Helper helperobject = new Helper();
	CommonUtilityMethods commmon_utility = new CommonUtilityMethods();
	ServicePage servicepageobject = new ServicePage();
	DigitalLifePage digitallifepageobject = new DigitalLifePage();
	public String propertyfilepath = Constants.PROJECT_INFRASTRUCTURESERVICES_PATH;
	public By reading_infrastructure_services_xpath;
	/**
	 * validate infrastructure services page navigation by verifying page infrastructure services title 
	 * click read more button and validate page navigation by verifying each page title 
	 * Perform click operation on infrastructure services icon and validate the infrastructure services page is navigated back 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * 
	 * @param driver
	 */
	public void infrastructure_Services_Menu(WebDriver driver) {
		
		digitallifepageobject.clickservicemenu(driver);
		reading_infrastructure_services_xpath = helperobject.read_xpath(driver, "infrastructure_services_submenu",propertyfilepath);
		commmon_utility.click(driver, reading_infrastructure_services_xpath);

		printtitle(driver, "Infrastructure Services");

		By heading = helperobject.read_xpath(driver, "infrastructure_services_heading", propertyfilepath);
		List<String> actual_heading = commmon_utility.counthyperlink(driver, heading);
		commmon_utility.verifyAssertListOfText(actual_heading, infrastructure_servicespage_hyperlink());

		By readmore = helperobject.read_xpath(driver, "infrastructure_services_readmore_count", propertyfilepath);
		List<String> actual_readmore = commmon_utility.countReadMoreButton(driver, readmore);
		commmon_utility.verifyAssertListOfText(actual_readmore, digitallifepageobject.digital_lifepage_readmore());

		servicepageobject.clickReadMoreButton(driver, "infrastructure_management_readmore", propertyfilepath);
		printtitle(driver, "Infrastructure Management");
		infrastructure_services_icon(driver);

		By click_readmore = helperobject.read_xpath(driver, "cloud_readmore", propertyfilepath);
		commmon_utility.click(driver, click_readmore);
		//printtitle(driver, "Cloud Infrastructure");
		commmon_utility.navigateTo(driver);

		servicepageobject.clickReadMoreButton(driver, "devops_readmore", propertyfilepath);
		printtitle(driver, "Infrastructure Automation with Devops");
		infrastructure_services_icon(driver);

		servicepageobject.clickReadMoreButton(driver, "NOCservices_readmore", propertyfilepath);
		printtitle(driver, "NOC Services");
		infrastructure_services_icon(driver);

		servicepageobject.clickReadMoreButton(driver, "datacenter_management_readmore", propertyfilepath);
		printtitle(driver, "Data Center Management");
		infrastructure_services_icon(driver);

		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}

	// add the list of elements into the list
	public List<String> infrastructure_servicespage_hyperlink() {
		List<String> hyperlink_content_expexted = new ArrayList<String>();
		hyperlink_content_expexted.add("Infrastructure Management");
		hyperlink_content_expexted.add("Cloud");
		hyperlink_content_expexted.add("Infrastructure Automation with Devops");
		hyperlink_content_expexted.add("NOC Services");
		hyperlink_content_expexted.add("Data Center Management");
		hyperlink_content_expexted.add("Sitemap");
		hyperlink_content_expexted.add("Services");
		hyperlink_content_expexted.add("Careers");
		hyperlink_content_expexted.add("Contact Us");
		return hyperlink_content_expexted;
	}


	/**
	 * get the xpath 
	 * perform get title and verify assert operation
	 * @param driver
	 * @param expextedtitle
	 */
	public void printtitle(WebDriver driver, String expectedtitle) {
		By reading_title_xpath = helperobject.read_xpath(driver, "infrastructure_services_title", propertyfilepath);
		String infrastructure_services_title = commmon_utility.getTitle(driver, reading_title_xpath);
		System.out.println(infrastructure_services_title);
		commmon_utility.verifyAssert(infrastructure_services_title, expectedtitle);

	}

	//perform click operation for infrastructure services icon 
	public void infrastructure_services_icon(WebDriver driver) {
		By backward_infrastructure_services_xpath = helperobject.read_xpath(driver, "infrastructure_services_icon",
				propertyfilepath);
		commmon_utility.click(driver, backward_infrastructure_services_xpath);
	}
	/**
	 * validate infrastructure management page navigation by verifying page infrastructure management title
	 * Perform click operation on infrastructure services icon and validate the infrastructure services page is navigated back   
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void infrastructure_management_submenu(WebDriver driver) {
		digitallifepageobject.clickservicemenu(driver);
		By reading_infrastructure_management_xpath = helperobject.read_xpath(driver,"infrastructure_management_submenu", propertyfilepath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_infrastructure_services_xpath);
		// commmon_utility.performMouseOverInServiceMenu(driver,
		// reading_infrastructure_management_xpath);
		commmon_utility.click(driver, reading_infrastructure_management_xpath);
		printtitle(driver, "Infrastructure Management");
		infrastructure_services_icon(driver);
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
	/**
	 * validate cloud infrastructure page navigation by verifying page cloud infrastructure title
	 * Perform click operation on infrastructure services icon and validate the infrastructure services page is navigated back   
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void cloud_infrastructure_submenu(WebDriver driver) {
		digitallifepageobject.clickservicemenu(driver);
		By reading_cloud_infrastructure_xpath = helperobject.read_xpath(driver, "cloud_infrastructure_submenu",
				propertyfilepath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_infrastructure_services_xpath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_cloud_infrastructure_xpath);
		helperobject.waitForTheElement(driver, "cloud_infrastructure_submenu");
		commmon_utility.click(driver, reading_cloud_infrastructure_xpath);
		printtitle(driver, "Cloud Infrastructure");
		infrastructure_services_icon(driver);
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
	/**
	 * validate devops page navigation by verifying page devops title
	 * Perform click operation on infrastructure services icon and validate the infrastructure services page is navigated back   
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void devops_submenu(WebDriver driver) {
		digitallifepageobject.clickservicemenu(driver);
		By reading_devops_xpath = helperobject.read_xpath(driver, "devops_submenu", propertyfilepath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_infrastructure_services_xpath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_devops_xpath);
		helperobject.waitForTheElement(driver, "devops_submenu");
		commmon_utility.click(driver, reading_devops_xpath);
		printtitle(driver, "Infrastructure Automation with Devops");
		infrastructure_services_icon(driver);
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
	/**
	 * validate NOC services page navigation by verifying page NOC services title
	 * Perform click operation on infrastructure services icon and validate the infrastructure services page is navigated back   
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void NOC_services_submenu(WebDriver driver) {
		digitallifepageobject.clickservicemenu(driver);
		By reading_NOC_services_xpath = helperobject.read_xpath(driver, "NOC_services_submenu", propertyfilepath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_infrastructure_services_xpath);
		helperobject.waitForTheElement(driver, "NOC_services_submenu");
		commmon_utility.performMouseOverInServiceMenu(driver, reading_NOC_services_xpath);
		commmon_utility.click(driver, reading_NOC_services_xpath);
		printtitle(driver, "NOC Services");
		infrastructure_services_icon(driver);
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
	/**
	 * validate data center management page navigation by verifying page data center management title
	 * Perform click operation on infrastructure services icon and validate the infrastructure services page is navigated back   
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void datacenter_management_submenu(WebDriver driver) {
		digitallifepageobject.clickservicemenu(driver);
		By reading_datacenter_management_xpath = helperobject.read_xpath(driver, "datacenter_management_submenu",
				propertyfilepath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_infrastructure_services_xpath);
		helperobject.waitForTheElement(driver, "datacenter_management_submenu");
		commmon_utility.performMouseOverInServiceMenu(driver, reading_datacenter_management_xpath);
		helperobject.waitForTheElement(driver, "datacenter_management_submenu");
		commmon_utility.click(driver, reading_datacenter_management_xpath);
		printtitle(driver, "Data Center Management");
		infrastructure_services_icon(driver);
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
}
