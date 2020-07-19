package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelSummaryPage extends GenericWrappers{
	
	public HotelSummaryPage(RemoteWebDriver driver, ExtentTest test){
		
		this.driver= driver;
		this.test = test;
		
	}
	
	public HotelSummaryPage waitSummary(long time){
		
		waitProperty(time);
		return this;
	}

	public HotelSummaryPage clickTermsandConditions(){
		
		clickByXpath(prop.getProperty("HotelSPage.clickonTermsnConditions.Xpath"));
		return this;
	}
	
	public HotelSummaryPage getHotelName(){
		getTextByXpath(prop.getProperty("HotelSpage.getHotelName.Xpath"));
		return this;
	}
	
	public HotelSummaryPage getPrice(){
		getTextByXpath(prop.getProperty("HotelSPage.getPrice.Xpath"));
		return this;
	}
	
	public HotelSummaryPage clickOnMakePayment(){
		
		clickByXpath(prop.getProperty("HotelSPage.clcikOnMakePayment.Xpath"));
		return this;
	}
}
