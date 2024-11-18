package com.keysolutions.common.bdd.NG_Listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.keysolutions.common.bdd.common_utils.*;
import com.keysolutions.common.bdd.report_util.*;

public class PageEvent implements ITestListener {
	BrowserFactory browserFactory = BrowserFactory.getInstance();
	public static String strBrowser;

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("+++++++++++++++++++++onTestStart++++++++++++++++++++");
		strBrowser = System.getProperty("Browser");
		System.out.println("Execution Started @ " + strBrowser + " Browser & for type : Web UI");
		try {

			VideoRecord.startRecord(arg0.getMethod().getMethodName());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {

		try {
			VideoRecord.stopRecord();
			BrowserFactory.getPage().close();

			// initDriver.tearDownWebDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {

		System.out.println("+++++++++++++++++++++onTestFailure++++++++++++++++++++");
		ReportManager.logFail(iTestResult.getThrowable().toString());

		try {
			ReportManager.logScreenshot();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ReportManager.endCurrentTest();

		try {

			VideoRecord.stopRecord();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

		String logText = "<b>" + arg0.getMethod().getMethodName() + " is skipped.</b>";
		Markup markup_message = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);

	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext arg0) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}
}
