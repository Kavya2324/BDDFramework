package org.ktn.pages;

import org.ktn.base.MainBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends MainBase {
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

//	private static final By firstNameField
//	=By.id("FirstName");

	@FindBy(id = "FirstName")
	public WebElement firstNameField;

//	private static final By lastNameField
//	=By.id("LastName");

	@FindBy(id = "LastName")
	public WebElement lastNameField;

//	private static final By emailField
//	=By.id("Email");

	@FindBy(id = "Email")
	public WebElement emailField;

//	private static final By passwordField
//	=By.id("Password");

	@FindBy(id = "Password")
	public WebElement passwordField;

//	private static final By confirmPswdField
//	=By.id("ConfirmPassword");

	@FindBy(id = "ConfirmPassword")
	public WebElement confirmPswdField;

//	private static final By registerBtn
//	=By.id("register-button");

	@FindBy(id = "register-button")
	public WebElement registerBtn;

	@FindBy(xpath = "//div[@class='result']")
	public WebElement registrationMsg;

	@FindBy(xpath = "//a[text()='Continue']")
	public WebElement continueBtn;

	

}
