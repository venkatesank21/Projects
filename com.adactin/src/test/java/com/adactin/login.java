package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends BaseClass {
	public login() {
		PageFactory.initElements(driver, this);	
		}
	    @FindBy(xpath="//input[@type='text']")
	    private WebElement user_name;
	    @FindBy(xpath="//input[@type='password']")
	    private WebElement password;
	    @FindBy(xpath="//input[@type='Submit']")
	    private WebElement signIn;
		public WebElement getUser_name() {
			return user_name;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getSignIn() {
			return signIn;
		}
	    
	
	   

}
