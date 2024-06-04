package org.ktn.pages;

import org.ktn.base.MainBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends MainBase {

//	private static final By loginBtn = By.xpath("//a[text()='Log in']");

	@FindBy(xpath = "//a[text()='Log in']")
	public WebElement loginBtn;

//	private static final By ApparelFlyout
//	=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']");

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Apparel ']")
	public WebElement ApparelFlyout;

//	private static final By Shoesctgry
//	=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Shoes ']");

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Shoes ']")
	public WebElement Shoesctgry;

//	private static final By registerLink
//	=By.linkText("Register");

	@FindBy(linkText = "Register")
	public WebElement registerLink;

//	private static final By ElectronicsFlyout
//	=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']");

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Electronics ']")
	public WebElement ElectronicsFlyout;

//	private static final By Cellphonesctgry
//	=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Cell phones ']");

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Cell phones ']")
	public WebElement Cellphonesctgry;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
