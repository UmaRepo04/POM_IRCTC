package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class TourPkgMakePayment extends GenericWrappers {
	
	public TourPkgMakePayment(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
	
	public TourPkgMakePayment getTransactionAmount(String value){
		
		
		
		
		getAttribute(prop.getProperty("TourPkgMakePAyment.TransactionAmount.Xpath"), value);
		return this;
		
	}

}
