@app
Feature: I want to check account details

Background: User is Logged In
    Given I navigate to the login page
    When I submit username and password
    Then I should be logged in

  @app1
  Scenario: To see account overview
    Given User is on the home page
    When User clicks on drop down
    And selects a account overview
    Then User should get the results


  @app2
  Scenario Outline: To update the profile
    Given User should be on the home page
    And Update info is selected
    When User clicks on contact field <"<contact>">
    Then Profile is updated
    
    Examples:
    
    	|contact|
    	|9098866543|


	@app3
	Scenario Outline: To transfer funds
		Given: User should be on the transferfund page
		When User clicks on amount <"<amount>">
		Then Amount should get transferd 
		
		
		Examples:
    
    	|amount|
    	|551546|
		
	@app4
	Scenario Outline: To request loan
	Given: User should be on loan page
	When User selects the loan amount <"<loan>">
	And User selects the downpayment amount <"<down>">
	Then Loan request gets submitted
	
	
	Examples:
    
    	|loan|down|
    	|5000000|5000|
	
	@app5
	Scenario: To logout from website
	Given: User should be on the home page
	When User clicks on the logout button
	Then User should be logged out







