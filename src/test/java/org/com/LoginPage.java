package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Hotel
{
public LoginPage() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="UserName")
private WebElement txtUserName;
@FindBy(name="passwords")
private WebElement txtPassword;
@FindBy(xpath="//input[@name='login']")
private WebElement btnlogin;
public WebElement getTxtUserName() {
	return txtUserName;
}
public WebElement getTxtPassword() {
	return txtPassword;
}
public WebElement getBtnlogin() {
	return btnlogin;
}

}
