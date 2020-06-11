package futuready.friends.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LifeInsurancePageObjects {
	
public WebDriver driver;

By selectLifeInsurance =By.linkText("Life");
By selectDOB =By.xpath("//input[@type='text']");
By selectYear =By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div/div/div[3]/div/div/header/div/div/div/div[2]/span/select");
By selectMonth =By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div/div/div[3]/div/div/header/div/div/div/div/span/select");
By selectDay =By.linkText("22");
By selectGender =By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div[2]/span[2]");
By selectOccupation =By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div[3]/div/div[2]/div/ul/li[5]/div");
By clickOccupation =By.xpath("(//input[@type='text'])[2]");
By clickSuboccupation =By.xpath("(//input[@type='text'])[3]");
By selectSuboccupation =By.xpath("//div[@id='productDetails']/div/section/div/div/div/div/div[4]/div/div[2]/div/ul/li[3]/div/span");
By selectPremium =By.xpath("//div[@id='productDetails']/div/section/div/div/div[2]/div[2]/div/span[2]");
By selectSunInsured =By.xpath("//div[@id='productDetails']/div/section/div/div/div[2]/div[2]/div/span");
By btnSubmit = By.xpath("//button[@type='submit']");
By enterAmt =By.xpath("//input[@type='number']");
By btnSearchPlans =By.xpath("//button[@type='info']");
By viewPlan =By.xpath("(//button[@type='button'])[3]");
By selectPlan =By.xpath("(//button[@type='button'])[40]");
By enterFname =By.xpath("//input[@type='text']");
By enterLname =By.xpath("(//input[@type='text'])[2]");
By enterTHFname =By.xpath("(//input[@type='text'])[3]");
By enterTHLname =By.xpath("(//input[@type='text'])[4]");
By enterMobileNo =By.xpath("(//input[@type='text'])[6]");
By enterEmail =By.xpath("//input[@type='email']");
By checkAgreement =By.xpath("//div[@id='life-pre']/div/div[2]/div/div[5]/div/div/label/span");
By btnRefer =By.xpath("//button[@type='button']");
By lblMsg =By.xpath("//p[contains(text(),'Thank you!')]");

public LifeInsurancePageObjects(WebDriver driver) {
	this.driver=driver;
}

public WebElement getLifeInsurance() {
	return driver.findElement(selectLifeInsurance);
}
public WebElement getDOB() {
	return driver.findElement(selectDOB);
}
public WebElement getYear() {
	return driver.findElement(selectYear);
}
public Select clickYear(){
	Select year = new Select(driver.findElement(selectYear));
	return year;
}
public WebElement getMonth() {
	return driver.findElement(selectMonth);
}
public Select clickMonth(){
	Select month = new Select(driver.findElement(selectMonth));
	return month;
}
public WebElement getDay() {
	return driver.findElement(selectDay);
}
public WebElement getGender() {
	return driver.findElement(selectGender);
}
public WebElement getSelectOccupation() {
	return driver.findElement(selectOccupation);
}
public WebElement getClickOccupation() {
	return driver.findElement(clickOccupation);
}
public WebElement getClickSuboccupation() {
	return driver.findElement(clickSuboccupation);
}
public WebElement getSelectSuboccupation() {
	return driver.findElement(selectSuboccupation);
}
public WebElement getbtnSubmit() {
	return driver.findElement(btnSubmit);
}
public WebElement getSelectPremiumn() {
	return driver.findElement(selectPremium);
}
public WebElement getSelectSunInsured() {
	return driver.findElement(selectSunInsured);
}
public WebElement getAmount() {
	return driver.findElement(enterAmt);
}
public WebElement getSearchPlansbtn() {
	return driver.findElement(btnSearchPlans);
}
public WebElement getViewPlan() {
	return driver.findElement(viewPlan);
}
public WebElement getSelectPlan() {
	return driver.findElement(selectPlan);
}
public WebElement getEnterFname() {
	return driver.findElement(enterFname);
}
public WebElement getEnterLname() {
	return driver.findElement(enterLname);
}
public WebElement getEnterTHFname() {
	return driver.findElement(enterTHFname);
}
public WebElement getEnterTHLname() {
	return driver.findElement(enterTHLname);
}
public WebElement getEnterMobileNo() {
	return driver.findElement(enterMobileNo);
}
public WebElement getEnterEmail() {
	return driver.findElement(enterEmail);
}
public WebElement getCheckAgreementn() {
	return driver.findElement(checkAgreement);
}
public WebElement getRefer() {
	return driver.findElement(btnRefer);
}
public WebElement getlblMsg() {
	return driver.findElement(lblMsg);
}
}//end of class
