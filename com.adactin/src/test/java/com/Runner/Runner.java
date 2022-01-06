package com.Runner;

import java.io.IOException;

import org.openqa.selenium.WebElement;


import com.adactin.BaseClass;
import com.adactin.Book;
import com.adactin.BookingConfirm;
import com.adactin.ConfirmBooking;
import com.adactin.Final_page;
import com.adactin.SearchHotel;
import com.adactin.login;

public class Runner extends BaseClass {

	public static void main(String[] args) throws IOException {
		BaseClass obj =new BaseClass();
		obj.browserLaunch("chrome");
		obj.maximize();
		obj.imlicitWait(10);
		obj.getUrl("https://adactinhotelapp.com/index.php");
		
     	login l = new login();
     	int rowCount = obj.rowCount("C:\\Users\\Venky\\eclipse-workspace\\com.adactin\\data\\datadriven2.xlsx","sheet1");
		for(int i=1;i<=rowCount;i++) {

		WebElement email = l.getUser_name();
		String username1=obj.excelRead("C:\\Users\\Venky\\eclipse-workspace\\com.adactin\\data\\datadriven2.xlsx", "sheet1", i, 0);
		obj.inputElement(email, username1);
		WebElement password=l.getPassword();
		String password1=obj.excelRead("C:\\Users\\Venky\\eclipse-workspace\\com.adactin\\data\\datadriven2.xlsx", "sheet1", i, 1);
		obj.inputElement(password, password1);
		WebElement login_click=l.getSignIn();
		obj.clickOnMouse(login_click);
		
     	SearchHotel s = new SearchHotel();
 		WebElement location= s.getLocation();
 		String location1=obj.excelRead("C:\\Users\\Venky\\eclipse-workspace\\com.adactin\\data\\datadriven2.xlsx", "sheet1", i, 2);
     	obj.select(location, "visible", location1);
     	WebElement hotels=s.getHotels();
     	String hotels1=obj.excelRead("C:\\Users\\Venky\\eclipse-workspace\\com.adactin\\data\\datadriven2.xlsx", "sheet1", i, 3);
     	obj.select(hotels, "visible", hotels1);
     	WebElement roomtype=s.getRoomtype();
     	String roomtype1=obj.excelRead("C:\\Users\\Venky\\eclipse-workspace\\com.adactin\\data\\datadriven2.xlsx", "sheet1", i, 4);
     	obj.select(roomtype, "visible", roomtype1);
     	WebElement rooms=s.getRoomnos();
     	String rooms1=obj.excelRead("C:\\Users\\Venky\\eclipse-workspace\\com.adactin\\data\\datadriven2.xlsx", "sheet1", i, 5);
     	obj.select(rooms, "visible", rooms1);
     	WebElement checkdate=s.getCheckin();
     	String checkdate1=obj.excelRead("C:\\Users\\Venky\\eclipse-workspace\\com.adactin\\data\\datadriven2.xlsx", "sheet1", i, 6);
     	obj.inputElement(checkdate, checkdate1);
     	WebElement checkout=s.getCheckout();
     	String checkdate2=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\com.adactin\\\\data\\\\datadriven2.xlsx","sheet1" , i, 7);
     			
     	obj.inputElement(checkout, checkdate2);
     	WebElement Adult=s.getAdultroom();
     	String adult1=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\com.adactin\\\\data\\\\datadriven2.xlsx","sheet1" , i, 8);
     	obj.select(Adult, "visible", adult1);
     	WebElement submit=s.getSubmit();
     	obj.clickOnMouse(submit);
		
		ConfirmBooking C =new ConfirmBooking();
		WebElement radi=C.getRadiobutton();
		obj.clickOnMouse(radi);
		WebElement submitt=C.getSubmit();
		obj.clickOnMouse(submitt);
		
		Book B = new Book();
		WebElement firstname=B.getFname();
		String firstname1=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\com.adactin\\\\data\\\\datadriven2.xlsx","sheet1" , i, 9);
		obj.inputElement(firstname, firstname1);
		WebElement lastname=B.getLname();
		String lastname1=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\com.adactin\\\\data\\\\datadriven2.xlsx","sheet1" , i, 10);
		obj.inputElement(lastname, lastname1);
		WebElement addresss =B.getAddress();
		String address1=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\com.adactin\\\\data\\\\datadriven2.xlsx","sheet1" , i, 11);
		obj.inputElement(addresss, address1);
		WebElement creditcard=B.getCc();
		String creditcard1=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\com.adactin\\\\data\\\\datadriven2.xlsx","sheet1" , i, 12);
		obj.inputElement(creditcard, creditcard1);
		WebElement credittype=B.getCctype();
		String credittype1=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\com.adactin\\\\data\\\\datadriven2.xlsx","sheet1" , i, 13);
		obj.select(credittype, "visible", credittype1);
		WebElement month=B.getExpmonth();
		String month1=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\com.adactin\\\\data\\\\datadriven2.xlsx","sheet1" , i, 14);
		obj.select(month, "visible", month1);
		WebElement year=B.getExpyear();
		String year1=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\com.adactin\\\\data\\\\datadriven2.xlsx","sheet1" , i, 15);
		obj.select(year, "visible", year1);
		WebElement cvvv=B.getCvv();
		String cvv1=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\com.adactin\\\\data\\\\datadriven2.xlsx","sheet1" , i, 16);
		obj.inputElement(cvvv, cvv1);
		WebElement submitclick=B.getSubmit();
		obj.clickOnMouse(submitclick);
		
		BookingConfirm BC=new BookingConfirm();
		WebElement order=BC.getOrderno();
		obj.getValue(order, "value");
		System.out.println(obj.getValue(order, "value"));
		
//		Final_page F =new Final_page();
//		WebElement clickf=F.getItnerary();
//		obj.clickOnMouse(clickf);
		

	}

}
}
