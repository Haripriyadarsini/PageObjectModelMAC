@MacLoginScenario
Feature: Mac application login funcionality testing

Scenario: Login the Mac page wit valid username and Password
Given User should be in Mac login page
When User should click the signin button in the header
And User should  enter EmailId in the Email Address field
And User  should enter the password in the password field
And User should click the Submit button ito login the MAC application
And User should validate the login name displayed in the page is valid
And User mouse hover to username in the header 
And User should move to Signout from page

@TC1
Scenario: Login the Mac page with username and Passw ord with step data
Given User should be in Mac login page
When User should click the signin button in the header
And User should  enter EmailId 'harnie04@yopmail.com' in the Email Address field
And User  should enter the password 'Test123' in the password field
And User should click the Submit button ito login the MAC application
And User should validate the username 'TEST' displayed in the page is valid
And User mouse hover to username in the header 
And User should move to Signout from page

@TC2
Scenario Outline: Login the Mac page with username and Password with step data
	Given User should be in Mac login page
	When User should click the signin button in the header
	And User should  enter EmailId '<EmailId>' in the Email Address field
	And User  should enter the password '<password>' in the password field
	And User should click the Submit button ito login the MAC application
	And User should validate the username '<username>' displayed in the page is valid
	And User mouse hover to username in the header 
	And User should move to Signout from page

Examples:
|EmailId				|password		|username|
|Mac123@yopmail.com 	|Test123	 	|MAC1|
|Mac1234@yopmail.com	|Test1234   	|MAC2|