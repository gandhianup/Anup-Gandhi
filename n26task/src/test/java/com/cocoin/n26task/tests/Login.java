package com.cocoin.n26task.tests;

import java.io.IOException;

import com.cocoin.n26task.utility.Log;
import com.cocoin.n26task.utility.Utility;

public class Login {
	
	public void login() throws IOException, InterruptedException {
		
		Log.startTestCase("Login Start");
		Utility.homeScreenSwipe();
		Utility.enterPasscode(true);
		Log.endTestCase("Login Complete");
	}
	
	
}
