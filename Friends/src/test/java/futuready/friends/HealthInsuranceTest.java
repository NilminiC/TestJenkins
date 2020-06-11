package futuready.friends;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import futuready.friends.base.BaseSetUp;
import futuready.friends.pageObjects.HealthInsPageObject;

public class HealthInsuranceTest extends BaseSetUp{

	@BeforeTest
	public void initialize() throws IOException {
		driver =initializeDriver();
	}

	@Test(dataProvider="getData")
	public void createHealthInsurance(String Username,String Password) throws IOException, InterruptedException {		
		LoginPageTest login = new LoginPageTest();
		login.basePageNavigation(Username, Password);
		HealthInsPageObject HInsurance = new HealthInsPageObject(driver);
		HInsurance.getDOB().click();
		HInsurance.getYear().click();
		HInsurance.clickYear().selectByVisibleText("1990");
		HInsurance.getYear().click();
		HInsurance.getMonth().click();
		HInsurance.clickMonth().selectByVisibleText("May");
		HInsurance.getMonth().click();
		HInsurance.getDay().click();
		HInsurance.getGender().click();
		HInsurance.getSearchPlansBtn().click();
		Thread.sleep(5000);
		HInsurance.getSelectView().click();
		HInsurance.getSelectPlan().click();
		//Select plan and send inquiry
		HInsurance.getFirstName().click();
		HInsurance.getFirstName().clear();
		HInsurance.getFirstName().sendKeys("Test First Name");
		HInsurance.getLastName().click();
		HInsurance.getLastName().clear();
		HInsurance.getLastName().sendKeys("Test Last Name");
		HInsurance.getThaiFirstName().click();
		HInsurance.getThaiFirstName().clear();
		HInsurance.getThaiFirstName().sendKeys("ข ไข่"
		);
		HInsurance.getThaiLastName().click();
		HInsurance.getThaiLastName().clear();
		HInsurance.getThaiLastName().sendKeys("ข ไข่");
		HInsurance.getMobileNo().click();
		HInsurance.getMobileNo().clear();
		HInsurance.getMobileNo().sendKeys("11-111-1119");
		HInsurance.getEmail().click();
		HInsurance.getEmail().clear();
		HInsurance.getEmail().sendKeys("nilmini.ceilanco@gmail.com");
		HInsurance.getSelectAgreement().click();
		HInsurance.getReferBtn().click();
		Thread.sleep(5000);
		Assert.assertEquals(HInsurance.getlblMsg().getText(), "Thank you!");
		Thread.sleep(5000);
	}


	@AfterTest
	public void teardown() {
		tearDownDriver();
	}

	@DataProvider
	public Object[][] getData(){
		//row stands for how many different data types test should run
		//column stands for how many values each test

		Object[][] data=new Object[1][2];

		data[0][0]="demouser";
		data[0][1]="demoUser1";

		return data;
	}
}
