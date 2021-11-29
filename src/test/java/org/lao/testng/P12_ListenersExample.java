package org.lao.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class P12_ListenersExample implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
System.out.println("Teststart");		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("success");			
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("failed");			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestSkipped");			
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("TestFailedButWithinSuccessPercentage");			
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("first start");			
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("last finsh");			
	}

}
