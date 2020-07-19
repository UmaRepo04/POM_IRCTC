package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class TourPkgsPassenger extends GenericWrappers{
	
	public TourPkgsPassenger(RemoteWebDriver driver, ExtentTest test){
		
		this.driver = driver;
		this.test = test;
	}

	
	public TourPkgsPassenger enterFName1(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.enterFname1.Xpath"), data);
		return this;
		
	}
	
	public TourPkgsPassenger enterLName1(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.enterLname1.Xpath"), data);
		return this;
	}
	
	public TourPkgsPassenger enterAge1(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.enterAge1.Xpath"), data);
		return this;
	}
	
	public TourPkgsPassenger enterGender1(String value){
		
		selectVisibileTextByXpath(prop.getProperty("TourPkgsPass.enterGender1.Xpath"), value);
		return this;
	}
	
	public TourPkgsPassenger enterFName2(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.enterFname2.Xpath"), data);
		return this;
		
	}
	
	public TourPkgsPassenger enterLName2(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.enterLname2.Xpath"), data);
		return this;
	}
	
	public TourPkgsPassenger enterAge2(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.enterAge2.Xpath"), data);
		return this;
	}
	
	public TourPkgsPassenger enterGender2(String value){
		
		selectVisibileTextByXpath(prop.getProperty("TourPkgsPass.enterGender2.Xpath"), value);
		return this;
	}
	
	public TourPkgsPassenger enterFName3(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.enterFname3.Xpath"), data);
		return this;
		
	}
	
	public TourPkgsPassenger enterLName3(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.enterLname3.Xpath"), data);
		return this;
	}
	
	public TourPkgsPassenger enterAge3(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.enterAge3.Xpath"), data);
		return this;
	}
	
	public TourPkgsPassenger enterGender3(String value){
		
		selectVisibileTextByXpath(prop.getProperty("TourPkgsPass.enterGender3.Xpath"), value);
		return this;
	}
	
	public TourPkgsPassenger enterNomineeName(String value){
		
		enterByXpath(prop.getProperty("TourPkgsPass.enterNomineeName.Xpath"), value);
		return this;
	}
	
	public TourPkgsPassenger enterNomineeRelation(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.NomineeRelation.Xpath"), data);
		return this;
	}
	
	public TourPkgsPassenger enterNomineeContact(String value){
		
		enterByXpath(prop.getProperty("TourPkgsPass.NomineeContact.Xpath"), value);
		return this;
	}
	
	
	public TourPkgsPassenger enterGst(String value){
		
		selectVisibileTextByXpath(prop.getProperty("TourPkgsPass.GST.Xpath"), value);
		return this;
		
	}
	
	public TourPkgsPassenger enterPhoneNumber(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.PhoneNo.Xpath"), data);
		return this;
	}
	
	public TourPkgsPassenger enterFaxNo(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.FaxNo.Xpath"), data);
		return this;
	}
	
	public TourPkgsPassenger enterAddress(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.Address.Xpath"), data);
		return this;
	}
	
	public TourPkgsPassenger enterCity(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.City.Xpath"), data);
		return this;
	}
	
	public TourPkgsPassenger selectStateName(String value){

		selectVisibileTextByXpath(prop.getProperty("TourPkgsPass.state.Xpath"), value);
		return this;
	}
	
	public TourPkgsPassenger selectIDType(String Value){
		
		selectVisibileTextByXpath(prop.getProperty("TouPkgsPass.IDType.Xpath"), Value);
		return this;
	}
	
	public TourPkgsPassenger enterIDCardNo(String data){
		
		enterByXpath(prop.getProperty("TourPkgsPass.CardNo.Xpath"), data);
		return this;
	}
	
	public TourPkgSummary clickOnSubmit(){
		
		clickByXpath(prop.getProperty("TourPkgsPass.Submit.Xpath"));
		return new TourPkgSummary(driver, test);	
		
	}
	
	
	
}
