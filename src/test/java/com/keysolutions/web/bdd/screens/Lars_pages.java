package com.keysolutions.web.bdd.screens;

import java.util.Random;

import com.keysolutions.common.bdd.ccl.PlayActions;
import com.keysolutions.common.bdd.common_utils.ConfigReader;
import com.microsoft.playwright.Page;

public class Lars_pages {

	String btn_eanimal_ordering = "//a[normalize-space()='eAnimal Ordering']";
	String btn_investigator = "//li[@id='liProductId2']//a[@class='rob'][normalize-space()='Investigator']";
	String btn_get_approved_protocols = "//li[5]//ul[1]//li[3]//a[text()='Get Approved Protocols']";
	String sel_document_id = "//*[@id='new4Id']/tbody/tr[1]/td[2]/font";
	String txt_specie = "//tr[@class='PH2']//td[3]";
	String txt_specie_gender = "(//tr[@class='PH2']/td[@class='TDBBR'])[3]";
	String btn_protocol_personnel = "//a[@href='javascript:getProtocolPersonnel()']";
	String btn_protocol_personnel_save = "//a[@data-id='Save']";
	String btn_funding_details = "//div[@onmouseover='javascript:showToolTip(event,val_tabstrip)']//a[1]";
	String btn_fd_add = "//a[@data-id='Add']";
	String txt_project_number = "//input[@id='projectNumber']";
	String btn_calender_icon = "//img[@alt='Show Date']";
	String btn_calendar_right_icon = "//span[@class='ui-icon ui-icon-circle-triangle-e']";
	String sel_date = "//a[@class='ui-state-default' and text()='30']";
	String btn_fd_save = "//a[@data-id='Save']";
	String btn_approved_species = "//div[normalize-space()='Approved Species']";
	String sel_species = "(//input[@type='checkbox'])[2]";
	String btn_create_requisition = "//a[@data-id='Create Requisition']";
	String sel_species_starin = "//html/body/div[1]/table/tbody/tr[2]/td/form/table[1]/tbody/tr/td/font[2]/table/tbody/tr[2]/td/table/tbody/tr[7]/td/table/tbody/tr[2]/td[3]/a";
	String txt_requested_now = "//input[@id='reqQty']";
	String sel_usda_pain_category = "//select[@name='distressCategory']";
	String txt_number_of_animals_per_page = "//input[@id='cageValue']";
	String btn_vendor = "//select[@name='vendor']";
	String sel_vendor = "(//*[text()='vendor-1'])[1]";
	String sel_date_required_on = "//input[@id='deliverOn']";
	String btn_calender_icon_r = "//td[@id='oneTime3']//img[@alt='Show Date']";
	String btn_calendar_right_icon_r = "//span[@class='ui-icon ui-icon-circle-triangle-e']";
	String sel_date_r = "//a[@class='ui-state-default' and text()='29']";
	String btn_purchase_project_no = "(//img[@aria-label='costCode'])[1]";
	String sel_project_number = "(//input[@type='checkbox'])[1]";
	String txt_percentage = "(//input[@type = 'text'])[1]";
	String btn_project_details_save = "//a[@data-id='Save']";
	String btn_perdim_project_no = "(//img[@aria-label='costCode'])[2]";
	String btn_requisition_ok = "//a[@data-id='OK']";
	String sel_rp_name = "//select[@name='respPerson']";
	String btn_submit_to_arc = "//a[@data-id='Submit to ARC']";
	String txt_requisition_id_success_message = "//th[@id='LayerConfirm']";
	String btn_reports = "//*[@id='liProductId2']/ul/li[8]/a[text()='Reports']";
	String btn_brn_report = "//a[normalize-space()='BRN Report']";
	String lbl_brn_report_page = "//font[@class='INSTTEXT' or text()='BRN REPORT']";
	String btn_brn_report_page_protocol = "//select[@name='protocol']";
	String btn_brn_report_page_species = "//select[@name='species']";
	String btn_brn_report_page_ok = "//a[@data-id='OK']";
	String btn_pending_for_receipt = "//a[normalize-space()='Pending For Receipt']";
	String lbl_pending_for_receipt = "//font[@class='INSTTEXT' or normalize-space()='PENDING FOR RECEIPTS REPORT']";
	String btn_pending_for_receipt_pi_name = "//select[@name='pdId']";
	String btn_pending_for_receipt_protocol_id = "//select[@id='protocolsId']";
	String btn_pending_for_receipt_rp_name = "//select[@id='rpUsr']";
	String btn_pending_for_receipt_ok = "//a[@data-id='OK']";
	String btn_procurement_staff = "//a[normalize-space()='Procurement Staff']";
	String btn_procurement_staff_home = "//a[@title='Procurement Staff Home']";
	String btn_document_id = "//html[1]/body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]";
	String btn_species_document_id = "//html/body/table[5]/tbody/tr[2]/td/form/table[1]/tbody/tr[1]/td/table[5]/tbody/tr[2]/td[3]/a[1]";
	String btn_cost_code = "//img[@aria-label='costcode']";
	String btn_perdim_charges = "//input[@value='525']";
	String btn_perdim_charges_add = "//a[@data-id='Add']";
	String btn_required_species = "//input[@name='reqItemID']";
	String btn_create_order = "//a[@data-id='Create Order']";
	String txt_po_number = "//input[@name='referenceNo']";
	String btn_send_to_SAP = "//a[@data-id='Finalize Order']";
	String txt_po_success_message = "//th[@id='LayerConfirm']";
	String btn_finalize_order = "//a[@data-id='Finalize Order']";
	String btn_update_glance = "//a[normalize-space()='(Update Glance)']";
	String btn_barcodes = "//a[@class='code']";
	String btn_cancel_at_bar_code_page = "//a[@data-id='Cancel']";
	String btn_reports_procurement_staff = "//li[7]//ul[1]//li[21]//a[text()='Reports']";
	String btn_housing_location = "//select[@name='housingLoc']";
	String btn_building = "//select[@id='buildingdropDown']";
	String btn_room = "//select[@id='roomDropDown']";
	String txt_req_number = "//input[@name='oracleReqNo']";

	PlayActions play = new PlayActions();

	Page newPageObj;

	public void click_on_eanimal_ordering() {
		play.click(btn_eanimal_ordering, "Successfully clicked on Eanimal Ordering");

	}

	public void click_on_eanimal_investigator() {
		play.click(btn_investigator, "Successfully clicked on Eanimal Investigator");

	}

	public void click_on_eanimal_get_approved_protocols() {
		play.click(btn_get_approved_protocols, "Successfully clicked on Approved Protocols");

	}

	public void click_on_document_id() {
		play.click(sel_document_id, "Successfully selected prorocol ID");

	}

	public void verify_the_specie() {
		play.getText(txt_specie);
	}

	public void click_on_protocol_personnel() {
		play.click(btn_protocol_personnel, "Protocol Personnel");
	}

	public void click_on_save_button() {
		play.click(btn_protocol_personnel_save, "Save");
	}

	public void click_on_funding_details() {
		play.click(btn_funding_details, "Funding Details");
	}

	public void click_on_fd_add() {
		play.click(btn_fd_add, "Add");
		newPageObj = play.newPageInstance().waitForPopup(() -> {

		});
	}

	public void enter_funding_details() {
		int randomInt = new Random().nextInt(1000) + 1;
		newPageObj.fill(txt_project_number, String.valueOf(randomInt));
		newPageObj.click(btn_calender_icon);
		newPageObj.click(btn_calendar_right_icon);
		newPageObj.click(sel_date);
	}

	public void click_on_fd_save() throws InterruptedException {
		newPageObj.click(btn_fd_save);
		Thread.sleep(3000);
	}

	public void click_on_approved_species() {
		play.click(btn_approved_species, "Approved Species");
	}

	public void select_species() {
		play.click(sel_species, "Species");
	}

	public void click_on_create_requisition() {
		play.click(btn_create_requisition, "Requisition");
	}

	public void select_requested_species() throws InterruptedException {
		Thread.sleep(2000);
		play.click(sel_species_starin, "Species Strain");

	}

	public void enter_all_the_mandotory_fields_in_requisition() throws InterruptedException {
		Thread.sleep(1000);
		play.SelectOptions(sel_usda_pain_category, "B");
		play.clear(txt_requested_now, "Control+A");
		play.clear(txt_requested_now, "Backspace");
		play.fill(txt_requested_now, ConfigReader.getValue("Required_Quantity"), "Required Quantity");
		play.clear(txt_number_of_animals_per_page, "Control+A");
		play.clear(txt_number_of_animals_per_page, "Backspace");
		play.fill(txt_number_of_animals_per_page, ConfigReader.getValue("Animals_per_cage"), "Animals Per Cage");
		play.click(btn_calender_icon_r, "Calender Icon");
		play.click(btn_calendar_right_icon_r, "Forward button");
		play.click(sel_date_r, "Select Date");
		play.scrollDown();
		play.SelectOptions(btn_vendor, "311");
		Thread.sleep(1000);
		play.SelectOptions(btn_housing_location, "454");
		play.SelectOptions(btn_building, "159");
		play.SelectOptions(btn_room, "235");
		newPageObj = play.newPageInstance().waitForPopup(() -> {
			play.click(btn_purchase_project_no, "Purchase Project Number");

		});
		Thread.sleep(1000);
		newPageObj.click(sel_project_number);
		newPageObj.fill(txt_percentage, ConfigReader.getValue("Percentage"));
		newPageObj.click(btn_project_details_save);
		Thread.sleep(1000);
		newPageObj = play.newPageInstance().waitForPopup(() -> {
			play.click(btn_perdim_project_no, "Perdim Project Number");

		});
		newPageObj.click(sel_project_number);
		newPageObj.fill(txt_percentage, ConfigReader.getValue("Percentage"));
		newPageObj.click(btn_project_details_save);

		Thread.sleep(2000);

	}

	public void click_on_ok_button() {
		play.click(btn_requisition_ok, "OK");
	}

	public void select_rp_name() {
		play.SelectOptions(sel_rp_name, "10496");

	}

	public void click_on_submit_to_arc() {
		play.click(btn_submit_to_arc, "Submit to ARC");
	}

	public void requisition_id__success_message() throws InterruptedException {
		Thread.sleep(3000);
		String succMsg = play.getText(txt_requisition_id_success_message).trim();
		Thread.sleep(2000);
		System.out.println("success message: " + succMsg.trim());
		System.out.println(succMsg.trim().substring(succMsg.trim().length() - 5, succMsg.trim().length() - 1));
//		String requisitionID = succMsg.trim().substring(succMsg.trim().length() - 5, succMsg.trim().length() - 1);
//		System.out.println("protocol id is : " + requisitionID);
	}

	public void click_on_reports() {
		play.click(btn_reports, "Reports");
	}

	public void click_on_brn_report() {
		play.click(btn_brn_report, "BRN Report");
	}

	public void brn_report_page() throws InterruptedException {
		Thread.sleep(1000);
		boolean brn_report = play.isVisible(lbl_brn_report_page, "BRN Report Page");
		System.out.println(brn_report);
		play.SelectOptions(btn_brn_report_page_protocol, "4227");
		play.SelectOptions(btn_brn_report_page_species, "4018");
		play.click(btn_brn_report_page_ok, "OK");
	}

	public void click_on_pending_for_receipts() {
		play.click(btn_pending_for_receipt, "Pending for Receipt");

	}

	public void pending_for_receipts_page() throws InterruptedException {
		Thread.sleep(1000);
		boolean pending_for_receipt = play.isVisible(lbl_pending_for_receipt, "Pending For Page");
		System.out.println(pending_for_receipt);
		play.SelectOptions(btn_pending_for_receipt_pi_name, "auto11");
		play.SelectOptions(btn_pending_for_receipt_protocol_id, "4197");
		play.SelectOptions(btn_pending_for_receipt_rp_name, "Automation, Automation");
		play.click(btn_pending_for_receipt_ok, "OK");
	}

	public void click_on_procurement_staff() {
		play.click(btn_procurement_staff, "Procurement Staff");
	}

	public void click_on_procurement_staff_home() {
		play.click(btn_procurement_staff_home, "Procurement Staff Home");
	}

	public void select_document_id() throws InterruptedException {
		Thread.sleep(5000);
		play.click(btn_document_id, "Document Id");
	}

	public void select_starin_or_species() throws InterruptedException {
		Thread.sleep(1500);
		play.click(btn_species_document_id, "Species");
	}

	public void click_on_cost_code_icon() throws InterruptedException {
		Thread.sleep(1000);
		play.click(btn_cost_code, "Cost Code");
		newPageObj = play.newPageInstance().waitForPopup(() -> {
//			play.click(btn_cost_code, "Cost Code");

		});

	}

	public void select_perdim_charges() {
		newPageObj.click(btn_perdim_charges);
	}

	public void click_on_add_at_perdim_popup() {
		newPageObj.click(btn_perdim_charges_add);
	}

	public void click_on_the_species() {
		play.click(btn_required_species, "Required Species");
	}

	public void click_on_create_order() {
		play.click(btn_create_order, "Create Order");
	}

	public void enter_mandotory_fields() {
		play.fill(txt_po_number, ConfigReader.getValue("Po_number"), "Purchase Order");
		play.fill(txt_req_number, ConfigReader.getValue("Req_number"), "Req Number");

	}

	public void click_on_send_to_sap() {
		play.click(btn_send_to_SAP, "Send to SAP");
	}

	public void wait_for_po_success_message() throws InterruptedException {
		Thread.sleep(2000);
		String po_success_message = play.getText(txt_po_success_message);
		System.out.println(po_success_message);
		play.isVisible(po_success_message, "po_success_message");
	}

	public void click_on_finalize_order() {
		play.click(btn_finalize_order, "Finalize Order");
	}

	public void click_on_update_glance() throws InterruptedException {
		Thread.sleep(5000);
		play.click(btn_update_glance, "Update Glance");
		newPageObj = play.newPageInstance().waitForPopup(() -> {
//			newPageObj.click(btn_update_glance);

		});
	}

	public void click_on_barcodes() {
		newPageObj.click(btn_barcodes);

	}

	public void click_on_cancel_button() {
		newPageObj.click(btn_cancel_at_bar_code_page);
	}

	public void click_on_procurement_staff_reports() {
		play.scrollDown();
		play.click(btn_reports_procurement_staff, "Reports");
	}

}
