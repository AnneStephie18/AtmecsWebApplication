package com.atmecs.qa.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.atmecs.qa.logreports.LogReports;
import com.atmecs.qa.testbase.Base;
/**
 * This class is used to perform operations such as click, mouse over, get title, verify assert, navigate to, count read more button, count hyper link present 
 * @author Anne.Sivakumar
 *
 */
public class CommonUtilityMethods extends Base {
	LogReports log=new LogReports();
	
	
	 //get xpath and driver  as parameter and perform mouse over using actions class
	public void performMouseOverInServiceMenu(WebDriver driver,By mouseclick)
	 {
		  //System.out.println(driver);
		log.info("Driver:"+driver);
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(mouseclick)).build().perform();
	 }
	
	//return the title of the page
	public String getTitle(WebDriver driver,By title)
	{
		
		 return driver.findElement(title).getText();
	}
	
	//verify with the actual and expected title is same
	public void verifyAssert(String actual,String expected)
	{
		//SoftAssert Assert=new SoftAssert();
		log.info("Actual Title of the page:"+actual);
		log.info("ExpectedTitle of the page:"+expected);
		Assert.assertEquals(actual,expected,"passed");
	}
	
	//count and print the number of read more button  by passing xpath as parameter
	public List<String> countReadMoreButton(WebDriver driver,By readmore_xpath)
	{
		List<String> read_more_content= new ArrayList<String>();
		List<WebElement> read_more_button= driver.findElements(readmore_xpath);

		for(WebElement CountOfReadMore:read_more_button)
		{
			read_more_content.add(CountOfReadMore.getText());
		}
		log.info("List of Read More content"+read_more_content);
		log.info("Read More count"+read_more_content.size());
		return read_more_content;
	}
	
	//count and print the number of hyper link button  by passing xpath as parameter
	public List<String> counthyperlink(WebDriver driver,By readmore_xpath)
	{
		List<String> hyperlink_content= new ArrayList<String>();
		List<WebElement> read_more_button= driver.findElements(readmore_xpath);
		
		for(WebElement CountOfReadMore:read_more_button)
		{
			hyperlink_content.add(CountOfReadMore.getText());
		    CountOfReadMore.getSize();
		}
		log.info("List of Hyper Link content"+hyperlink_content);
		log.info("Hyper Link count"+hyperlink_content.size());
		return hyperlink_content;
	}
	
	//verify with list of actual and expected title is same
   public void verifyAssertListOfText(List<String> actual, List<String> expected) 
    {
	   log.info("Actual Title of the page:"+actual);
	   log.info("ExpectedTitle of the page:"+expected);
	   Assert.assertEquals(actual,expected,"passed");
	}
   
 //perform click operation by passing xpath as parameter
public void click(WebDriver driver,By clickxpath)
	{
		 driver.findElement(clickxpath).click();		 
	}
	
//navigate to the previous page
	public void navigateTo(WebDriver driver)
	{
		driver.navigate().back();
	}
	
}
