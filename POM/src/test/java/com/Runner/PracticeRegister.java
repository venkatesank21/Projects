package com.Runner;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.practice.BaseClass;
import com.practice.Login;
import com.practice.Register;

public class PracticeRegister extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		BaseClass obj = new BaseClass();
		int rowCount=obj.rowCount("C:\\Users\\Venky\\eclipse-workspace\\POM\\data\\registersheet.xlsx", "Sheet2");
		for(int j=1;j<=rowCount;j++) {
		
		obj.browserLaunch("chrome");
		obj.maximize();
		obj.imlicitWait(10);
		obj.getUrl("http://automationpractice.com/index.php");
		Login l =new Login();
		WebElement signIn = l.getSignIn();
		signIn.click();
		Register R = new Register();
		
		WebElement email=R.getEmail();
		String emAIL=obj.excelRead("C:\\Users\\Venky\\eclipse-workspace\\POM\\data\\registersheet.xlsx", "sheet2",j,0);
		obj.inputElement(email, emAIL);
		WebElement createacc =R.getCreate_account();
		obj.clickOnMouse(createacc);
		WebElement radio=R.getRadio();
		obj.clickOnMouse(radio);
		WebElement Firstname = R.getFname();
		String FirstNameex = obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,0);
		obj.inputElement(Firstname, FirstNameex);
		WebElement Lastname = R.getLname();
		String LastNameex=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,1);
		obj.inputElement(Lastname, LastNameex);
		WebElement password = R.getPassword();
		String passwordex=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,2);
		obj.inputElement(password, passwordex);
		WebElement Day=R.getDay();
		String datex=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,3);
		obj.inputElement(Day,datex);
		WebElement Month=R.getMonth();
		String Monthex=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,4);
		obj.inputElement(Month, Monthex);
		WebElement Year=R.getYear();
		String yearex=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,5);
		obj.inputElement(Year, yearex);
		WebElement address=R.getAddress();
		String addresse=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,6);
		obj.inputElement(address, addresse);
		WebElement city=R.getCity();
		String citex=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,7);
		obj.inputElement(city, citex);
		WebElement state=R.getState();
		String statex=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,8);
		obj.select(state, "visible", statex);
		WebElement postcode=R.getPostcode();
		String postcodex=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,9);
		obj.inputElement(postcode, postcodex);
		WebElement phone =R.getPhone();
		String phonex=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,9);
		obj.inputElement(phone, phonex);
		WebElement mobile=R.getMobile();
		String mobilex=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,9);
		obj.inputElement(mobile, mobilex);
		WebElement alias =R.getAlias();
		String aliaex=obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\registersheet.xlsx","sheet1",j,10);
		obj.inputElement(alias, aliaex);
		WebElement RegisterBtn=R.getRegisterButton();
		RegisterBtn.click();
		
		
		
		
		
		
		

	
	}

}
}
