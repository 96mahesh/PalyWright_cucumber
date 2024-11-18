@PMS
Feature: PMS Module

  @scenario1
  Scenario: Automating the functionlaity of Submmiting the Protocol in ePMS application
    Given User is in the appliaction
    When User enters user name and password
    And User clicks on login button
    Then User should able to see the home page
    And User clicks on eProtocol
    And User clicks on Investigator form the eProtocol dropdown
    And User clicks on Investigator home
    When User clicks on Create Protocol
    When User enters Study title
    And User clicks on IACUC check box under IACUC section
    And User enters phone number in principal investigator
    And User clicks on create button
    And User selects NO option from the working with animal models in principal investigator
    And User selects NO option from the working with animal models in administartive editor
    And User selects NO option from the working with animal models in designated editor
    And User enters emergency contact number
    And User clicks on Next button
    When User clicks on add button
    And User fills all the mandatory fields in the species page
    And User clicks on save button in the species page
    And User checks the animal name from species to be added
    And User clicks on Next button species homepage
    When User enters name of consult and date of consultation
    And User clicks on Next button
    When User fills all the mandatory fields in collaborations and safety concerns
    And User clicks on Next button
    And User clicks on Next button
    When User enters all mandatory filelds in Rationale
    And User clicks on Next button
    And User clicks on Add button in procedure page
    And User fill all the mandatory fields in the procedures page
    And User clicks on Next button
    And User clicks on procedures button
    And User clicks on procedure type option link
    And User fills the procedure description text boxes
    And User clicks on Next button
    And User enters all mandatory fields in Alternative search
    And User clicks on Next button
    And User clicks on Next button
    And User clicks on Add button in Euthanasia page
    And User enters all mandatory fields in the Euthanasia page
    And User clicks on save button in the Euthanasia page
    And User clicks on Next button
    And User clicks on Next button
    And User accepts all mandatory policies
    #And User clicks on Next button
    When User clicks on submit button
    When User clicks on Yes button in the pop up
    Then User should able to see the protocol submits successfully in the investigator home page
    And User clicks on eProtocol
    And User clicks committe manager
    And User selects committe manager home
    When User selects the proctocol id which he creates
    And User assigns the protocol to the panel member
    And User clicks on assign panel button
    And User clicks on eProtocol
    And User clicks on manager
    And User selects manager home
    And User clicks on Receipt of Protocol
    And User clicks on write Comments
    And User clicks on protocol Decision
    And User clicks on protocolId checkBox in protocolDecision Page
    And User clicks on Decision button
    And User clicks on Save button in protocol popup

  @scenario2
  Scenario: Automating the functionlaity of Submmiting the Protocol in ePMS application
    Given User is in the appliaction
    When User enters user name and password
    And User clicks on login button
    Then User should able to see the home page
    And User clicks on eProtocol
    And User clicks on Investigator form the eProtocol dropdown
    And User clicks on Investigator home
    When User clicks on Create Protocol
    When User enters Study title
    And User clicks on IACUC check box under IACUC section
    And User enters phone number in principal investigator
    And User clicks on create button
    And User selects NO option from the working with animal models in principal investigator
    And User selects NO option from the working with animal models in administartive editor
    And User selects NO option from the working with animal models in designated editor
    And User enters emergency contact number
    And User clicks on Next button
    When User clicks on add button
    And User fills all the mandatory fields in the species page
    And User clicks on save button in the species page
    And User checks the animal name from species to be added
    And User clicks on Next button species homepage
    When User enters name of consult and date of consultation
    And User clicks on Next button
    When User fills all the mandatory fields in collaborations and safety concerns
    And User clicks on Next button
    And User clicks on Next button
    When User enters all mandatory filelds in Rationale
    And User clicks on Next button
    And User clicks on Add button in procedure page
    And User fill all the mandatory fields in the procedures page
    And User clicks on Next button
    And User clicks on procedures button
    And User clicks on procedure type option link
    And User fills the procedure description text boxes
    And User clicks on Next button
    And User enters all mandatory fields in Alternative search
    And User clicks on Next button
    And User clicks on Next button
    And User clicks on Add button in Euthanasia page
    And User enters all mandatory fields in the Euthanasia page
    And User clicks on save button in the Euthanasia page
    And User clicks on Next button
    And User clicks on Next button
    And User accepts all mandatory policies
    #And User clicks on Next button
    When User clicks on submit button
    When User clicks on Yes button in the pop up
    Then User should able to see the protocol submits successfully in the investigator home page
    And User clicks on eProtocol
    And User clicks committe manager
    And User selects committe manager home
    When User selects the proctocol id which he creates
    And User assigns the protocol to the panel member
    And User clicks on assign panel button
    And User clicks on eProtocol
    And User clicks on manager
    And User selects manager home
    And User clicks on Receipt of Protocol
    And User clicks on write Comments
    And User clicks on write comments in commants page
    And User enters comments in comments box
    And User clicks on Save button above the comments box
    And user clicks on submit to PI button
    And User clicks on comment in available comments
    And User clicks on Forward Play button
    And User clicks on submit to PI button in comments popup
    And User clicks on eProtocol
    And User clicks on Investigator form the eProtocol dropdown
    And User clicks on Investigator home
    And User clicks on comments received
    And User enters reponse in response text box
    And User cliks on Submit to IACUC
    And User clicks on eProtocol
    And User clicks on manager
    And User selects manager home
    And User clicks on Responses Received
    And User clicks on protocol Decision
    And User clicks on protocolId checkBox in protocolDecision Page
    And User clicks on Decision button
    And User clicks on Save button in protocol popup
