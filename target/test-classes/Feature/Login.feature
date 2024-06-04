Feature: As a user wants to log in to the Nopecomerce site

@login @smoke @regression
Scenario: Successful login with valid creditials
	Given the user is on the Nopecomerce home page
	When the user clicks the sign page
	Then the user enters a valid username and password
	And the user clicks the "login" button
	Then the user should be redirected to the homepage
	