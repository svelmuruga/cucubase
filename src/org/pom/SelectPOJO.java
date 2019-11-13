package org.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPOJO extends BasClass
{
public SelectPOJO()
{
	PageFactory.initElements(driver,this);
}

@FindBy(id="radiobutton_0")
private WebElement radio;

@FindBy(id="continue")
private WebElement button;

public WebElement getRadio() {
	return radio;
}

public WebElement getButton() {
	return button;
}
}