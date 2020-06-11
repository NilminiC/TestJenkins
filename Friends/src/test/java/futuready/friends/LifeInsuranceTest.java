package futuready.friends;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import futuready.friends.base.BaseSetUp;
import futuready.friends.pageObjects.LifeInsurancePageObjects;
import junit.framework.Assert;

public class LifeInsuranceTest extends BaseSetUp{
	@BeforeTest
	public void initialize() throws IOException {
		driver =initializeDriver();
	}

	@Test(dataProvider="getData")
	public void createLifeInsurance(String Username,String Password) throws IOException, InterruptedException {		
		LoginPageTest login = new LoginPageTest();
		login.basePageNavigation(Username, Password);
		LifeInsurancePageObjects LInsurance = new LifeInsurancePageObjects(driver);
		LInsurance.getLifeInsurance().click();
		Thread.sleep(2000);
		LInsurance.getDOB().click();
		LInsurance.getYear().click();
		LInsurance.clickYear().selectByVisibleText("2004");
		LInsurance.getYear().click();
		LInsurance.getMonth().click();
		LInsurance.clickMonth().selectByVisibleText("December");
		LInsurance.getMonth().click();
		LInsurance.getDay().click();
		LInsurance.getGender().click();
		LInsurance.getClickOccupation().click();
		LInsurance.getSelectOccupation().click();
		LInsurance.getClickSuboccupation().click();
		LInsurance.getSelectSuboccupation().click();
		LInsurance.getbtnSubmit().click();
		LInsurance.getSelectPremiumn().click();
		LInsurance.getSelectSunInsured().click();
		LInsurance.getAmount().click();
		LInsurance.getAmount().clear();
		LInsurance.getAmount().sendKeys("1000000");
		LInsurance.getSearchPlansbtn().click();
		Thread.sleep(5000);
		LInsurance.getViewPlan().click();
		LInsurance.getSelectPlan().click();
		LInsurance.getEnterFname().click();
		LInsurance.getEnterFname().clear();
		LInsurance.getEnterFname().sendKeys("Life Test First Name");
		LInsurance.getEnterLname().click();
		LInsurance.getEnterLname().clear();
		LInsurance.getEnterLname().sendKeys("Life Test Last name");
		LInsurance.getEnterTHFname().click();
		LInsurance.getEnterTHFname().clear();
		LInsurance.getEnterTHFname().sendKeys("Life Test Thai First Name");
		LInsurance.getEnterTHLname().click();
		LInsurance.getEnterTHLname().clear();
		LInsurance.getEnterTHLname().sendKeys("Life Test Last name");
		LInsurance.getEnterMobileNo().click();
		LInsurance.getEnterMobileNo().clear();
		LInsurance.getEnterMobileNo().sendKeys("11-111-1119");
		LInsurance.getEnterEmail().click();
		LInsurance.getEnterEmail().clear();
		LInsurance.getEnterEmail().sendKeys("test@gmail.com");
		LInsurance.getCheckAgreementn().click();
		LInsurance.getRefer().click();
		Thread.sleep(5000);
		Assert.assertEquals("Thank you!", LInsurance.getlblMsg().getText());		
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
