package futuready.friends;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import futuready.friends.base.BaseSetUp;
import futuready.friends.pageObjects.MotorInsurancePageobject;

public class MotorInsuranceTest extends BaseSetUp{
	
	@BeforeTest
	public void initialize() throws IOException {
		driver =initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void createMotorInsurance(String Username,String Password) throws IOException, InterruptedException {		
		LoginPageTest login = new LoginPageTest();
		login.basePageNavigation(Username, Password);
		MotorInsurancePageobject MotorInsurance = new MotorInsurancePageobject(driver);
		MotorInsurance.getMotorInsurancePage().click();
		MotorInsurance.getBrand().click();
		MotorInsurance.getSelecthonda().click();
		MotorInsurance.getYear().click();
		MotorInsurance.getSelectYear().click();
		MotorInsurance.getModal().click();
		MotorInsurance.getSelectmodal().click();
		MotorInsurance.getSelectClass().click();
		Thread.sleep(5000);
		MotorInsurance.getSelectPlans().click();
		MotorInsurance.getSelectView().click();
		MotorInsurance.getSelectPlanWanted().click();
		MotorInsurance.getFname().click();
		MotorInsurance.getFname().clear();
		MotorInsurance.getFname().sendKeys("Test Motor First Name");
		MotorInsurance.getLname().click();
		MotorInsurance.getLname().clear();
		MotorInsurance.getLname().sendKeys("Test Motor Last Name");
		MotorInsurance.getThaiFname().click();
		MotorInsurance.getThaiFname().clear();
		MotorInsurance.getThaiFname().sendKeys("Test Motor First Thai Name");
		MotorInsurance.getThaiLname().click();
		MotorInsurance.getThaiLname().clear();
		MotorInsurance.getThaiLname().sendKeys("Test Motor Last Thai Name");
		MotorInsurance.getMobileNo().click();
		MotorInsurance.getMobileNo().clear();
		MotorInsurance.getMobileNo().sendKeys("11-111-1119");
		MotorInsurance.getEmail().click();
		MotorInsurance.getEmail().clear();
		MotorInsurance.getEmail().sendKeys("nilmini.ceilanco@gmail.com");
		MotorInsurance.getSelectAgreement().click();
		MotorInsurance.getSelectReferBtn().click();
		Thread.sleep(5000);
		Assert.assertEquals(MotorInsurance.getLblMsg().getText(),"Thank you!");
		
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
