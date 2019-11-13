package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Velmurugan\\eclipse-workspace\\MySelenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
	//driver.switchTo().frame("a077aa5e");
	driver.manage().window().maximize();
	
	List<WebElement> emp=driver.findElements(By.tagName("iframe"));
	int len=emp.size();
	System.out.println(len);
	
	
	driver.quit();
	}

}
