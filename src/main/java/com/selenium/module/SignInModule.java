package com.selenium.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.selenium.core.GenericModule;

public class SignInModule extends GenericModule{

	public SignInModule(WebDriver webdriver) {
		super(webdriver);
	}

	/**
	 * This method is use to click on your trip link
	 * 
	 */
	public void clickOnYourTripLink() {
		driver.findElement(By.linkText("Your trips")).click();
		System.out.println("Click on your trips link");
	}

	/**
	 * This method is use to click on your trip link
	 * 
	 */
	public void clickOnSignIn() {
		driver.findElement(By.id("SignIn")).click();
		System.out.println("Click on sign in button");
	}

	/**
	 * This method is use to click on popup signIn button
	 * 
	 */
	public void clickOnPopUpSignIn() {
		// Added switch to Frame new model window
		driver.switchTo().frame(driver.findElement(By.id("modal_window")));
		System.out.println("Switch to popup window");
		driver.findElement(By.id("signInButton")).click();
		System.out.println("Click on popup sign in button");
	}
	
	/**
	 * This method is use to return error text Message in Popup Sign in page
	 * 
	 */
	public String getErrorText() {
		String errorText=driver.findElement(By.id("errors1")).getText();
		System.out.println("Get Error Text Message:"+ errorText);
		return errorText;
	}
	
	














}
