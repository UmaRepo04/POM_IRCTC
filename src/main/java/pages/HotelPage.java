package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelPage extends GenericWrappers {
	
	public HotelPage(RemoteWebDriver driver, ExtentTest test){
		
		this.driver = driver;
		
		this .test = test;
		
	}
	
	public HotelPage changeControl(){
		switchToLastWindow();
		return this;
	}
	
	public HotelPage waitHotelPage(long time){
		
		waitProperty(time);
		return this;
	}
	
	
	public HotelPage clickLogin(){
		
		clickByXpath(prop.getProperty("HotelPage.clickOnLogin.Xpath"));
		return this;
		
	}
	
	public HotelPage clickOnGuestUserLoginButton(){
		clickByXpath(prop.getProperty("HotelPage.clickOnGuestuserlogin.Xpath"));
		return this;
	}
	
	public HotelPage enterLoginDetails(String email, String mobile){
		enterByXpath(prop.getProperty("HotelPage.enterMail.Xpath"), email);
		enterByXpath(prop.getProperty("HotelPage.entermobile.Xpath"), mobile);
		return this;
	}
	
	public HotelPage clickOnSignIn(){
		clickByXpath(prop.getProperty("HotelPage.clickOnSignIn.Xpath"));
		return this;
	}
	
	public HotelPage enterCityName(String data) {
		
		enterByXpath(prop.getProperty("HotelPage.enterCityName.Xpath"), data);
		clickByXpath(prop.getProperty("HotelPage.clickCity.Xpath"));
		return this;
	}
	
	public HotelPage checkInDate()
	{
		clickByXpath(prop.getProperty("HotelPage.enterCheckIndate.Xpath"));
		waitProperty(3000);
		clickByXpath(prop.getProperty("HotelPage.clickIndate.Xpath"));
		return this;
	}
	
	public HotelPage checkOutDate(){
		
		clickByXpath(prop.getProperty("HotelPage.enterCheckOutDate.Xpath"));
		waitProperty(3000);
		clickByXpath(prop.getProperty("HotelPage.clickOutdate.Xpath"));
		return this;
	}
	
	public HotelPage selectRoomsandGuests(String Value,String Value1, String Value2){
		
		clickByXpath(prop.getProperty("HotelPage.clickOnGuestsandRooms.Xpath"));
		waitProperty(3000L);
		selectVisibileTextByXpath(prop.getProperty("HotelPage.selectRooms.Xpath"), Value);
		selectVisibileTextByXpath(prop.getProperty("HotelPage.selectAdults.Xpath"), Value1);
		selectVisibileTextByXpath(prop.getProperty("Hotelpage.selectChild.Xpath"), Value2);
		waitProperty(3000L);
		clickByXpath(prop.getProperty("HotelPage.clickOnDone.Xpath"));
		return this;
	}
	
	public ListOfHotelsPage clickFindHotel(){
		
		clickByXpath(prop.getProperty("HotelPage.ClickOnFindHotel.Xpath"));
		return  new ListOfHotelsPage(driver, test);
		
		
	}
		

}
