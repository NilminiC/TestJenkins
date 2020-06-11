package futuready.friends.extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extent;
	public static ExtentReports getReportObject() {
		 
		    ExtentTest logger;
		    ExtentHtmlReporter htmlReporter;
		    String htmlReportPath = System.getProperty("user.dir")+"\\reports\\index.html"; //Path for the HTML report to be saved		    
		    ExtentSparkReporter reporter = new ExtentSparkReporter(htmlReportPath);
		    reporter.config().setReportName("Futuready Friends");
		    reporter.config().setDocumentTitle("Test Results");
		    
		   // htmlReporter = new ExtentHtmlReporter(htmlReportPath);
	        extent = new ExtentReports();
	       // extent.attachReporter(htmlReporter); 
	        extent.attachReporter(reporter);
	        extent.setSystemInfo("Tester", "Nilmini Amarasinghe");
	        return extent;
	}
}
