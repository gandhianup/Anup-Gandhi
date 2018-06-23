package com.cocoin.n26tasks.init;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.cocoin.n26task.config.AppConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Init {
	
	public static Properties configProperties;
	private DesiredCapabilities capabilities;
	public static AppiumDriver<WebElement> driver;
	public static WebElement element;
	public static XSSFSheet sheet;
	public static XSSFWorkbook workbook;
	public static XSSFCell cell;
	
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		
		//Load files
		loadProperties("/config.properties");
		
		//Setting the desired capabilities
		
		capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, AppConstants.DEVICE_NAME); 
		capabilities.setCapability(MobileCapabilityType.VERSION, AppConstants.VERSION);
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, AppConstants.PLATFORM_NAME);
	    capabilities.setCapability("appPackage", AppConstants.APP_PACKAGE);
	    capabilities.setCapability("appActivity", AppConstants.APP_ACTIVITY);
	 
		//Instantiating driver
		
	    Init.driver = new AndroidDriver<WebElement>(new URL(AppConstants.URL), capabilities);
	    Init.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertNotNull(Init.driver.getContext());
	}

	private void loadProperties(String filePath) throws IOException {
		
		configProperties = new Properties();
	    InputStream is = null;
	    is = this.getClass().getResourceAsStream(filePath);
		configProperties.load(is);
	}
}
