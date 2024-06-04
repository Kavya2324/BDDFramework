package org.ktn.stepdefinition;


import org.ktn.base.MainBase;
import org.ktn.pageactions.HomePageActions;
import org.ktn.pageactions.RegistrationPageActions;

import io.cucumber.java.en.*;

public class RegisrtationStepDefinition extends MainBase{
	
	public RegisrtationStepDefinition() {}
	
	HomePageActions homePageActions ;
	RegistrationPageActions registrationPageActions;
	
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		launchBroswer();
		
	}

	@When("The user clicks on Register link")
	public void the_user_clicks_on_register_link() {
		homePageActions = new HomePageActions();
		homePageActions.clickonRegisterLink();
		
	}

	@And("The user enters valid registration deatils")
	public void the_user_enters_valid_registration_deatils() {
		registrationPageActions =new RegistrationPageActions();
		registrationPageActions.enterFirstName(prop.getProp().getProperty("firstname"))
		.enterLastName(prop.getProp().getProperty("lastname")).enterEmail(prop.getProp().getProperty("email"))
		.enterPassword(prop.getProp().getProperty("password")).enterConfirmPassword(prop.getProp().getProperty("confirmpassword"));
		
	}

	@Then("The user sumbits the registration form")
	public void the_user_sumbits_the_registration_form() {
		registrationPageActions =new RegistrationPageActions();
		registrationPageActions.clickOnRegisterBtn();
	}

	@And("The user should see a registration success message")
	public void the_user_should_see_a_registration_success_message() {
		registrationPageActions =new RegistrationPageActions();
		String msg = registrationPageActions.getRegistrationSuccessMsg();
		registrationPageActions.clickOnContinueBtn();
		System.out.println(msg);
		
	}

	@Then("The user should be redirect to the home page")
	public void the_user_should_be_redirect_to_the_home_page() {
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
