package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class TourPkgsLogin extends GenericWrappers {
	
	public TourPkgsLogin(RemoteWebDriver driver, ExtentTest test){
		
		this.driver = driver;
		this.test = test;
	}
	
	
	public TourPkgsLogin clickOnGuestUserLogin(){
		
		clickByXpath(prop.getProperty("TourPkgsLogin.clickOnGuestUserLogin.Xpath"));
		return this;
	}
	
	public TourPkgsLogin enterLoginDetails(String data, String data1){
		
		enterByXpath(prop.getProperty("TourPkgsLogin.enterEmail.Xpath"), data);
		enterByXpath(prop.getProperty("TourPkgsLogin.enterMobile.Xpath"), data1);
		return this;
	}
	
	public TourPkgsPassenger clickOnLogIn(){
		
		clickByXpath(prop.getProperty("TourPkgsLogin.clickOnLogIn.Xpath"));
		return new TourPkgsPassenger(driver, test);
	}

}
