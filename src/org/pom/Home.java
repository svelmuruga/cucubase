package org.pom;

import org.openqa.selenium.WebElement;

public class Home extends BasClass {
public static void main(String[] args) throws InterruptedException {
	launchBrowser();
	maxi();
	loadurl("https://adactin.com/HotelApp/");
	Takeurl();
	Title();
	LoginPOJO l=new LoginPOJO();
	input(l.getUser(), "velmurugans");
	input(l.getPass(), "velmurugan");
	accept(l.getButton());
	wintrack();
	SearchPOJO s=new SearchPOJO();
	SelectDrop(s.getLocate(), "London");
	SelectDrop(s.getHotel(), "Hotel Sunshine");
	SelectDrop(s.getType(), "Deluxe");
	SelectDrop(s.getRoomsCount(), "2");
	input(s.getDateIN(),"20/10/2019");
	input(s.getDateOut(), "21/10/2019");
	SelectDrop(s.getAdult(),"2");
	SelectDrop(s.getChild(), "1");
	accept(s.getSearch());
	SelectPOJO sp=new SelectPOJO();
	accept(sp.getRadio());
	accept(sp.getButton());
	BookPOJO b=new BookPOJO();
	input(b.getFname(),"Muthu");
	input(b.getLname(),"Kumar");
	input(b.getAddress(),"Coimbatore");
	input(b.getCardno(),"1122334455667788");
	IndexSelect(b.getCardtype(), 2);
	IndexSelect(b.getExpmonth(), 3);
	IndexSelect(b.getExpyear(),5);
	input(b.getCcv(),"554");
	accept(b.getBnow());
	Thread.sleep(5000);
	WebElement ono = b.getOno();
	String text = ono.getAttribute("value");
	System.out.println(text);
	CloseBrowser();
}
}
