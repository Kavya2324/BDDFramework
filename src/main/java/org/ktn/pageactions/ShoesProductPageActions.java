package org.ktn.pageactions;

import org.ktn.enums.WaitStrategy;
import org.ktn.pages.ShoesProdcutPage;
import org.ktn.seleniumfunctions.SeleniumFunctions;

public class ShoesProductPageActions extends SeleniumFunctions{
	
	public ShoesProductPageActions() {}
	
	ShoesProdcutPage shoesProdcutPage = new ShoesProdcutPage();
	
	public ShoesProductPageActions scrollToProduct() {
		scrollToELement(shoesProdcutPage.adidasShoes,WaitStrategy.PRESENCE, "adidas Shoes");
		return this;
	}
	
	public ProductPageActions clickOnAdidasShoes() {
		click(shoesProdcutPage.adidasShoes,WaitStrategy.CLICKABLE, "adidas Shoes");
		return new ProductPageActions();
	}
}
