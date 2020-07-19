package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRPage extends GenericWrappers {
	
	public FTRPage(RemoteWebDriver driver, ExtentTest test){
		
		this.driver = driver;
		this.test = test;
		
	}
	
	public FTRPage waitPropFTR(long time){
		
		waitProperty(time);
		return this;
	}
	
	public PublicUserRegistrtion clickOnNewUSerSignUp(){
		
			clickByXpath(prop.getProperty("FTRPage.newUserSignUp.Xpath"));
			return new PublicUserRegistrtion(driver, test);		
		
	}
	
	

}
