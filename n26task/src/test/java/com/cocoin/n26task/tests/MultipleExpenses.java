package com.cocoin.n26task.tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.cocoin.n26task.config.AppConstants;
import com.cocoin.n26task.utility.Log;
import com.cocoin.n26task.utility.Utility;
import com.cocoin.n26tasks.init.Init;

public class MultipleExpenses extends Init {

	@Test(priority=4)
	public void multipleExpense() throws InterruptedException, IOException {
		
		Log.startTestCase("Adding Multiple Records start");
		
		Login appLogin = new Login();
		appLogin.login();
		
		Thread.sleep(2000);
		Utility.findByXpath(AppConstants.BREAKFAST).click();
		Utility.findByXpath(AppConstants.INPUT5).click();
		Utility.findByXpath(AppConstants.INPUT0).click();
		Utility.findByXpath(AppConstants.CHECK_MARK).click();
		Log.info("First Record Inserted Successfully");
		
		Utility.findByXpath(AppConstants.LUNCH).click();
		Utility.findByXpath(AppConstants.INPUT8).click();
		Utility.findByXpath(AppConstants.INPUT0).click();
		Utility.findByXpath(AppConstants.CHECK_MARK).click();
		Log.info("Second Record Inserted Successfully");
		
		Utility.findByXpath(AppConstants.TRAFFIC).click();
		Utility.findByXpath(AppConstants.INPUT2).click();
		Utility.findByXpath(AppConstants.INPUT0).click();
		Utility.findByXpath(AppConstants.INPUT0).click();
		Utility.findByXpath(AppConstants.CHECK_MARK).click();
		Log.info("Third Record Inserted Successfully");
		
		Utility.findByID(AppConstants.MENU_OPTION).click();
		Thread.sleep(1000);
		
		Utility.enterPasscode(false);
		
		String totalExpense = Utility.findByID(AppConstants.EXPENSE).getText();
		
		Assert.assertEquals(totalExpense.trim(), "$330");
		Log.info("All expenses are added up and the sum is showing apprpiately");
		Log.endTestCase("Adding Multiple Records complete");
		Utility.close();
	}
	
}
