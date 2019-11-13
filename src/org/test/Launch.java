package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Velmurugan\\eclipse-workspace\\MySelenium\\driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504236057%7Ce%7Cfacebook%20%27%7C&placement=&creative=318504236057&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-360705453827%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI-4bX3b_45AIVGDUrCh1qLQLuEAAYASAAEgJ6BfD_BwE");
String currentUrl=driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	String title=driver.getTitle();
	System.out.println(title);
	driver.quit();
	
	}

}
