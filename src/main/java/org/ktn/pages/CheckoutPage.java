package org.ktn.pages;

import org.ktn.base.MainBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckoutPage extends MainBase {
	public CheckoutPage(){
		PageFactory.initElements(driver, this);
	}
	
	
//	private static final By countryDD
//	=By.id("BillingNewAddress_CountryId"); 
	
	@FindBy (id=  "BillingNewAddress_CountryId" )
	public WebElement countryDD;

//	private static final By cityField
//	=By.id("BillingNewAddress_City"); 
	
	@FindBy (id=  "BillingNewAddress_City" )
	public WebElement cityField;
	
//	private static final By addressField
//	=By.id("BillingNewAddress_Address1"); 
	
	@FindBy (id=  "BillingNewAddress_Address1" )
	public WebElement addressField;
	
//	private static final By pinCodeField
//	=By.id("BillingNewAddress_ZipPostalCode"); 
	
	@FindBy (id=  "BillingNewAddress_ZipPostalCode")
	public WebElement pinCodeField;
	
//	private static final By phNumnberField
//	=By.id("BillingNewAddress_PhoneNumber");
	
	@FindBy (id=  "BillingNewAddress_PhoneNumber" )
	public WebElement phNumnberField;
	
//	private static final By continueBillAddressBtn
//	=By.xpath("//div[@id='billing-buttons-container']/button[2]");
	
	@FindBy (xpath=  "//div[@id='billing-buttons-container']/button[2]" )
	public WebElement continueBillAddressBtn;
	
	
//	private static final By shippingMethodContinueBtn
//	=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
	
	@FindBy (xpath=  "//button[@class='button-1 shipping-method-next-step-button']" )
	public WebElement shippingMethodContinueBtn;
	
//	private static final By paymentMethodContinueBtn
//	=By.xpath("//button[@class='button-1 payment-method-next-step-button']");
	
	@FindBy (xpath=  "//button[@class='button-1 payment-method-next-step-button']" )
	public WebElement paymentMethodContinueBtn;
	
//	private static final By paymentinfoContinueBtn
//	=By.xpath("//button[@class='button-1 payment-info-next-step-button']");
	
	@FindBy (xpath=  "//button[@class='button-1 payment-info-next-step-button']" )
	public WebElement paymentinfoContinueBtn;
	
//	private static final By confirmOrderContinueBtn
//	=By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
	
	@FindBy (xpath=  "//button[@class='button-1 confirm-order-next-step-button']" )
	public WebElement confirmOrderContinueBtn;
	
//	private static final By orderCompletedMsg
//	=By.xpath("//div[@class='section order-completed']/div/strong");
	
	@FindBy (xpath=  "//div[@class='section order-completed']/div/strong" )
	public WebElement orderCompletedMsg;
	
//	private static final By orderCompletedContinueBtn
//	=By.xpath("//button[@class='button-1 order-completed-continue-button']");
	
	@FindBy (xpath=  "//button[@class='button-1 order-completed-continue-button']" )
	public WebElement orderCompletedContinueBtn;
	
	
	
}
