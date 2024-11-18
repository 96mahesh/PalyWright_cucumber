package com.keysolutions.web.bdd.step_definitions;

import com.keysolutions.web.bdd.screens.DemoWP;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo {

	DemoWP webPage = new DemoWP();

	@Given("User is in leaf ground application")
	public void user_is_in_leaf_ground_application() {
		webPage.openingUrl();

	}

	@When("User clicks on menu icon")
	public void user_clicks_on_menu_icon() {
		webPage.select_menu();

	}

	@When("User selects dropdown option")
	public void user_selects_dropdown_option() {
		webPage.select_dropdown();

	}

	@When("User selects automation tool from the dropdown")
	public void user_selects_automation_tool_from_the_dropdown() throws InterruptedException {
		webPage.automation_tool();

	}

}
