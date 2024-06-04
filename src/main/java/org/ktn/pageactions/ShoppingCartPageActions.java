package org.ktn.pageactions;

import org.ktn.enums.WaitStrategy;
import org.ktn.pages.ShoppingCartPage;
import org.ktn.seleniumfunctions.SeleniumFunctions;

public class ShoppingCartPageActions extends SeleniumFunctions{
	
	public ShoppingCartPageActions() {}
	
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	
	public ShoppingCartPageActions clickonTCCheckBox() {
		click(shoppingCartPage.tcCheckBox, WaitStrategy.CLICKABLE, "T&C Check Box");
		return this;
	}
	
	public CheckoutPageActions clickonCheckOutBtn() {
		click(shoppingCartPage.checkOutBtn, WaitStrategy.CLICKABLE, "Checkout button");
		return new CheckoutPageActions();
	}

}
