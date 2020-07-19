package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class TourBookingPage extends GenericWrappers {
	
	public TourBookingPage(RemoteWebDriver driver, ExtentTest test){
		
		this.driver = driver;
		this.test = test;
	}
	
	public TourBookingPage moveToTourPage(){
		switchToLastWindow();
		return this;
	}
	
	public TourBookingPage waitTour(long time){
		
		waitProperty(time);
		return this;
	}
	
	public TourBookingPage selectTourStartDate(String value){
		
		selectVisibileTextByXpath(prop.getProperty("TourBookPage.selectTourStartDate.Xpath"), value);
		return this;
	}
	
	public TourBookingPage selectBoardingStation(String value){
		
		selectVisibileTextByXpath(prop.getProperty("TouBookPage.selectBoardStat.Xpath"), value);
		return this;
		
	}
	
	public TourBookingPage clickOnContinue()
	{
		
		clickByXpath(prop.getProperty("TourBookPAge.clcikOnContinue.Xpath"));
		return this;
	}
	
	public TourBookingPage selectRoom(String value){
		
		selectVisibileTextByXpath(prop.getProperty("TourBookPage.selectRoom.Xpath"), value);
		return this;
	}
	
	public TourPkgsLogin clickOnBook(){
		
		clickByXpath(prop.getProperty("TourBookPAge.clickOnBook.Xpath"));
		return new TourPkgsLogin(driver, test);
	}
	

}
