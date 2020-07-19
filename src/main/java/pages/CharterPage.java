package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	
	public CharterPage(RemoteWebDriver driver , ExtentTest test){
		
		this.driver = driver;
		
		this.test = test;
		
		
	}
	
	public CharterPage waitCharter(long time){
		
		waitProperty(time);
		return this;
	}
	
	
	public CharterPage clickOnEnquiryForm(){
		
		clickByXpath(prop.getProperty("CharterPage.clickOnEnquiryForm.Xpath"));
		return this;
	}
	
	public CharterPage enterNameOfApplicant(String data){
		
		enterByXpath(prop.getProperty("CharterPage.enterNameOfApplicant.Xpath"), data);
		return this;
	}
	
	public CharterPage enterNameOfOrganisation(String data){
		
		enterByXpath(prop.getProperty("CharterPage.enterNameOfOrg.Xpath"), data);
		return this;
	}
	
	public CharterPage enterAddress(String data){
		
		enterByXpath(prop.getProperty("CharterPage.enterAddress.Xpath"), data);
		return this;
	}
	
	public CharterPage enterMobileNo(String data){
		
		enterByXpath(prop.getProperty("CharterPage.enterMobileNo.Xpath"), data);
		return this;
	}
	
	public CharterPage enterEmail(String data){
		
		enterByXpath(prop.getProperty("CharterPage.enterEmail.Xpath"), data);
		return this;
	}
	
	public CharterPage selectRequestFor(String value){
		
		selectVisibileTextByXpath(prop.getProperty("CharterPage.selectReqFor.Xpath"), value);
		return this;
	}
	
	public CharterPage enterOrginationStation(String data){
		
		enterByXpath(prop.getProperty("CharterPage.enterorginStat.Xpath"), data);
		return this;
	}
	
	public CharterPage enterDestinationStation(String data){
		
		enterByXpath(prop.getProperty("CharterPage.enterDestStat.Xpath"), data);
		return this;
	}
	
	public CharterPage enterDateOfDepature(){
		
		clickByXpath(prop.getProperty("CharterPage.enterDOD.Xpath"));
		waitProperty(3000);
		clickByXpath(prop.getProperty("Charterpage.ClickdateDOD.Xpath"));
		return this;
		
	}
	
	
	public CharterPage enterDateOfArrival(){
		
		clickByXpath(prop.getProperty("CharterPage.enterDOA.Xpath"));
		waitProperty(3000);
		clickByXpath(prop.getProperty("CharterPage.clickdateinDOA.Xpath"));
		return this;
	}
	
	public CharterPage enterDurationOfTour(String data){
		enterByXpath(prop.getProperty("CharterPage.enterDurodTour.Xpath"), data);
		return this;
	}
	
	public CharterPage enterTypeOfCoach(String data){
		enterByXpath(prop.getProperty("CharterPage.enterTypeOfCoach.Xpath"), data);
		return this;
	}
	
	public CharterPage enterNoOfPassengers(String data){
		
		enterByXpath(prop.getProperty("CharterPage.enterNoofPassengers.Xpath"), data);
		return this;
	}
	
	public CharterPage enterPurposeOfCharter(String data){
		
		enterByXpath(prop.getProperty("CharterPage.enterPurposeOfCharter.Xpath"), data);
		return this;
	}
	
	public CharterPage enterAdditionalSerives(String data){
		
		enterByXpath(prop.getProperty("CharterPage.enterAddServices.Xpath"), data);
		return this;
	}
	
	public CharterPage clickOnSubmit(){
		
		clickByXpath(prop.getProperty("CharterPage.clickOnSubmit.Xpath"));
		return this;
	}
	
	public void waitPropCharPage(Long time){
		
		waitProperty(time);
	}
	

}
