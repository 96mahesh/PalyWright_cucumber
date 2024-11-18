@tag
Feature: Title of your feature

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

  Scenario: Automating the functionlaity of LARS module
    #Given User is in the appliaction
    #When User enters user name and password
    #And User clicks on login button
    #Then User should able to see the home page
    #When User clicks on eAnimal Ordering dropdown
    #And User clicks on Investigator
    #And User clicks on Get Approved Protocols
    #And User clicks on protocol ID under Document ID under Available Protocols
    #Then User should verify Approved species table data
    #When User clicks on Protocol Personnel
    #And User enters Phone number
    #And User clicks on Save button
    #When User clicks on Funding Details
    #And User clicks on Add button
    #And User fills the all mandatory fields in funding details(Project number,Expiration Date)
    #And User clicks on Save button in funding details page
    #When User clicks on Approved Species
    #And User clicks on species check box
    #And User clicks on Create Requisition button
    #And User clicks on specie under Species/Strain/Species Source
    #And User fills all mandatory fields under Requisitioned Species Details
    #And User clicks on OK button
    #And User select the RP Name
    #And User clicks on Submit to ARC
    #Then User should able to see success message with Requisition ID
    #When User clicks on eAnimal Ordering dropdown
    #And User clicks on Investigator
    #And User clicks on Reports
    #And User clicks on BRN Report
    #Then User should able to see the BRN report
    #When User clicks on eAnimal Ordering dropdown
    #And User clicks on Investigator
    #And User clicks on Reports
    #And User clicks on Pending For Receipt
    #Then User should able to see Pending For Receipt
    #When User clicks on eAnimal Ordering dropdown
    #And User clicks on Procurement Staff
    #And User clicks on Procurement Staff Home
    #And User clicks on Document ID under Available Protocols for the same protocol ID
    #And User clicks on specie under Species/Strain/Species Source under Procurement Staff section
    #And User select Cost Code icon
    #And User selcts any one of the options check box in Per Diem Charges
    #And User clicks on Add button in per dim charges
    #And User clicks on OK button
    #And User selects the species check box
    #And User clicks on Create Order button
    #And User enters mandotory fields
    #And User clicks on Finalize Order
    #Then User should able to see the Success message of the order
    #When User clicks on Finalize Order
    #And User clicks on Yes button in the pop up
    #And User clicks on Update Glance
    #And User clicks on Barcode(s) under Bar Code No.
    #Then User should able to see Use Status as Yet to be received and tags
    #When User clicks on Cancel button in Cage Card
    #And User clicks on Cancel button in Bar codes page
    #When User clicks on eAnimal Ordering dropdown
    #And User clicks on Procurement Staff
    #And User clicks on Reports under Procurement Staff
    #And User clicks on Pending For receipt under the procurement staff section
    #Then User should to validate Pending For receipt report
    #When User clicks on eAnimal Ordering dropdown
    #And User clicks on Procurement Staff
