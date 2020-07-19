package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PassengerDetailsPage extends GenericWrappers{
	
	public PassengerDetailsPage(RemoteWebDriver driver, ExtentTest test){
		
		this.driver = driver;
		this.test = test;
		
	}
	public PassengerDetailsPage waitPass(long time){
		
		waitProperty(time);
		return this;
	}
	
	public PassengerDetailsPage enterTitle(String data){
		
		selectVisibileTextByXpath(prop.getProperty("PassengerDetails.enterTitle.Xpath"), data);
		return this;
	}
	
	public PassengerDetailsPage enterFirstName(String data){
		enterByXpath(prop.getProperty("PassengerDetails.enterFirstname.Xpath"), data);
		return this;
	}
	
	public PassengerDetailsPage enterLastName(String data){
		enterByXpath(prop.getProperty("PassengerDetails.enterLastName.Xpath"), data);
		return this;
	}
	
	public PassengerDetailsPage selectGst(String value){
		selectVisibileTextByXpath(prop.getProperty("PassengerDetails.enterGST.Xpath"), value);
		return this;
	}
	
	public PassengerDetailsPage enterGstNumber(String data){
		
		enterByXpath(prop.getProperty("PassengerDetails.enterGSTNO.Xpath"), data);
		return this;
	}
	
	public PassengerDetailsPage enterCompanyName(String data){
		
		enterByXpath(prop.getProperty("PassengerDetails.enterCompanyNmae.Xpath"), data);
		return this;
	}
	
	public PassengerDetailsPage enterCompanyAddress(String data){
		
		enterByXpath(prop.getProperty("PassengerDetails.enterComAddress.Xpath"), data);
		return this;
	}
	
	public HotelSummaryPage clickGoButton(){
		clickByXpath(prop.getProperty("PassengerDetails.clickOnGo.Xpath"));
		return new HotelSummaryPage(driver, test);
		
	}
	


}
