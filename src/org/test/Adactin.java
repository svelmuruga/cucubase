package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Velmurugan\\eclipse-workspace\\MySelenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.adactin.com/HotelApp/");
	WebElement txtUser=driver.findElement(By.id("username"));
	
	txtUser.sendKeys("chennai");
	
WebElement pass=driver.findElement(By.id("password"));
	
pass.sendKeys("erode");
	
}

}
