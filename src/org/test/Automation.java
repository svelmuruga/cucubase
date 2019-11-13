package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Velmurugan\\eclipse-workspace\\MySelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	
	WebElement txtfname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));	
	
	txtfname.sendKeys("vel");
		
WebElement txtlname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));	
	
	txtlname.sendKeys("murugan");
	
WebElement txtadd=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));	
	
	txtadd.sendKeys("pillayar koil first cross street");
WebElement txtemail=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));	
	
	txtemail.sendKeys("vel@gmail.com");
	
WebElement txtphone=driver.findElement(By.xpath("//input[@ng-model='Phone']"));	
	
	txtemail.sendKeys("12345678");
	
WebElement btnGen=driver.findElement(By.xpath("//input[@ng-model='radiovalue']"));	
	
	btnGen.click();
	
WebElement btnsub=driver.findElement(By.xpath("//button[@id='submitbtn']"));	
	
	btnsub.click();
	
	
	
	
	}
}
