package futuready.friends.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelInsurancePageObjects {
	public WebDriver driver;

	By selectTravelInsurance =By.linkText("Travel");
	By selectDestination =By.xpath("//div[@id='travel-insurance']/section/div/div/div/div/div/div/div[2]/div/ul/li[52]/div");
	By clickDestination =By.xpath("//input[@type='text']");
	By selectMultiTrip =By.xpath("//div[@id='travel-insurance']/section/div/div/div[2]/div[2]/div/span[2]");
	By selectSingleTrip =By.xpath("//div[@id='travel-insurance']/section/div/div/div[2]/div[2]/div/span");
	By selectMonth;
	By selectDay;
	By btnNext;
	
	public TravelInsurancePageObjects(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getTavelInsurance() {
		return driver.findElement(selectTravelInsurance);
	}
	public WebElement getDestination() {
		return driver.findElement(selectDestination);
	}
	public WebElement getClickDestination() {
		return driver.findElement(clickDestination);
	}
	public WebElement getSelectMultiTrip() {
		return driver.findElement(selectMultiTrip);
	}
	public WebElement getSelectSingleTrip() {
		return driver.findElement(selectSingleTrip);
	}
}
