package com.keysolutions.common.bdd.report_util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.keysolutions.common.bdd.common_utils.*;

public class ReportManager {

	public static ExtentReports extent;
	public static Map<Long, ExtentTest> testMap = new HashMap<>();
	public static Map<String, ExtentTest> extentMap = new HashMap<>();

	public static void startReport() {

		if (Objects.isNull(extent)) {
			extent = new ExtentReports();
			String timeStamp = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
			String dateStamp = new SimpleDateFormat("dd.MM.yyyy").format(new Date());

			ExtentSparkReporter spark = new ExtentSparkReporter(Constants.extent_reportPath);
			extent.attachReporter(spark);

			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("TestPerform-Keysolutions_POC");
			spark.config().setReportName("KeySolutions");

			extent.setSystemInfo("Organization", "TestPerform-Keysolutions_POC");
			extent.setSystemInfo("Employee", "Test User");
			extent.setSystemInfo("Domain", "Engineering (IT - Software)");
			extent.setSystemInfo("Skill", "Test Automation Engineer");

		}

	}

	public static void startTest(String testName, String categories) {
		if (extentMap.containsKey(testName)) {
			extent.removeTest(extentMap.get(testName));
			testName = "Rerun - " + testName;
		}
		ExtentTest test = extent.createTest(testName);
		test.assignCategory(categories);
		testMap.put(Thread.currentThread().getId(), test);
		extentMap.put(testName, test);
	}

	public static void logScreenshot() throws IOException { //
		getCurrentTest().addScreenCaptureFromBase64String(Screenshot_Util.takeScreenshot());
		Media mediaModel = MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot_Util.takeScreenshot())
				.build();
		getCurrentTest().fail("", mediaModel);

	}

	public static void logPass(String message) {
		getCurrentTest().log(Status.PASS, message);

	}

	public static void logFail(String message) {
		getCurrentTest().log(Status.FAIL, message);
	}

	public static void logInfo(String message) {
		getCurrentTest().log(Status.INFO, message);

	}

	public static void endCurrentTest() {
		getCurrentTest().getExtent().flush();

		testMap.remove(Thread.currentThread().getId());
	}

	public static ExtentTest getCurrentTest() {
		return testMap.get(Thread.currentThread().getId());

	}

	public static void endReport() {

		extent.flush();
	}

}