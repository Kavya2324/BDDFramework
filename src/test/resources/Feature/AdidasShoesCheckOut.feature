Feature: Checkout Adidas shoes

@AdidasShoesCheckout
Scenario: Successful checkout of Adidas shoes
		Given the user is on the Nopecomerce homepage
		When the user clicks the signpage
		Then the user enters a valid username & password
		And the user clicks the login button and be on the home page
		Then the user select the shoes product page from apparel flyout 
		And the user select the Adidas shoes 
		Then the user selects size and click on add t cart
		Then the user should able to see success message
		And the user clicks on the shopping cart link
		Then the user select the T&C check box and clicks the checkout button
		And the user enters the shipping details
		Then the user clicks on the continue buttons
		And the user should able to see order success message
		Then the user clicks on the orde completed continue button