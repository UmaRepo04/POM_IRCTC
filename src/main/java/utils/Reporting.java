package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
	
	 public static ExtentReports reports;
	 public ExtentTest test;
	 
	 public String testname, testdesc;
	
 public void startReport(){
	 
	 
	reports = new ExtentReports("./Reporting/report.html", false);
	 
 }
 
 public void startTest(String testname, String desc){
	 
	 
	test =reports.startTest(testname, desc) ;
	
 }
 
 public abstract long takeSnap();
 
 public void reportStep(String status, String details){
	 
long snapNumber =	 takeSnap();
	 
	 if(status.equalsIgnoreCase("pass")){
		 
		 test.log(LogStatus.PASS, details+test.addScreenCapture(".././Reporting/ScreenShot/"+snapNumber+".png"));
	 }else if(status.equalsIgnoreCase("fail")){
		 test.log(LogStatus.FAIL, details+test.addScreenCapture(".././Reporting/ScreenShot/"+snapNumber+".png"));
	 }else if(status.equalsIgnoreCase("warning")){
		 test.log(LogStatus.WARNING, details+test.addScreenCapture(".././Reporting/ScreenShot/"+snapNumber+".png"));
	 }
 }

 public void reportStep(String status, String details , boolean snap){
	 
	// long snapNumber =	 takeSnap();
	 	 
	 if(!snap){
	 
	 	 if(status.equalsIgnoreCase("pass")){
	 		 
	 		 test.log(LogStatus.PASS, details);
	 	 }else if(status.equalsIgnoreCase("fail")){
	 		 test.log(LogStatus.FAIL, details);
	 	 }else if(status.equalsIgnoreCase("warning")){
	 		 test.log(LogStatus.WARNING, details);
	 	 }
	  }
 }
 
 public void endTest(){
	 
	 reports.endTest(test);
 }
 
 
 public void endReport(){
	 
	 reports.flush();
 }
	
	
	
	
	
	
	
	
	
	
	
	

}
