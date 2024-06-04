package org.ktn.pageactions;

import org.ktn.enums.WaitStrategy;
import org.ktn.pages.CheckoutPage;
import org.ktn.seleniumfunctions.SeleniumFunctions;

public class CheckoutPageActions extends SeleniumFunctions{

	public CheckoutPageActions() {}
	
	CheckoutPage checkOutPage = new CheckoutPage();
	
	public CheckoutPageActions selectCountry(String value) {
		sleep(3000);
		selectFromDropDown(checkOutPage.countryDD,"visibleText",WaitStrategy.PRESENCE,value);
		return this;
	}
	
	public CheckoutPageActions enterCity(String value) {
		sendKeys(checkOutPage.cityField, value, WaitStrategy.PRESENCE,"city field");
		return this;
	}
	
	public CheckoutPageActions enterAddressField(String value) {
		sendKeys(checkOutPage.addressField, value, WaitStrategy.PRESENCE,"address field");
		return this;
	}
	
	
	public CheckoutPageActions enterPinCode(String value) {
		sendKeys(checkOutPage.pinCodeField, value, WaitStrategy.PRESENCE,"pin/zip code field");
		return this;
	}
	
	public CheckoutPageActions enterPhNumber(String value) {
		sendKeys(checkOutPage.phNumnberField, value, WaitStrategy.PRESENCE,"city field");
		return this;
	}
	
	public CheckoutPageActions clickOnContinueBillAddressBtn() {
		click(checkOutPage.continueBillAddressBtn,WaitStrategy.CLICKABLE, "continue Billing Address Button");
		return this;
	}
	
	public CheckoutPageActions clickOnShippingMethodContinueBtn() {
		click(checkOutPage.shippingMethodContinueBtn,WaitStrategy.CLICKABLE, "continue Shipping Method Button");
		return this;
	}
	
	public CheckoutPageActions clickOnPaymentMethodContinueBtn() {
		click(checkOutPage.paymentMethodContinueBtn,WaitStrategy.CLICKABLE, "continue Payment Method Button");
		return this;
	}
	
	
	public CheckoutPageActions clickOnPaymentinfoContinueBtn() {
		click(checkOutPage.paymentinfoContinueBtn,WaitStrategy.CLICKABLE, "continue Payment Info Button");
		return this;
	}
	
	public CheckoutPageActions clickOnConfirmOrderContinueBtn() {
		click(checkOutPage.confirmOrderContinueBtn,WaitStrategy.CLICKABLE, "continue Confirm Order Button");
		return this;
	}
	
	public String getOrderCompletedMsg() {
		String msg = getElementText(checkOutPage.orderCompletedMsg,WaitStrategy.PRESENCE, "order Completed Message");
		return msg;
	}
	
	
	public CheckoutPageActions clickOnOrderCompletedContinueBtn() {
		click(checkOutPage.orderCompletedContinueBtn,WaitStrategy.CLICKABLE, "continue Order completed Button");
		return this;
	}
}
