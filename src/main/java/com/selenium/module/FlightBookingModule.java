package com.selenium.module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.selenium.constant.Constant;
import com.selenium.core.GenericModule;

public class FlightBookingModule extends GenericModule {

	public FlightBookingModule(WebDriver webdriver) {
		super(webdriver);
	}

	/**
	 * This method use to select trip type like One_Way ,Round_trip etc
	 * 
	 * @param type
	 */
	public void selectTrip(String type) {

		if (type.equalsIgnoreCase("One Way")) {
			driver.findElement(By.id("OneWay")).click();
		    System.out.println("Select Radio button One way");
		}
		else if (type.equalsIgnoreCase("Round trip")) {
			driver.findElement(By.id("RoundTrip")).click();
			System.out.println("Select Radio button Round Trip");
		}
		else {
			driver.findElement(By.id("MultiCity")).click();
			System.out.println("Select Radio button Multi-city");
		}
	}

	/**
	 * This method use to select City Source
	 * 
	 * @param type
	 */
	public void searchAndSelectCitySource(String city) {
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys(city);
		System.out.println("Search city source name :"+city);

		if (checkRendered(By.id("ui-id-1"), Constant.MEDIUM_TIMEOUT)) {
			List<WebElement> originOptions = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
			originOptions.get(0).click();
			System.out.println("Select city source name :"+city);
		} else {
			Assert.assertTrue(false, city + ": selction not found");
		}
	}

	/**
	 * This method use to select City Destination 
	 * 
	 * @param type
	 */
	public void searchAndSelectCityDestination(String city) {
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys(city);
		System.out.println("Search city destination name :"+city);
		if (checkRendered(By.id("ui-id-2"), Constant.MEDIUM_TIMEOUT)) {
			List<WebElement> originOptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
			originOptions.get(0).click();
			System.out.println("Select city destination name :"+city);
		} else {
			Assert.assertTrue(false, city + ": selction not found");
		}
	}

	/**
	 * This method use to select Depart on date 
	 * 
	 * @param type
	 */
	public void selectDeparcherDate(String month,String year,String day) {

		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//td[@data-month='"+month+"' and @data-year='"+year+"']/a[text()='"+day+"']")).click();
		System.out.println("Select Depart on date: "+day+"/"+month+"/"+year);

	}

	/**
	 * This method use to click Search Button
	 * 
	 * @param type
	 */
	public void clickSearchButton() {

		driver.findElement(By.id("SearchBtn")).click();
		System.out.println("Click on Search Button");

	}





}
