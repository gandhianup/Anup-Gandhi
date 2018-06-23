package com.cocoin.n26task.config;

import com.cocoin.n26tasks.init.Init;

public class AppConstants {

	public static final String DEVICE_NAME = Init.configProperties.getProperty("deviceName");
	public static final String VERSION = Init.configProperties.getProperty("version");
	public static final String PLATFORM_NAME = Init.configProperties.getProperty("platformName");
	public static final String APP_PACKAGE = Init.configProperties.getProperty("appPackage");
	public static final String APP_ACTIVITY = Init.configProperties.getProperty("appActivity");
	public static final String URL = Init.configProperties.getProperty("URL");
	
	public static final String INPUT1 = Init.configProperties.getProperty("input1");
	public static final String INPUT2 = Init.configProperties.getProperty("input2");
	public static final String INPUT3 = Init.configProperties.getProperty("input3");
	public static final String INPUT4 = Init.configProperties.getProperty("input4");
	public static final String INPUT5 = Init.configProperties.getProperty("input5");
	public static final String INPUT6 = Init.configProperties.getProperty("input6");
	public static final String INPUT7 = Init.configProperties.getProperty("input7");
	public static final String INPUT8 = Init.configProperties.getProperty("input8");
	public static final String INPUT9 = Init.configProperties.getProperty("input9");
	public static final String INPUT0 = Init.configProperties.getProperty("input0");
	public static final String CHECK_MARK = Init.configProperties.getProperty("checkMark");
	public static final String BREAKFAST = Init.configProperties.getProperty("breakfast");
	public static final String LUNCH = Init.configProperties.getProperty("lunch");
	public static final String TRAFFIC = Init.configProperties.getProperty("traffic");
	
	public static final String MENU_OPTION = Init.configProperties.getProperty("menuOption");
	public static final String CHART_PIE = Init.configProperties.getProperty("chartpie");
	public static final String LIST_VIEW = Init.configProperties.getProperty("listView");
	public static final String EMPTY_LIST_VIEW = Init.configProperties.getProperty("emptyListView");
	public static final String EXPENSE = Init.configProperties.getProperty("expense");
	public static final String SET_LIMIT = Init.configProperties.getProperty("setLimit");
	public static final String INPUT_LIMIT = Init.configProperties.getProperty("inputLimit");
	public static final String OK_BUTTON = Init.configProperties.getProperty("OKButton");
	public static final String RIGHT_EXPENSE = Init.configProperties.getProperty("rightExpense");
	public static final String ENTER_AMOUNT = Init.configProperties.getProperty("enterAmount");
	
	
	public static final String IMAGE_BUTTON = Init.configProperties.getProperty("imageButton");
	public static final String LIST_VIEW_RECORDS = Init.configProperties.getProperty("listViewRecords");
	
}
