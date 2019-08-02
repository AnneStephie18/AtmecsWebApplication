package com.atmecs.qa.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.atmecs.qa.testbase.Base;

public class CommonUtilityMethods extends Base {
	
	public void performMouseOverInServiceMenu(WebDriver driver,By mouseclick)
	 {
		  System.out.println(driver);
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(mouseclick)).build().perform();
	 }
	public String getTitle(WebDriver driver,By title)
	{
		 return driver.findElement(title).getText();
	}
	
	public void verifyAssert(String actual,String expexted)
	{
		SoftAssert Assert=new SoftAssert();
		Assert.assertEquals(actual,expexted,"passed");
	}
	
	public List<String> countReadMoreButton(WebDriver driver,By readmore_xpath)
	{
		List<String> read_more_content= new ArrayList<String>();
		List<WebElement> read_more_button= driver.findElements(readmore_xpath);

		for(WebElement CountOfReadMore:read_more_button)
		{
			read_more_content.add(CountOfReadMore.getText());
		}
		System.out.println(read_more_content);
		return read_more_content;
	}
	
	public List<String> counthyperlink(WebDriver driver,By readmore_xpath)
	{
		List<String> hyperlink_content= new ArrayList<String>();
		List<WebElement> read_more_button= driver.findElements(readmore_xpath);
		
		for(WebElement CountOfReadMore:read_more_button)
		{
			hyperlink_content.add(CountOfReadMore.getText());
		    CountOfReadMore.getSize();
		}
		System.out.println(hyperlink_content);
		return hyperlink_content;
	}
	
   public void verifyAssertListOfText(List<String> actual, List<String> expexted) 
    {
	   Assert.assertEquals(actual,expexted,"passed");
	}
   
public void click(WebDriver driver,By clickxpath)
	{
		 driver.findElement(clickxpath).click();		 
	}
	
	public void navigateTo(WebDriver driver)
	{
		driver.navigate().back();
	}
	
}
