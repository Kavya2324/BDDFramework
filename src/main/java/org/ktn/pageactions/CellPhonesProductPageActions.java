package org.ktn.pageactions;

import org.ktn.enums.WaitStrategy;
import org.ktn.pages.CellPhonesProductPage;
import org.ktn.seleniumfunctions.SeleniumFunctions;

public class CellPhonesProductPageActions extends SeleniumFunctions{
	public CellPhonesProductPageActions() {
		
	}
	
	CellPhonesProductPage cellPage = new CellPhonesProductPage();
	
	public CellPhonesProductPageActions scrollToProduct() {
		scrollToELement(cellPage.NokiaPhone,WaitStrategy.PRESENCE, "Nokia Phone");
		return this;
	}
	
	public ProductPageActions clickOnNokiaPhone() {
		click(cellPage.NokiaPhone,WaitStrategy.CLICKABLE, "Nokia Phone");
		return new ProductPageActions();
	}
	
	
	
	

}
