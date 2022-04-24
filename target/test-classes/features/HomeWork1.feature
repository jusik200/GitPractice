@Smoke
Feature: Compare quotes functionalities

  Background:
    Given user is on live environment

  Scenario: verify compare quotes functionality is working
    When user should select "My Apartment" on What are you moving selector
    Then "My Apartment" should be selected
    And user should select 1 bedroom, on bedroom amount selector
    And user should click on compare quotes button
    Then user should see configurator






