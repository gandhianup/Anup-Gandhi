package com.cocoin.n26task.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cocoin.n26task.config.AppConstants;
import com.cocoin.n26task.utility.Log;
import com.cocoin.n26task.utility.Utility;
import com.cocoin.n26tasks.init.Init;

public class ValidateListView extends Init{
	
	@Test(priority=3)
	public void validateListView() throws InterruptedException, FileNotFoundException, IOException {
		
		Log.startTestCase("Validate List View start");
		
		Login appLogin = new Login();
		appLogin.login();
		
		Thread.sleep(2000);
		Utility.findByID(AppConstants.MENU_OPTION).click();
		Thread.sleep(1000);
		Utility.enterPasscode(false);
		Thread.sleep(1000);
		Utility.findByXpath(AppConstants.IMAGE_BUTTON).click();
		Thread.sleep(1000);
		Utility.findByID(AppConstants.LIST_VIEW).click();
		Thread.sleep(1000);
		
		Assert.assertTrue(Utility.findByID(AppConstants.EMPTY_LIST_VIEW).isDisplayed());
		Log.info("No records found since no records entered");
		Log.endTestCase("Validate List View complete");
		Utility.close();
	}	
}
