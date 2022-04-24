@Smoke
Feature: Home page functionalities

  Background:
    Given user is on qa environment


  Scenario: Verify labor tab button is clickable
    When user should click labor tab button
    Then user should see "Enter your zip code" and "Move date" fields