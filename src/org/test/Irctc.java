package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Velmurugan\\eclipse-workspace\\MySelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		
		WebElement txtUser=driver.findElement(By.className("ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted"));
		
		txtUser.sendKeys("chennai");
		
WebElement dest=driver.findElement(By.className("ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted"));
		
		dest.sendKeys("erode");
		
		
		
	}
}
