package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public void browserLaunch(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
	}


	public void maximize() {
		driver.manage().window().maximize();

	}

	public void imlicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	}

	public void getUrl(String url) {
		driver.get(url);

	}

	public void clickOnMouse(WebElement element) {
		element.click();

	}

	public void inputElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	public void select(WebElement element, String type, String value) {
		Select s  = new Select(element);
		if (type.equalsIgnoreCase("visible")){
			s.selectByVisibleText(value);
			
			
		}
		else {
			s.selectByValue(value);
		}
		
	}
	public void select(WebElement element,int value) {
		Select s  = new Select(element);
			s.selectByIndex(value);
			
	}


	public void closeBrowser() {
		driver.close();

	}

	public void closeAll() {
		driver.quit();

	}
	public void navigateTo(String Web) {
		if(Web.equals("demo.guru") ) {
			driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		}
		else if(Web.equals("automation")) {
			driver.navigate().to("http://automationpractice.com/index.php");
			
		}
		else  {
			driver.navigate().to("https://www.amazon.in/");
		}
		
		
	}
	public void navigateBack() {
		driver.navigate().back();  
		
	}
	public void navigateForward() {
		driver.navigate().forward();  
	}
	public void navigateRefresh() {
		driver.navigate().refresh();
	}
	public void alert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		
	}
	public void action(WebElement women, String string) {
		
	    Actions wo = new Actions(driver);
		wo.moveToElement(women).build().perform();
		
	}
	public void getTitle(String title) {
		driver.get(title);
		System.out.println(title);
	}
	
	public void roboMethod() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	


	public int rowCount(String path, String name) throws IOException {
		File f=new File(path);
		FileInputStream input=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(input);
		Sheet s=w.getSheet(name);
		int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		return physicalNumberOfRows;
	}


	public String excelRead(String path, String name, int row, int column) throws IOException {
		File f=new File(path);
		FileInputStream input=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(input);
		Sheet s=w.getSheet(name);
		Row r = s.getRow(row);
		Cell cell = r.getCell(column);
		if(cell.getCellType()==0)
		{
			double numericCellValue = cell.getNumericCellValue();
			Long value= (long) numericCellValue;
			return value.toString();
		}
		else if(cell.getCellType()==1)
		{
			return cell.getStringCellValue();
		}
		else
		{
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat format=new SimpleDateFormat("dd/MM/YYYY");
			return format.format(dateCellValue);
			
		}
		
	}
	
	
	
	

}
