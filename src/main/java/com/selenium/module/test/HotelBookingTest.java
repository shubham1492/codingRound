package com.selenium.module.test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.core.TestBase;

public class HotelBookingTest extends TestBase {

    @Test
    public void shouldBeAbleToSearchForHotels() {
       
    	String day = "23";
    	String month = "8";
    	String year = "2019";
    	
    	String day1 = "25";
    	String month1 = "9";
    	String year1 = "2019";
    	
        hotelBookingPageFactory.clickHotelLink();
        hotelBookingPageFactory.searchAndSelectLocality("Indiranagar, Bangalore");
        hotelBookingPageFactory.selectCheckInDate(day, month, year);
        hotelBookingPageFactory.selectCheckOutDate(day1, month1, year1);
        hotelBookingPageFactory.selectTravellers("2 rooms, 4 adults");
        hotelBookingPageFactory.clickOnSearchHotelsButton();

    }
    
}
