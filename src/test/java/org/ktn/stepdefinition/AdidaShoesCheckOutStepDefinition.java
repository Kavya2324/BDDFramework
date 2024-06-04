package org.ktn.stepdefinition;

import org.ktn.base.MainBase;
import org.ktn.pageactions.CheckoutPageActions;
import org.ktn.pageactions.HomePageActions;
import org.ktn.pageactions.LoginPageActions;
import org.ktn.pageactions.ProductPageActions;
import org.ktn.pageactions.ShoesProductPageActions;
import org.ktn.pageactions.ShoppingCartPageActions;

import io.cucumber.java.en.*;

public class AdidaShoesCheckOutStepDefinition extends MainBase{
	
	public AdidaShoesCheckOutStepDefinition() {}
	
	HomePageActions homePageAct;
	LoginPageActions loginPageAct;
	ShoesProductPageActions shoesProdcutPageAct;
	ProductPageActions productPageAct; 
	
	ShoppingCartPageActions shoppingCartPageAct;
	CheckoutPageActions checkoutPageAct;
	
	@Given("the user is on the Nopecomerce homepage")
	public void the_user_is_on_the_nopecomerce_homepage() {
		launchBroswer();
	}

	@When("the user clicks the signpage")
	public void the_user_clicks_the_signpage() {
		homePageAct = new HomePageActions();
		homePageAct.clickonLogin();
	}

	@Then("the user enters a valid username & password")
	public void the_user_enters_a_valid_username_password() {
		loginPageAct = new LoginPageActions();
		loginPageAct.enterEmail(prop.getProp().getProperty("email"))
		.enterPassword(prop.getProp().getProperty("password"));
	}

	@Then("the user clicks the login button and be on the home page")
	public void the_user_clicks_the_button_and_be_on_the_home_page() {
		loginPageAct.clickOnLoginButton();
		
	}

	@Then("the user select the shoes product page from apparel flyout")
	public void the_user_select_the_shoes_product_page_from_apparel_flyout() {
		homePageAct.moveToApparelFlyout().clickonShoes();
	}

	@Then("the user select the Adidas shoes")
	public void the_user_select_the_adidas_shoes() {
		shoesProdcutPageAct = new ShoesProductPageActions();
		shoesProdcutPageAct.scrollToProduct().clickOnAdidasShoes();
	}

	@Then("the user selects size and click on add t cart")
	public void the_user_selects_size_and_click_on_add_t_cart() {
		productPageAct = new ProductPageActions();
		productPageAct.selectShoeSize("9").clickAddToCart();
	}

	@Then("the user should able to see success message")
	public void the_user_should_able_to_see_success_message() {
		System.out.println(productPageAct.getSuccessMessage());
	}

	@Then("the user clicks on the shopping cart link")
	public void the_user_clicks_on_the_shopping_cart_link() {
		productPageAct.clickOnShoppingCartUrl();
	}

	@Then("the user select the T&C check box and clicks the checkout button")
	public void the_user_select_the_t_c_check_box_and_clicks_the_checkout_button() {
		
		shoppingCartPageAct =new ShoppingCartPageActions(); 
		shoppingCartPageAct.clickonTCCheckBox().clickonCheckOutBtn();
	}

	@Then("the user enters the shipping details")
	public void the_user_enters_the_shipping_details() {
		checkoutPageAct = new CheckoutPageActions();
		checkoutPageAct.selectCountry("India")
		   .enterCity("Bangalore")
		   .enterAddressField("TF")
		   .enterPinCode("560068")
		   .enterPhNumber("8908309090");
	}

	@Then("the user clicks on the continue buttons")
	public void the_user_clicks_on_the_continue_buttons() {
		checkoutPageAct.clickOnContinueBillAddressBtn()
		   .clickOnShippingMethodContinueBtn()
		   .clickOnPaymentMethodContinueBtn()
		   .clickOnPaymentinfoContinueBtn()
		   .clickOnConfirmOrderContinueBtn();
	}

	@Then("the user should able to see order success message")
	public void the_user_should_able_to_see_order_success_message() {
		System.out.println(checkoutPageAct.getOrderCompletedMsg());
	}

	@Then("the user clicks on the orde completed continue button")
	public void the_user_clicks_on_the_orde_completed_continue_button() {
		checkoutPageAct.clickOnOrderCompletedContinueBtn();
		driver.quit();
	}
	

}
