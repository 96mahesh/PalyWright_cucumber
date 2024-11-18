package com.keysolutions.common.bdd.ccl;

import java.util.List;
import java.util.function.IntPredicate;

import com.keysolutions.common.bdd.common_utils.*;
import com.keysolutions.common.bdd.report_util.*;
import com.microsoft.playwright.Download;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class PlayActions {

	private Page page = BrowserFactory.getInstance().getPage();

	public void openURL(String URL) {
		page.navigate(URL);
		String ActualURL = BrowserFactory.getInstance().getPage().url();
		System.out.println("Actual URL - " + ActualURL);
		System.out.println("Expected URL - " + URL);
		ReportManager.logInfo("Actual URL - " + ActualURL);
		ReportManager.logInfo("Expected URL - " + URL);
	}

	public void click(String locator, String info) {
		page.click(locator);
		System.out.println("Successfully clicked on  -  " + info);
		ReportManager.logInfo("Successfully clicked on  -  " + info);
	}

	public void fill(String locator, String value, String info) {
		page.fill(locator, value);
		System.out.println("Successfully entered the value -  " + value + " in " + info + " box");
		ReportManager.logInfo("Successfully entered the value -  " + value + " in " + info + " box");
	}

	public void frame(String value) {
		page.frame(value);
		System.out.println("Successfully entered into Frame with -  " + value);
		ReportManager.logInfo("Successfully entered into Frame with -  " + value);

	}

	public String getText(String locator) {
		String Text = page.textContent(locator);
		System.out.println("Text is -  " + Text);
		ReportManager.logInfo("Text is -  " + Text);
		return Text;
	}

	public void draganddrop(String source, String target) {
		page.dragAndDrop(source, target);
		System.out.println("Successfully dragged from " + source + " to " + target);
		ReportManager.logInfo("Successfully dragged from " + source + " to " + target);
	}

	public void check(String locator, String info) {
		page.check(locator);
		System.out.println("Successfully clicked on -  " + locator + " in " + info + " box");
		ReportManager.logInfo("Successfully clicked on -  " + locator + " in " + info + " box");

	}

	public void getContent() {
		page.content();
		System.out.println("The HTML page content is ");
		ReportManager.logInfo("The HTML page content is ");
	}

	public void doubleClick(String locator, String info) {
		page.dblclick(locator);
		System.out.println("Successfully clicked on  -  " + info);
		ReportManager.logInfo("Successfully clicked on  -  " + info);
	}

	public void backButton(String info) {
		page.goBack();
		System.out.println("Successfully clicked on Back Button");
		ReportManager.logInfo("Successfully clicked on Back Button");
	}

	public String getCurrentURL() {
		String Currenturl = page.url();
		return Currenturl;
	}

	public void nextPage(String locator, String info) {
		page.goForward();
		System.out.println("Successfully clicked on Forward Button");
		ReportManager.logInfo("Successfully clicked on Forward Button");
	}

	public void mouseHover(String locator, String info) {
		page.hover(locator);
		System.out.println("Successfully mouse hoverd on  -  " + info);
		ReportManager.logInfo("Successfully mouse hoverd on  -  " + info);
	}

	public void isChecked(String locator, String info) {
		page.isChecked(locator);
		System.out.println("Successfully element is checked  -  " + info);
		ReportManager.logInfo("Successfully element is checked  -  " + info);
	}

	public void isDisabled(String locator, String info) {
		page.isDisabled(locator);
		System.out.println("Successfully element is disabled  -  " + info);
		ReportManager.logInfo("Successfully element is disabled  -  " + info);
	}

	public void isEnabled(String locator, String info) {
		page.isEnabled(locator);
		System.out.println("Successfully element is enabled  -  " + info);
		ReportManager.logInfo("Successfully element is enabled  -  " + info);
	}

	public boolean isVisible(String locator, String info) {
		boolean isPresent = page.isVisible(locator);
		if (isPresent == true) {
			System.out.println("Successfully element is displayed  -  " + info);
			ReportManager.logInfo("Successfully element is displayed  -  " + info);
		} else {
			ReportManager.logInfo("element not displayed: " + info);
			System.out.println("element not displayed: " + info);

		}
		return isPresent;
	}

	public void getTitle() {
		page.title();
		System.out.println("The title of the page is : ");
		ReportManager.logInfo("The title of the page is : ");
	}

	public void uncheck(String locator, String info) {
		page.uncheck(locator);
		System.out.println("Successfully element is uncheck  -  " + info);
		ReportManager.logInfo("Successfully element is uncheck  -  " + info);
	}

	public boolean isDisplayed(String locator, String info) {
		boolean isPresent = page.isVisible(locator);

		if (isPresent == true) {
			ReportManager.logInfo("Successfully element displayed: " + info);
			System.out.println("Successfully element displayed: " + info);
		} else {
			ReportManager.logInfo("element not displayed: " + info);
			System.out.println("element not displayed: " + info);

		}
		return isPresent;
	}

	public void waitForDownload(String locator, String FileName, String info) {
		Download download = page.waitForDownload(() -> {
			page.click(locator);
		});
		System.out.println(download.url());
		String path = download.path().toString();
		System.out.println(path);
		System.out.println(download.suggestedFilename());
		System.out.println("Successfully element is uncheck  -  " + info);
		ReportManager.logInfo("Successfully element is uncheck  -  " + info);
	}

	public void SelectOptions(String id, String index) {
		page.selectOption(id, index);
		System.out.println("Successfully selected the value in Dropdown");
		ReportManager.logInfo("Successfully selected the value in Dropdown");

	}

	public void Keyboard(String locator, String text) {
		page.press(locator, text);
		ReportManager.logInfo("Successfully Cleared text - " + text);
		System.out.println("Successfully Cleared text - " + text);
	}

	public Page newPageInstance() {
		BrowserFactory.getInstance();
		Page page = BrowserFactory.getPage();
		return page;
	}

	public void switchToNewTab_On_Click(String Locator, String Info) {
		Page p = page.waitForPopup(() -> {
			this.click(Locator, Info);

		});
		BrowserFactory.getInstance();
		BrowserFactory.getPage().close();
		BrowserFactory.getInstance().setNewPage(p);
		this.page = p;
		System.out.println("Successfully Switched to New Tab  " + page.context().pages().size());

		String newUrl = page.context().pages().get(0).url();
		System.out.println("Successfully Switched to New Tab  " + newUrl);
		System.out.println("Successfully Switched to New Tab  ");
	}

	public void Select_Options_By_Using_Index(String Locater, int index) {
		ElementHandle Dropdown = page.waitForSelector(Locater);
		Dropdown.selectOption(new SelectOption[] { new SelectOption().setIndex(index) });

	}

	public void clear(String Locator, String key) {
		page.press(Locator, key);
	}

	public void scrollDown() {
		page.evaluate("window.scrollBy(0, window.innerHeight)");

	}
	// Method to highlight an element using JavaScript
	public static void highlightElement(Page page, ElementHandle element) {
	    // Execute JavaScript to apply highlighting effect
	    page.evaluate("element => { element.style.backgroundColor = 'yellow'; element.style.border = '2px solid red'; }", element);
	}
	
	// Method to highlight an element using JavaScript
	public static void highlightElement(Page page, String str) {
		page.locator(str).evaluate(
				"(element) =>{element.style.backgroundColor = 'skyblue'; element.style.border = '2px solid black'}");
	}
	
	
	
}
