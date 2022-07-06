Feature: Default

	
	@UPGNX-352
	Scenario Outline: Login to the homepage with the valid credentials
		When salesmenager-posmenager user types "<valid email>" and "<valid password>" in the input boxes
		    And salesmenager-posmanager user clicks login button
		    Then Users should see that expectedTitle is "Odoo"
		
		    Examples:
		      | valid email             | valid password |
		      | posmanager16@info.com   | posmanager     |
		      | posmanager17@info.com   | posmanager     |
		      | salesmanager18@info.com | salesmanager   |
		      | salesmanager19@info.com | salesmanager   |