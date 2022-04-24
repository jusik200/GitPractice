@Smoke
Feature: Full Inventory functionalities

  Background:
  Given user is on qa environment

  Scenario: Verify user can add items to each room
    Given user should select "My House" on What are you moving selector
    And user should select "1 Bedroom (500-1000 sq ft)" in Move Size drop down menu
    When user should click on compare quotes button
    Then "These are recommended rooms for a" pop up should appear
    When user click on Continue button in These are recommended rooms for a pop up
    Then Boxes pop up should appear with "GOT IT" button
    When user click on GOT IT button in Boxes pop up
    Then hint "Here you can see all your rooms and start moving!" appears
    When user clicks Next button in Here you can see all your rooms and start moving! hint
    Then should see hint "Here you can see inventory items for selected room!"
    When user should click Next button in Here you can see inventory items for selected room! hint
    And user see hint "Press this button to save choosed items and move to the next room!"
    Then user should click Ok button in Press this button to save choosed items and move to the next room! hint
    When user should click add to inventory Sofa in Living room
    And user should click add to inventory TV in Living room
    Then user should click save and go to next button in Living room
    When user should click add to inventory Dresser in Bedroom room
    And user should click add to inventory Bed in Bedroom room
    Then user should click save and go to next button in Bedroom room
    When user should click add to inventory Kitchen_Dining chairs in Dining room
    And user should click add to inventory Kitchen_Dining table in Dining room
    Then user should click save and go to next button in Dining room
    When user should click add to inventory Kitchen_Dining chairs in Kitchen room
    And user should click add to inventory Kitchen_Dining table in Kitchen room
    Then user should click save and go to next button in Kitchen room
    When user should click add to inventory Basket_Hamper in Bathroom room
    And user should click add to inventory Trash Can in Bathroom room
    Then user should click save and go to next button in Bathroom room
    When user should click add to inventory Outdoor chair in Patio room
    And user should click add to inventory Outdoor table in Patio room
    And user should click save and go to next button in Patio room
    Then "Box Calculator" pop up appears
    When user should click Add and Continue button in Box Calculator pop up
