package futuready.friends;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import futuready.friends.base.BaseSetUp;

public class ExtentReportDemo extends BaseSetUp{
	WebDriver driver;
	 
    ExtentReports extent;
    ExtentTest logger;
    ExtentHtmlReporter htmlReporter;
    String htmlReportPath = System.getProperty("user.dir")+"\\reports\\index.html"; //Path for the HTML report to be saved
 
    @BeforeTest
    public void setup() throws IOException{
        htmlReporter = new ExtentHtmlReporter(htmlReportPath);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
 
        driver =initializeDriver();
        
    }
 
    @Test
    public void test1(){
        logger = extent.createTest("Site Test", "Test to launch site");
      //  driver.get("http://www.google.com/");
        driver.get(website);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        logger.log(Status.INFO, "Opened site");
        assertEquals(driver.getTitle(), "Futuready Referral (Thailand)");
        logger.log(Status.PASS, "Site loaded");
    }
 
    @AfterMethod
    public void getResult(ITestResult result) throws Exception {
        if (result.getStatus() == ITestResult.FAILURE)
        {
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:", ExtentColor.RED));
            logger.fail(result.getThrowable());
        }
        else if (result.getStatus() == ITestResult.SUCCESS)
        {
            logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
        }
        else if (result.getStatus() == ITestResult.SKIP)
        {
            logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.BLUE));
        }
     }
 
    @AfterTest
    public void testend() throws Exception {
        extent.flush();
    }
 
    @AfterClass
    public void tearDown() throws Exception {
        driver.close();

}}
