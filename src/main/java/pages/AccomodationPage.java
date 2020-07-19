package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers {
	
	
	public AccomodationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
		
		
		
	}
	
	public AccomodationPage waitAccPage(long time){
		
		waitProperty(time);
		return this;
	}
	
	public AccomodationPage controlTransfer(){
		
		switchToLastWindow();
		return this;
	}
	
	
	
	public HotelPage clickOfHotelIcon(){
		clickByXpath(prop.getProperty("AccomdationPage.ClickOnHotelIcon.Xpath"));
		return new HotelPage(driver, test);
	}
	
	public AccomodationPage clickOfMenu(){
		
		clickByXpath(prop.getProperty("AccomdationPage.ClickOnMenu.Xpath"));
		return this;
		
	}
	
	public GalleryPage clickOnHillRailways(){
		
		clickByXpath(prop.getProperty("AccomdationPage.ClickonHillRailways.Xpath"));
		return new GalleryPage(driver, test);
	}
	
	public CharterPage clickOnCharter(){
		clickByXpath(prop.getProperty("AccomdationPage.ClickOnCharter.Xpath"));
		return new CharterPage(driver, test);
		
	}
	
	public AccomodationPage clickOnBookyourCoach(){
		
		clickByXpath(prop.getProperty("AccomdationPage.clickOnBookCoach"));
		return this;
	}
	
	public FTRPage againControlTransfer(){
		
		switchToLastWindow();
		return new  FTRPage(driver, test);
	}

}
