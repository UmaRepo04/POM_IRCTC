package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PublicUserRegistrtion extends GenericWrappers{
	
	public PublicUserRegistrtion(RemoteWebDriver driver, ExtentTest test){
		
		this.driver = driver;
		this.test = test;
	}
	
	public PublicUserRegistrtion waitPub(long time){
		
		waitProperty(time);
		return this;
	}
	
	
	public PublicUserRegistrtion enterUserId(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterUserId.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion enterPassword(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterPassword.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion enterCnfPassword(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterCnfPassword.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion selectSecQuestion(String value){
		
		selectVisibileTextByXpath(prop.getProperty("PURPage.selectSecQn.xpath"), value);
		return this;
	}
	
	public PublicUserRegistrtion enterSecAnswer(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterSecAns.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion enterDOB(String value,String Value1){
		
		clickByXpath(prop.getProperty("PURPage.enterDOB.Xpath"));
		waitProperty(3000L);
		selectVisibileTextByXpath(prop.getProperty("PURPage.enterYear.Xpath"), value);
		selectVisibileTextByXpath(prop.getProperty("PURPage.enterMonth.Xpath"), Value1);
		waitProperty(3000L);
		clickByXpath(prop.getProperty("PURPAge.enterDate.Xpath"));
		return this;
	}
	
	public PublicUserRegistrtion clickOnGender(){
		
		clickByXpath(prop.getProperty("PURPage.clickOnGender.Xpath"));
		return this;
	}
	
	public PublicUserRegistrtion clickOnMaritalStatus(){
		
		clickByXpath(prop.getProperty("PURPAge.clickOnMaritalStatus.Xpath"));
		return this;
	}
	
	public PublicUserRegistrtion enterMailID(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterEmailId.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion selectOccupation(String value){
		
		selectVisibileTextByXpath(prop.getProperty("PURPage.selectoccupation.Xpath"), value);
		return this;
	}
	
	public PublicUserRegistrtion enterFname(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterFName.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion enterMname(String data){
		
		enterByXpath(prop.getProperty("PURPAge.enterMname.Xpath"), data);
		return this;
	}
	public PublicUserRegistrtion enterLname(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterLname.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion selectNationalaity(String value){
		
		selectVisibileTextByXpath(prop.getProperty("PURPAge.selectNationality.Xpath"), value);
		return this;
	}
	
	public PublicUserRegistrtion enterResFlatNo(String data){
		
		enterByXpath(prop.getProperty("PURpage.enterResFlatNo.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion enterResStreet(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterResStreet.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion enterResArea(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterResArea.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion selectCountry(String value){
		
		selectVisibileTextByXpath(prop.getProperty("PURPage.selectCountry.Xpath"), value);
		return this;
	}
	
	public PublicUserRegistrtion enterResMobileNo(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterResMobileNo.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion enterResPincode(String data){
		
		enterByXpath(prop.getProperty("PURPAge.enterResPinCode.Xpath"), data);
		keyboradOperationByXpath(prop.getProperty("PURPAge.enterResPinCode.Xpath"), "tab");
		return this;
	}
	
	public PublicUserRegistrtion selectResCity(String value){
		
		selectVisibileTextByXpath(prop.getProperty("PURPage.enterResCity.Xpath"), value);
		return this;
	}
	
	public PublicUserRegistrtion selectResState(String value){
		
		selectVisibileTextByXpath(prop.getProperty("PURPage.selectResState.Xpath"), value);
		return this;
	}
	
	public PublicUserRegistrtion selectResPostOffice(String value){
		
		selectVisibileTextByXpath(prop.getProperty("PURPage.selectResPO.Xpath"), value);
		return this;
	}
	
	public PublicUserRegistrtion clickAddressisSameorNot(){
		
		clickByXpath(prop.getProperty("PURPage.clickAddressisSameorNot.Xpath"));
		return this;
	}
	
public PublicUserRegistrtion enterOffFlatNo(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterOffFlat.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion enterOffStreet(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterOffStreet.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion enteroffArea(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterOffArea.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion selectOffCountry(String value){
		
		selectVisibileTextByXpath(prop.getProperty("PURPage.enterOffCountry.Xpath"), value);
		return this;
	}
	
	public PublicUserRegistrtion enterOffMobileNo(String data){
		
		enterByXpath(prop.getProperty("PURPAge.enterOffMobileNo.Xpath"), data);
		return this;
	}
	
	public PublicUserRegistrtion enterOffPincode(String data){
		
		enterByXpath(prop.getProperty("PURPage.enterOffPinCode.Xpath"), data);
		keyboradOperationByXpath(prop.getProperty("PURPage.enterOffPinCode.Xpath"), "tab");
		return this;
	}
	
	public PublicUserRegistrtion selectOffCity(String value){
		
		selectVisibileTextByXpath(prop.getProperty("PURPAge.selectOffCity.Xpath"), value);
		return this;
	}
	
	public PublicUserRegistrtion selectOffState(String value){
		
		selectVisibileTextByXpath(prop.getProperty("PURPage.selectOffState.Xpath"), value);
		return this;
	}
	
	public PublicUserRegistrtion selectOffPostOffice(String value){
		
		selectVisibileTextByXpath(prop.getProperty("PURPage.selectOFFPO.Xpath"), value);
		return this;
	}
	
	
	
	

}
