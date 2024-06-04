package org.ktn.pageactions;

import org.ktn.enums.WaitStrategy;
import org.ktn.pages.ProdcutPage;
import org.ktn.seleniumfunctions.SeleniumFunctions;

public class ProductPageActions extends SeleniumFunctions {
	
	public ProductPageActions(){}
	
	ProdcutPage productPage = new ProdcutPage();
	
	public ProductPageActions selectShoeSize(Object value) {
		selectFromDropDown(productPage.shoeSizeDD, "visibleText", WaitStrategy.PRESENCE, value);
		return this;
	}

	public ProductPageActions clickAddToCart() {
		click(productPage.addCartBtn, WaitStrategy.CLICKABLE, "add to cart button");
		return this;
	}

	public String getSuccessMessage() {
		String msg = getElementText(productPage.successMessage, WaitStrategy.VISIBLE, "successMessage");
		return msg;
	}

	public ShoppingCartPageActions clickOnShoppingCartUrl() {
		click(productPage.shoppingCartUrl, WaitStrategy.CLICKABLE, "Shopping cart URL");
		return new ShoppingCartPageActions();
	}

	public ProductPageActions clickAddToCartonNokiaPdp() {
		click(productPage.PhoneaddCartBtn, WaitStrategy.CLICKABLE, "add to cart button");
		return this;
	}

}
