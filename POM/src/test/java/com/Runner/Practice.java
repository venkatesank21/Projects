package com.Runner;
import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.practice.BaseClass;
import com.practice.Login;

public class Practice extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		BaseClass obj = new BaseClass();
		int rowCount = obj.rowCount("C:\\Users\\Venky\\eclipse-workspace\\POM\\data\\datadriven.xlsx","sheet1");
		for(int i=1;i<=rowCount;i++)
		{
		obj.browserLaunch("chrome");
		obj.maximize();
		obj.imlicitWait(10);
		obj.getUrl("http://automationpractice.com/index.php");
		Login l=new Login();
        WebElement login = l.getSignIn();
		obj.clickOnMouse(login);
		WebElement email = l.getEmail();
		String userName = obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\datadriven.xlsx", "sheet1", i, 0);
		obj.inputElement(email,userName);
		String pass = obj.excelRead("C:\\\\Users\\\\Venky\\\\eclipse-workspace\\\\POM\\\\data\\\\datadriven.xlsx", "sheet1", i, 1);
		obj.inputElement(l.getPassWord(),pass);
		obj.clickOnMouse(l.getSignInBtn());
	
		}
		
		
		

	}

}

