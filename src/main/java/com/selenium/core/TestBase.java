package com.selenium.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.selenium.constant.Constant;
import com.selenium.module.FlightBookingModule;
import com.selenium.module.HotelBookingModulePageFactory;
import com.selenium.module.SignInModule;
import com.selenium.webdriver.WebDriverImpl;
import com.selenium.webdriver.WebDriverProducerFactory;

public class TestBase {

	protected WebDriver driver;
	protected GenericModule genericModule;
	protected HotelBookingModulePageFactory hotelBookingPageFactory;
	protected FlightBookingModule flightBooking;
	protected SignInModule signInModule;

	@BeforeSuite
	public void SetUp() {
		System.out.println("Creating Webdriver : webdriver created");

		WebDriverImpl webdriverImpl = WebDriverProducerFactory.getWebDriver(Constant.CHROME);
		driver = webdriverImpl.getWebBrowserDriver();
		driver.get(Constant.TARGET_URL);
		System.out.println("Lauch URL:"+Constant.TARGET_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		genericModule = new GenericModule(driver);
		hotelBookingPageFactory = new HotelBookingModulePageFactory(driver);
		flightBooking = new FlightBookingModule(driver);
		signInModule = new SignInModule(driver);
	}

	@AfterSuite
	public void TearDown() {
		System.out.println("Closing webdriver : webdriver quit");
		driver.close();
	}

}
