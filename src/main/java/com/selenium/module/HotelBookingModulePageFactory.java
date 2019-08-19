package com.selenium.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.core.GenericModule;

public class HotelBookingModulePageFactory extends GenericModule{

	
	@FindBy(linkText = "Hotels")
	WebElement hotelLink;

	@FindBy(id = "Tags")
	WebElement localityTextBox;
	
	@FindBy(xpath="//*[@id='ui-id-1']//li")
	WebElement selectLocality;
	
	@FindBy(id="CheckInDate")
	WebElement checkInDateSelction;
    	
	@FindBy(id="CheckOutDate")
	WebElement checkOutDateSelction;
	
	@FindBy(css = "select[id='travellersOnhome']")
	WebElement travellerSelection;
	
	@FindBy(id = "SearchHotelsButton")
	WebElement searchButton;
	
	
	public HotelBookingModulePageFactory(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
		System.out.println("Initilize All page factory element");
	}
	
	// click Hotel link
    public void clickHotelLink(){
    	hotelLink.click();
    	System.out.println("Click on hotel link");
    }
    
    // Search Locality TextBox
    public void searchAndSelectLocality(String locality){
    	localityTextBox.sendKeys(locality); 
    	selectLocality.findElement(By.xpath("//a[starts-with(text(),'"+locality+"')]")).click();
    	System.out.println("Search and select locality :"+ locality);
    }
	
    // Select check In Date
    public void selectCheckInDate(String day, String month, String year){
    	checkInDateSelction.findElement(By.xpath("//td[@data-month='"+month+"' and @data-year='"+year+"']/a[text()='"+day+"']")).click();
    	System.out.println("Select checkIn date: "+day+"/"+month+"/"+year);
    }
    
    
    // Select Check Out date
    public void selectCheckOutDate(String day, String month, String year){
    	checkOutDateSelction.findElement(By.xpath("//td[@data-month='"+month+"' and @data-year='"+year+"']/a[text()='"+day+"']")).click();
    	System.out.println("Select check out date: "+day+"/"+month+"/"+year);
    }
    
    
    // Select Travelers
    public void selectTravellers(String travellers){
    	selectByVisibleText(travellerSelection, travellers);
    }

    // click on search Hotels button
    public void clickOnSearchHotelsButton(){
    	searchButton.click();
    	System.out.println("Click on search hotels button");
    }
    
}
