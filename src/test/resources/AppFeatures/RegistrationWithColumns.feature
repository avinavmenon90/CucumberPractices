#Demo of DataTable in Cucumber (as Maps)
#DataTable can be applied after any step: Give, When, Then etc.
Feature: User Registration With Columns

Scenario: user regisration with diff data in columns

Given User is on the Registration Page
When User enters the following user details

	| avi | men | avi@gmail.com | 123123123 | CLT |
	| tom| hardy | tom@gmail.com | 34234234234 | ATL |
	| john| murthy | jm@gmail.com | 456456456456 | SFO |
	
Then User registration should be successful
 
Scenario: user regisration with diff data with columns

Given User is on the Registration Page
When User enters the following user details with columns

	| firstname | lastname | email | phone | city |
	| avi | men | avi@gmail.com | 123123123 | CLT |
	| tom| hardy | tom@gmail.com | 34234234234 | ATL |
	| john| murthy | jm@gmail.com | 456456456456 | SFO |
	
Then User registration should be successful