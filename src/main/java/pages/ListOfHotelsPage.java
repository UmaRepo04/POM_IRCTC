package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ListOfHotelsPage extends GenericWrappers{
	
	public ListOfHotelsPage(RemoteWebDriver driver, ExtentTest test){
		
		this.driver=driver;
		this.test=test;
	}
	
	public ListOfHotelsPage waitList(long time){
		
		waitProperty(time);
		return this;
	}
	
	public HotelDetails clickOnBook(){
		
		clickByXpath(prop.getProperty("LoHp.clickOnBook.Xpath"));
		return new HotelDetails(driver, test);
		
	}
	

}
