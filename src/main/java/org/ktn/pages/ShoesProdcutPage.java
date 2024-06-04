package org.ktn.pages;

import org.ktn.base.MainBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoesProdcutPage extends MainBase {
	
	
	public ShoesProdcutPage() {
		PageFactory.initElements(driver, this);
	}
	
//	private static final By adidasShoes 
//	= By.xpath("//div[@class='products-wrapper']//a[text()='adidas Consortium Campus 80s Running Shoes']");
	
	@FindBy (xpath = "//div[@class='products-wrapper']//a[text()='adidas Consortium Campus 80s Running Shoes']" )
	public WebElement adidasShoes;
	

	
	
	

}
