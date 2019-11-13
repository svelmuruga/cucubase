package org.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class BasClass {
	static WebDriver driver;
	static String winHand;

	static String winhandles; 

	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Velmurugan\\eclipse-workspace\\MySelenium\\driver1\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	public static void loadurl(String url)
	{
		driver.get(url);
	}
	public static void maxi() {
		driver.manage().window().maximize();
	}

	public static void Takeurl()
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void Title()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
		public static void input(WebElement w,String n)
	{
		w.sendKeys(n);
	}
	public static void accept(WebElement w)
	{
		w.click();
	}
	public static void SelectDrop(WebElement w,String s)
	{
		Select se=new Select(w);
		se.selectByValue(s);
	}
	public static void IndexSelect(WebElement w,int n)
	{
		Select se=new Select(w);
		se.selectByIndex(n);
	}
	public static void wintrack()
	{
		winHand= driver.getWindowHandle();
		driver.switchTo().window(winHand);
	}

	public static void QBrowser() {
		driver.quit();
	}
	public static void CloseBrowser()
	{
		driver.close();
	}
	}



