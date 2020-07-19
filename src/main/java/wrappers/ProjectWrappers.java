package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrappers extends GenericWrappers{

	@BeforeSuite
	public void beforeSuite(){
		
		startReport();
	}
	
	@BeforeTest
	public void beforeTest(){
		
		loadObject();
		
	}
	
	@BeforeMethod
	public void beforeMethod(){
		
		startTest(testname, testdesc);
		invokeApp(browser, "https://irctc.co.in");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod(){
		
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass(){
		endTest();
	}
	
	@AfterTest
	public void afterTest(){
		
		unloadObject();
	}
	
	@AfterSuite
	public void afterSuite(){
		endReport();
		
	}
	
	
}
