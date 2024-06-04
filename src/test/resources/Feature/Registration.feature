Feature: User Registration

@register @regression
Scenario: Successful Registration
	Given The user is on Home page
	When The user clicks on Register link
	And The user enters valid registration deatils
	Then The user sumbits the registration form
	And The user should see a registration success message
	Then The user should be redirect to the home page

	