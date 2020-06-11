package futuready.friends;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import futuready.friends.base.BaseSetUp;
import futuready.friends.pageObjects.LoginPageObject;

public class LoginPageTest extends BaseSetUp{
	
	@BeforeTest
	public void initialize() throws IOException {
		driver =initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password) throws IOException {		
		 driver.get(website);
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     LoginPageObject login = new LoginPageObject(driver);
	     assertEquals( login.getTitle().getText(), "FRIENDS");	 
	     Assert.assertTrue(login.getTitle().isDisplayed());
	     login.getUserName().sendKeys(Username);
	     login.getPassword().sendKeys(Password);
	     login.getLoginBtn().click();
	     Assert.assertTrue(login.getLoggedIn().isDisplayed());
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
