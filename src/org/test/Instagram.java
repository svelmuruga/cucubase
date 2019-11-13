package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Velmurugan\\eclipse-workspace\\MySelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement txtUser=driver.findElement(By.id("userName"));
		
		txtUser.sendKeys("vel");
		
	}

}
