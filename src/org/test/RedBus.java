package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Velmurugan\\eclipse-workspace\\MySelenium\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(" https://www.redbus.in/ ");
		
		WebElement txtUserName=driver.findElement(By.id("src"));
		txtUserName.sendKeys("chennai");
		
		WebElement txtPassWord=driver.findElement(By.id("dest"));
		txtPassWord.sendKeys("erode");
		
		
		
		
		
		
	
	}

}
