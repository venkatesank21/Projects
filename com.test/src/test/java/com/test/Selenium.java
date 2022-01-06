package com.test;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Select Women Tab
	
	    WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions wo =new Actions(driver);
		wo.moveToElement(women).build().perform();
		
		  WebElement dresses = driver.findElement(By.xpath("//a[@title='Dresses']"));
		  dresses.click();
		  WebElement casual = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[1]"));
		  casual.click();
		  
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_RIGHT);
		  r.keyRelease(KeyEvent.VK_RIGHT);
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  
		  WebElement stock = driver.findElement(By.xpath("//span[@class='available-now']"));
		  stock.click();
		  
		//  Thread.sleep(3000);
		  WebElement add = driver.findElement(By.linkText("Add to cart"));
		  add.click();
		  //Thread.sleep(5000);
		  
		  
		  WebElement chkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		  Thread.sleep(3000);
		  chkout.click();
		  //Thread.sleep(5000);
		  
		
		  
		
		  
		  //adding quantity
		  WebElement quantity = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		  quantity.clear();
		  quantity.sendKeys("7");
		 
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,350)", "");
		  Thread.sleep(3000);
		  WebElement proceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		 
//		  JavascriptExecutor executor = (JavascriptExecutor)driver;
//		  executor.executeScript("arguments[0].click();", proceed);
		  proceed.click();
		  //Thread.sleep(5000);
		  
		  WebElement emailinput = driver.findElement(By.id("email"));
		  emailinput.sendKeys("Venkatesan333666@gmail.com");
		  
		  WebElement passinput = driver.findElement(By.id("passwd"));
		  passinput.sendKeys("Test@123");
		  
		  WebElement signin = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		  signin.click();
		  
//		  WebElement emai = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		  emai.sendKeys("Venkatesan333666@gmail.com");
//		  
//		  WebElement Crea_acc = driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium exclusive']"));
//          Crea_acc.click();
//          
//          Thread.sleep(3000);
//          
//          WebElement radio = driver.findElement(By.xpath("(//input[@name='id_gender'])[1]"));
//          radio.click();
//          
//          
//          WebElement fname = driver.findElement(By.name("customer_firstname"));
//          fname.sendKeys("Venkatesan");
//          
//          WebElement lname = driver.findElement(By.name("customer_lastname"));
//          lname.sendKeys("Kannan");
//          
//          WebElement pass = driver.findElement(By.name("passwd"));
//          pass.sendKeys("Test@123");
//          
//          WebElement day = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
//          day.sendKeys("6");
//          
//          WebElement month = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
//          month.sendKeys("November");
//          
//          WebElement year = driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
//          year.sendKeys("1993");
//          
//          WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
//          address.sendKeys("No 8 sowbackia lakshmi street selaiyur ");
//          
//          WebElement city = driver.findElement(By.name("city"));
//          city.sendKeys("Chennai");
//          
//         // Thread.sleep(3000);
//          
//          WebElement state = driver.findElement(By.id("id_state"));
//          Select S = new Select(state);
//          S.selectByVisibleText("Texas");
//          
//          WebElement zip = driver.findElement(By.id("postcode"));
//          zip.sendKeys("60007");
//          
//          WebElement phnumber = driver.findElement(By.name("other"));
//          phnumber.sendKeys("9789868673");
//          
//          
//         WebElement mobilenum = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
//         mobilenum.sendKeys("9789868673");
//         
//         WebElement addr = driver.findElement(By.xpath("//input[@name='alias']"));
//         addr.sendKeys("lakshmi");
//         
//         WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium']"));
//         button.click();
//         
//         Thread.sleep(3000);
         
         WebElement pro_chkout = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
         pro_chkout.click();
         
         WebElement check = driver.findElement(By.id("cgv"));
         check.click();
         
         WebElement final_proceed = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
         final_proceed.click();
          
          WebElement bankwire = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
          bankwire.click();
          
          Thread.sleep(3000);
          
          WebElement confirmorder = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
          confirmorder.click();
          
        TakesScreenshot ts= (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Venky\\eclipse-workspace\\com.test\\screenshot");
        FileUtils.copyFile(source, destination);
       
          
          
          
          
          
	}
	}
