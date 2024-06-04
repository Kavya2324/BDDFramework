package org.ktn.pageactions;

import org.ktn.pages.RegisterPage;
import org.ktn.seleniumfunctions.SeleniumFunctions;
import org.ktn.enums.WaitStrategy;

public class RegistrationPageActions extends SeleniumFunctions{
		
	RegisterPage registrationPage = new RegisterPage();
	
	public RegistrationPageActions enterFirstName(String value) {
		sendKeys(registrationPage.firstNameField,value, WaitStrategy.PRESENCE, " First Name Field");
		return this;
	}
	
	public RegistrationPageActions enterLastName(String value) {
		sendKeys(registrationPage.lastNameField,value, WaitStrategy.PRESENCE, " Last Name Field");
		return this;
	}
	
	public RegistrationPageActions enterEmail(String value) {
		sendKeys(registrationPage.emailField,value, WaitStrategy.PRESENCE, " Email Field");
		return this;
	}
	
	
	public RegistrationPageActions enterPassword(String value) {
		sendKeys(registrationPage.passwordField,value, WaitStrategy.PRESENCE, "password");
		return this;
	}
	
	public RegistrationPageActions enterConfirmPassword(String value) {
		sendKeys(registrationPage.confirmPswdField,value, WaitStrategy.PRESENCE, "password");
		return this;
	}
	
	public HomePageActions clickOnRegisterBtn() {
		click(registrationPage.registerBtn, WaitStrategy.CLICKABLE, "Register Button");
		return new HomePageActions();
	}
	
	public String getRegistrationSuccessMsg() {
		
		String txt = getElementText(registrationPage.registrationMsg, WaitStrategy.PRESENCE, "Registration success message" );
		return txt;
	}
	
	public HomePageActions clickOnContinueBtn() {
		click(registrationPage.continueBtn, WaitStrategy.CLICKABLE, "Continue Button");
		return new HomePageActions();
	}
}
