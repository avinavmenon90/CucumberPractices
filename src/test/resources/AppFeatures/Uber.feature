Feature: Uber Booking Feature
#below "sedan" is a Cucumber Regular expression

Scenario: Booking Cab 
Given User wants to select a car type "sedan" from Uber Application
When User selects car "sedan" and pickuppoint "Kochi" and drop location "Chennai"


Then Driver starts the journey
Then Driver ends the journey
And Driver ends the journey
Then User pays 100 USD