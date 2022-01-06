package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype;
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement roomnos;
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkin;
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkout;
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultroom;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	

}
