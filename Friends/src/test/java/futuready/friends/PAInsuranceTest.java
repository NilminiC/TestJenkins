package futuready.friends;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import futuready.friends.base.BaseSetUp;
import futuready.friends.pageObjects.PAInsurancePageObjects;
import junit.framework.Assert;

public class PAInsuranceTest extends BaseSetUp{
	
	@BeforeTest
	public void initialize() throws IOException {
		driver =initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void createPAInsurance(String Username,String Password) throws IOException, InterruptedException {		
		LoginPageTest login = new LoginPageTest();
		login.basePageNavigation(Username, Password);
		PAInsurancePageObjects PAInsurance = new PAInsurancePageObjects(driver);
		PAInsurance.getPAInsurance().click();
		Thread.sleep(2000);
		PAInsurance.getDOB().click();
		PAInsurance.getSelectYear().click();
		PAInsurance.clickYear().selectByVisibleText("1988");
		PAInsurance.getSelectYear().click();
		PAInsurance.getSelectMonth().click();
		PAInsurance.clickMonth().selectByVisibleText("September");
		PAInsurance.getSelectMonth().click();
		PAInsurance.getSelectDay().click();
		PAInsurance.getSelectGender().click();
		PAInsurance.getOccupation().click();
		PAInsurance.getSelectOccupation().click();
		PAInsurance.getSubOccupation().click();
		PAInsurance.getSelectSubOccupation().click();
		PAInsurance.getNextBtn().click();
		PAInsurance.getPremium().click();
		PAInsurance.getSumInsured().click();
		PAInsurance.getAmount().click();
		PAInsurance.getAmount().clear();
		PAInsurance.getAmount().sendKeys("1000000");
		PAInsurance.getSearchPlansBtn().click();
		Thread.sleep(5000);
		PAInsurance.getViewPlansBtn().click();
		PAInsurance.getSearchPlanBtn().click();
		PAInsurance.getEnterFname().click();
		PAInsurance.getEnterFname().clear();
		PAInsurance.getEnterFname().sendKeys("Test PA Insurance First Name");
		PAInsurance.getEnterLname().click();
		PAInsurance.getEnterLname().clear();
		PAInsurance.getEnterLname().sendKeys("Test PA Insurance Last Name");
		PAInsurance.getEnterThaiFname().click();
		PAInsurance.getEnterThaiFname().clear();
		PAInsurance.getEnterThaiFname().sendKeys("Test Thai PA Insurance First Name");
		PAInsurance.getEnterThaiLname().click();
		PAInsurance.getEnterThaiLname().clear();
		PAInsurance.getEnterThaiLname().sendKeys("Test Thai PA Insurance Last Name");
		PAInsurance.getMobileNo().click();
		PAInsurance.getMobileNo().clear();
		PAInsurance.getMobileNo().sendKeys("11-111-1119");
		PAInsurance.getEmail().click();
		PAInsurance.getEmail().clear();
		PAInsurance.getEmail().sendKeys("nilmini.ceilanco@gmail.com");
		PAInsurance.getAgreement().click();
		PAInsurance.getReferBtn().click();
		Thread.sleep(5000);
		Assert.assertEquals("Thank you!", PAInsurance.getlblMsg().getText());
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
