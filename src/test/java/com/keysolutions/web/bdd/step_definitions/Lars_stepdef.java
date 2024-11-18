package com.keysolutions.web.bdd.step_definitions;

import com.keysolutions.web.bdd.screens.Lars_pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lars_stepdef {

	Lars_pages lars = new Lars_pages();

	@When("User clicks on eAnimal Ordering dropdown")
	public void user_clicks_on_e_animal_ordering_dropdown() {
		lars.click_on_eanimal_ordering();

	}

	@And("User clicks on Investigator")
	public void user_clicks_on_investigator() {
		lars.click_on_eanimal_investigator();

	}

	@And("User clicks on Get Approved Protocols")
	public void user_clicks_on_get_approved_protocols() {
		lars.click_on_eanimal_get_approved_protocols();

	}

	@And("User clicks on protocol ID under Document ID under Available Protocols")
	public void user_clicks_on_protocol_id_under_document_id_under_available_protocols() {
		lars.click_on_document_id();
	}

	@Then("User should verify Approved species table data")
	public void user_should_verify_approved_species_table_data() {
		lars.verify_the_specie();

	}

	@When("User clicks on Protocol Personnel")
	public void user_clicks_on_protocol_personnel() {
		lars.click_on_protocol_personnel();

	}

	@When("User clicks on Save button")
	public void user_clicks_on_save_button() {
		lars.click_on_save_button();
	}

	@When("User clicks on Funding Details")
	public void user_clicks_on_funding_details() {
		lars.click_on_funding_details();
	}

	@When("User clicks on Add button")
	public void user_clicks_on_add_button() {
		lars.click_on_fd_add();
	}

	@When("User fills the all mandatory fields in funding details\\(Project number,Expiration Date)")
	public void user_fills_the_all_mandatory_fields_in_funding_details_project_number_expiration_date() {
		lars.enter_funding_details();

	}

	@When("User clicks on Save button in funding details page")
	public void user_clicks_on_save_button_in_funding_details_page() throws InterruptedException {
		lars.click_on_fd_save();
	}

	@When("User clicks on Approved Species")
	public void user_clicks_on_approved_species() {
		lars.click_on_approved_species();

	}

	@When("User clicks on species check box")
	public void user_clicks_on_species_check_box() {
		lars.select_species();

	}

	@When("User clicks on Create Requisition button")
	public void user_clicks_on_create_requisition_button() {
		lars.click_on_create_requisition();

	}

	@When("User clicks on specie under Species\\/Strain\\/Species Source")
	public void user_clicks_on_specie_under_species_strain_species_source() throws InterruptedException {
		lars.select_requested_species();

	}

	@When("User fills all mandatory fields under Requisitioned Species Details")
	public void user_fills_all_mandatory_fields_under_requisitioned_species_details() throws InterruptedException {
		lars.enter_all_the_mandotory_fields_in_requisition();

	}

	@When("User clicks on OK button")
	public void user_clicks_on_ok_button() {
		lars.click_on_ok_button();
	}

	@When("User select the RP Name")
	public void user_select_the_rp_name() {
		lars.select_rp_name();
	}

	@When("User clicks on Submit to ARC")
	public void user_clicks_on_submit_to_arc() {
		lars.click_on_submit_to_arc();
	}

	@Then("User should able to see success message with Requisition ID")
	public void user_should_able_to_see_success_message_with_requisition_id() throws InterruptedException {
		lars.requisition_id__success_message();
	}

	@When("User clicks on Reports")
	public void user_clicks_on_reports() {
		lars.click_on_reports();
	}

	@When("User clicks on BRN Report")
	public void user_clicks_on_brn_report() {
		lars.click_on_brn_report();

	}

	@Then("User should able to see the BRN report")
	public void user_should_able_to_see_the_brn_report() throws InterruptedException {
		lars.brn_report_page();

	}

	@When("User clicks on Pending For Receipt")
	public void user_clicks_on_pending_for_receipt() {
		lars.click_on_pending_for_receipts();

	}

	@Then("User should able to see Pending For Receipt")
	public void user_should_able_to_see_pending_for_receipt() throws InterruptedException {
		lars.pending_for_receipts_page();

	}

	@When("User clicks on Procurement Staff")
	public void user_clicks_on_procurement_staff() {
		lars.click_on_procurement_staff();

	}

	@When("User clicks on Procurement Staff Home")
	public void user_clicks_on_procurement_staff_home() {
		lars.click_on_procurement_staff_home();

	}

	@When("User clicks on Document ID under Available Protocols for the same protocol ID")
	public void user_clicks_on_document_id_under_available_protocols_for_the_same_protocol_id()
			throws InterruptedException {
		lars.select_document_id();

	}

	@When("User clicks on specie under Species\\/Strain\\/Species Source under Procurement Staff section")
	public void user_clicks_on_specie_under_species_strain_species_source_under_procurement_staff_section()
			throws InterruptedException {
		lars.select_starin_or_species();

	}

	@When("User select Cost Code icon")
	public void user_select_cost_code_icon() throws InterruptedException {
		lars.click_on_cost_code_icon();

	}

	@When("User selcts any one of the options check box in Per Diem Charges")
	public void user_selcts_any_one_of_the_options_check_box_in_per_diem_charges() {
		lars.select_perdim_charges();

	}

	@When("User clicks on Add button in per dim charges")
	public void user_clicks_on_add_button_in_per_dim_charges() {
		lars.click_on_add_at_perdim_popup();

	}

	@When("User selects the species check box")
	public void user_selects_the_species_check_box() {
		lars.click_on_the_species();

	}

	@When("User clicks on Create Order button")
	public void user_clicks_on_create_order_button() {
		lars.click_on_create_order();
	}

	@When("User enters mandotory fields")
	public void user_enters_po_number() {
		lars.enter_mandotory_fields();
	}

	@When("User clicks on Send To SAP")
	public void user_clicks_on_send_to_sap() {
		lars.click_on_send_to_sap();
	}

	@Then("User should able to see the Success message of the order")
	public void user_should_able_to_see_the_success_message_of_upload_order_cxml_export_file_success()
			throws InterruptedException {
		lars.wait_for_po_success_message();
	}

	@When("User clicks on Finalize Order")
	public void user_clicks_on_finalize_order() {
		lars.click_on_finalize_order();
	}

	@When("User clicks on Update Glance")
	public void user_clicks_on_update_glance() throws InterruptedException {
		lars.click_on_update_glance();
	}

	@When("User clicks on Barcode\\(s) under Bar Code No.")
	public void user_clicks_on_barcode_s_under_bar_code_no() {
		lars.click_on_barcodes();
	}

	@When("User clicks on Cancel button in Bar codes page")
	public void user_clicks_on_cancel_button_in_bar_codes_page() {
		lars.click_on_cancel_button();
	}

	@When("User clicks on Reports under Procurement Staff")
	public void user_clicks_on_reports_under_procurement_staff() {
		lars.click_on_procurement_staff_reports();
	}

	@When("User clicks on Pending For receipt under the procurement staff section")
	public void user_clicks_on_pending_for_receipt_under_the_procurement_staff_section() {
		lars.click_on_pending_for_receipts();
	}

}
