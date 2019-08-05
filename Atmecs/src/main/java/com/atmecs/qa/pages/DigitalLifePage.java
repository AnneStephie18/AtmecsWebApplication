package com.atmecs.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;

/**
 * This class is used to validate digital life page navigation with data of each page navigated 
 * Perform click operation on read more button and validate pageb navigation is navigated  
 * Perform click operation on digital life icon and validate the digital life page is navigated back 
 * Perform click operation on service icon and validate the service page is navigated back 
 * Perform click operation on home icon and validate the home page is navigated back 
 * verify page navigation with the title of the page
 * 
 * @author Anne.Sivakumar
 *
 */
public class DigitalLifePage {

	Helper helperobject = new Helper();
	CommonUtilityMethods commmon_utility = new CommonUtilityMethods();
	ServicePage servicepageobject = new ServicePage();
	public String propertyfilepath = Constants.PROJECT_DIGITALLIFE_PATH;
	By reading_digital_life_xpath;

	/**
	 * validate digital life page navigation by verifying page digital life title 
	 * click read more button and validate page navigation by verifying each page title 
	 * Perform click operation on digital life icon and validate the digital life page is navigated back 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * 
	 * @param driver
	 */
	public void digital_Life_Menu(WebDriver driver) {
		// By reading_service_xpath=helperobject.read_digitallife_xpath(driver,
		// "servicemenu");
		// commmon_utility.performMouseOverInServiceMenu(driver,
		// reading_service_xpath);
		clickservicemenu(driver);
		reading_digital_life_xpath = helperobject.read_xpath(driver, "digital_life_submenu", propertyfilepath);
		commmon_utility.click(driver, reading_digital_life_xpath);

		printtitle(driver, "Digital Life");

		By heading = helperobject.read_xpath(driver, "digital_life_heading", propertyfilepath);
		List<String> actual_heading = commmon_utility.counthyperlink(driver, heading);
		commmon_utility.verifyAssertListOfText(actual_heading, digital_lifepage_hyperlink());

		By readmore = helperobject.read_xpath(driver, "digital_lifepage_readmore_count", propertyfilepath);
		List<String> actual_readmore = commmon_utility.countReadMoreButton(driver, readmore);
		commmon_utility.verifyAssertListOfText(actual_readmore, digital_lifepage_readmore());

		servicepageobject.clickReadMoreButton(driver, "artificial_intelligence_readmore_button", propertyfilepath);
		printtitle(driver, "Artificial Intelligence / Machine Learning");
		digital_life_icon(driver);

		servicepageobject.clickReadMoreButton(driver, "virtual_reality_readmore_button", propertyfilepath);
		printtitle(driver, "Augmented Reality / Virtual Reality");
		digital_life_icon(driver);

		servicepageobject.clickReadMoreButton(driver, "blockchain_readmore_button", propertyfilepath);
		printtitle(driver, "Blockchain");
		digital_life_icon(driver);

		servicepageobject.clickReadMoreButton(driver, "robotic_readmore_button", propertyfilepath);
		printtitle(driver, "Robotic Process Automation & ChatBOTs");
		digital_life_icon(driver);

		servicepageobject.clickReadMoreButton(driver, "internetofthings_readmore_button", propertyfilepath);
		printtitle(driver, "Internet of Things");
		digital_life_icon(driver);

		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}

	// add the list of elements into the list
	public List<String> digital_lifepage_hyperlink() {
		List<String> hyperlink_content_expexted = new ArrayList<String>();
		hyperlink_content_expexted.add("Artificial Intelligence / Machine Learning");
		hyperlink_content_expexted.add("Augmented Reality / Virtual Reality");
		hyperlink_content_expexted.add("Blockchain");
		hyperlink_content_expexted.add("Robotic Process Automation & ChatBOTs");
		hyperlink_content_expexted.add("Internet of Things");
		return hyperlink_content_expexted;
	}

	// add the list of elements into the list
	public List<String> digital_lifepage_readmore() {
		List<String> readmore_content_expexted = new ArrayList<String>();
		readmore_content_expexted.add("Read More");
		readmore_content_expexted.add("Read More");
		readmore_content_expexted.add("Read More");
		readmore_content_expexted.add("Read More");
		readmore_content_expexted.add("Read More");
		return readmore_content_expexted;
	}

	//perform mouse over operation by passing xpath as parameter
	public void clickservicemenu(WebDriver driver) {
		By reading_service_xpath = helperobject.read_xpath(driver, "servicemenu", propertyfilepath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_service_xpath);
	}

	/**
	 * get the xpath 
	 * perform get title and verify assert operation
	 * @param driver
	 * @param expextedtitle
	 */
	public void printtitle(WebDriver driver, String expectedtitle) {
		By reading_title_xpath = helperobject.read_xpath(driver, "digital_life_title", propertyfilepath);
		String digital_life_title = commmon_utility.getTitle(driver, reading_title_xpath);
		commmon_utility.verifyAssert(digital_life_title, expectedtitle);
	}

	//perform click operation for digital life icon 
	public void digital_life_icon(WebDriver driver) {
		By backward_digital_life_xpath = helperobject.read_xpath(driver, "digital_lifepage_icon", propertyfilepath);
		commmon_utility.click(driver, backward_digital_life_xpath);
	}

	/**
	 * validate artificial intelligence page navigation by verifying page artificial intelligence title
	 * Perform click operation on digital life icon and validate the digital life page is navigated back  
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void artificial_intelligence_submenu(WebDriver driver) {
		clickservicemenu(driver);
		By reading_artificial_intelligence_xpath = helperobject.read_xpath(driver, "artificial_intelligence_submenu",propertyfilepath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_digital_life_xpath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_artificial_intelligence_xpath);
		commmon_utility.click(driver, reading_artificial_intelligence_xpath);
		printtitle(driver, "Artificial Intelligence / Machine Learning");
		digital_life_icon(driver);
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
	/**
	 * validate virtual reality page navigation by verifying page virtual reality title
	 * Perform click operation on digital life icon and validate the digital life page is navigated back  
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void virtual_reality_submenu(WebDriver driver) {
		clickservicemenu(driver);
		By reading_virtual_reality_xpath = helperobject.read_xpath(driver, "virtual_reality_submenu", propertyfilepath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_digital_life_xpath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_virtual_reality_xpath);
		commmon_utility.click(driver, reading_virtual_reality_xpath);
		printtitle(driver, "Augmented Reality / Virtual Reality");
		digital_life_icon(driver);
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
	/**
	 * validate blockchain page navigation by verifying page blockchain title
	 * Perform click operation on digital life icon and validate the digital life page is navigated back  
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void blockchain_submenu(WebDriver driver) {
		clickservicemenu(driver);
		By reading_blockchain_xpath = helperobject.read_xpath(driver, "blockchain_submenu", propertyfilepath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_digital_life_xpath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_blockchain_xpath);
		commmon_utility.click(driver, reading_blockchain_xpath);
		printtitle(driver, "Blockchain");
		digital_life_icon(driver);
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
	/**
	 * validate robotic page navigation by verifying page robotic title
	 * Perform click operation on digital life icon and validate the digital life page is navigated back  
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void robotic_submenu(WebDriver driver) {
		clickservicemenu(driver);
		By reading_robotic_xpath = helperobject.read_xpath(driver, "robotic_submenu", propertyfilepath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_digital_life_xpath);
		helperobject.waitForTheElement(driver, "robotic_submenu");
		commmon_utility.performMouseOverInServiceMenu(driver, reading_robotic_xpath);
		commmon_utility.click(driver, reading_robotic_xpath);
		printtitle(driver, "Robotic Process Automation & ChatBOTs");
		digital_life_icon(driver);
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
	/**
	 * validate internet of things page navigation by verifying page internet of things title
	 * Perform click operation on digital life icon and validate the digital life page is navigated back  
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void internetofthings_submenu(WebDriver driver) {
		clickservicemenu(driver);
		By reading_internetofthings_xpath = helperobject.read_xpath(driver, "internetofthings_submenu",propertyfilepath);
		commmon_utility.performMouseOverInServiceMenu(driver, reading_digital_life_xpath);
		helperobject.waitForTheElement(driver, "internetofthings_submenu");
		commmon_utility.performMouseOverInServiceMenu(driver, reading_internetofthings_xpath);
		commmon_utility.click(driver, reading_internetofthings_xpath);
		printtitle(driver, "Internet of Things");
		digital_life_icon(driver);
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
}
