package com.keysolutions.web.bdd.screens;

import java.util.ArrayList;

import org.testng.Assert;

import com.keysolutions.common.bdd.ccl.PlayActions;
import com.keysolutions.common.bdd.common_utils.BrowserFactory;
import com.keysolutions.common.bdd.common_utils.ConfigReader;
import com.lowagie.text.List;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.WaitForPopupOptions;
import com.microsoft.playwright.options.SelectOption;

public class Pms_pages {
	Page newPageObj;
	Page newPageObj2;
	public static String protocolID;
	java.util.List<Page> pages = new ArrayList<Page>();

	String btn_advanced = "//button[contains(text(),'Advanced')]";
	String sel_proceed_link = "//a[@id='proceed-link']";
	String txt_username = "//input[@name='userId']";
	String txt_password = "//input[@name='password']";
	String login_button = "//a[text()='Login']";
	String eProtocol = "//a[normalize-space()='eProtocol']";
	String investigator = "(//a[contains(text(),'Investigator')])[3]";
	String investigator_home = "(//a[normalize-space()='Investigator Home'])[2]";
	String IACUC_button = "//td[normalize-space(text()) = 'IACUC']";
	String create_protocol = "(//a[text()='Create Protocol'])[2]";
	String studyTitle_txtbox = "//textarea[@id='studyTitle']";
	String IACUC_chkbox = "//input[@name='frmId2']";
	String Phone_PI = "//input[@id='R4C4_ob101_1']"; 
	String create_btn_CreateProtocolPage = "//td[@id='createTop']//a[@title='Create'][normalize-space()='Create']";
	String prinicipal_investigator_No_radiobtn = "//label[@for='R7C5_ob101_1_OP2']";
	String administrative_Editor_No_radiobtn = "//label[@for='R7C5_ob101_8_OP2']";
	String designated_Editor_No_radiobtn = "//label[@for='R7C5_ob101_11_OP2']";
	String emergencyContactInformation_txtarea = "//textarea[@id='R2C0_ob101_150']";
	String personalInformationNexrBtn = "(//a[normalize-space()='Next'])[1]";
	String addBtn = "//a[text()='Add']";
	String SpeciesCommonName_dd = "//select[@id='R1C2_ob130_4']";

	PlayActions play = new PlayActions();

	public void openingUrl() throws InterruptedException {
		play.openURL(ConfigReader.getValue("Keysolutions_BRD_Url"));
//		play.click(btn_advanced, "Successfully clicked on Advanced button");
//		play.click(sel_proceed_link, "Successfully selected proceed link");
	}

	public void username() throws InterruptedException {
		play.highlightElement(BrowserFactory.getPage(), txt_username);
		play.click(txt_username, "Clicked on username");
		play.fill(txt_username, ConfigReader.getValue("Username"), "Successfully entered the username");

	}

	public void password() {
		play.highlightElement(BrowserFactory.getPage(), txt_password);
		play.fill(txt_password, ConfigReader.getValue("Password"), "Successfully entered the password");
	}

	public void login() throws InterruptedException {
		play.highlightElement(BrowserFactory.getPage(), login_button);
		play.click(login_button, "Successfully Loggedin");
		Thread.sleep(1500);
	}
	
	String errorMsg = "//font[@class='PMARK']";
	public boolean ValidateErrorMsg() throws InterruptedException {
		Thread.sleep(1000);
		return play.isDisplayed(errorMsg, "error message is displayed");
	}

	public void iseProtocolExist() throws InterruptedException {
		Thread.sleep(1500);
		boolean status = play.isVisible(eProtocol, "Successfully visibled");
		Assert.assertTrue(status);
	}

	public void clickOneProtocol() {
		play.highlightElement(BrowserFactory.getPage(), eProtocol);
		play.click(eProtocol, "Successfully clicked on eProtocol");
	}

	public void clickOnInvestigator() throws InterruptedException {
		play.highlightElement(BrowserFactory.getPage(), investigator);
		play.click(investigator, "Successfully clicked on investigator");
	}

	public void clickOnInvestigatorHome() {
		play.highlightElement(BrowserFactory.getPage(), investigator_home);
		play.click(investigator_home, "Successfully clicked on investigator_home");
	}

	public void clickOnIACUCBtn() {
		try {
			play.highlightElement(BrowserFactory.getPage(), IACUC_chkbox);
			play.click(IACUC_chkbox, "Successfully clicked on IACUC_button");
		} catch (Exception e) {

		}
	}

	public void clickOnCreateProtocol() {
		play.highlightElement(BrowserFactory.getPage(), create_protocol);
		play.click(create_protocol, "Successfully clicked on create_protocol");
	}

	public void enterStudyTitle() {
		play.highlightElement(BrowserFactory.getPage(), studyTitle_txtbox);
		play.fill(studyTitle_txtbox, ConfigReader.getValue("StudyTitle"), "Successfully entered study title");
	}

	public void clickOnIACUCCheckBox() {
		play.highlightElement(BrowserFactory.getPage(), IACUC_chkbox);
		play.check(IACUC_chkbox, "Successfully checked on IACUC check box");
	}

	public void enterPhonePI() {
		play.highlightElement(BrowserFactory.getPage(), Phone_PI);
		play.fill(Phone_PI, ConfigReader.getValue("PhonePI"), "Successfully entered phone number");
	}

	public void clickOnCreate_btn_CreateProtocolPage() {
		pages.add(BrowserFactory.getPage());
		newPageObj = play.newPageInstance().waitForPopup(() -> {
			play.highlightElement(BrowserFactory.getPage(), create_btn_CreateProtocolPage);
			play.click(create_btn_CreateProtocolPage, "Successfully clicked on create_btn_CreateProtocolPage");
			pages.add(newPageObj);
		});
	}

	public void clickOnPrinicipal_investigator_No_radiobtn() {
		play.highlightElement(newPageObj, prinicipal_investigator_No_radiobtn);
		newPageObj.click(prinicipal_investigator_No_radiobtn);
	}

	public void clickOnAdministrative_Editor_No_radiobtn() {
		play.highlightElement(newPageObj, administrative_Editor_No_radiobtn);
		newPageObj.click(administrative_Editor_No_radiobtn);
	}

	public void clickOnDesignated_Editor_No_radiobtn() {
		play.highlightElement(newPageObj, designated_Editor_No_radiobtn);
		newPageObj.click(designated_Editor_No_radiobtn);
	}

	public void enterEmergencyContactInfo() {
		play.highlightElement(newPageObj, emergencyContactInformation_txtarea);
		newPageObj.fill(emergencyContactInformation_txtarea, ConfigReader.getValue("EmergencyContactInfo"));
	}

	public void clickOnPersonalInformationNexrBtn() throws InterruptedException {
		play.highlightElement(newPageObj, personalInformationNexrBtn);
		newPageObj.click(personalInformationNexrBtn);
		Thread.sleep(1000);
	}

	// Species
	public void clickOnAddBtn() throws InterruptedException {
		Thread.sleep(3000);
		newPageObj2 = newPageObj.waitForPopup(() -> {
			play.highlightElement(newPageObj, addBtn);
			newPageObj.click(addBtn);
			pages.add(newPageObj2);
		});

		System.out.println("no of pages are : " + pages.size());
	}

	public void selectsSpeciesCommonName() {
//		Locator dd = newPageObj2.locator(SpeciesCommonName_dd);
//		dd.selectOption(new SelectOption().setIndex(1));
		play.highlightElement(newPageObj2, SpeciesCommonName_dd);
		newPageObj2.selectOption(SpeciesCommonName_dd, "9417");
	}
	
	String animalSex = "//select[@id='R6C4_ob130_4']";
	public void selectAnimalSex() {
		play.highlightElement(newPageObj2, animalSex);
		Locator dd = newPageObj2.locator(animalSex);
		dd.selectOption(new SelectOption().setIndex(2));
	}
	String housing = "//select[@id='R4C2_ob130_4']";
	public void selectHousingFacility() {
		play.highlightElement(newPageObj2, housing);
		Locator dd = newPageObj2.locator(housing);
		dd.selectOption(new SelectOption().setIndex(1));
	}
	
	String maxNoAnimals = "//input[@id='R10C2_ob130_4']";
	public void enterMaxNoAnimals() {
		play.highlightElement(newPageObj2, maxNoAnimals);
		newPageObj2.fill(maxNoAnimals, ConfigReader.getValue("MaxNoAnimals"));
	}
	
	String painCatChkBox ="//input[@id='R20C3_ob130_4']";
	public void clickOnPainCatchkBox() {
		play.highlightElement(newPageObj2, painCatChkBox);
		newPageObj2.click(painCatChkBox);
	}
	String painCatNo_Txtbox = "//input[@id='R15C4_ob130_4']";
	public void enterPainCatNo() {
		PlayActions.highlightElement(newPageObj2, painCatNo_Txtbox);
		newPageObj2.fill(painCatNo_Txtbox, ConfigReader.getValue("PainCategoryNumber"));
	}
	String vendorChkbox = "//input[@id='R21C1_ob130_4']";
	public void clickOnVendorChkbox() {
		PlayActions.highlightElement(newPageObj2, vendorChkbox);
		newPageObj2.click(vendorChkbox);
	}
	String vendorTxtBox = "//input[@id='R21C4_ob130_4']";
	public void enterVendorTxtBox() {
		PlayActions.highlightElement(newPageObj2, vendorTxtBox);
		newPageObj2.fill(vendorTxtBox, ConfigReader.getValue("vendorTxtBox"));
	}
	String animals_undergone_procedures="//label[@for='R25C7_ob130_4_OP2']";
	public void clickOnAnimals_undergone_procedures() {
		PlayActions.highlightElement(newPageObj2, animals_undergone_procedures);
		newPageObj2.click(animals_undergone_procedures);
	}
	String genetically_Modified_Animals_have_phenotype="//label[@for='R29C7_ob130_4_OP2']";
	public void clickOnGenetically_Modified_Animals_have_phenotype() {
		PlayActions.highlightElement(newPageObj2, genetically_Modified_Animals_have_phenotype);
		newPageObj2.click(genetically_Modified_Animals_have_phenotype);
	}
	String saveBtn = "//a[normalize-space()='Save']";
	public void clickOnSaveBtn() {
		PlayActions.highlightElement(newPageObj2, saveBtn);
		newPageObj2.click(saveBtn);
	}
	
	String speciesChkbox = "//input[@id='mouse (Location1)']"; 	 
	public void clickOnSpeciesChkbox() {
		play.highlightElement(newPageObj, speciesChkbox);
		newPageObj.click(speciesChkbox);
	}
	String nextBtn_speciesHomepage ="(//a[normalize-space()='Next'])[1]";
	public void clickOnnextBtn_speciesHomepage() {
		play.highlightElement(newPageObj, nextBtn_speciesHomepage);
		newPageObj.click(nextBtn_speciesHomepage);
	}
	String VetName = "//input[@id='R1C3_ob299_23']";
	public void enterVetName() {
		play.highlightElement(newPageObj, VetName);
		newPageObj.fill(VetName, ConfigReader.getValue("vetName"));
	}
	String dateOfConsultation = "//img[@alt='Select a Date']";
	String date = "//a[normalize-space()='29']";
	String next="(//a[normalize-space()='Next'])[1]";
	public void enterDateOfConsultation() throws InterruptedException {
		
		newPageObj2 = newPageObj.waitForPopup(() -> {
			play.highlightElement(newPageObj, dateOfConsultation);
			newPageObj.click(dateOfConsultation);
		});
		Thread.sleep(2000);
		play.highlightElement(newPageObj2, date);
		newPageObj2.click(date);
		Thread.sleep(2000);
	}
	//clickon nest btn
	String Collaboration_with_another_institution = "//label[@for='R1C3_ob140_361_OP2']";
	public void clickOnCollaboration_with_another_institution() throws InterruptedException {
		play.highlightElement(newPageObj, Collaboration_with_another_institution);
		newPageObj.click(Collaboration_with_another_institution);
	}
	
	String Live_animals_for_teaching = "//label[@for='R1C3_ob140_366_OP2']";
	public void clickOnLive_animals_for_teaching() {
		play.highlightElement(newPageObj, Live_animals_for_teaching);
		newPageObj.click(Live_animals_for_teaching);
	}

	String biological_material_human_or_animal_products = "//label[@for='R1C3_ob140_387_OP2']";
	public void clickOBbiological_material_human_or_animal_products() {
		play.highlightElement(newPageObj, biological_material_human_or_animal_products);
		newPageObj.click(biological_material_human_or_animal_products);
	}

	String Toxic_Substances = "//label[@for='R1C3_ob140_412_OP2']";
	public void clcikOnToxic_Substances() {
		play.highlightElement(newPageObj, Toxic_Substances);
		newPageObj.click(Toxic_Substances);
	}

	String Radiological_Agents = "//label[@for='R1C3_ob140_415_OP2']";
	public void clickOnRadiological_Agents() {
		play.highlightElement(newPageObj, Radiological_Agents);
		newPageObj.click(Radiological_Agents);
	}

	
	String Other_Agents_or_Substances = "//label[@for='R1C3_ob140_419_OP2']";
	public void clickOnOther_Agents_or_Substances() {
		play.highlightElement(newPageObj, Other_Agents_or_Substances);
		newPageObj.click(Other_Agents_or_Substances);
	}
	
	String 	Field_Study_or_Wildlife_Study = "//label[@for='R1C3_ob140_422_OP2']";
	public void clickOnField_Study_or_Wildlife_Study() {
		play.highlightElement(newPageObj, Field_Study_or_Wildlife_Study);
		newPageObj.click(Field_Study_or_Wildlife_Study);
	}
	
	

	String breeding_or_creating_transgenic_or_knockin_out_animals = "//label[@for='R1C3_ob140_425_OP2']";
	public void clickOnbreeding_or_creating_transgenic_or_knockin_out_animals() {
		play.highlightElement(newPageObj, breeding_or_creating_transgenic_or_knockin_out_animals);
		newPageObj.click(breeding_or_creating_transgenic_or_knockin_out_animals);
	}

	String hES_or_hIPS_cells_in_animals = "//label[@for='R1C3_ob140_436_OP2']";
	public void clickOnhES_or_hIPS_cells_in_animals() {
		play.highlightElement(newPageObj, hES_or_hIPS_cells_in_animals);
		newPageObj.click(hES_or_hIPS_cells_in_animals);
	}

	String creating_teratomas = "//label[@for='R1C3_ob140_437_OP2']";
	public void clcikOncreating_teratomas() {
		play.highlightElement(newPageObj, creating_teratomas);
		newPageObj.click(creating_teratomas);
	}
	//
	String Aims_and_Significance_a ="//textarea[@id='R2C1_ob170_234']";
	public void enterAims_and_Significance_a() {
		play.highlightElement(newPageObj, Aims_and_Significance_a);
		newPageObj.fill(Aims_and_Significance_a,ConfigReader.getValue("Aims_and_Significance_a"));
	}
	String Aims_and_Significance_b="//textarea[@id='R2C1_ob170_236']";
	public void enterAims_and_Significance_b() {
		play.highlightElement(newPageObj, Aims_and_Significance_b);
		newPageObj.fill(Aims_and_Significance_b,ConfigReader.getValue("Aims_and_Significance_b"));
	}
	String Rationale_for_Use_of_Animals_a="//textarea[@id='R2C1_ob170_237']";
	public void enterRationale_for_Use_of_Animals_a() {
		play.highlightElement(newPageObj, Rationale_for_Use_of_Animals_a);
		newPageObj.fill(Rationale_for_Use_of_Animals_a,ConfigReader.getValue("Rationale_for_Use_of_Animals_a"));
	}

	String Rationale_for_Use_of_Animals_b = "//textarea[@id='R2C1_ob170_239']";
	public void enterRationale_for_Use_of_Animals_b() {
		play.highlightElement(newPageObj, Rationale_for_Use_of_Animals_b);
		newPageObj.fill(Rationale_for_Use_of_Animals_b,ConfigReader.getValue("Rationale_for_Use_of_Animals_b"));
	}

	String Rationale_for_Use_of_Animals_c = "//input[@id='R1C1_ob170_246']";
	public void clickOnRationale_for_Use_of_Animals_c() {
		play.highlightElement(newPageObj, Rationale_for_Use_of_Animals_c);
		newPageObj.click(Rationale_for_Use_of_Animals_c);
	}

	String Rationale_for_Use_of_Animals_d = "//textarea[@id='R2C1_ob170_255']";
	public void enterRationale_for_Use_of_Animals_d() {
		play.highlightElement(newPageObj, Rationale_for_Use_of_Animals_d);
		newPageObj.fill(Rationale_for_Use_of_Animals_d,ConfigReader.getValue("Rationale_for_Use_of_Animals_d"));
	}
	
	String Add_procedure = "//a[@class='listing1']";
	public void clickOnAdd_procedure() {
		play.highlightElement(newPageObj, Add_procedure);
		newPageObj.click(Add_procedure);
	}
	String procedureType_dd="//select[@id='R1C2_ob150_0']";
	public void selectProcedureType() {
		play.highlightElement(newPageObj, procedureType_dd);
		Locator dd = newPageObj.locator(procedureType_dd);
		dd.selectOption(new SelectOption().setIndex(1));
	}
	String description_txt = "//input[@id='R2C2_ob150_0']";
	public void enterDescription_txt() {
		play.highlightElement(newPageObj, description_txt);
		newPageObj.fill(description_txt,ConfigReader.getValue("description"));
	}
	String species_dd = "//select[@id='R3C2_ob150_0']";
	public void selectSpecies() {
		play.highlightElement(newPageObj, species_dd);
		Locator dd = newPageObj.locator(species_dd);
		dd.selectOption(new SelectOption().setIndex(1));
	}
	String painCategory_dd = "//select[@id='R3C4_ob150_0']";
	public void selectPainCategory() {
		play.highlightElement(newPageObj, painCategory_dd);
		Locator dd = newPageObj.locator(painCategory_dd);
		dd.selectOption(new SelectOption().setIndex(1));
	}

	String animals_to_be_used_in_this_procedure_txt = "//input[@id='R5C3_ob150_0']";
	public void enterAnimals_to_be_used_in_this_procedure_txt() {
		play.highlightElement(newPageObj, animals_to_be_used_in_this_procedure_txt);
		newPageObj.fill(animals_to_be_used_in_this_procedure_txt,ConfigReader.getValue("animals_to_be_used_in_this_procedure_txt"));
	}
	
	String Campus ="//select[@id='R6C3_ob150_0']";
	public void selectCampus() {
		play.highlightElement(newPageObj, Campus);
		Locator dd = newPageObj.locator(Campus);
		dd.selectOption(new SelectOption().setIndex(1));
	}
	
	String BuildingorFacility = "//select[@id='R8C3_ob150_0']";
	public void selectBuildingorFacility() {
		play.highlightElement(newPageObj, BuildingorFacility);
		Locator dd = newPageObj.locator(BuildingorFacility);
		dd.selectOption(new SelectOption().setIndex(1));
	}
	
	String RoomNumber= "//select[@id='R10C3_ob150_0']";
	public void selectRoomNumber() {
		play.highlightElement(newPageObj, RoomNumber);
		Locator dd = newPageObj.locator(RoomNumber);
		dd.selectOption(new SelectOption().setIndex(1));
	}
	
	String proceduresBtn = "(//a[@title='Procedures'])[1]";
	public void clickOnProceduresBtn() {
		play.highlightElement(newPageObj, proceduresBtn);
		newPageObj.click(proceduresBtn);
	}
	String procedureTypeOptionLink = "//font[normalize-space()='Anesthetize and Release']";
	public void clickOnProcedureTypeOptionLink() {
		play.highlightElement(newPageObj, procedureTypeOptionLink);
		newPageObj.click(procedureTypeOptionLink);
	}
	
	String ProcedureDescription_1 = "//textarea[@id='R2C1_ob151_4']";
	public void enterProcedureDescription_1() {
		play.highlightElement(newPageObj, ProcedureDescription_1);
		newPageObj.fill(ProcedureDescription_1, ConfigReader.getValue("ProcedureDescription_1"));
	}
	String ProcedureDescription_2="//textarea[@id='R2C1_ob151_6']";
	public void enterProcedureDescription_2() {
		play.highlightElement(newPageObj, ProcedureDescription_2);
		newPageObj.fill(ProcedureDescription_2, ConfigReader.getValue("ProcedureDescription_2"));
	}
	String ProcedureDescription_3="//textarea[@id='R2C1_ob151_8']";
	public void enterProcedureDescription_3() {
		play.highlightElement(newPageObj, ProcedureDescription_3);
		newPageObj.fill(ProcedureDescription_3, ConfigReader.getValue("ProcedureDescription_3"));
	}
	String ProcedureDescription_4="//textarea[@id='R2C1_ob151_10']";
	public void enterProcedureDescription_4() {
		play.highlightElement(newPageObj, ProcedureDescription_4);
		newPageObj.fill(ProcedureDescription_4, ConfigReader.getValue("ProcedureDescription_4"));
	}
	String Literature ="//input[@id='R1C1_ob210_69']";
	public void clickOnLiterature() {
		play.highlightElement(newPageObj, Literature);
		newPageObj.click(Literature);
	}
	
	String painful_or_distressful_procedures="//textarea[@id='R2C1_ob210_79']";
	public void enterPainful_or_distressful_procedures() {
		play.highlightElement(newPageObj, painful_or_distressful_procedures);
		newPageObj.fill(painful_or_distressful_procedures, ConfigReader.getValue("painful_or_distressful_procedures"));
	}
	String DuplicationofResults ="//input[@id='R1C1_ob210_74']";
	public void clickOnDuplicationofResults() {
		play.highlightElement(newPageObj, DuplicationofResults);
		newPageObj.click(DuplicationofResults);
	}

	String Attendance_at_meetings_or_conferences_a ="//input[@id='R1C1_ob210_32_OP2']";
	public void clickOnAttendance_at_meetings_or_conferences_a() {
		play.highlightElement(newPageObj, Attendance_at_meetings_or_conferences_a);
		newPageObj.click(Attendance_at_meetings_or_conferences_a);
	}
	String Attendance_at_meetings_or_conferences_b="//input[@id='R1C1_ob210_36_OP2']";
	public void clickOnAttendance_at_meetings_or_conferences_b() {
		play.highlightElement(newPageObj, Attendance_at_meetings_or_conferences_b);
		newPageObj.click(Attendance_at_meetings_or_conferences_b);
	}
	String Attendance_at_meetings_or_conferences_c="//input[@id='R1C1_ob210_40_OP2']";
	public void clickOnAttendance_at_meetings_or_conferences_c() {
		play.highlightElement(newPageObj, Attendance_at_meetings_or_conferences_c);
		newPageObj.click(Attendance_at_meetings_or_conferences_c);
	}
	
	String Add_Euthanasia ="//a[normalize-space()='Add']";
	public void Add_Euthanasia() throws InterruptedException {
		Thread.sleep(1500);
		newPageObj2 = newPageObj.waitForPopup(() -> {
			play.highlightElement(newPageObj, Add_Euthanasia);
			newPageObj.click(Add_Euthanasia);
		});
	}
	
	String species_Dd = "//select[@id='R1C2_ob195_4']";
	public void selectSpecies_Euthanasia() {
		play.highlightElement(newPageObj2, species_Dd);
		Locator dd = newPageObj2.locator(species_Dd);
		dd.selectOption(new SelectOption().setIndex(1));
	}
	
	String Method_of_Euthanasia_Primary_dd ="//select[@id='R2C2_ob195_4']";
	public void selectMethod_of_Euthanasia_Primary() {
		play.highlightElement(newPageObj2, Method_of_Euthanasia_Primary_dd);
		Locator dd = newPageObj2.locator(Method_of_Euthanasia_Primary_dd);
		dd.selectOption(new SelectOption().setIndex(1));
	}
	
	String save_euthanisia ="(//a[normalize-space()='Save'])[1]";
	public void clickOnSave_euthanisia() throws InterruptedException {
		//Thread.sleep(1000);
		play.highlightElement(newPageObj2, save_euthanisia);
		newPageObj2.click(save_euthanisia);
	}
	
	String Mandatory_policy1 = "//a[@id='id_220_220_289_R1C0']";
	String IAgree_Mandatory_policy1 = "//label[@for='R1C3_ob220_289_OP1']";
	String Save_Mandatory_policy1="//a[@id='SaveORUpdateObject']";
	public void acceptMandatory_policy1() throws InterruptedException {
		newPageObj2 = newPageObj.waitForPopup(() -> {
			play.highlightElement(newPageObj, Mandatory_policy1);
			newPageObj.click(Mandatory_policy1);
		});
		Thread.sleep(1000);
		play.highlightElement(newPageObj2, IAgree_Mandatory_policy1);
		newPageObj2.click(IAgree_Mandatory_policy1);
		Thread.sleep(1000);
		play.highlightElement(newPageObj2, Save_Mandatory_policy1);
		newPageObj2.click(Save_Mandatory_policy1);
	}
	
	
	String Mandatory_policy2="//a[@id='id_220_220_290_R1C0']";
	String IAgree_Mandatory_policy2 = "//label[@for='R1C3_ob220_290_OP1']";
	String Save_Mandatory_policy2="//a[@id='SaveORUpdateObject']";
	public void acceptMandatory_policy2() throws InterruptedException {
		newPageObj2 = newPageObj.waitForPopup(() -> {
			play.highlightElement(newPageObj, Mandatory_policy2);
			newPageObj.click(Mandatory_policy2);
		});
		Thread.sleep(1000);
		play.highlightElement(newPageObj2, IAgree_Mandatory_policy2);
		newPageObj2.click(IAgree_Mandatory_policy2);
		Thread.sleep(1000);
		play.highlightElement(newPageObj2, Save_Mandatory_policy2);
		newPageObj2.click(Save_Mandatory_policy2);
	}
	
	String certificationCheckBox ="//input[@id='R1C1_ob160_56']";
	String Save_btn = "//a[@class='hbmenu'][normalize-space()='Save']";
	public void clickOnCertificationCheckBox() throws InterruptedException {
		play.highlightElement(newPageObj, certificationCheckBox);
		newPageObj.click(certificationCheckBox);
		Thread.sleep(2000);
		play.highlightElement(newPageObj, Save_btn);
		newPageObj.click(Save_btn);
		Thread.sleep(2000);
		
	}
	
	String submitForm = "//a[normalize-space()='Submit Form']";
	public void clickOnSubmitForm() {
		newPageObj2 = newPageObj.waitForPopup(() -> {
			play.highlightElement(newPageObj, submitForm);
			newPageObj.click(submitForm);
		});
	}
	
	String YesBtn_submitpopup = "//a[@title='Yes']";
	public void clickOnYesBtn_submitpopup() {
		play.highlightElement(newPageObj2, YesBtn_submitpopup);
		newPageObj2.click(YesBtn_submitpopup);
	}
	
	String successMsg = "//th[@id='LayerConfirm']";
	public void getProtocolSubmissionSuccessMsgText() throws InterruptedException {
		Thread.sleep(3000);
		String succMsg = play.getText(successMsg).trim();
		Thread.sleep(1000);
		System.out.println("success message: "+succMsg.trim());
		System.out.println(succMsg.trim().substring(succMsg.trim().length()-5, succMsg.trim().length()-1));
		try {
			protocolID=succMsg.trim().substring(succMsg.trim().length()-5, succMsg.trim().length()-1);
		}catch(Exception e) {
			
		}
		System.out.println("protocol id is : "+protocolID);
		//Assert.assertEquals(succMsg, ""+protocolID);
	}
	
	String committeeManager = "//a[normalize-space()='Committee Manager']";
	public void clickOncommitteeManager() throws InterruptedException {
		Thread.sleep(1500);
		play.highlightElement(BrowserFactory.getPage(), committeeManager);
		play.click(committeeManager, "successfully clicked on committeeManager");
	}
	String CommitteeManagerHome ="//a[@title='Committee Manager Home']";
	public void clickOnCommitteeManagerHome() {
		play.highlightElement(BrowserFactory.getPage(), CommitteeManagerHome);
		play.click(CommitteeManagerHome, "successfully clicked on CommitteeManagerHome");
	}
	String protocolID_CheckBox="//table[@id='CMANAGER_sortable_NEW']//tbody/tr[1]/td[1]";	
	public void clickOnprotocolID_CheckBox() {
		play.highlightElement(BrowserFactory.getPage(), protocolID_CheckBox);
		play.click(protocolID_CheckBox, "successfully clicked on protocolID_CheckBox");
	}
	String pannelDropdown="(//select[@aria-label='panel'])[1]";
	public void selectPanel() {
		play.highlightElement(BrowserFactory.getPage(), pannelDropdown);
		play.Select_Options_By_Using_Index(pannelDropdown, 1);
	}
	String AssignPannelBtn ="//a[@id='assign']";
	public void clickOnAssignPannel() {
		play.highlightElement(BrowserFactory.getPage(), AssignPannelBtn);
		play.click(AssignPannelBtn, "successfully clicked on AssignPannelBtn");
	}
	String Manager = "//a[normalize-space()='Manager']";
	public void clickOnManager() {
		play.highlightElement(BrowserFactory.getPage(), Manager);
		play.click(Manager, "successfully clicked on Manager");
	}
	String ManagerHome ="//a[@title='Manager Home']";
	public void clickOnManagerHome() {
		play.highlightElement(BrowserFactory.getPage(), ManagerHome);
		play.click(ManagerHome, "successfully clicked on ManagerHome");
	}
	String Receipt_of_Protocol="//font[contains(text(),'Receipt of Protocol')]";
	public void clickOnReceipt_of_Protocol() {
		play.click(Receipt_of_Protocol, "successfully clicked on Receipt_of_Protocol");
	}
	String writeComments="//a[@title='Write Comment(s)']";
	public void clickOnwriteComments() {
		play.highlightElement(BrowserFactory.getPage(), writeComments);
		play.click(writeComments, "successfully clicked on waitComments");
	}
	String protocolDecision = "(//a[text()='Protocol Decision'])[2]";
	public void clickOnprotocolDecision() {
		play.highlightElement(BrowserFactory.getPage(), protocolDecision);
		play.click(protocolDecision, "successfully clicked on protocolDecision");
	}
	String protocolId_checkBox_protocolDecisionPage = "(//input[@name='meetIds'])[1]";
	public void clickOnprotocolId_checkBox_protocolDecisionPage() {
		play.highlightElement(BrowserFactory.getPage(), protocolId_checkBox_protocolDecisionPage);
		play.click(protocolId_checkBox_protocolDecisionPage, "successfully clicked on protocolId_checkBox_protocolDecisionPage");
	}
	String DecisionBtn = "//a[@id='submition']";
	public void clickOnDecisionBtn() {
		newPageObj =  play.newPageInstance().waitForPopup(() -> {
			PlayActions.highlightElement(BrowserFactory.getPage(), DecisionBtn);
			play.click(DecisionBtn, "successfully clicked on DecisionBtn");
		});
		
	}
	String savebtn_protocolpopup="//a[@id='save']";
	public void clickOnsavebtn_popup() throws InterruptedException {
		Thread.sleep(1000);
		PlayActions.highlightElement(newPageObj, savebtn_protocolpopup);
		newPageObj.click(savebtn_protocolpopup);
	}

	String wcomments ="//a[@id='wtbutton']";
	public void clickOnWriteComments_Comments() {
		PlayActions.highlightElement(BrowserFactory.getPage(), wcomments);
		play.click(wcomments, "WriteComments_Comments");
	}
	String comments_box="//textarea[@name='cmntNotes']";
	public void enterCommentstoPI() {
		PlayActions.highlightElement(BrowserFactory.getPage(), comments_box);
		play.fill(comments_box, ConfigReader.getValue("CommentstoPI"),"CommentstoPI");
	}
	String save_comments_box="//a[normalize-space()='Save']";
	public void clickOnSave_comments_box() throws InterruptedException {
		PlayActions.highlightElement(BrowserFactory.getPage(), save_comments_box);
		play.click(save_comments_box, "save_comments_box");
		Thread.sleep(1500);
	}
	String submitToPI="//a[normalize-space()='Submit to PI']";
	public void clickOnSubmitToPI() {
		newPageObj =  play.newPageInstance().waitForPopup(() -> {
			PlayActions.highlightElement(BrowserFactory.getPage(), submitToPI);
			play.click(submitToPI, "submitToPI");
		});
	}
	String availableComments ="//option[@title='MA1']";
	public void clickOnAvailableComments() {
		PlayActions.highlightElement(newPageObj, availableComments);
		newPageObj.click(availableComments);
	}
	String farwardPlayBtn="((//table[@summary='Table'])[7]/tbody/tr/td)[1]/img";
	public void clickOnFarwardPlayBtn() {
		PlayActions.highlightElement(newPageObj, farwardPlayBtn);
		newPageObj.click(farwardPlayBtn);
	}
	String submitToPI_commentsPopup="//a[@id='submitPD']";
	public void clickOnSubmitToPI_commentsPopup() {
		PlayActions.highlightElement(newPageObj, submitToPI_commentsPopup);
		newPageObj.click(submitToPI_commentsPopup);
	}

	String commentsReceived_InvHome = "(//table[@id='sortable_NEW']/tbody/tr/td)[3]//font/font";
	public void clickOnCommentsReceived_InvHome() {
		PlayActions.highlightElement(BrowserFactory.getPage(), commentsReceived_InvHome);
		play.click(commentsReceived_InvHome, "commentsReceived_InvHome");
	}
	
	String response_box= "//textarea[@id='textId']";
	public void enterResponse() {
		PlayActions.highlightElement(BrowserFactory.getPage(), response_box);
		play.fill(response_box, ConfigReader.getValue("Response"), "Response");
	}

	String submitToIACUC = "//a[normalize-space()='Submit to IACUC']";
	public void clickOnSubmitToIACUC() {
		newPageObj =  play.newPageInstance().waitForPopup(() -> {
			PlayActions.highlightElement(BrowserFactory.getPage(), submitToIACUC);
			play.click(submitToIACUC, "submitToIACUC");
		});
	}
	String OkBtn ="//a[@title='OK']";
	public void clickOnOkBtn() {
		PlayActions.highlightElement(newPageObj, OkBtn);
		newPageObj.click(OkBtn);
	}
	
	String responsesReceived = "(//table[@id='MANAGER_sortable_NEW']/tbody/tr/td[3]//font)[1]";
	public void clickOnResponsesReceived() {
		PlayActions.highlightElement(BrowserFactory.getPage(), responsesReceived);
		play.click(responsesReceived, "responsesReceived");
	}
	
	
	
	//with out time
//	public void openingUrl() throws InterruptedException {
//		play.openURL(ConfigReader.getValue("Keysolutions_BRD_Url"));
//	}
//
//	public void username() throws InterruptedException {
//		//play. highlightElement(txt_username);
//		play.click(txt_username, "Clicked on username");
//		play.fill(txt_username, ConfigReader.getValue("Username"), "Successfully entered the username");
//
//	}
//
//	public void password() {
//		play.fill(txt_password, ConfigReader.getValue("Password"), "Successfully entered the password");
//	}
//
//	public void login() throws InterruptedException {
//		play.click(login_button, "Successfully Loggedin");
//		//Thread.sleep(1000);
//	}
//	
//	String errorMsg = "//font[@class='PMARK']";
//	public boolean ValidateErrorMsg() {
//		return play.isDisplayed(errorMsg, "error message is displayed");
//	}
//
//	public void iseProtocolExist() {
//		boolean status = play.isVisible(eProtocol, "Successfully visibled");
//		Assert.assertTrue(status);
//	}
//
//	public void clickOneProtocol() {
//		play.click(eProtocol, "Successfully clicked on eProtocol");
//	}
//
//	public void clickOnInvestigator() throws InterruptedException {
//		play.click(investigator, "Successfully clicked on investigator");
//	}
//
//	public void clickOnInvestigatorHome() {
//		play.click(investigator_home, "Successfully clicked on investigator_home");
//	}
//
//	public void clickOnIACUCBtn() {
//		try {
//			play.click(IACUC_chkbox, "Successfully clicked on IACUC_button");
//		} catch (Exception e) {
//
//		}
//	}
//
//	public void clickOnCreateProtocol() {
//		play.click(create_protocol, "Successfully clicked on create_protocol");
//	}
//
//	public void enterStudyTitle(String st) {
//		play.fill(studyTitle_txtbox, st, "Successfully entered study title");
//	}
//
//	public void clickOnIACUCCheckBox() {
//		play.check(IACUC_chkbox, "Successfully checked on IACUC check box");
//	}
//
//	public void enterPhonePI() {
//		play.fill(Phone_PI, "1236547896", "Successfully entered phone number");
//	}
//
//	public void clickOnCreate_btn_CreateProtocolPage() {
//		pages.add(BrowserFactory.getPage());
//		newPageObj = play.newPageInstance().waitForPopup(() -> {
//			play.click(create_btn_CreateProtocolPage, "Successfully clicked on create_btn_CreateProtocolPage");
//			pages.add(newPageObj);
//		});
//	}
//
//	public void clickOnPrinicipal_investigator_No_radiobtn() {
//		newPageObj.click(prinicipal_investigator_No_radiobtn);
//	}
//
//	public void clickOnAdministrative_Editor_No_radiobtn() {
//		newPageObj.click(administrative_Editor_No_radiobtn);
//	}
//
//	public void clickOnDesignated_Editor_No_radiobtn() {
//		newPageObj.click(designated_Editor_No_radiobtn);
//	}
//
//	public void enterEmergencyContactInfo() {
//		newPageObj.fill(emergencyContactInformation_txtarea, "testing");
//	}
//
//	public void clickOnPersonalInformationNexrBtn() throws InterruptedException {
//		newPageObj.click(personalInformationNexrBtn);
//		Thread.sleep(1000);
//	}
//
//	// Species
//	public void clickOnAddBtn() throws InterruptedException {
//		Thread.sleep(3000);
//		newPageObj2 = newPageObj.waitForPopup(() -> {
//			newPageObj.click(addBtn);
//			pages.add(newPageObj2);
//		});
//
//		System.out.println("no of pages are : " + pages.size());
//	}
//
//	public void selectsSpeciesCommonName() {
////		Locator dd = newPageObj2.locator(SpeciesCommonName_dd);
////		dd.selectOption(new SelectOption().setIndex(1));
//		
//		newPageObj2.selectOption(SpeciesCommonName_dd, "9417");
//	}
//	
//	String animalSex = "//select[@id='R6C4_ob130_4']";
//	public void selectAnimalSex() {
//		Locator dd = newPageObj2.locator(animalSex);
//		dd.selectOption(new SelectOption().setIndex(2));
//	}
//	String housing = "//select[@id='R4C2_ob130_4']";
//	public void selectHousingFacility() {
//		Locator dd = newPageObj2.locator(housing);
//		dd.selectOption(new SelectOption().setIndex(1));
//	}
//	
//	String maxNoAnimals = "//input[@id='R10C2_ob130_4']";
//	public void enterMaxNoAnimals() {
//		newPageObj2.fill(maxNoAnimals, "1000");
//	}
//	
//	String painCatChkBox ="//input[@id='R20C3_ob130_4']";
//	public void clickOnPainCatchkBox() {
//		newPageObj2.click(painCatChkBox);
//	}
//	String painCatNo_Txtbox = "//input[@id='R15C4_ob130_4']";
//	public void enterPainCatNo() {
//		newPageObj2.fill(painCatNo_Txtbox, "1000");
//	}
//	String vendorChkbox = "//input[@id='R21C1_ob130_4']";
//	public void clickOnVendorChkbox() {
//		newPageObj2.click(vendorChkbox);
//	}
//	String vendorTxtBox = "//input[@id='R21C4_ob130_4']";
//	public void enterVendorTxtBox() {
//		newPageObj2.fill(vendorTxtBox, "v1");
//	}
//	String animals_undergone_procedures="//label[@for='R25C7_ob130_4_OP2']";
//	public void clickOnAnimals_undergone_procedures() {
//		newPageObj2.click(animals_undergone_procedures);
//	}
//	String genetically_Modified_Animals_have_phenotype="//label[@for='R29C7_ob130_4_OP2']";
//	public void clickOnGenetically_Modified_Animals_have_phenotype() {
//		newPageObj2.click(genetically_Modified_Animals_have_phenotype);
//	}
//	String saveBtn = "//a[normalize-space()='Save']";
//	public void clickOnSaveBtn() {
//		newPageObj2.click(saveBtn);
//	}
//	
//	String speciesChkbox = "//input[@id='mouse (Location1)']"; 	 
//	public void clickOnSpeciesChkbox() {
//		newPageObj.click(speciesChkbox);
//	}
//	String nextBtn_speciesHomepage ="(//a[normalize-space()='Next'])[1]";
//	public void clickOnnextBtn_speciesHomepage() {
//		newPageObj.click(nextBtn_speciesHomepage);
//	}
//	String VetName = "//input[@id='R1C3_ob299_23']";
//	public void enterVetName() {
//		newPageObj.fill(VetName, "vet");
//	}
//	String dateOfConsultation = "//img[@alt='Select a Date']";
//	String date = "//a[normalize-space()='29']";
//	String next="(//a[normalize-space()='Next'])[1]";
//	public void enterDateOfConsultation() throws InterruptedException {
//		
//		newPageObj2 = newPageObj.waitForPopup(() -> {
//			newPageObj.click(dateOfConsultation);
//		});
//		//Thread.sleep(2000);
//		newPageObj2.click(date);
//		//Thread.sleep(2000);
//	}
//	//clickon nest btn
//	String Collaboration_with_another_institution = "//label[@for='R1C3_ob140_361_OP2']";
//	public void clickOnCollaboration_with_another_institution() throws InterruptedException {
//		newPageObj.click(Collaboration_with_another_institution);
//	}
//	
//	String Live_animals_for_teaching = "//label[@for='R1C3_ob140_366_OP2']";
//	public void clickOnLive_animals_for_teaching() {
//		newPageObj.click(Live_animals_for_teaching);
//	}
//
//	String biological_material_human_or_animal_products = "//label[@for='R1C3_ob140_387_OP2']";
//	public void clickOBbiological_material_human_or_animal_products() {
//		newPageObj.click(biological_material_human_or_animal_products);
//	}
//
//	String Toxic_Substances = "//label[@for='R1C3_ob140_412_OP2']";
//	public void clcikOnToxic_Substances() {
//		newPageObj.click(Toxic_Substances);
//	}
//
//	String Radiological_Agents = "//label[@for='R1C3_ob140_415_OP2']";
//	public void clickOnRadiological_Agents() {
//		newPageObj.click(Radiological_Agents);
//	}
//
//	
//	String Other_Agents_or_Substances = "//label[@for='R1C3_ob140_419_OP2']";
//	public void clickOnOther_Agents_or_Substances() {
//		newPageObj.click(Other_Agents_or_Substances);
//	}
//	
//	String 	Field_Study_or_Wildlife_Study = "//label[@for='R1C3_ob140_422_OP2']";
//	public void clickOnField_Study_or_Wildlife_Study() {
//		newPageObj.click(Field_Study_or_Wildlife_Study);
//	}
//	
//	String breeding_or_creating_transgenic_or_knockin_out_animals = "//label[@for='R1C3_ob140_425_OP2']";
//	public void clickOnbreeding_or_creating_transgenic_or_knockin_out_animals() {
//		newPageObj.click(breeding_or_creating_transgenic_or_knockin_out_animals);
//	}
//
//	String hES_or_hIPS_cells_in_animals = "//label[@for='R1C3_ob140_436_OP2']";
//	public void clickOnhES_or_hIPS_cells_in_animals() {
//		newPageObj.click(hES_or_hIPS_cells_in_animals);
//	}
//
//	String creating_teratomas = "//label[@for='R1C3_ob140_437_OP2']";
//	public void clcikOncreating_teratomas() {
//		newPageObj.click(creating_teratomas);
//	}
//	//
//	String Aims_and_Significance_a ="//textarea[@id='R2C1_ob170_234']";
//	public void enterAims_and_Significance_a() {
//		newPageObj.fill(Aims_and_Significance_a,"testing");
//	}
//	String Aims_and_Significance_b="//textarea[@id='R2C1_ob170_236']";
//	public void enterAims_and_Significance_b() {
//		newPageObj.fill(Aims_and_Significance_b,"testing");
//	}
//	String Rationale_for_Use_of_Animals_a="//textarea[@id='R2C1_ob170_237']";
//	public void enterRationale_for_Use_of_Animals_a() {
//		newPageObj.fill(Rationale_for_Use_of_Animals_a,"testing");
//	}
//
//	String Rationale_for_Use_of_Animals_b = "//textarea[@id='R2C1_ob170_239']";
//	public void enterRationale_for_Use_of_Animals_b() {
//		newPageObj.fill(Rationale_for_Use_of_Animals_b,"testing");
//	}
//
//	String Rationale_for_Use_of_Animals_c = "//input[@id='R1C1_ob170_246']";
//	public void enterRationale_for_Use_of_Animals_c() {
//		newPageObj.click(Rationale_for_Use_of_Animals_c);
//	}
//
//	String Rationale_for_Use_of_Animals_d = "//textarea[@id='R2C1_ob170_255']";
//	public void enterRationale_for_Use_of_Animals_d() {
//		newPageObj.fill(Rationale_for_Use_of_Animals_d,"testing");
//	}
//	
//	String Add_procedure = "//a[@class='listing1']";
//	public void clickOnAdd_procedure() {
//		newPageObj.click(Add_procedure);
//	}
//	String procedureType_dd="//select[@id='R1C2_ob150_0']";
//	public void selectProcedureType() {
//		Locator dd = newPageObj.locator(procedureType_dd);
//		dd.selectOption(new SelectOption().setIndex(1));
//	}
//	String description_txt = "//input[@id='R2C2_ob150_0']";
//	public void enterDescription_txt() {
//		newPageObj.fill(description_txt,"testing");
//	}
//	String species_dd = "//select[@id='R3C2_ob150_0']";
//	public void selectSpecies() {
//		Locator dd = newPageObj.locator(species_dd);
//		dd.selectOption(new SelectOption().setIndex(1));
//	}
//	String painCategory_dd = "//select[@id='R3C4_ob150_0']";
//	public void selectPainCategory() {
//		Locator dd = newPageObj.locator(painCategory_dd);
//		dd.selectOption(new SelectOption().setIndex(1));
//	}
//
//	String animals_to_be_used_in_this_procedure_txt = "//input[@id='R5C3_ob150_0']";
//	public void enterAnimals_to_be_used_in_this_procedure_txt() {
//		newPageObj.fill(animals_to_be_used_in_this_procedure_txt,"100");
//	}
//	
//	String Campus ="//select[@id='R6C3_ob150_0']";
//	public void selectCampus() {
//		Locator dd = newPageObj.locator(Campus);
//		dd.selectOption(new SelectOption().setIndex(1));
//	}
//	
//	String BuildingorFacility = "//select[@id='R8C3_ob150_0']";
//	public void selectBuildingorFacility() {
//		Locator dd = newPageObj.locator(BuildingorFacility);
//		dd.selectOption(new SelectOption().setIndex(1));
//	}
//	
//	String RoomNumber= "//select[@id='R10C3_ob150_0']";
//	public void selectRoomNumber() {
//		Locator dd = newPageObj.locator(RoomNumber);
//		dd.selectOption(new SelectOption().setIndex(1));
//	}
//	
//	String proceduresBtn = "(//a[@title='Procedures'])[1]";
//	public void clickOnProceduresBtn() {
//		newPageObj.click(proceduresBtn);
//	}
//	String procedureTypeOptionLink = "//font[normalize-space()='Anesthetize and Release']";
//	public void clickOnProcedureTypeOptionLink() {
//		newPageObj.click(procedureTypeOptionLink);
//	}
//	
//	String ProcedureDescription_1 = "//textarea[@id='R2C1_ob151_4']";
//	public void enterProcedureDescription_1() {
//		newPageObj.fill(ProcedureDescription_1, "testing1");
//	}
//	String ProcedureDescription_2="//textarea[@id='R2C1_ob151_6']";
//	public void enterProcedureDescription_2() {
//		newPageObj.fill(ProcedureDescription_2, "testing2");
//	}
//	String ProcedureDescription_3="//textarea[@id='R2C1_ob151_8']";
//	public void enterProcedureDescription_3() {
//		newPageObj.fill(ProcedureDescription_3, "testing3");
//	}
//	String ProcedureDescription_4="//textarea[@id='R2C1_ob151_10']";
//	public void enterProcedureDescription_4() {
//		newPageObj.fill(ProcedureDescription_4, "testing4");
//	}
//	String Literature ="//input[@id='R1C1_ob210_69']";
//	public void clickOnLiterature() {
//		newPageObj.click(Literature);
//	}
//	
//	String painful_or_distressful_procedures="//textarea[@id='R2C1_ob210_79']";
//	public void enterPainful_or_distressful_procedures() {
//		newPageObj.fill(painful_or_distressful_procedures, "testing");
//	}
//	String DuplicationofResults ="//input[@id='R1C1_ob210_74']";
//	public void clickOnDuplicationofResults() {
//		newPageObj.click(DuplicationofResults);
//	}
//
//	String Attendance_at_meetings_or_conferences_a ="//input[@id='R1C1_ob210_32_OP2']";
//	public void clickOnAttendance_at_meetings_or_conferences_a() {
//		newPageObj.click(Attendance_at_meetings_or_conferences_a);
//	}
//	String Attendance_at_meetings_or_conferences_b="//input[@id='R1C1_ob210_36_OP2']";
//	public void clickOnAttendance_at_meetings_or_conferences_b() {
//		newPageObj.click(Attendance_at_meetings_or_conferences_b);
//	}
//	String Attendance_at_meetings_or_conferences_c="//input[@id='R1C1_ob210_40_OP2']";
//	public void clickOnAttendance_at_meetings_or_conferences_c() {
//		newPageObj.click(Attendance_at_meetings_or_conferences_c);
//	}
//	
//	String Add_Euthanasia ="//a[normalize-space()='Add']";
//	public void Add_Euthanasia() throws InterruptedException {
//		Thread.sleep(2000);
//		newPageObj2 = newPageObj.waitForPopup(() -> {
//			newPageObj.click(Add_Euthanasia);
//		});
//	}
//	
//	String species_Dd = "//select[@id='R1C2_ob195_4']";
//	public void selectSpecies_Euthanasia() {
//		Locator dd = newPageObj2.locator(species_Dd);
//		dd.selectOption(new SelectOption().setIndex(1));
//	}
//	
//	String Method_of_Euthanasia_Primary_dd ="//select[@id='R2C2_ob195_4']";
//	public void selectMethod_of_Euthanasia_Primary() {
//		Locator dd = newPageObj2.locator(Method_of_Euthanasia_Primary_dd);
//		dd.selectOption(new SelectOption().setIndex(1));
//	}
//	
//	String save_euthanisia ="(//a[normalize-space()='Save'])[1]";
//	public void clickOnSave_euthanisia() throws InterruptedException {
//		Thread.sleep(1000);
//		newPageObj2.click(save_euthanisia);
//	}
//	
//	String Mandatory_policy1 = "//a[@id='id_220_220_289_R1C0']";
//	String IAgree_Mandatory_policy1 = "//label[@for='R1C3_ob220_289_OP1']";
//	String Save_Mandatory_policy1="//a[@id='SaveORUpdateObject']";
//	public void acceptMandatory_policy1() throws InterruptedException {
//		newPageObj2 = newPageObj.waitForPopup(() -> {
//			newPageObj.click(Mandatory_policy1);
//		});
//		//Thread.sleep(1000);
//		newPageObj2.click(IAgree_Mandatory_policy1);
//		//Thread.sleep(1000);
//		newPageObj2.click(Save_Mandatory_policy1);
//	}
//	
//	
//	String Mandatory_policy2="//a[@id='id_220_220_290_R1C0']";
//	String IAgree_Mandatory_policy2 = "//label[@for='R1C3_ob220_290_OP1']";
//	String Save_Mandatory_policy2="//a[@id='SaveORUpdateObject']";
//	public void acceptMandatory_policy2() throws InterruptedException {
//		newPageObj2 = newPageObj.waitForPopup(() -> {
//			newPageObj.click(Mandatory_policy2);
//		});
//		//Thread.sleep(1000);
//		newPageObj2.click(IAgree_Mandatory_policy2);
//		//Thread.sleep(1000);
//		newPageObj2.click(Save_Mandatory_policy2);
//	}
//	
//	String certificationCheckBox ="//input[@id='R1C1_ob160_56']";
//	String Save_btn = "//a[@class='hbmenu'][normalize-space()='Save']";
//	public void clickOnCertificationCheckBox() throws InterruptedException {
//		newPageObj.click(certificationCheckBox);
//		Thread.sleep(2000);
//		newPageObj.click(Save_btn);
//		Thread.sleep(3000);
//		
//	}
//	
//	String submitForm = "//a[normalize-space()='Submit Form']";
//	public void clickOnSubmitForm() {
//		newPageObj2 = newPageObj.waitForPopup(() -> {
//			newPageObj.click(submitForm);
//		});
//	}
//	
//	String YesBtn_submitpopup = "//a[@title='Yes']";
//	public void clickOnYesBtn_submitpopup() {
//		newPageObj2.click(YesBtn_submitpopup);
//	}
//	
//	String successMsg = "//th[@id='LayerConfirm']";
//	public void getProtocolSubmissionSuccessMsgText() throws InterruptedException {
//		Thread.sleep(2000);
//		String succMsg = play.getText(successMsg).trim();
//		Thread.sleep(1000);
//		System.out.println("success message: "+succMsg.trim());
//		System.out.println(succMsg.trim().substring(succMsg.trim().length()-5, succMsg.trim().length()-1));
//		try {
//			protocolID=succMsg.trim().substring(succMsg.trim().length()-5, succMsg.trim().length()-1);
//		}catch(Exception e) {
//			
//		}
//		System.out.println("protocol id is : "+protocolID);
//		//Assert.assertEquals(succMsg, ""+protocolID);
//	}
//	
//	String committeeManager = "//a[normalize-space()='Committee Manager']";
//	public void clickOncommitteeManager() {
//		play.click(committeeManager, "successfully clicked on committeeManager");
//	}
//	String CommitteeManagerHome ="//a[@title='Committee Manager Home']";
//	public void clickOnCommitteeManagerHome() {
//		play.click(CommitteeManagerHome, "successfully clicked on CommitteeManagerHome");
//	}
//	String protocolID_CheckBox="//table[@id='CMANAGER_sortable_NEW']//tbody/tr[1]/td[1]";	
//	public void clickOnprotocolID_CheckBox() {
//		play.click(protocolID_CheckBox, "successfully clicked on protocolID_CheckBox");
//	}
//	String pannelDropdown="(//select[@aria-label='panel'])[1]";
//	public void selectPanel() {
//		play.Select_Options_By_Using_Index(pannelDropdown, 1);
//	}
//	String AssignPannelBtn ="//a[@id='assign']";
//	public void clickOnAssignPannel() {
//		play.click(AssignPannelBtn, "successfully clicked on AssignPannelBtn");
//	}
//	String Manager = "//a[normalize-space()='Manager']";
//	public void clickOnManager() {
//		play.click(Manager, "successfully clicked on Manager");
//	}
//	String ManagerHome ="//a[@title='Manager Home']";
//	public void clickOnManagerHome() {
//		play.click(ManagerHome, "successfully clicked on ManagerHome");
//	}
//	String Receipt_of_Protocol="//font[contains(text(),'Receipt of Protocol')]";
//	public void clickOnReceipt_of_Protocol() {
//		play.click(Receipt_of_Protocol, "successfully clicked on Receipt_of_Protocol");
//	}
//	String writeComments="//a[@title='Write Comment(s)']";
//	public void clickOnwriteComments() {
//		play.click(writeComments, "successfully clicked on waitComments");
//	}
//	String protocolDecision = "(//a[text()='Protocol Decision'])[2]";
//	public void clickOnprotocolDecision() {
//		play.click(protocolDecision, "successfully clicked on protocolDecision");
//	}
//	String protocolId_checkBox_protocolDecisionPage = "(//input[@name='meetIds'])[1]";
//	public void clickOnprotocolId_checkBox_protocolDecisionPage() {
//		play.click(protocolId_checkBox_protocolDecisionPage, "successfully clicked on protocolId_checkBox_protocolDecisionPage");
//	}
//	String DecisionBtn = "//a[@id='submition']";
//	public void clickOnDecisionBtn() {
//		newPageObj =  play.newPageInstance().waitForPopup(() -> {
//			play.click(DecisionBtn, "successfully clicked on DecisionBtn");
//		});
//		
//	}
//	String savebtn_protocolpopup="//a[@id='save']";
//	public void clickOnsavebtn_popup() throws InterruptedException {
//		Thread.sleep(1000);
//		newPageObj.click(savebtn_protocolpopup);
//	}
//
//	String wcomments ="//a[@id='wtbutton']";
//	public void clickOnWriteComments_Comments() {
//		play.click(wcomments, "dsf");
//	}
//	String comments_box="//textarea[@name='cmntNotes']";
//	public void enterCommentstoPI() {
//		play.fill(comments_box, "dsf","gdjas");
//	}
//	String save_comments_box="//a[normalize-space()='Save']";
//	public void clickOnSave_comments_box() {
//		play.click(save_comments_box, "dsf");
//	}
//	String submitToPI="//a[normalize-space()='Submit to PI']";
//	public void clickOnSubmitToPI() {
//		newPageObj =  play.newPageInstance().waitForPopup(() -> {
//			play.click(submitToPI, "dsf");
//		});
//	}
//	String availableComments ="//option[@title='MM1']";
//	public void clickOnAvailableComments() {
//		newPageObj.click(availableComments);
//	}
//	String farwardPlayBtn="((//table[@summary='Table'])[7]/tbody/tr/td)[1]/img";
//	public void clickOnFarwardPlayBtn() {
//		newPageObj.click(farwardPlayBtn);
//	}
//	String submitToPI_commentsPopup="//a[@id='submitPD']";
//	public void clickOnSubmitToPI_commentsPopup() {
//		newPageObj.click(submitToPI_commentsPopup);
//	}
//	//String ="";
//	String commentsReceived_InvHome = "(//table[@id='sortable_NEW']/tbody/tr/td)[3]//font/font";
//	public void clickOnCommentsReceived_InvHome() {
//		play.click(commentsReceived_InvHome, "df");
//	}
//	
//	String response_box= "//textarea[@id='textId']";
//	public void enterResponse() {
//		play.fill(response_box, "sdfs", "sdf");
//	}
//
//	String submitToIACUC = "//a[normalize-space()='Submit to IACUC']";
//	public void clickOnSubmitToIACUC() {
//		newPageObj =  play.newPageInstance().waitForPopup(() -> {
//			play.click(submitToIACUC, "dsf");
//		});
//	}
//	String OkBtn ="//a[@title='OK']";
//	public void clickOnOkBtn() {
//		newPageObj.click(OkBtn);
//	}
//	
//	String responsesReceived = "(//table[@id='MANAGER_sortable_NEW']/tbody/tr/td[3]//font)[1]";
//	public void clickOnResponsesReceived() {
//		play.click(responsesReceived, "responsesReceived");
//	}
	
}
