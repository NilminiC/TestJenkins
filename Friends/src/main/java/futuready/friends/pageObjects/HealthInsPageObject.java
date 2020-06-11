package futuready.friends.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HealthInsPageObject {
	
	public WebDriver driver;
	
	By txtDOB = By.xpath("//input[@placeholder='Click to select a date']");
	By selectYear = By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div/div/div[3]/div/div/header/div/div/div/div[2]/span/select");
	By selectMonth = By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div/div/div[3]/div/div/header/div/div/div/div/span/select");
	By selectDay = By.linkText("9");
	By selectGenderFemale = By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div[2]/span[2]");
	By btnSearchPlans = By.xpath("//button[@type='info']");
	By btnSelectView = By.xpath("//main[@id='lifeSearch']/div[2]/div[2]/div/div/div/div[4]/button/span");
	By btnSelectPlanInner = By.xpath("(//button[@type='button'])[40]");	
	By txtfname = By.xpath("//input[@type='text']");
	By txtlname = By.xpath("(//input[@type='text'])[2]");
	By txtThaifname = By.xpath("(//input[@type='text'])[3]");
	By txtThailname = By.xpath("(//input[@type='text'])[4]");
	By txtMobilNo = By.xpath("(//input[@type='text'])[6]");
	By txtEmail = By.xpath("//input[@type='email']");
	By checkAgreement = By.xpath("//div[@id='life-pre']/div/div[2]/div/div[5]/div/div/label/span");
	By btnRefer = By.xpath("//button[@type='button']");
	By lblThankyouMsg = By.xpath("//p[contains(text(),'Thank you!')]");
	
	public HealthInsPageObject(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getDOB() {
		return driver.findElement(txtDOB);
	}
	
	public WebElement getYear() {
		return driver.findElement(selectYear);
	}
	
	public WebElement getMonth() {
		return driver.findElement(selectMonth);
	}
	
	public WebElement getGender() {
		return driver.findElement(selectGenderFemale);
	}
	
	public WebElement getSearchPlansBtn() {
		return driver.findElement(btnSearchPlans);
	}
	
	public WebElement getDay() {
		return driver.findElement(selectDay);
	}
	
	public Select clickYear(){
		Select year = new Select(driver.findElement(selectYear));
		return year;
	}
	
	public Select clickMonth(){
		Select month = new Select(driver.findElement(selectMonth));
		return month;
	}
	
	public WebElement getSelectView() {
		return driver.findElement(btnSelectView);
	}
	
	public WebElement getSelectPlan() {
		return driver.findElement(btnSelectPlanInner);
	}
	
	public WebElement getFirstName() {
		return driver.findElement(txtfname);
	}
	public WebElement getLastName() {
		return driver.findElement(txtlname);
	}
	public WebElement getThaiFirstName() {
		return driver.findElement(txtThaifname);
	}
	public WebElement getThaiLastName() {
		return driver.findElement(txtThailname);
	}
	public WebElement getMobileNo() {
		return driver.findElement(txtMobilNo);
	}
	public WebElement getEmail() {
		return driver.findElement(txtEmail);
	}
	public WebElement getSelectAgreement() {
		return driver.findElement(checkAgreement);
	}
	public WebElement getReferBtn() {
		return driver.findElement(btnRefer);
	}
	public WebElement getlblMsg() {
		return driver.findElement(lblThankyouMsg);
	}
}
