package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmBooking extends BaseClass {
	public ConfirmBooking() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radiobutton;
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;

}
