package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.javafx.PlatformUtil;

public class ChromeWebDriver implements WebDriverImpl{

	WebDriver driver=null;
	
	/**
	 * This method is use to get web browser based on Platform  like window,Linux and Mac
	 * 
	 */
	public WebDriver getWebBrowserDriver() {
	
		if (PlatformUtil.isMac()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver_mac.exe");
			driver = new ChromeDriver();
		}
		if (PlatformUtil.isWindows()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (PlatformUtil.isLinux()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver_linux.exe");
			driver = new ChromeDriver();
		}
		return driver;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
