@UPGNX-374
Feature: Default

	Background:
		#@UPGNX-375
		Background: for the scenarios in the feature file, user is expected to be on login page
		    Given User is on the login page
		    Then User verifies that the title is Login | Best solution for startups
		

	
	@UPGNX-352
	Scenario Outline: Verification of logging to the homepage with the valid credentials
		Scenario Outline: Logging to the homepage with the valid credentials
		    When salesmenager-posmenager user types "<valid email>" and "<valid password>" in the input boxes
		    And salesmenager-posmanager user clicks login button
		    Then Users should see that expectedTitle is "Odoo"
		
		    Examples:
		      | valid email             | valid password |
		      | posmanager16@info.com   | posmanager     |
		      | posmanager17@info.com   | posmanager     |
		      | salesmanager18@info.com | salesmanager   |
		      | salesmanager19@info.com | salesmanager   |	

	
	@UPGNX-367
	Scenario Outline: Verification of the error message "Wrong login/password"
		Scenario Outline: Verification of the error message in case of typing valid email and invalid password
		    When salesmenager-posmenager user enter "<valid email>" and "<invalid password>" in the input boxes
		    And salesmenager-posmanager user clicks login button
		    Then User should see the error message "Wrong login/password"
		
		    Examples:
		      | valid email             | invalid password |
		      | salesmanager16@info.com | posmenager       |
		      | salesmanager17@info.com | posmenager       |
		      | posmanager18@info.com   | salesmanager     |
		      | posmanager19@info.com   | menager          |	

	
	@UPGNX-369
	Scenario Outline: Verification of the error message "Wrong login/password"
		Scenario Outline: Verification of the error message "Wrong login/password"
		    When salesmenager-posmenager users enter "<invalid email>" and "<valid password>" in the input boxes
		    And salesmenager-posmanager user clicks login button
		    Then User should see the error message "Wrong login/password"
		
		    Examples:
		      | invalid email          | valid password |
		      | salesmanager@info.com  | salesmanager   |
		      | salesmanage17@info.com | salesmanager   |
		      | posmanager@info.com    | posmanager     |
		      | pomanager19@info.com   | posmanager     |	

	
	@UPGNX-370
	Scenario Outline: Verification of the error message "Wrong login/password"
		Scenario Outline: Verification of the error message "Wrong login/password"
		    When salesmenager-posmenager users enter "<invalid email>" and "<invalid password>" in the input boxes
		    And salesmenager-posmanager user clicks login button
		    Then User should see the error message "Wrong login/password"
		
		    Examples:
		      | invalid email          | invalid password |
		      | salesmanager@info.com  | salesmanger      |
		      | salesmanage17@info.com | salemanager      |
		      | posmanager@info.com    | psmanager        |
		      | pomanager19@info.com   | posmanger        |	

	
	@UPGNX-371
	Scenario: Verification of the message "Please fill out this field."
		Scenario: Verification of the message "Please fill out this field."
		    When salesmenager-posmenager users do not type any credential and click the login button
		    Then User should see the Please fill out this field. message	

	
	@UPGNX-372
	Scenario: "Reset Password" page verification after clicking on the "Reset password" link
		Scenario: "Reset Password" page verification after clicking on the "Reset password" link
		    When Salesmanager-Posmanager user clicks the reset password link
		    Then The title should be "Reset password | Best solution for startups".	

	
	@UPGNX-373
	Scenario: Bullet signs verification
		Scenario: Bullet signs verification
		    When Salesmanager-Posmanager user fills in the password field
		    Then User should see the password in bullet signs by default