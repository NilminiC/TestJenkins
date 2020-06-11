package futuready.friends.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MotorInsurancePageobject {

	public WebDriver driver;
	
	By selectBrand = By.xpath("//input[@placeholder='Search for Brands']");
	By selecthonda = By.xpath("//main[@id='motorInsurance']/div/section/div/div/div/div/div/div/div[2]/div/ul/li[2]/div");
	By selectMotorInsurance = By.linkText("Motor");
	By selectYear = By.xpath("(//input[@type='text'])[2]");
	By selectYearwanted = By.xpath("//main[@id='motorInsurance']/div/section/div/div/div[2]/div[2]/div/div/div[2]/div/ul/li[2]/div");
	By selectModal = By.xpath("(//input[@type='text'])[3]");
	By selectModalwanted = By.xpath("//main[@id='motorInsurance']/div/section/div/div/div[2]/div[3]/div/div/div[2]/div/ul/li[9]/div");
	By selectClass = By.xpath("//main[@id='motorInsurance']/div/section/div/div/div/div[2]/div/div[2]/label/span");
	By selectPlans = By.xpath("//button[@type='submit']");
	By selectView = By.xpath("//main[@id='motorSearch']/div[2]/div[2]/div/div/div/div[4]/button");
	By selectPlanWanted = By.xpath("//main[@id='motorSearch']/div[2]/div[3]/div/div[2]/div/div[3]/button/span");
	By txtFname = By.xpath("//input[@type='text']");
	By txtLame = By.xpath("(//input[@type='text'])[2]");
	By txtThaiFname = By.xpath("(//input[@type='text'])[3]");
	By txtThaiLame = By.xpath("(//input[@type='text'])[4]");
	By txtMobileNo = By.xpath("(//input[@type='text'])[6]");
	By txtEmail = By.xpath("//input[@type='email']");
	By checkAgreed = By.xpath("//div[@id='motor-pre']/div/div[2]/div/div[5]/div/div/label/span");
	By btnRefer = By.xpath("//button[@type='button']");
	By lblMsg = By.xpath("//p[contains(text(),'Thank you!')]");
	
	public MotorInsurancePageobject(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getMotorInsurancePage() {
		return driver.findElement(selectMotorInsurance);
	}
	
	public WebElement getBrand() {
		return driver.findElement(selectBrand);
	}
	
	public WebElement getSelecthonda() {
		return driver.findElement(selecthonda);
	}
	
	public WebElement getYear() {
		return driver.findElement(selectYear);
	}
	
	public WebElement getSelectYear() {
		return driver.findElement(selectYearwanted);
	}
	
	public WebElement getModal() {
		return driver.findElement(selectModal);
	}
	
	public WebElement getSelectClass() {
		return driver.findElement(selectClass);
	}
	
	public WebElement getSelectmodal() {
		return driver.findElement(selectModalwanted);
	}
	
	public WebElement getSelectPlans() {
		return driver.findElement(selectPlans);
	}
	
	public WebElement getSelectView() {
		return driver.findElement(selectView);
	}
	
	public WebElement getSelectPlanWanted() {
		return driver.findElement(selectPlanWanted);
	}
	public WebElement getFname() {
		return driver.findElement(txtFname);
	}
	
	public WebElement getLname() {
		return driver.findElement(txtLame);
	}
	
	public WebElement getThaiFname() {
		return driver.findElement(txtThaiFname);
	}
	
	public WebElement getThaiLname() {
		return driver.findElement(txtThaiLame);
	}
	
	public WebElement getMobileNo() {
		return driver.findElement(txtMobileNo);
	}
	
	public WebElement getEmail() {
		return driver.findElement(txtEmail);
	}
	
	public WebElement getSelectAgreement() {
		return driver.findElement(checkAgreed);
	}
	
	public WebElement getSelectReferBtn() {
		return driver.findElement(btnRefer);
	}
	
	public WebElement getLblMsg() {
		return driver.findElement(lblMsg);
	}
	
}
