package org.com;

import org.openqa.selenium.WebElement;

public class Adacitin extends Hotel{
public static void main(String[] args) {
	Hotel hotel = new Hotel();
	hotel.getdriver();
	hotel.launchurl("https://adactinhotelapp.com/");
	
	LoginPage page = new LoginPage();
	WebElement txtUserName = page.getTxtUserName();
	hotel.enterText(txtUserName, "gurusriramesh");
	WebElement txtPassword = page.getTxtPassword();
	hotel.enterText(txtPassword, "123456789");
	WebElement btnlogin = page.getBtnlogin();
	hotel.btnclick(btnlogin);
}
}
