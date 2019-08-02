package com.atmecs.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;

public class InfrastructureServicesPage {
	Helper helperobject=new Helper();
	CommonUtilityMethods commmon_utility=new CommonUtilityMethods();
	ServicePage servicepageobject=new ServicePage();
	DigitalLifePage digitallifepageobject=new DigitalLifePage();
	public String propertyfilepath=Constants.PROJECT_INFRASTRUCTURESERVICES_PATH;
	public void Infrastructure_Services_Menu(WebDriver driver)
	{
		digitallifepageobject.clickservicemenu(driver);
		click_infrastructure_services(driver);
		
		printtitle(driver, "Infrastructure Services");
		
		By heading=helperobject.read_xpath(driver, "infrastructure_services_heading",propertyfilepath);
	    List<String> actual_heading=commmon_utility.counthyperlink(driver, heading);
		commmon_utility.verifyAssertListOfText(actual_heading,infrastructure_servicespage_hyperlink());
		
		By readmore=helperobject.read_xpath(driver, "infrastructure_services_readmore_count",propertyfilepath);
		List<String> actual_readmore=commmon_utility.countReadMoreButton(driver, readmore);
		commmon_utility.verifyAssertListOfText(actual_readmore,digitallifepageobject.digital_lifepage_readmore());
		
		servicepageobject.clickReadMoreButton(driver, "infrastructure_management_readmore",propertyfilepath);
        printtitle(driver,"Infrastructure Management");
		infrastructure_services_icon(driver);
		
		By click_readmore=helperobject.read_xpath(driver,"cloud_readmore",propertyfilepath);
		commmon_utility.click(driver, click_readmore);
		printtitle(driver,"Cloud Infrastructure");
		commmon_utility.navigateTo(driver);
		
		servicepageobject.clickReadMoreButton(driver, "devops_readmore",propertyfilepath);
		printtitle(driver,"Infrastructure Automation with Devops");
		infrastructure_services_icon(driver);
		
		servicepageobject.clickReadMoreButton(driver, "NOCservices_readmore",propertyfilepath);
		printtitle(driver,"NOC Services");
		infrastructure_services_icon(driver);
		
		servicepageobject.clickReadMoreButton(driver, "datacenter_management_readmore",propertyfilepath);
		printtitle(driver,"Data Center Management");
		infrastructure_services_icon(driver);
		
		servicepageobject.service_icon(driver);
		servicepageobject.home_icon(driver);
	}
	
	public List<String> infrastructure_servicespage_hyperlink()
	   {
		   List<String> hyperlink_content_expexted= new ArrayList<String>();
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
	
	public void click_infrastructure_services(WebDriver driver)
	{
		By reading_infrastructure_services_xpath=helperobject.read_xpath(driver,"infrastructure_services_submenu",propertyfilepath);
		commmon_utility.click(driver, reading_infrastructure_services_xpath);
	}
	public void printtitle(WebDriver driver,String expextedtitle)
	{
		By reading_title_xpath=helperobject.read_xpath(driver,"infrastructure_services_title",propertyfilepath);
		String infrastructure_services_title=commmon_utility.getTitle(driver, reading_title_xpath);
		System.out.println(infrastructure_services_title);
		commmon_utility.verifyAssert(infrastructure_services_title,expextedtitle);
		
	}
	
	public void infrastructure_services_icon(WebDriver driver) 
	{
		By backward_infrastructure_services_xpath=helperobject.read_xpath(driver,"infrastructure_services_icon",propertyfilepath);
		commmon_utility.click(driver, backward_infrastructure_services_xpath);
	}
}
