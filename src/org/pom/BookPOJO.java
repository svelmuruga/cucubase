package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPOJO extends BasClass
{
public BookPOJO() {
	PageFactory.initElements(driver,this);
}

@FindBy(id="first_name")
private WebElement fname;

@FindBy(id="last_name")
private WebElement lname;

@FindBy(id="address")
private WebElement address;

@FindBy(id="cc_num")
private WebElement cardno;

@FindBy(id="cc_type")
private WebElement cardtype;

@FindBy(id="cc_exp_month")
private WebElement expmonth;

@FindBy(id="cc_exp_year")
private WebElement expyear;

@FindBy(id="cc_cvv")
private WebElement ccv;

public WebElement getOno() {
	return ono;
}

@FindBy(id="book_now")
private WebElement Bnow;

@FindBy(id="order_no")
private WebElement ono;


public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCardno() {
	return cardno;
}

public WebElement getCardtype() {
	return cardtype;
}

public WebElement getExpmonth() {
	return expmonth;
}

public WebElement getExpyear() {
	return expyear;
}

public WebElement getCcv() {
	return ccv;
}

public WebElement getBnow() {
	return Bnow;
}
}
