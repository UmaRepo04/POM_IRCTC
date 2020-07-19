package testcase;


import pages.HomePage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccomodationPage;
import pages.ListOfHotelsPage;
import pages.HotelDetails;
import pages.HotelPage;
import pages.HotelSummaryPage;
import pages.PassengerDetailsPage;
import wrappers.ProjectWrappers;


public class TC006 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass(){
		
		testname="bookHotel2";
		testdesc="To Book hotels";
		browser = "chrome";
	}
	
	@Test
	public void bookHotel2(){
		
		new HomePage(driver, test)
		.clickOnCovidMessage()
		.clickOnStays()
		.clickOnLounge()
		.waitAccPage(5000)
		.controlTransfer()
		.clickOfHotelIcon()
		.changeControl()
		.waitHotelPage(5000)
		.clickLogin()
		.waitHotelPage(3000)
		.clickOnGuestUserLoginButton()
		.enterLoginDetails("uma04eswari08@gmail.com", "8220015413")
		.clickOnSignIn()
		.waitHotelPage(3000)
		.enterCityName("Chennai")
		.checkInDate()
		.checkOutDate()
		.selectRoomsandGuests("1", "3", "0")
		.clickFindHotel()
		.waitList(3000)
		.clickOnBook()
		.waitPropHDetaila(9000)
		.getHotelName()
		.getPriceDetails()
		.clickOnContinueToBook()
		.waitPass(3000)
		.enterTitle("Miss")
		.enterFirstName("Uma")
		.enterLastName("Mageswari")
		.selectGst("No")
		.clickGoButton()
		.waitSummary(3000)
		.clickTermsandConditions()
		.getHotelName()
		.getPrice()
		.clickOnMakePayment();
		
	}
	
	
	
}