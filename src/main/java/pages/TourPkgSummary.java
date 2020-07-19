package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class TourPkgSummary extends GenericWrappers {
	
	public TourPkgSummary(RemoteWebDriver driver, ExtentTest test){
		
		this.driver = driver;
		this.test = test;
	}
	
	
	public TourPkgSummary getPrice(){
		
		getTextByXpath(prop.getProperty("TourPkgSummary.getPrice.Xpath"));
		return this;
	}
	
	public TourPkgSummary clickonTermsAndConditions(){
		
		clickByXpath(prop.getProperty("TourPkgSummary.termsnConditions.Xpath"));
		return this;
	}
	
	public TourPkgMakePayment clickOnMakepayment(){
		
		clickByXpath(prop.getProperty("TourPkgSummary.MakePayment.Xpath"));
		return new TourPkgMakePayment(driver, test);
	}


	

}
