package com.selenium.webdriver;

import org.testng.Reporter;

import com.selenium.constant.Constant;

public class WebDriverProducerFactory {

	
	public static WebDriverImpl getWebDriver(String browserType) {
		
		WebDriverImpl webdriver=null;
		// Check weather browser is chrome it will return chrome browser object 
		if(browserType.toLowerCase().contains(Constant.CHROME)) {
			webdriver=new ChromeWebDriver();
			Reporter.log("Get object of chrome Webdriver");
		}
		return webdriver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
