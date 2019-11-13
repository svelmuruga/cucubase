package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Velmurugan\\eclipse-workspace\\MySelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		WebElement txtinput=driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		txtinput.click();
		txtinput.sendKeys("vel");
		
		WebElement txtPassword=driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		
		txtPassword.sendKeys("murugan");
	}

}
