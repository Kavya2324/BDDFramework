package org.ktn.pages;

import org.ktn.base.MainBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingCartPage extends MainBase{
	public ShoppingCartPage() {
		
		PageFactory.initElements(driver, this);
	}
	
//	private static final By tcCheckBox 
//	= By.id("termsofservice"); 
	
	@FindBy (id = "termsofservice" )
	public WebElement tcCheckBox;
	
//	private static final By checkOutBtn 
//	= By.id("checkout");
	
	@FindBy (id = "checkout" )
	public WebElement checkOutBtn;
	
	
}
