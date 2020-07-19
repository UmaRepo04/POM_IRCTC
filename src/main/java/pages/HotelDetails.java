package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelDetails extends GenericWrappers{
	
	public HotelDetails(RemoteWebDriver driver, ExtentTest test){
		
		this.driver = driver;
		
		this.test = test;
		
	}
	
	public HotelDetails waitPropHDetaila(long time){
		
		waitProperty(time);
		return this;
	}
	
	public HotelDetails getPriceDetails(){
		
		getTextByXpath(prop.getProperty("HotelDetails.getPrice.Xpath"));
		return this;
		
	}
	
	public HotelDetails getHotelName(){
		getTextByXpath(prop.getProperty("HotelDetails.getHotelName.Xpath"));
		return this;
	}
	
	public PassengerDetailsPage clickOnContinueToBook(){
		
		clickByXpath(prop.getProperty("HotelDetails.clickOnContoBook.Xpath"));
		return new PassengerDetailsPage(driver, test);
	}
	
	
}
