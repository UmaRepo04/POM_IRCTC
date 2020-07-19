package utils;



import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReporting {
	
	
	
	
	
	@Test
	public void reporting(){
		
		
		ExtentReports report = new ExtentReports("./Reports/report.html" , false);
		
		ExtentTest test =report.startTest("IRCTC_SignIn", " Signing into the IRCTC Application");
		
		
		test.assignAuthor("Uma");
		
		test.assignCategory("Regression");
		
	
		test.log(LogStatus.PASS, "The step one passed successfully");
		
		test.log(LogStatus.PASS, "The step two passed successfully");

		test.log(LogStatus.PASS, "The step three passed successfully");

		test.log(LogStatus.PASS, "The step four passed successfully");

		test.log(LogStatus.PASS, "The step five passed successfully");
		
		
		//test.log(LogStatus.FAIL, "The step five passed successfully");
		//test.log(LogStatus.INFO, "The step five passed successfully");
		//test.log(LogStatus.WARNING, "The step five passed successfully");

		
		report.endTest(test);
		
		report.flush();
		
		
		
		
		
		
		
		
		
		
		
	}

}
