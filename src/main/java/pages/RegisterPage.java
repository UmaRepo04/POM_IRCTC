package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegisterPage extends GenericWrappers{
	
	
	public RegisterPage(RemoteWebDriver driver, ExtentTest test){
		
	this.driver=driver;
	this.test=test;
	}
	
public RegisterPage regPageWaitProp(long data){
		
		waitProperty(data);
		return this;
	}
	
	public RegisterPage enterUesrName(String data){
		
		enterByXpath(prop.getProperty("RegisterPage.UserName.Xpath"), data);
		return this;
	}
	
	
	public RegisterPage enterPassword(String data){
		
		enterByXpath(prop.getProperty("RegisterPage.Password.Xpath"), data);
		return this;
	}
	
	public RegisterPage enterConfirmPassword(String data){
		
		enterByXpath(prop.getProperty("RegisterPage.CnfPassword.Xpath"), data);
		return this;
	}
	
	public RegisterPage selectSecurityQuestion(){
		clickByXpath(prop.getProperty("RegisterPage.SelectSecQn.Xpath"));
		clickByXpath(prop.getProperty("RegisterPage.SelectSecQn1.Xpath"));
		return this;
	}
	
	public RegisterPage enterSecurityAnswer(String data){
		
		enterByXpath(prop.getProperty("RegisterPage.EnterSecAns.Xpath"), data);
		return this;
	}
	
	public RegisterPage selectPrefferedlanguage(){
		
		clickByXpath(prop.getProperty("RegisterPage.SelectPreferedLang.Xpath"));
		clickByXpath(prop.getProperty("RegisterPage.selectPrefferedLang1.Xpath"));
		return this;
	}
	
	public RegisterPage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("RegisterPage.enterFirstName.Xpath"), data);
		return this;
		
	}
	
	public RegisterPage enterMiddleName(String data) {
		
		enterByXpath(prop.getProperty("RegisterPage.enterMiddleName.Xpath"), data);
		return this;
	}
	
	public RegisterPage enterLastName(String data) {
		enterByXpath(prop.getProperty("RegisterPage.enterLastName.Xpath"), data);
		return this;
	}
	
	public RegisterPage selectGender(){
		clickByXpath(prop.getProperty("RegisterPage.selectGender.Xpath"));
		return this;
	}
	
	public RegisterPage dateOfBirth(String month, String year){
		clickByXpath(prop.getProperty("RegisterPage.selectDOB.Xpath"));
		selectVisibileTextByXpath(prop.getProperty("RegisterPage.selectMonth.Xpath"), month);
		selectVisibileTextByXpath(prop.getProperty("RegisterPage.selectYear.Xpath"), year);
		clickByXpath(prop.getProperty("RegisterPage.ClickDate.Xpath"));
		return this;
	}
	
	public RegisterPage selectOccupation(){
		clickByXpath(prop.getProperty("RegisterPage.selectOccupation.Xpath"));
		clickByXpath(prop.getProperty("RegisterPage.selectOccupation1.Xpath"));
		return this;
	}
	
	public RegisterPage clickMaritalStatus(){
		clickByXpath(prop.getProperty("RegisterPage.clickMaritalStatus.Xpath"));
		return this;
	}
	
	public RegisterPage enterEmail(String data){
		enterByXpath(prop.getProperty("RegisterPage.enterEmail.Xpath"), data);
		return this;
		
	}
	
	public RegisterPage enterMobile(String data){
		enterByXpath(prop.getProperty("RegisterPage.enterMobile.Xpath"), data);
		return this;
	}
	
	public RegisterPage selectNationality(String value){
		
		selectVisibileTextByXpath(prop.getProperty("RegisterPage.selectNationalaity.Xpath"), value);
		return this;
	}
	
	public RegisterPage enterResAddr1(String data){
		
		enterByXpath(prop.getProperty("RegisterPage.enterResAddr1.Xpath"), data);
		return this;
	}
	
	public RegisterPage enterResAddr2(String data){
		
		enterByXpath(prop.getProperty("RegisterPage.enterResAddr2.Xpath"), data);
		return this;
	}
	
	public RegisterPage enterResAddr3(String data) {
		
		enterByXpath(prop.getProperty("RegisterPage.enterResAddr3.Xpath"), data);
		return this;
	}
	
	public RegisterPage enterResPinCode(String data){
		
		enterByXpath(prop.getProperty("RegisterPage.enterResPinCode.Xpath"), data);
		return this;
	}
	
	public RegisterPage enterResState(String data){
		
		enterByXpath(prop.getProperty("RegisterPage.enterResState.Xpath"), data);
		return this;
	}
	
	public RegisterPage selectResCity(String value){
		
		selectVisibileTextByXpath(prop.getProperty("RegisterPage.enterResCity.Xpath"), value);
		return this;
				
	}
	
	public RegisterPage selectResPostOffice(String value){
		
		selectVisibileTextByXpath(prop.getProperty("RegisterPage.enterResPostOffice.Xpath"), value);
		return this;
	}
	
	public RegisterPage enterResPhoneno(String data){
		enterByXpath(prop.getProperty("RegisterPage.enterResPhnNo.Xpath"), data);
		return this;
	}
	
	public RegisterPage clickSameAddress(){
		clickByXpath(prop.getProperty("RegisterPage.clickSameAddress"));
		return this;
	}
	
public RegisterPage enterOffAddr1(String data){
		
		enterByXpath(prop.getProperty("RegisterPage.enterOffAddr1.Xpath"), data);
		return this;
	}
	
	public RegisterPage enterOffAddr2(String data){
		
		enterByXpath(prop.getProperty("RegisterPage.enterOffAddr2.Xpath"), data);
		return this;
	}
	
	public RegisterPage enterOffAddr3(String data) {
		
		enterByXpath(prop.getProperty("RegisterPage.enterOffAddr3.Xpath"), data);
		return this;
	}
	
	public RegisterPage enterOffPinCode(String data){
		
		enterByXpath(prop.getProperty("RegisterPage.enterOffPinCode.Xpath"),data);
		return this;
	}
	
	public RegisterPage enterOffState(String data){
		
		enterByXpath(prop.getProperty("RegisterPage.enterOffState.Xpath"), data);
		return this;
	}
	
	public RegisterPage selectOffCity(String value){
		
		selectVisibileTextByXpath(prop.getProperty("RegisterPage.enterOffCity.Xpath"), value);
		return this;
				
	}
	
	public RegisterPage selectOffPostOffice(String value){
		
		selectVisibileTextByXpath(prop.getProperty("RegisterPage.enterOffPostOffice.Xpath"), value);
		return this;
	}
	
	public RegisterPage enterOffPhoneno(String data){
		enterByXpath(prop.getProperty("RegisterPage.enterOffPhnNo.Xpath"), data);
		return this;
	}
	
	public RegisterPage checkTermsAndConditions(){
		clickByXpath(prop.getProperty("RegisterPage.checkTermsAndConditions"));
		return this;
	}
	
	public void RegPageWait(Long time){
		waitProperty(time);
	}
}
