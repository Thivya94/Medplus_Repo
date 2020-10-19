package com.listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ExtentManager.extentManager;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Resources.BaseClass;

public class ListenerClass extends extentManager implements ITestListener {
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {

		test.log(Status.PASS, "Pass Test case is: " + result.getName());

	}

	public void onTestFailure(ITestResult result) {

		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));

		String pathString = BaseClass.screenShot(BaseClass.driver, result.getName());
		try {
			test.addScreenCaptureFromPath(pathString);
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {

		test.log(Status.SKIP, "Skipped Test case is: " + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stubb
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

}
