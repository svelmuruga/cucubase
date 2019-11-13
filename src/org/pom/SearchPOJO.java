package org.pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPOJO extends BasClass{
	
	public SearchPOJO()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement locate;

	@FindBy(id="hotels")
	private WebElement hotel;

	@FindBy(id="room_type")
	private WebElement type;

	@FindBy(id="room_nos")
	private WebElement roomsCount;

	@FindBy(name="datepick_in")
	private WebElement dateIN;

	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement dateOut;

	@FindBy(name="adult_room")
	private WebElement adult;

	@FindBy(id="Submit")
	private WebElement search;


	public WebElement getSearch() {
		return search;
	}

	public WebElement getLocate() {
		return locate;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getRoomsCount() {
		return roomsCount;
	}

	public WebElement getDateIN() {
		return dateIN;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	@FindBy(name="child_room")
	private WebElement child;


}
