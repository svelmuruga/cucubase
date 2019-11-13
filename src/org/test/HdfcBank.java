package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {
	
	public static void main(String[] args) {
	
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Velmurugan\\eclipse-workspace\\MySelenium\\driver\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					driver.get("https://netbanking.hdfcbank.com/netbanking/");
					WebElement txtinput=driver.findElement(By.name("fldLoginUserId"));
					txtinput.sendKeys("234");
		

}
}