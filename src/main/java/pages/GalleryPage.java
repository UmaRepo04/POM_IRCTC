package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class GalleryPage extends GenericWrappers{
	
	public GalleryPage(RemoteWebDriver driver, ExtentTest test){
		
		this.driver= driver;
		this.test  = test;
		
	}
	
	public GalleryPage waitGallery(long time){
		
		waitProperty(time);
		return this;
	}
	
	public GalleryPage moveToGallery(){
		
		switchToLastWindow();
		return this;
	}

	
	public PackageDescriptionPage clickBookNow()
	{
		
		clickByXpath(prop.getProperty("Gallerypage.clickOnBooknow.Xpath"));
		return new PackageDescriptionPage(driver, test);
	}
}
