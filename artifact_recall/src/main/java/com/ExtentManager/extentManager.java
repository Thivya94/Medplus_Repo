package com.ExtentManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Resources.MyBaseClass;



public class extentManager {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	
	public static void setExtent() {
		htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "\\" + "reports\\" + "index_" + MyBaseClass.getCurrentTime() + ".html");

		htmlReporter.config().setDocumentTitle("Automation Test Report");
		htmlReporter.config().setReportName("Medplus Test Automation Report");
		htmlReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("HostName", "MyHost");
		extent.setSystemInfo("ProjectName", "Medplus");
		extent.setSystemInfo("Tester", "Thivya");
		extent.setSystemInfo("OS", "Win10");
		extent.setSystemInfo("Browser", "Chrome");
		
	}
	
	public static void endReport() {
		extent.flush();
	}

}
