package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccomodationPage;
import pages.CharterPage;
import pages.HomePage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
		
		testname="saloonMandatoryCheck";
		testdesc="To Apply for charter form";
		browser = "chrome";
	}
	
	
	@Test
	public void saloonMandatoryCheck(){
		
		
		new HomePage(driver, test)
		.clickOnCovidMessage()
		.clickOnStays()
		.clickOnLounge()
		.waitAccPage(3000)
		.controlTransfer()
		.clickOfMenu()
		.clickOnCharter()	
		.waitCharter(5000)
		.clickOnEnquiryForm()
		.enterNameOfApplicant("Uma")
		.enterNameOfOrganisation("Wipro")
		.enterAddress("Sozhinganallur")
		.enterMobileNo("9876543")
		.enterEmail("uma04eswari08@gmail.com")
		.selectRequestFor("Saloon Charter")
		.enterOrginationStation("Chennai")
		.enterDestinationStation("Delhi")
		.enterDateOfDepature()
		.enterDateOfArrival()
		.enterNoOfPassengers("21")
		.enterPurposeOfCharter("Devotional")
		.enterAdditionalSerives("Nothing Much")		
		.clickOnSubmit();
		
		
		
		
		
	}

}
