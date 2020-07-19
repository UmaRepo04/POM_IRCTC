package testcase;


import pages.HomePage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccomodationPage;
import pages.ListOfHotelsPage;
import pages.HotelDetails;
import pages.HotelPage;
import pages.PassengerDetailsPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
		
		testname="bookHotels";
		testdesc="To Book hotelrooms";
		browser = "chrome";
	}
	
	
	@Test
	public void bookHotels(){
		
		new HomePage(driver, test)
		.clickOnCovidMessage()
		.clickOnStays()
		.clickOnLounge()	
		.controlTransfer()
		.waitAccPage(5000)
		.clickOfHotelIcon()
		.changeControl()
		.waitHotelPage(5000)
		.clickLogin()
		.clickOnGuestUserLoginButton()
		.enterLoginDetails("uma04eswari08@gmail.com", "8220015413")
		.clickOnSignIn()
		.enterCityName("Chennai")
		.checkInDate()
		.checkOutDate()
		.selectRoomsandGuests("1", "3", "0")
		.clickFindHotel()
		.clickOnBook()
		.getHotelName()
		.getPriceDetails()
		.clickOnContinueToBook()		
		.enterTitle("Miss")
		.enterFirstName("Uma")
		.enterLastName("Mageswari")
		.selectGst("Yes")
		.enterGstNumber("975Tnou3")
		.enterCompanyName("Wipro")
		.enterCompanyAddress("Sozhinganallur")
		.clickGoButton();
		
		
		
	}

}
