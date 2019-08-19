package com.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericModule{

	protected WebDriver driver;

	public GenericModule(WebDriver webdriver) {
		this.driver=webdriver;
	}

	// 
	public void waitFor(int durationInMilliSeconds) {
		try {
			Thread.sleep(durationInMilliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		}
	}

	/**
	 * This method use to verify the visibility of element
	 * 
	 * @param by
	 * @param t
	 * @return
	 */
	public boolean checkRendered(final By by,int t) {
		long timeout = t; 
		if(t >= 1000) {
			timeout = t/1000;
		}
		try {
			(new WebDriverWait(driver, t)).until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver d) {
					return d.findElement(by);
				}
			});
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	/**
	 * This method use to select drop down value 
	 * 
	 * @param by
	 * @param visibleText
	 */
	public void selectByVisibleText(WebElement element,String visibleText) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(visibleText);
			System.out.println("Select text from dropdown "+visibleText);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

    // this method is not correct because there is no synchronization to check element present or not   
	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}


}
