
package com.atmecs.qa.constants;

import java.io.File;

public class Constants {
    public final static String PROJECT_BASE_PATH= System.getProperty("user.dir");
    public final static long PAGE_LODE_TIMEOUT = 20;
	public final static long IMPLICIT_WAIT = 10;
	public final static String PROJECT_SERVICE_PATH=PROJECT_BASE_PATH + File.separator+"resources"+File.separator+"locators"+File.separator+"Services.properties";
	public final static String PROJECT_DIGITALLIFE_PATH=PROJECT_BASE_PATH + File.separator+"resources"+File.separator+"locators"+File.separator+"digitallife.properties";
	public final static String PROJECT_CLOUDSERVICES_PATH=PROJECT_BASE_PATH + File.separator+"resources"+File.separator+"locators"+File.separator+"cloudservices.properties";
	public final static String PROJECT_ENTERPRISEANALYTICS_PATH=PROJECT_BASE_PATH + File.separator+"resources"+File.separator+"locators"+File.separator+"enterpriseanalytics.properties";
	public final static String PROJECT_PRODUCTENGINEERING_PATH=PROJECT_BASE_PATH + File.separator+"resources"+File.separator+"locators"+File.separator+"productengineering.properties";
	public final static String PROJECT_MOBILECOMPUTING_PATH=PROJECT_BASE_PATH + File.separator+"resources"+File.separator+"locators"+File.separator+"mobilecomputing.properties";
	public final static String PROJECT_QUALITYENGINEERING_PATH=PROJECT_BASE_PATH + File.separator+"resources"+File.separator+"locators"+File.separator+"qualityengineering.properties";
	public final static String PROJECT_INFRASTRUCTURESERVICES_PATH=PROJECT_BASE_PATH + File.separator+"resources"+File.separator+"locators"+File.separator+"infrastructureservices.properties";
	
}
