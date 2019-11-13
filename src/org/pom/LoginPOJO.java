package org.pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BasClass {
	
	public LoginPOJO()
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="username")
	private WebElement User;


	@FindBy(id="password")
	private WebElement Pass;

	@FindBy(id="login")
	private WebElement button;

	public WebElement getUser() {
		return User;
	}

	public WebElement getPass() {
		return Pass;
	}

	public WebElement getButton() {
		return button;

	}
}