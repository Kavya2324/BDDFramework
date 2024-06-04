package org.ktn.pages;

import org.ktn.base.MainBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends MainBase{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
//	private static final By emailfield = By.id("Email");
	
	@FindBy (id = "Email")
	public WebElement emailfield;
	
//	private static final By passwordfield = By.id("Password");
	
	@FindBy (id = "Password")
	public WebElement passwordfield;
	
//	private static final By loginButton = By.xpath("//button[text()='Log in']");
	
	@FindBy (xpath = "//button[text()='Log in']")
	public WebElement loginButton;
	
	
	
	

}
