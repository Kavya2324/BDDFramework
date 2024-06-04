package org.ktn.pageactions;

import org.ktn.enums.WaitStrategy;
import org.ktn.pages.LoginPage;
import org.ktn.seleniumfunctions.SeleniumFunctions;

public class LoginPageActions extends SeleniumFunctions{
	
	
	public LoginPageActions() {}
	
	LoginPage logingPage = new LoginPage();
	
	public LoginPageActions enterEmail(String value) {
		sendKeys(logingPage.emailfield, value, WaitStrategy.PRESENCE, "eamil" );
		return this;
	}
	
	public LoginPageActions enterPassword(String value) {
		sendKeys(logingPage.passwordfield,  value, WaitStrategy.PRESENCE, "password" );
		return this;
	}
	
	public HomePageActions clickOnLoginButton() {
		click(logingPage.loginButton, WaitStrategy.PRESENCE, "loginButton" );
		return new HomePageActions();
	}
	

}
