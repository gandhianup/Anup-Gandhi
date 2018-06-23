package com.cocoin.n26task.utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cocoin.n26task.config.AppConstants;
import com.cocoin.n26tasks.init.Init;

public class Utility {
	
	public static WebElement findByXpath(String string) throws InterruptedException {
		
		Init.element = Init.driver.findElement(By.xpath(string));
		Thread.sleep(500);
		return Init.element;
	}
	
	public static WebElement findByID(String string) throws InterruptedException {
		Init.element = Init.driver.findElement(By.id(string));
		Thread.sleep(500);
		return Init.element;
	}

	public static WebElement findByClass(String string) throws InterruptedException {
		Init.element = Init.driver.findElement(By.className(string));
		Thread.sleep(500);
		return Init.element;
	}
	
	public static WebElement passwordAgin() {
		Init.element = Init.driver.findElement(By.id(Init.configProperties.getProperty("passwordAgain")));
		return Init.element;
	}
	
	public static void enterPasscode(Boolean flag) throws InterruptedException {
		
		Utility.findByXpath(AppConstants.INPUT1).click();
		Utility.findByXpath(AppConstants.INPUT2).click();
		Utility.findByXpath(AppConstants.INPUT3).click();
		Utility.findByXpath(AppConstants.INPUT4).click();
		Thread.sleep(1000);
		reEnterPasscode(flag);
	}
	
	public static void reEnterPasscode(boolean flag) throws InterruptedException {
		
		if (flag) {
			flag=false;
			enterPasscode(flag);
		}
	}
	
	public static void homeScreenSwipe() throws InterruptedException, FileNotFoundException, IOException {
		
		//Handling initial 4 swipes
		Thread.sleep(7000);
		Init.driver.swipe(1300, 750, 50, 750, 1000);
		Thread.sleep(2000);
		Init.driver.swipe(1300, 750, 50, 750, 1000);
		Thread.sleep(2000);
		Init.driver.swipe(1300, 750, 50, 750, 1000);
		Thread.sleep(2000);
		Init.driver.swipe(1300, 750, 50, 750, 1000);
		Thread.sleep(2000);
	}
		
	public static void close() {
		Init.driver.quit();
	}
}
