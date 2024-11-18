package com.keysolutions.web.bdd.screens;

import com.keysolutions.common.bdd.ccl.PlayActions;
import com.keysolutions.common.bdd.common_utils.ConfigReader;

public class DemoWP {

	String menu = "//i[@class='pi pi-server layout-menuitem-icon']";
	String dropdown = "//span[normalize-space()='Dropdown']";
	String tool_dropdown = "//select[@class='ui-selectonemenu']";

	PlayActions play = new PlayActions();

	public void openingUrl() {
		play.openURL(ConfigReader.getValue("Leafground"));
	}

	public void select_menu() {
		play.click(menu, "Menu Selected");
	}

	public void select_dropdown() {
		play.click(dropdown, "Dropdown Selected");
	}

	public void automation_tool() throws InterruptedException {
		play.SelectOptions(tool_dropdown, "Playwright");
	}

}
