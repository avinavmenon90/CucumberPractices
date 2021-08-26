#Demo of using 'Background' keyword in Cucumber
#Background steps executes before each scenario (used for common conditions)
#https://www.youtube.com/watch?v=ZPEzIogLnrM&list=PLFGoYjJG_fqpObjigKg4bunu6_Ki7Ppn-&index=7

Feature: Amazon Order Page
In order to check my order details
As a registered users
I want to specify the features of order details page

Background:
	Given a registered user exists
	Given a user is on Amazon login page
	When user enters username
	And user enters password
	And user clicks on login button
	Then user navigates to order page

Scenario: Check Previous Order details
	When user clicks on Order link
	Then user checks the previous order details

Scenario: Check Open Order details
	When user clicks on Open Order link
	Then user checks the open order details

Scenario: Check Cancelled Order details
	When user clicks on cancelled order link
	Then user checks the cancelled order details