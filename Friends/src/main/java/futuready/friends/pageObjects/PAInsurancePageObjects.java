package futuready.friends.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PAInsurancePageObjects {
	
	public WebDriver driver;
	
	By selectPAInsurance = By.linkText("Personal Accident");
	By selectDOB = By.xpath("//input[@type='text']");
	By selectYear = By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div/div/div[3]/div/div/header/div/div/div/div[2]/span/select");
	By selectMonth = By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div/div/div[3]/div/div/header/div/div/div/div/span/select");
	By selectDay = By.linkText("21");
	By selectGender = By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div[2]/span[2]");
	By txtoccupation = By.xpath("(//input[@type='text'])[2]");
	By selectOccupation = By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div[3]/div/div[2]/div/ul/li[2]/div");
	By txtsuboccupation = By.xpath("(//input[@type='text'])[3]");
	By selectSuboccupation = By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div[4]/div/div[2]/div/ul/li[5]/div/span");
	By btnNext = By.xpath("//button[@type='submit']");
	By selectedPremium =By.xpath("//div[@id='productDetails']/div/section/div/div/div[2]/div[2]/div/span[2]");
	By selectSumInsured =By.xpath("//div[@id='productDetails']/div/section/div/div/div[2]/div[2]/div/span");
	By txtAmount =By.xpath("//input[@type='number']");
	By btnsearchPlans =By.xpath("//button[@type='info']");
	By btnViewPlan = By.xpath("//main[@id='lifeSearch']/div[2]/div[2]/div/div/div/div[4]/button/span");
	By btnSelectPlan =By.xpath("//main[@id='lifeSearch']/div[2]/div[4]/div/div[2]/div/div[3]/button/span");
	By txtFname =By.xpath("//input[@type='text']");
	By txtLname =By.xpath("(//input[@type='text'])[2]");
	By txtTFname =By.xpath("(//input[@type='text'])[3]");
	By txtTLname =By.xpath("(//input[@type='text'])[4]");
	By txtMobileNo =By.xpath("(//input[@type='text'])[6]");
	By txtEmail =By.xpath("//input[@type='email']");
	By checkAgreed =By.xpath("//div[@id='pa-pre']/div/div[2]/div/div[5]/div/div/label/span");
	By btnRefer =By.xpath("//button[@type='button']");
	By lblMsg =By.xpath("//p[contains(text(),'Thank you!')]");
	
	public PAInsurancePageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getPAInsurance() {
		return driver.findElement(selectPAInsurance);
	}
	
	public WebElement getSelectYear() {
		return driver.findElement(selectYear);
	}
	
	public Select clickYear(){
		Select year = new Select(driver.findElement(selectYear));
		return year;
	}
	
	public WebElement getSelectMonth() {
		return driver.findElement(selectMonth);
	}
	
	public Select clickMonth(){
		Select month = new Select(driver.findElement(selectMonth));
		return month;
	}
	
	public WebElement getSelectDay() {
		return driver.findElement(selectDay);
	}
	
	public WebElement getOccupation() {
		return driver.findElement(txtoccupation);
	}
	
	public WebElement getSelectOccupation() {
		return driver.findElement(selectOccupation);
	}
	public WebElement getSubOccupation() {
		return driver.findElement(txtsuboccupation);
	}
	public WebElement getSelectSubOccupation() {
		return driver.findElement(selectSuboccupation);
	}
	
	public WebElement getSelectGender() {
		return driver.findElement(selectGender);
	}
	
	public WebElement getDOB() {
		return driver.findElement(selectDOB);
	}
	
	public WebElement getNextBtn() {
		return driver.findElement(btnNext);
	}
	
	public WebElement getPremium() {
		return driver.findElement(selectedPremium);
	}
	public WebElement getSumInsured() {
		return driver.findElement(selectSumInsured);
	}
	
	public WebElement getAmount() {
		return driver.findElement(txtAmount);
	}
	public WebElement getSearchPlansBtn() {
		return driver.findElement(btnsearchPlans);
	}
	public WebElement getViewPlansBtn() {
		return driver.findElement(btnViewPlan);
	}
	public WebElement getSearchPlanBtn() {
		return driver.findElement(btnSelectPlan);
	}
	public WebElement getEnterFname() {
		return driver.findElement(txtFname);
	}
	public WebElement getEnterLname() {
		return driver.findElement(txtLname);
	}
	public WebElement getEnterThaiFname() {
		return driver.findElement(txtTFname);
	}
	public WebElement getEnterThaiLname() {
		return driver.findElement(txtTLname);
	}
	public WebElement getMobileNo() {
		return driver.findElement(txtMobileNo);
	}
	public WebElement getEmail() {
		return driver.findElement(txtEmail);
	}
	public WebElement getAgreement() {
		return driver.findElement(checkAgreed);
	}
	
	public WebElement getReferBtn() {
		return driver.findElement(btnRefer);
	}
	public WebElement getlblMsg() {
		return driver.findElement(lblMsg);
	}
}
