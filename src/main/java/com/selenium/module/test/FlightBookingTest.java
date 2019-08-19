package com.selenium.module.test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.constant.Constant;
import com.selenium.core.TestBase;

public class FlightBookingTest extends TestBase{
	
    @Test
    public void searchFlightTest() {
        
    	String trip = "One Way";
    	String sourceCity = "Bangalore";
    	String destinationCity = "Delhi";
    	String day = "23";
    	String month = "7";
    	String year = "2019";
    	
    	
    	flightBooking.selectTrip(trip);
    	
    	flightBooking.searchAndSelectCitySource(sourceCity);
    	
    	flightBooking.searchAndSelectCityDestination(destinationCity);
    	
    	flightBooking.selectDeparcherDate(month, year, day);
    	
    	flightBooking.clickSearchButton();
    
        Assert.assertTrue(genericModule.checkRendered(By.className("searchSummary"),Constant.SHORT_TIMEOUT));

    }

   
}
