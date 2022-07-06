@Logout
Feature: Upgenix application logout feature

  User story: As a user, I should be able to log out.

  Background: for the scenarios in the feature file, user is expected to be on home page
    Given User is on the home page
    Then User verifies that the title is "Odoo"

  Scenario: verification of the logout button functionality
    When user clicks the user avatar
    And user clicks the logout button in dropdown
    Then Actual title should be "Login | Best solution for startups"

  Scenario: verification of the step back button
    When user clicks the user avatar
    And user clicks the logout button in dropdown
    And Actual title should be "Login | Best solution for startups"
    And User clicks on the step back button after successfully logging out.
    Then Odoo Session Expired message is displayed
