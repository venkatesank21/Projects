package com.practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends BaseClass {
	public Register() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//button[@class='btn btn-default button button-medium exclusive']")
	private WebElement create_account;
	
	
	@FindBy(xpath="(//input[@name='id_gender'])[1]")
	private WebElement radio;
	
	@FindBy(name="customer_firstname")
	private WebElement fname;
	@FindBy(name="customer_lastname")
	private WebElement lname;
	@FindBy(name="passwd")
	private WebElement password;
	@FindBy(xpath="(//select[@class='form-control'])[1]")
	private WebElement day;
	@FindBy(xpath="(//select[@class='form-control'])[2]")
	private WebElement month;
	@FindBy(xpath="(//select[@class='form-control'])[3]")
	private WebElement year;
	@FindBy(xpath="//input[@name='address1']")
	private WebElement address;
	@FindBy(name="city")
	private WebElement city;
	@FindBy(id="id_state")
	private WebElement state;
	@FindBy(id="postcode")
	private WebElement postcode;
	@FindBy(name="other")
	private WebElement phone;
	@FindBy(xpath="//input[@name='phone_mobile']")
	private WebElement mobile;
	@FindBy(xpath="//input[@name='alias']")
	private WebElement alias;
	@FindBy(xpath="//button[@class='btn btn-default button button-medium']")
	private WebElement RegisterButton;
	
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getCreate_account() {
		return create_account;
	}
	
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getPostcode() {
		return postcode;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getAlias() {
		return alias;
	}
	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	
	

	
	

}
