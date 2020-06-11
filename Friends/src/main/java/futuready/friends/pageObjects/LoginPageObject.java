package futuready.friends.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	By txtuserName = By.xpath("//input[@placeholder='Username']");
	By txtpassWord = By.xpath("//input[@placeholder='Password']");
	By btnLogin = By.xpath("//button[@class='button is-link is-fullwidth']");
	By lblTitle = By.xpath("//h1[contains(text(),'FRIENDS')]");
	By lblLoggedIn = By.xpath("//p[@class='title-start has-text-centered']");
	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement getUserName() {
		return driver.findElement(txtuserName);
	}
	
	public WebElement getPassword() {
		return driver.findElement(txtpassWord);
	}
	
	public WebElement getLoginBtn() {
		return driver.findElement(btnLogin);
	}
	
	public WebElement getTitle() {
		return driver.findElement(lblTitle);
	}
	
	public WebElement getLoggedIn() {
		return driver.findElement(lblLoggedIn);
	}
}
