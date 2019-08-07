package com.atmecs.qa.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.qa.testbase.Base;
/**
 * This class is used to load properties file and explicit wait
 * @author Anne.Sivakumar
 *
 */
public class Helper {
	Base base = new Base();
	public String PagePath;

	//load the property file and read the xpath 
	public By read_xpath(WebDriver driver, String xpath, String loadpropertyfile) 
	{
		//PagePath = loadpropertyfile;
		base.readProperties(loadpropertyfile);
		return By.xpath(base.properties.getProperty(xpath));
	}

	//wait up to 10 seconds and check the element is visible/not 
	public boolean explixitWait(WebDriver driver, String value) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try 
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(base.properties.getProperty(value))));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(base.properties.getProperty(value))));
		} 
		catch (Exception e) 
		{
			return false;
		}
		return true;
	}

}
