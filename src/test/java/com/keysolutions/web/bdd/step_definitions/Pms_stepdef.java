package com.keysolutions.web.bdd.step_definitions;

import com.keysolutions.web.bdd.screens.Pms_pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pms_stepdef {

	Pms_pages pms = new Pms_pages();

	@Given("User is in the appliaction")
	public void user_is_in_the_pms_appliaction() throws InterruptedException {
		pms.openingUrl();
		Thread.sleep(1000);
	}

	@When("User enters user name and password")
	public void user_enters_user_name_and_password() throws InterruptedException {
		pms.username();
		Thread.sleep(1000);
		pms.password();
		Thread.sleep(1000);
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		pms.login();
		Thread.sleep(1500);
	}

	@Then("User should able to see the home page")
	public void user_should_able_to_see_the_home_page() throws InterruptedException {
		pms.iseProtocolExist();
		Thread.sleep(1000);
	}

	@When("User clicks on eProtocol")
	public void user_clicks_on_e_protocol() throws InterruptedException {
		Thread.sleep(1000);
		pms.clickOneProtocol();
		Thread.sleep(3000);
	}

	@When("User clicks on Investigator form the eProtocol dropdown")
	public void user_clicks_on_investigator_form_the_e_protocol_dropdown() throws InterruptedException {
		pms.clickOnInvestigator();
		Thread.sleep(1000);
	}

	@When("User clicks on Investigator home")
	public void user_clicks_on_investigator_home() throws InterruptedException {
		pms.clickOnInvestigatorHome();
		Thread.sleep(1000);
	}

	@Then("User clicks on IACUC button")
	public void user_clicks_on_iacuc_button() throws InterruptedException {
		pms.clickOnIACUCBtn();
		Thread.sleep(1000);
	}

	@When("User clicks on Create Protocol")
	public void user_clicks_on_create_protocol() throws InterruptedException {
		pms.clickOnCreateProtocol();
		Thread.sleep(1000);
	}

	@When("User enters Study title")
	public void user_enters_study_title() throws InterruptedException {
		pms.enterStudyTitle();
		Thread.sleep(1000);
	}

	@When("User clicks on IACUC check box under IACUC section")
	public void user_clicks_on_iacuc_check_box_under_iacuc_section() throws InterruptedException {
		pms.clickOnIACUCCheckBox();
		Thread.sleep(1000);
	}

	@When("User enters phone number in principal investigator")
	public void user_enters_phone_number_in_principal_investigator() throws InterruptedException {
		pms.enterPhonePI();
		Thread.sleep(1000);
	}

	@When("User clicks on create button")
	public void user_clicks_on_create_button() throws InterruptedException {
		pms.clickOnCreate_btn_CreateProtocolPage();
		Thread.sleep(1000);
	}
	
	@When("User selects NO option from the working with animal models in principal investigator")
	public void user_selects_no_option_from_the_working_with_animal_models_in_principal_investigator() throws InterruptedException {
	   pms.clickOnPrinicipal_investigator_No_radiobtn();
	   Thread.sleep(1000);
	}

	@When("User selects NO option from the working with animal models in administartive editor")
	public void user_selects_no_option_from_the_working_with_animal_models_in_administartive_editor() throws InterruptedException {
	   pms.clickOnAdministrative_Editor_No_radiobtn();
	   Thread.sleep(1000);
	}

	@When("User selects NO option from the working with animal models in designated editor")
	public void user_selects_no_option_from_the_working_with_animal_models_in_designated_editor() throws InterruptedException {
	    pms.clickOnDesignated_Editor_No_radiobtn();
	    Thread.sleep(1000);
	}

	@When("User enters emergency contact number")
	public void user_enters_emergency_contact_number() throws InterruptedException {
	   pms.enterEmergencyContactInfo();
	   Thread.sleep(1000);
	}

	@When("User clicks on Next button")
	public void user_clicks_on_next_button() throws InterruptedException {
	   pms.clickOnPersonalInformationNexrBtn();
	   Thread.sleep(1000);
	}
	
	@When("User clicks on add button")
	public void user_clicks_on_add_button() throws InterruptedException {
	    pms.clickOnAddBtn();
	    Thread.sleep(1000);
	}

	@When("User fills all the mandatory fields in the species page")
	public void user_fills_all_the_mandatory_fields_in_the_species_page() throws InterruptedException {
	   pms.selectsSpeciesCommonName();
	   Thread.sleep(1000);
	   pms.selectAnimalSex();
	   Thread.sleep(1000);
	   pms.selectHousingFacility();
	   Thread.sleep(1000);
	   pms.enterMaxNoAnimals();
	   Thread.sleep(1000);
	   pms.clickOnPainCatchkBox();
	   Thread.sleep(1000);
	   pms.enterPainCatNo();
	   Thread.sleep(1000);
	   pms.clickOnVendorChkbox();
	   Thread.sleep(1000);
	   pms.enterVendorTxtBox();
	   Thread.sleep(1000);
	   pms.clickOnAnimals_undergone_procedures();
	   Thread.sleep(1000);
	   pms.clickOnGenetically_Modified_Animals_have_phenotype();
	   Thread.sleep(1000);
	}
	
	@When("User clicks on save button in the species page")
	public void user_clicks_on_save_button_in_the_species_page() throws InterruptedException {
	   pms.clickOnSaveBtn();
	   Thread.sleep(1000);
	}

	@When("User checks the animal name from species to be added")
	public void user_checks_the_animal_name_from_species_to_be_added() throws InterruptedException {
	    pms.clickOnSpeciesChkbox();
	    Thread.sleep(1000);
	}
	@When("User clicks on Next button species homepage")
	public void user_clicks_on_next_button_species_homepage() throws InterruptedException {
	   pms.clickOnnextBtn_speciesHomepage();
	   Thread.sleep(1000);
	}

	@When("User enters name of consult and date of consultation")
	public void user_enters_name_of_consult_and_date_of_consultation() throws InterruptedException {
		pms.enterVetName();
		Thread.sleep(1000);
		pms.enterDateOfConsultation();
		Thread.sleep(1000);
	}
	
	@When("User fills all the mandatory fields in collaborations and safety concerns")
	public void user_fills_all_the_mandatory_fields_in_collaborations_and_safety_concerns() throws InterruptedException {
		Thread.sleep(1000);
		pms.clickOnCollaboration_with_another_institution();
		Thread.sleep(1000);
		pms.clickOnLive_animals_for_teaching();
		Thread.sleep(1000);
		pms.clickOBbiological_material_human_or_animal_products();
		Thread.sleep(1000);
		pms.clcikOnToxic_Substances();
		Thread.sleep(1000);
		pms.clickOnRadiological_Agents();
		Thread.sleep(1000);
		pms.clickOnOther_Agents_or_Substances();
		Thread.sleep(1000);
		pms.clickOnField_Study_or_Wildlife_Study();
		Thread.sleep(1000);
		pms.clickOnbreeding_or_creating_transgenic_or_knockin_out_animals();
		Thread.sleep(1000);
		pms.clickOnhES_or_hIPS_cells_in_animals();
		Thread.sleep(1000);
		pms.clcikOncreating_teratomas();
		Thread.sleep(1000);
	}
	@When("User enters all mandatory filelds in Rationale")
	public void user_enters_all_mandatory_filelds_in_rationale() throws InterruptedException {
		pms.enterAims_and_Significance_a();
		Thread.sleep(1000);
		pms.enterAims_and_Significance_b();
		Thread.sleep(1000);
		pms.enterRationale_for_Use_of_Animals_a();
		Thread.sleep(1000);
		pms.enterRationale_for_Use_of_Animals_b();
		Thread.sleep(1000);
		pms.clickOnRationale_for_Use_of_Animals_c();
		Thread.sleep(1000);
		pms.enterRationale_for_Use_of_Animals_d();
		Thread.sleep(1000);
	}
	
	@When("User clicks on Add button in procedure page")
	public void user_clicks_on_add_button_in_procedure_page() throws InterruptedException {
	    pms.clickOnAdd_procedure();
	    Thread.sleep(1000);
	}

	@When("User fill all the mandatory fields in the procedures page")
	public void user_fill_all_the_mandatory_fields_in_the_procedures_page() throws InterruptedException {
		Thread.sleep(1000);
		pms.selectProcedureType();
		Thread.sleep(1000);
		pms.enterDescription_txt();
		Thread.sleep(1000);
		pms.selectSpecies();
		Thread.sleep(1000);
		//pms.selectPainCategory();
		//Thread.sleep(1000);
		pms.enterAnimals_to_be_used_in_this_procedure_txt();
		Thread.sleep(1000);
		pms.selectCampus();
		Thread.sleep(1000);
		pms.selectBuildingorFacility();
		Thread.sleep(1000);
		pms.selectRoomNumber();
	}
	
	@When("User clicks on procedures button")
	public void user_clicks_on_procedures_button() throws InterruptedException {
		pms.clickOnProceduresBtn();
		Thread.sleep(1000);
	}
	
	@When("User clicks on procedure type option link")
	public void user_clicks_on_procedure_type_option_link() throws InterruptedException {
	    pms.clickOnProcedureTypeOptionLink();
	    Thread.sleep(1000);
	}


	@When("User fills the procedure description text boxes")
	public void user_fills_the_procedure_description_text_boxes() throws InterruptedException {
		pms.enterProcedureDescription_1();
		Thread.sleep(1000);
		pms.enterProcedureDescription_2();
		Thread.sleep(1000);
		pms.enterProcedureDescription_3();
		Thread.sleep(1000);
		pms.enterProcedureDescription_4();
		Thread.sleep(1000);
	}
	@When("User enters all mandatory fields in Alternative search")
	public void user_enters_all_mandatory_fields_in_alternative_search() throws InterruptedException {
	  pms.clickOnLiterature();
	  Thread.sleep(1000);
//	  pms.clickOnAttendance_at_meetings_or_conferences_a();
//	  Thread.sleep(1000);
//	  pms.clickOnAttendance_at_meetings_or_conferences_b();
//	  Thread.sleep(1000);
//	  pms.clickOnAttendance_at_meetings_or_conferences_c();
//	  Thread.sleep(1000);
	  pms.enterPainful_or_distressful_procedures();
	  pms.clickOnDuplicationofResults();
	}
	
	@When("User clicks on Add button in Euthanasia page")
	public void user_clicks_on_add_button_in_euthanasia_page() throws InterruptedException {
	    pms.Add_Euthanasia();
	    Thread.sleep(1000);
	}
	
	@When("User enters all mandatory fields in the Euthanasia page")
	public void user_enters_all_mandatory_fields_in_the_euthanasia_page() throws InterruptedException {
		 pms.selectSpecies_Euthanasia();
		 Thread.sleep(1000);
		 pms.selectMethod_of_Euthanasia_Primary();
		 Thread.sleep(1000);
	}

	@When("User clicks on save button in the Euthanasia page")
	public void user_clicks_on_save_button_in_the_euthanasia_page() throws InterruptedException {
		pms.clickOnSave_euthanisia();
		Thread.sleep(5000);
	}
	
	@When("User accepts all mandatory policies")
	public void user_accepts_all_mandatory_policies() throws InterruptedException {
	    pms.acceptMandatory_policy1();
	    Thread.sleep(1000);
	    pms.acceptMandatory_policy2();
	    Thread.sleep(1000);
		pms.clickOnPersonalInformationNexrBtn();
		Thread.sleep(1000);
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		pms.clickOnCertificationCheckBox();
		pms.clickOnSubmitForm();
	   Thread.sleep(1000);
	}

	@When("User clicks on Yes button in the pop up")
	public void user_clicks_on_yes_button_in_the_pop_up() throws InterruptedException {
		pms.clickOnYesBtn_submitpopup();
		Thread.sleep(1000);
	}
	@Then("User should able to see the protocol submits successfully in the investigator home page")
	public void user_should_able_to_see_the_protocol_submits_successfully_in_the_investigator_home_page() throws InterruptedException {
	    pms.getProtocolSubmissionSuccessMsgText();
	    Thread.sleep(1500);
	}
	@Then("User clicks committe manager")
	public void user_clicks_committe_manager() throws InterruptedException {
	    pms.clickOncommitteeManager();
	    Thread.sleep(1500);
	}

	@Then("User selects committe manager home")
	public void user_selects_committe_manager_home() throws InterruptedException {
	   pms.clickOnCommitteeManagerHome();
	   Thread.sleep(1500);
	}

	@When("User selects the proctocol id which he creates")
	public void user_selects_the_proctocol_id_which_he_creates() throws InterruptedException {
	    pms.clickOnprotocolID_CheckBox();
	    Thread.sleep(1500);
	    pms.selectPanel();
	    Thread.sleep(1000);
	}

	@When("User assigns the protocol to the panel member")
	public void user_assigns_the_protocol_to_the_panel_member() throws InterruptedException {
		pms.selectPanel();
		Thread.sleep(1000);
		
	}

	@When("User clicks on assign panel button")
	public void user_clicks_on_assign_panel_button() throws InterruptedException {
		pms.clickOnAssignPannel();
		Thread.sleep(1500);
	}
	
	@When("User clicks on manager")
	public void user_clicks_on_manager() throws InterruptedException {
	    pms.clickOnManager();
	    Thread.sleep(1000);
	}

	@When("User selects manager home")
	public void user_selects_manager_home() throws InterruptedException {
	   pms.clickOnManagerHome();
	   Thread.sleep(1000);
	}

	@When("User clicks on Receipt of Protocol")
	public void user_clicks_on_receipt_of_protocol() throws InterruptedException {
	   pms.clickOnReceipt_of_Protocol();
	   Thread.sleep(1000);
	}

	@When("User clicks on write Comments")
	public void user_clicks_on_write_comments() throws InterruptedException {
	   pms.clickOnwriteComments();
	   Thread.sleep(1000);
	}

	@When("User clicks on protocol Decision")
	public void user_clicks_on_protocol_decision() throws InterruptedException {
	    pms.clickOnprotocolDecision();
	    Thread.sleep(1000);
	}

	@When("User clicks on protocolId checkBox in protocolDecision Page")
	public void user_clicks_on_protocol_id_check_box_in_protocol_decision_page() throws InterruptedException {
	   pms.clickOnprotocolId_checkBox_protocolDecisionPage();
	   Thread.sleep(1000);
	}

	@When("User clicks on Decision button")
	public void user_clicks_on_decision_button() throws InterruptedException {
	   pms.clickOnDecisionBtn();
	   Thread.sleep(1000);
	}

	@When("User clicks on Save button in protocol popup")
	public void user_clicks_on_save_button_in_protocol_popup() throws InterruptedException {
		 pms.clickOnsavebtn_popup();
		 Thread.sleep(1000);
	}
	
	@When("User clicks on write comments in commants page")
	public void user_clicks_on_write_comments_in_commants_page() throws InterruptedException {
		pms.clickOnWriteComments_Comments();
		Thread.sleep(1000);
	}

	@When("User enters comments in comments box")
	public void user_enters_comments_in_comments_box() throws InterruptedException {
		pms.enterCommentstoPI();
		Thread.sleep(1000);
	}

	@When("User clicks on Save button above the comments box")
	public void user_clicks_on_save_button_above_the_comments_box() throws InterruptedException {
		pms.clickOnSave_comments_box();
		Thread.sleep(1000);
	}

	@When("user clicks on submit to PI button")
	public void user_clicks_on_submit_to_pi_button() throws InterruptedException {
		pms.clickOnSubmitToPI();
		Thread.sleep(1000);
	}

	@When("User clicks on comment in available comments")
	public void user_clicks_on_comment_in_available_comments() throws InterruptedException {
		pms.clickOnAvailableComments();
		Thread.sleep(1000);
	}

	@When("User clicks on Forward Play button")
	public void user_clicks_on_forward_play_button() throws InterruptedException {
		pms.clickOnFarwardPlayBtn();
		Thread.sleep(1000);
	}

	@When("User clicks on submit to PI button in comments popup")
	public void user_clicks_on_submit_to_pi_button_in_comments_popup() throws InterruptedException {
		pms.clickOnSubmitToPI_commentsPopup();
		Thread.sleep(2000);
	}
	
	@When("User clicks on comments received")
	public void user_clicks_on_comments_received() throws InterruptedException {
	    pms.clickOnCommentsReceived_InvHome();
	    Thread.sleep(1000);
	}

	@When("User enters reponse in response text box")
	public void user_enters_reponse_in_response_text_box() throws InterruptedException {
		pms.enterResponse();
		Thread.sleep(1000);
	}

	@When("User cliks on Submit to IACUC")
	public void user_cliks_on_submit_to_iacuc() throws InterruptedException {
		pms.clickOnSubmitToIACUC();
		Thread.sleep(1000);
		pms.clickOnOkBtn();
		Thread.sleep(1000);
	}
	
	@When("User clicks on Responses Received")
	public void user_clicks_on_responses_received() throws InterruptedException {
	  pms.clickOnResponsesReceived();
	  Thread.sleep(1000);
	}

	
	
	//without wait time
//	@Given("User is in the appliaction")
//	public void user_is_in_the_pms_appliaction() throws InterruptedException {
//		pms.openingUrl();
//	}
//
//	@When("User enters user name and password")
//	public void user_enters_user_name_and_password() throws InterruptedException {
//		pms.username();
//		pms.password();
//	}
//
//	@And("User clicks on login button")
//	public void user_clicks_on_login_button() throws InterruptedException {
//		pms.login();
//		Thread.sleep(3000);
//	}
//
//	@Then("User should able to see the home page")
//	public void user_should_able_to_see_the_home_page() throws InterruptedException {
//		pms.iseProtocolExist();
//		Thread.sleep(1000);
//	}
//
//	@When("User clicks on eProtocol")
//	public void user_clicks_on_e_protocol() throws InterruptedException {
//		Thread.sleep(1000);
//		pms.clickOneProtocol();
//		Thread.sleep(3000);
//	}
//
//	@When("User clicks on Investigator form the eProtocol dropdown")
//	public void user_clicks_on_investigator_form_the_e_protocol_dropdown() throws InterruptedException {
//		pms.clickOnInvestigator();
//	}
//
//	@When("User clicks on Investigator home")
//	public void user_clicks_on_investigator_home() throws InterruptedException {
//		pms.clickOnInvestigatorHome();
//	}
//
//	@Then("User clicks on IACUC button")
//	public void user_clicks_on_iacuc_button() throws InterruptedException {
//		pms.clickOnIACUCBtn();
//	}
//
//	@When("User clicks on Create Protocol")
//	public void user_clicks_on_create_protocol() throws InterruptedException {
//		pms.clickOnCreateProtocol();
//	}
//
//	@When("User enters Study title")
//	public void user_enters_study_title() throws InterruptedException {
//		pms.enterStudyTitle("Study1");
//	}
//
//	@When("User clicks on IACUC check box under IACUC section")
//	public void user_clicks_on_iacuc_check_box_under_iacuc_section() throws InterruptedException {
//		pms.clickOnIACUCCheckBox();
//	}
//
//	@When("User enters phone number in principal investigator")
//	public void user_enters_phone_number_in_principal_investigator() throws InterruptedException {
//		pms.enterPhonePI();
//	}
//
//	@When("User clicks on create button")
//	public void user_clicks_on_create_button() throws InterruptedException {
//		pms.clickOnCreate_btn_CreateProtocolPage();
//	}
//	
//	@When("User selects NO option from the working with animal models in principal investigator")
//	public void user_selects_no_option_from_the_working_with_animal_models_in_principal_investigator() throws InterruptedException {
//	   pms.clickOnPrinicipal_investigator_No_radiobtn();
//	}
//
//	@When("User selects NO option from the working with animal models in administartive editor")
//	public void user_selects_no_option_from_the_working_with_animal_models_in_administartive_editor() throws InterruptedException {
//	   pms.clickOnAdministrative_Editor_No_radiobtn();
//	}
//
//	@When("User selects NO option from the working with animal models in designated editor")
//	public void user_selects_no_option_from_the_working_with_animal_models_in_designated_editor() throws InterruptedException {
//	    pms.clickOnDesignated_Editor_No_radiobtn();
//	}
//
//	@When("User enters emergency contact number")
//	public void user_enters_emergency_contact_number() throws InterruptedException {
//	   pms.enterEmergencyContactInfo();
//	}
//
//	@When("User clicks on Next button")
//	public void user_clicks_on_next_button() throws InterruptedException {
//	   pms.clickOnPersonalInformationNexrBtn();
//	}
//	
//	@When("User clicks on add button")
//	public void user_clicks_on_add_button() throws InterruptedException {
//	    pms.clickOnAddBtn();
//	}
//
//	@When("User fills all the mandatory fields in the species page")
//	public void user_fills_all_the_mandatory_fields_in_the_species_page() throws InterruptedException {
//	   pms.selectsSpeciesCommonName();
//	   pms.selectAnimalSex();
//	   pms.selectHousingFacility();
//	   pms.enterMaxNoAnimals();
//	   pms.clickOnPainCatchkBox();
//	   pms.enterPainCatNo();
//	   pms.clickOnVendorChkbox();
//	   pms.enterVendorTxtBox();
//	   pms.clickOnAnimals_undergone_procedures();
//	   pms.clickOnGenetically_Modified_Animals_have_phenotype();
//	}
//	
//	@When("User clicks on save button in the species page")
//	public void user_clicks_on_save_button_in_the_species_page() throws InterruptedException {
//	   pms.clickOnSaveBtn();
//	}
//
//	@When("User checks the animal name from species to be added")
//	public void user_checks_the_animal_name_from_species_to_be_added() throws InterruptedException {
//	    pms.clickOnSpeciesChkbox();
//	}
//	@When("User clicks on Next button species homepage")
//	public void user_clicks_on_next_button_species_homepage() throws InterruptedException {
//	   pms.clickOnnextBtn_speciesHomepage();
//	}
//
//	@When("User enters name of consult and date of consultation")
//	public void user_enters_name_of_consult_and_date_of_consultation() throws InterruptedException {
//		pms.enterVetName();
//		pms.enterDateOfConsultation();
//	}
//	
//	@When("User fills all the mandatory fields in collaborations and safety concerns")
//	public void user_fills_all_the_mandatory_fields_in_collaborations_and_safety_concerns() throws InterruptedException {
//		pms.clickOnCollaboration_with_another_institution();
//		pms.clickOnLive_animals_for_teaching();
//		pms.clickOBbiological_material_human_or_animal_products();
//		pms.clcikOnToxic_Substances();
//		pms.clickOnRadiological_Agents();
//		pms.clickOnOther_Agents_or_Substances();
//		pms.clickOnField_Study_or_Wildlife_Study();
//		pms.clickOnbreeding_or_creating_transgenic_or_knockin_out_animals();
//		pms.clickOnhES_or_hIPS_cells_in_animals();
//		pms.clcikOncreating_teratomas();
//	}
//	@When("User enters all mandatory filelds in Rationale")
//	public void user_enters_all_mandatory_filelds_in_rationale() throws InterruptedException {
//		pms.enterAims_and_Significance_a();
//		pms.enterAims_and_Significance_b();
//		pms.enterRationale_for_Use_of_Animals_a();
//		pms.enterRationale_for_Use_of_Animals_b();
//		pms.enterRationale_for_Use_of_Animals_c();
//		pms.enterRationale_for_Use_of_Animals_d();
//	}
//	
//	@When("User clicks on Add button in procedure page")
//	public void user_clicks_on_add_button_in_procedure_page() throws InterruptedException {
//	    pms.clickOnAdd_procedure();
//	}
//
//	@When("User fill all the mandatory fields in the procedures page")
//	public void user_fill_all_the_mandatory_fields_in_the_procedures_page() throws InterruptedException {
//		pms.selectProcedureType();
//		pms.enterDescription_txt();
//		pms.selectSpecies();
//		//pms.selectPainCategory();
//		//Thread.sleep(1000);
//		pms.enterAnimals_to_be_used_in_this_procedure_txt();
//		pms.selectCampus();
//		pms.selectBuildingorFacility();
//		pms.selectRoomNumber();
//	}
//	
//	@When("User clicks on procedures button")
//	public void user_clicks_on_procedures_button() throws InterruptedException {
//		pms.clickOnProceduresBtn();
//	}
//	
//	@When("User clicks on procedure type option link")
//	public void user_clicks_on_procedure_type_option_link() throws InterruptedException {
//	    pms.clickOnProcedureTypeOptionLink();
//	}
//
//
//	@When("User fills the procedure description text boxes")
//	public void user_fills_the_procedure_description_text_boxes() throws InterruptedException {
//		pms.enterProcedureDescription_1();
//		pms.enterProcedureDescription_2();
//		pms.enterProcedureDescription_3();
//		pms.enterProcedureDescription_4();
//	}
//	@When("User enters all mandatory fields in Alternative search")
//	public void user_enters_all_mandatory_fields_in_alternative_search() throws InterruptedException {
//	  pms.clickOnLiterature();
////	  pms.clickOnAttendance_at_meetings_or_conferences_a();
////	  Thread.sleep(1000);
////	  pms.clickOnAttendance_at_meetings_or_conferences_b();
////	  Thread.sleep(1000);
////	  pms.clickOnAttendance_at_meetings_or_conferences_c();
////	  Thread.sleep(1000);
//	  pms.enterPainful_or_distressful_procedures();
//	  pms.clickOnDuplicationofResults();
//	}
//	
//	@When("User clicks on Add button in Euthanasia page")
//	public void user_clicks_on_add_button_in_euthanasia_page() throws InterruptedException {
//	    pms.Add_Euthanasia();
//	}
//	
//	@When("User enters all mandatory fields in the Euthanasia page")
//	public void user_enters_all_mandatory_fields_in_the_euthanasia_page() throws InterruptedException {
//		 pms.selectSpecies_Euthanasia();
//		 pms.selectMethod_of_Euthanasia_Primary();
//	}
//
//	@When("User clicks on save button in the Euthanasia page")
//	public void user_clicks_on_save_button_in_the_euthanasia_page() throws InterruptedException {
//		pms.clickOnSave_euthanisia();
//		Thread.sleep(3000);
//	}
//	
//	@When("User accepts all mandatory policies")
//	public void user_accepts_all_mandatory_policies() throws InterruptedException {
//	    pms.acceptMandatory_policy1();
//	    pms.acceptMandatory_policy2();
//		pms.clickOnPersonalInformationNexrBtn();
//	}
//
//	@When("User clicks on submit button")
//	public void user_clicks_on_submit_button() throws InterruptedException {
//		pms.clickOnCertificationCheckBox();
//		pms.clickOnSubmitForm();
//	}
//
//	@When("User clicks on Yes button in the pop up")
//	public void user_clicks_on_yes_button_in_the_pop_up() throws InterruptedException {
//		pms.clickOnYesBtn_submitpopup();
//	}
//	@Then("User should able to see the protocol submits successfully in the investigator home page")
//	public void user_should_able_to_see_the_protocol_submits_successfully_in_the_investigator_home_page() throws InterruptedException {
//	    pms.getProtocolSubmissionSuccessMsgText();
//	}
//	@Then("User clicks committe manager")
//	public void user_clicks_committe_manager() throws InterruptedException {
//	    pms.clickOncommitteeManager();
//	}
//
//	@Then("User selects committe manager home")
//	public void user_selects_committe_manager_home() throws InterruptedException {
//	   pms.clickOnCommitteeManagerHome();
//	}
//
//	@When("User selects the proctocol id which he creates")
//	public void user_selects_the_proctocol_id_which_he_creates() throws InterruptedException {
//	    pms.clickOnprotocolID_CheckBox();
//	    pms.selectPanel();
//	}
//
//	@When("User assigns the protocol to the panel member")
//	public void user_assigns_the_protocol_to_the_panel_member() throws InterruptedException {
//		pms.selectPanel();
//		
//	}
//
//	@When("User clicks on assign panel button")
//	public void user_clicks_on_assign_panel_button() throws InterruptedException {
//		pms.clickOnAssignPannel();
//	}
//	
//	@When("User clicks on manager")
//	public void user_clicks_on_manager() throws InterruptedException {
//	    pms.clickOnManager();
//	}
//
//	@When("User selects manager home")
//	public void user_selects_manager_home() throws InterruptedException {
//	   pms.clickOnManagerHome();
//	}
//
//	@When("User clicks on Receipt of Protocol")
//	public void user_clicks_on_receipt_of_protocol() throws InterruptedException {
//	   pms.clickOnReceipt_of_Protocol();
//	}
//
//	@When("User clicks on write Comments")
//	public void user_clicks_on_write_comments() throws InterruptedException {
//	   pms.clickOnwriteComments();
//	}
//
//	@When("User clicks on protocol Decision")
//	public void user_clicks_on_protocol_decision() throws InterruptedException {
//	    pms.clickOnprotocolDecision();
//	}
//
//	@When("User clicks on protocolId checkBox in protocolDecision Page")
//	public void user_clicks_on_protocol_id_check_box_in_protocol_decision_page() throws InterruptedException {
//	   pms.clickOnprotocolId_checkBox_protocolDecisionPage();
//	}
//
//	@When("User clicks on Decision button")
//	public void user_clicks_on_decision_button() throws InterruptedException {
//	   pms.clickOnDecisionBtn();
//	}
//
//	@When("User clicks on Save button in protocol popup")
//	public void user_clicks_on_save_button_in_protocol_popup() throws InterruptedException {
//		 pms.clickOnsavebtn_popup();
//	}
//	
//	@When("User clicks on write comments in commants page")
//	public void user_clicks_on_write_comments_in_commants_page() throws InterruptedException {
//		pms.clickOnWriteComments_Comments();
//	}
//
//	@When("User enters comments in comments box")
//	public void user_enters_comments_in_comments_box() throws InterruptedException {
//		pms.enterCommentstoPI();
//	}
//
//	@When("User clicks on Save button above the comments box")
//	public void user_clicks_on_save_button_above_the_comments_box() throws InterruptedException {
//		pms.clickOnSave_comments_box();
//	}
//
//	@When("user clicks on submit to PI button")
//	public void user_clicks_on_submit_to_pi_button() throws InterruptedException {
//		pms.clickOnSubmitToPI();
//	}
//
//	@When("User clicks on comment in available comments")
//	public void user_clicks_on_comment_in_available_comments() throws InterruptedException {
//		pms.clickOnAvailableComments();
//	}
//
//	@When("User clicks on Forward Play button")
//	public void user_clicks_on_forward_play_button() throws InterruptedException {
//		pms.clickOnFarwardPlayBtn();
//	}
//
//	@When("User clicks on submit to PI button in comments popup")
//	public void user_clicks_on_submit_to_pi_button_in_comments_popup() throws InterruptedException {
//		pms.clickOnSubmitToPI_commentsPopup();
//		Thread.sleep(2000);
//	}
//	
//	@When("User clicks on comments received")
//	public void user_clicks_on_comments_received() throws InterruptedException {
//	    pms.clickOnCommentsReceived_InvHome();
//	}
//
//	@When("User enters reponse in response text box")
//	public void user_enters_reponse_in_response_text_box() throws InterruptedException {
//		pms.enterResponse();
//	}
//
//	@When("User cliks on Submit to IACUC")
//	public void user_cliks_on_submit_to_iacuc() throws InterruptedException {
//		pms.clickOnSubmitToIACUC();
//		pms.clickOnOkBtn();
//	}
//	
//	@When("User clicks on Responses Received")
//	public void user_clicks_on_responses_received() throws InterruptedException {
//	  pms.clickOnResponsesReceived();
//	}
	
	
	
	
}
