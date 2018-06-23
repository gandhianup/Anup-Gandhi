package com.cocoin.n26task.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cocoin.n26task.config.AppConstants;
import com.cocoin.n26task.utility.Log;
import com.cocoin.n26task.utility.Utility;
import com.cocoin.n26tasks.init.Init;

public class SetExpenseLimit extends Init {
	
  @Test(priority=2)
  public void addRecord() throws InterruptedException, IOException {
	  
	  Log.startTestCase("Set Expense Limit start");
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
	  Utility.findByXpath(AppConstants.IMAGE_BUTTON).click();
	  Thread.sleep(1000);
	  Utility.findByID(AppConstants.SET_LIMIT).click();
	  Thread.sleep(1000);
	  Log.info("Successfully Navigated to set expense limit page");
	  Utility.findByID(AppConstants.INPUT_LIMIT).sendKeys("10");
	  Utility.findByXpath(AppConstants.OK_BUTTON).click();
	  Thread.sleep(1000);
	  Utility.findByID(AppConstants.INPUT_LIMIT).sendKeys("200");
	  Utility.findByXpath(AppConstants.OK_BUTTON).click();
	  Thread.sleep(1000);
	  Assert.assertEquals(Utility.findByID(AppConstants.RIGHT_EXPENSE).getText().trim(), "$200");
	  Log.info("Expense limit set successfully");
	  Log.endTestCase("Set Expense Limit complete");
	  Utility.close();
	}
}
