package com.keysolutions.web.bdd.step_definitions;

import org.testng.Assert;

import com.keysolutions.web.bdd.screens.Pms_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_stepdef {
	
	Pms_pages pms = new Pms_pages();
	
	@When("User enters user name")
	public void user_enters_user_name() throws InterruptedException {
		pms.username();
	}
	
	@Then("User should validate error message")
	public void user_should_validate_error_message() throws InterruptedException {
	   pms.ValidateErrorMsg();
	   Assert.assertTrue(pms.ValidateErrorMsg());
	}

}
