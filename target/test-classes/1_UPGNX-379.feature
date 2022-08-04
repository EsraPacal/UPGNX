@UPGNX-378
Feature: Default

	Background:
		#@UPGNX-379
		Background: for the scenarios in the feature file, user is expected to be on home page
		    Given User is on the home page
		    Then User verifies that the title is "Odoo"
		

	
	@UPGNX-376
	Scenario: verification of the "Log out" button functionality
		Scenario: verification of the log out button functionality
		    When user clicks the user avatar
		    And user clicks the log out button in dropdown
		    Then Actual title should be "Login | Best solution for startups"	

	
	@UPGNX-377
	Scenario: verification of the step back function
		Scenario: verification of the step back function
		    When user clicks the user avatar
		    And user clicks the logout button in dropdown
		    And Actual title should be "Login | Best solution for startups"
		    And User clicks on the step back button after successfully logging out.
		    Then Odoo Session Expired message is displayed