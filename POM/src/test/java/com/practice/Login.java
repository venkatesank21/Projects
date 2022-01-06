package com.practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{
	public Login() {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(css="a.login")
	private WebElement signIn;
	@FindBy(css="#email")
	private WebElement email;
	@FindBy(css="#passwd")
	private WebElement passWord;
	@FindBy(css="span i.icon-lock")
	private WebElement signInBtn;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getSignInBtn() {
		return signInBtn;
	}
	public WebElement getSignIn() {
		return signIn;
	}

}
