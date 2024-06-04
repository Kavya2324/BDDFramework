package org.ktn.pages;

import org.ktn.base.MainBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesProductPage extends MainBase{
	public CellPhonesProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[@class='product-item']//a[text()='Nokia Lumia 1020']" )
	public WebElement NokiaPhone;
			
			
//	private static final By NokiaPhone 
//	= By.xpath("//div[@class='product-item']//a[text()='Nokia Lumia 1020']");
	
	
	
	

}
