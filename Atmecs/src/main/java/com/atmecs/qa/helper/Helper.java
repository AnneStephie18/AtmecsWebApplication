package com.atmecs.qa.helper;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.qa.testbase.Base;

public class Helper {
	Base base = new Base();
	public String servicePagePath,digitalpagePagePath,cloudservicespagePagePath,enterpriseanalyticspagePagePath;
	public String productengineeringpagePagePath,mobilecomputingpagePagePath,qualityengineeringpagePagePath,infrastructureservicespagePagePath;
	
	public By read_xpath(WebDriver driver,String xpath,String loadpropertyfile)
	{
		cloudservicespagePagePath = loadpropertyfile;
		base.readProperties(cloudservicespagePagePath);
		return By.xpath(base.properties.getProperty(xpath));
	}
	
	
	
}
