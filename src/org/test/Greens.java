package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Velmurugan\\eclipse-workspace\\MySelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement txtUser=driver.findElement(By.xpath("//a[href='contact.php']"));
		
		txtUser.click();
		
		WebElement txtName=driver.findElement(By.id("InputName"));
		
		txtName.sendKeys("vel");

		WebElement txtMail=driver.findElement(By.name("email"));
		
		txtMail.sendKeys("vel@gmail.com");
WebElement txtPhone=driver.findElement(By.name("phone"));
		
		txtPhone.sendKeys("123456789");
		
WebElement txtCourse=driver.findElement(By.name("courses"));
		
		txtCourse.sendKeys("Java");
		
WebElement txtTime=driver.findElement(By.name("time"));
		
		txtCourse.sendKeys("10.00");
WebElement txtMessage=driver.findElement(By.name("comments"));
		
		txtCourse.sendKeys("NA");
WebElement bt=driver.findElement(By.id("submit"));
		
		bt.click();
		
	}

}
