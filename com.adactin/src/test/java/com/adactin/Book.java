package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book extends BaseClass {
	public Book() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fname;
    
	@FindBy(xpath="//input[@name='last_name']")
    private WebElement lname;
    @FindBy(xpath="//input[@name='cc_num']")
    private WebElement cc;
    
	@FindBy(xpath="//textarea[@name='address']")
    private WebElement address;
    @FindBy(xpath="//select[@name='cc_type']")
    private WebElement cctype;
    @FindBy(xpath="//select[@name='cc_exp_month']")
    private WebElement expmonth;
    @FindBy(xpath="//select[@name='cc_exp_year']")
    private WebElement expyear;
    @FindBy(xpath="//input[@name='cc_cvv']")
    private WebElement cvv;
    @FindBy(xpath="//input[@type='button']")
    private WebElement submit;
    
    public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getCc() {
		return cc;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getSubmit() {
		return submit;
	}

}
