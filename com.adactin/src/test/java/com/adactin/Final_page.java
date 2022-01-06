package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_page extends BaseClass {
	public Final_page() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="(//input[@type='button'])[2]")
	private WebElement itnerary;
	public WebElement getItnerary() {
		return itnerary;
	}

}
