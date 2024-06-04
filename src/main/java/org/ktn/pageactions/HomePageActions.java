package org.ktn.pageactions;

import org.ktn.enums.WaitStrategy;
import org.ktn.pages.HomePage;
import org.ktn.seleniumfunctions.SeleniumFunctions;

public class HomePageActions extends SeleniumFunctions {

	public HomePageActions() {
	}

	HomePage homePage = new HomePage();

	public LoginPageActions clickonLogin() {

		click(homePage.loginBtn, WaitStrategy.CLICKABLE, "LoginButton");
		return new LoginPageActions();
	}

	public HomePageActions waitSomeTime() {
		sleep(5000);
		return this;

	}

	public HomePageActions moveToApparelFlyout() {
		moveToWebElementElement(homePage.ApparelFlyout, "ApparelFlyout");
		return this;
	}

	public ShoesProductPageActions clickonShoes() {
		click(homePage.Shoesctgry, WaitStrategy.CLICKABLE, "Shoes category");
		return new ShoesProductPageActions();
	}

	public RegistrationPageActions clickonRegisterLink() {

		click(homePage.registerLink, WaitStrategy.CLICKABLE, "Register Link");
		return new RegistrationPageActions();
	}

	public HomePageActions moveToCellPhonesFlyout() {
		moveToWebElementElement(homePage.ElectronicsFlyout, "Electronics Flyout");
		return this;
	}

	public CellPhonesProductPageActions clickonCellphones() {
		click(homePage.Cellphonesctgry, WaitStrategy.CLICKABLE, "CellPhones category");
		return new CellPhonesProductPageActions();
	}

}
