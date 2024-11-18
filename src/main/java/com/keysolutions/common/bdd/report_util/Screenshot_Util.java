package com.keysolutions.common.bdd.report_util;

import java.nio.file.Paths;
import java.util.Base64;

import com.keysolutions.common.bdd.common_utils.*;
import com.microsoft.playwright.Page;

public class Screenshot_Util {
	public static String takeScreenshot() {
		String path = System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() + ".png";
		// getPage().screenshot(new
		// Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));

		byte[] buffer = BrowserFactory.getInstance().getPage()
				.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
		String base64Path = Base64.getEncoder().encodeToString(buffer);

		return base64Path;
	}
}
