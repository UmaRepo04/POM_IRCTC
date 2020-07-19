package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PackageDescriptionPage extends GenericWrappers{
	
	public PackageDescriptionPage(RemoteWebDriver driver,ExtentTest test){
		
		this.driver = driver;
		this.test = test;
		
	}
	
	public PackageDescriptionPage moveToPackagePage(){
		
		switchToLastWindow();
		return this;
	}
	
	public PackageDescriptionPage waitPack(long time){
		
		waitProperty(time);
		return this;
	}
	
	
	public TourBookingPage clickOnBookNow(){
		
		clickByXpath(prop.getProperty("PacDpage.clickOnBookNow.Xpath"));
		return new TourBookingPage(driver, test);
		
	}

}
