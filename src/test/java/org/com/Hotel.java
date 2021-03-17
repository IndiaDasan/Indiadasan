package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Hotel 
{
public static WebDriver driver;
public void getdriver() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
public void launchurl(String url) {
	driver.get(url);
}
public void enterText(WebElement element,String value) {
	element.sendKeys(value);

}
public void btnclick(WebElement element) {
	element.click();

}
public void draganaddrop(WebElement source,WebElement target) {
	 Actions ac = new Actions(driver);
	 ac.dragAndDrop(source, target).perform();

}
}
