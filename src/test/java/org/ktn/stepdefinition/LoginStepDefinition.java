package org.ktn.stepdefinition;

import org.ktn.base.MainBase;
import org.ktn.pageactions.HomePageActions;
import org.ktn.pageactions.LoginPageActions;

import io.cucumber.java.en.*;

public class LoginStepDefinition extends MainBase {
	
	HomePageActions homePageAct;
	 LoginPageActions loginPageAct;
	
	@Given("the user is on the Nopecomerce home page")
	public void the_user_is_on_the_nopecomerce_home_page() {
		launchBroswer();
	}

	@When("the user clicks the sign page")
	public void the_user_clicks_the_sign_page() {
		homePageAct = new HomePageActions();
		homePageAct.clickonLogin();
		
		
	}

	@Then("the user enters a valid username and password")
	public void the_user_enters_a_valid_username_and_password() {
		loginPageAct = new LoginPageActions();
		loginPageAct.enterEmail(prop.getProp().getProperty("email"))
		.enterPassword(prop.getProp().getProperty("password"));
	}

	@Then("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		loginPageAct.clickOnLoginButton();
	}

	@Then("the user should be redirected to the homepage")
	public void the_user_should_be_redirected_to_the_homepage() {
	    System.out.println(driver.getTitle());
	    driver.quit();
	}

}
