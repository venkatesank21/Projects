package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm extends BaseClass{
	public BookingConfirm() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderno;
	public WebElement getOrderno() {
		return orderno;
	}

}
