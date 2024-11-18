@LARS
Feature: LARS Module

  @scenario1
  Scenario: Automating the functionlaity of LARS module
    Given User is in the appliaction
    When User enters user name and password
    And User clicks on login button
    Then User should able to see the home page
    When User clicks on eAnimal Ordering dropdown
    And User clicks on Investigator
    And User clicks on Get Approved Protocols
    And User clicks on protocol ID under Document ID under Available Protocols
    Then User should verify Approved species table data
    When User clicks on Protocol Personnel
    #And User enters Phone number
    And User clicks on Save button
    When User clicks on Funding Details
    And User clicks on Add button
    And User fills the all mandatory fields in funding details(Project number,Expiration Date)
    And User clicks on Save button in funding details page
    When User clicks on Approved Species
    And User clicks on species check box
    And User clicks on Create Requisition button
    And User clicks on specie under Species/Strain/Species Source
    And User fills all mandatory fields under Requisitioned Species Details
    And User clicks on OK button
    And User select the RP Name
    And User clicks on Submit to ARC
    Then User should able to see success message with Requisition ID
    When User clicks on eAnimal Ordering dropdown
    And User clicks on Investigator
    And User clicks on Reports
    And User clicks on BRN Report
    Then User should able to see the BRN report
    #When User clicks on eAnimal Ordering dropdown
    #And User clicks on Investigator
    #And User clicks on Reports
    #And User clicks on Pending For Receipt
    #Then User should able to see Pending For Receipt
    When User clicks on eAnimal Ordering dropdown
    And User clicks on Procurement Staff
    And User clicks on Procurement Staff Home
    And User clicks on Document ID under Available Protocols for the same protocol ID
    And User clicks on specie under Species/Strain/Species Source under Procurement Staff section
    And User select Cost Code icon
    And User selcts any one of the options check box in Per Diem Charges
    And User clicks on Add button in per dim charges
    And User clicks on OK button
    And User selects the species check box
    And User clicks on Create Order button
    And User enters mandotory fields
    And User clicks on Finalize Order
    Then User should able to see the Success message of the order
    When User clicks on Finalize Order
    #And User clicks on Yes button in the pop up
    And User clicks on Update Glance
    And User clicks on Barcode(s) under Bar Code No.
    #Then User should able to see Use Status as Yet to be received and tags
    #When User clicks on Cancel button in Cage Card
    And User clicks on Cancel button in Bar codes page
    When User clicks on eAnimal Ordering dropdown
    And User clicks on Procurement Staff
    And User clicks on Reports under Procurement Staff
    And User clicks on Pending For receipt under the procurement staff section
    #Then User should to validate Pending For receipt report
    When User clicks on eAnimal Ordering dropdown
    And User clicks on Procurement Staff
    #And User clicks on Receipt Home
    #And User clicks on AR check box for the same protocol ID under Action Required
    #And User clicks on Execute button
    #And User Clicks on Confirm button
    #Then User should able to see the Receipt is released success message
    #When User clicks on eAnimal Ordering
    #And User clicks on Investigator
    #And User clicks on Investigator Home
    #And User clicks on Completed Transactions icon
    #Then User should able to see the same protocol ID record under Completed Transactions
