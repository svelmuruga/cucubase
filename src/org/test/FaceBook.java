package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Velmurugan\\eclipse-workspace\\MySelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtUserName=driver.findElement(By.id("email"));
	txtUserName.sendKeys("vel");
	
	WebElement txtPassWord=driver.findElement(By.id("pass"));
	txtPassWord.sendKeys("murugan");
	WebElement btnLogin=driver.findElement(By.xpath("//input[@value='Log In']"));
	btnLogin.click();
	
	
	}
}
