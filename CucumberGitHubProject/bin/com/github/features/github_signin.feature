Feature: TestSignin functionality of gitbub.com website
#We are doing this per ...

Scenario: Signin Functionality
	Given user is on github homepage
	When A user clicks on the Signin link
	And enters "reachfast@yahoo.com" or email address
	And enters password as "sairam2017"
	And Clicks on signin button
	Then user should see Start a project button
	
	
	Scenario: Negative signin functionality
	Given user is on github homepage
	When A user clicks on the Signin link
	And enters "reachfast@yahoo.com" or email address
	And enters password as "badpassword"
	And Clicks on signin button
	Then user is displayed Incorrect username or password message