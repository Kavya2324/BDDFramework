package org.ktn.pages;

import org.ktn.base.MainBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdcutPage extends MainBase{

	public ProdcutPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "product_attribute_9")
	public WebElement shoeSizeDD ;
	
//	private static final By shoeSizeDD = By.id("product_attribute_9");
	
	
	@FindBy (id = "add-to-cart-button-25")
	public WebElement addCartBtn;
	
//	private static final By addCartBtn = By.id("add-to-cart-button-25");
	
	@FindBy (xpath = "//div[@class='bar-notification success']/p")
	public WebElement successMessage;
	
//	private static final By successMessage = By.xpath("//div[@class='bar-notification success']/p");
	
	@FindBy (linkText = "shopping cart")
	public WebElement shoppingCartUrl;
	
//	private static final By shoppingCartUrl = By.linkText("shopping cart");
	
	@FindBy (id = "add-to-cart-button-20")
	public WebElement PhoneaddCartBtn ;
	
//	private static final By PhoneaddCartBtn = By.id("add-to-cart-button-20");

	

}
