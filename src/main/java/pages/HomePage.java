package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	
	
	
	
	public HomePage(RemoteWebDriver driver, ExtentTest test){
		
		this.driver =driver;
		this.test =test;
		
	}
	public HomePage clickOnCovidMessage(){
		
		clickByXpath(prop.getProperty("HomePage.CovidMessage.Xpath"));
		return this;
	}
	
	
	
	public HomePage clickOnStays(){
		
		clickByXpath(prop.getProperty("HomePage.Stays.Xpath"));
		//HomePage obj = new HomePage();	
		return this;
			}
	
	
	public AccomodationPage clickOnLounge(){
		
		clickByXpath(prop.getProperty("HomePage.Longue.Xpath"));
		
		return new AccomodationPage(driver, test);
		
	}
	
	public RegisterPage clickOnRegister(){
		
		
		clickByXpath(prop.getProperty("HomePage.Register.Xpath"));
		return new RegisterPage(driver, test);
	}
	
	
	
	
	

}
