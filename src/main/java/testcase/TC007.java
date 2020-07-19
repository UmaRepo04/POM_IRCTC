package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccomodationPage;
import pages.GalleryPage;
import pages.HomePage;
import pages.PackageDescriptionPage;
import pages.TourBookingPage;
import pages.TourPkgMakePayment;
import pages.TourPkgSummary;
import pages.TourPkgsPassenger;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
		
		testname="hillRailways";
		testdesc="To Book trip to hill stations";
		browser = "chrome";
	}
	
	@Test
	public void hillRailways(){
		
		new HomePage(driver, test)
		.clickOnCovidMessage()
		.clickOnStays()
		.clickOnLounge()
		.controlTransfer()
		.waitAccPage(5000)
		.clickOfMenu()
		.clickOnHillRailways()
		.waitGallery(5000)
		.moveToGallery()
		.clickBookNow()
		.waitPack(5000)
		.moveToPackagePage()
		.clickOnBookNow()
		.waitTour(5000)
		.moveToTourPage();
		/*.selectTourStartDate("21-MAY-20")
		.selectBoardingStation("ARAKKONAM JN")
		.clickOnContinue()
		.waitTour(3000)
		.selectRoom("2 Adult + 1 Child without bed (29380 /-)")
		.clickOnBook()
		.clickOnGuestUserLogin()
		.enterLoginDetails("8220015413", "uma.palaniappan@wipro.com")
		.clickOnLogIn()
		.enterFName1("Uma")
		.enterLName1("MAgeswari")
		.enterAge1("34")
		.enterGender1("Female")
		.enterFName2("Priya")
		.enterLName2("Raju")
		.enterAge2("25")
		.enterGender2("Female")
		.enterFName3("Kanmani")
		.enterLName3("Gowtham")
		.enterAge3("05")
		.enterGender3("Female")
		.enterNomineeName("Palaniappan")
		.enterNomineeRelation("Father")
		.enterGst("No")
		.enterPhoneNumber("9864563728")
		.enterFaxNo("910440847983")
		.enterAddress("Sozhinganallur")
		.enterCity("Chennai")
		.selectStateName("TamilNadu")
		.selectIDType("Driving Lisence")
		.enterIDCardNo("876456909953")
		.clickOnSubmit()
		.getPrice()
		.clickonTermsAndConditions()
		.clickOnMakepayment()
		.getTransactionAmount("Value");*/
		
		
		
		
		
	}

}
