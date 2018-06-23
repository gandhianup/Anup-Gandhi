package com.cocoin.n26task.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cocoin.n26task.config.AppConstants;
import com.cocoin.n26task.utility.Log;
import com.cocoin.n26task.utility.Utility;
import com.cocoin.n26tasks.init.Init;

public class DefaultValue extends Init {
	
	@Test(priority=1)
	public void login() throws InterruptedException, IOException {
	
		Log.startTestCase("Checking Default Values Start");
		
		Login appLogin = new Login();
		appLogin.login();
		
		String initialValue = Utility.findByID(AppConstants.ENTER_AMOUNT).getText();
		Assert.assertEquals(initialValue, "0");
		
		Log.info("Login Successfull");
		Log.info("By Default no value is entered in the amount field");
		Log.endTestCase("Checking Default Values End");
		Utility.close();
	}
}
