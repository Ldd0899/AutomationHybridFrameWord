package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import base.BaseTest;

public class MyTestNGListener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		test.log(Status.INFO, result.getMethod().getMethodName()+"is Started ...");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

	    String screenshotPath = UtilKits.getScreenshot();

	    if (screenshotPath != null && !screenshotPath.isEmpty()) {
	        test.addScreenCaptureFromPath(screenshotPath);
	    }

	    test.log(Status.PASS,
	        result.getMethod().getMethodName() + " is passed");
	}
	

	@Override
	public void onTestFailure(ITestResult result) {
		//test.addScreenCaptureFromPath(UtilKits.getScreenshot());
		test.log(Status.INFO,result.getMethod().getMethodName()+" is fail ...");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
}
