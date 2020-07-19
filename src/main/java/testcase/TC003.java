package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccomodationPage;
import pages.FTRPage;
import pages.HomePage;
import pages.PublicUserRegistrtion;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass(){
		
		testname = "nationalVoters";
		testdesc = "To book your Coach or Train";
		browser = "chrome";
		
	}
	
	@Test
	public void nationalVoters(){
		
		
		new HomePage(driver, test)
		.clickOnCovidMessage()
		.clickOnStays()
		.clickOnLounge()
		.controlTransfer()
		.waitAccPage(3000)
		.clickOfMenu()
		.clickOnBookyourCoach()
		.againControlTransfer()
		.waitPropFTR(3000)
		.clickOnNewUSerSignUp()
		.waitPub(3000)
		.enterUserId("umairctc12")
		.enterPassword("Liberty@1234")
		.enterCnfPassword("Liberty@1234")
		.selectSecQuestion("Who was your Childhood hero?")
		.enterSecAnswer("VJS")
		.enterDOB("1996", "May")
		.clickOnGender()
		.clickOnMaritalStatus()
		.enterMailID("uma04eswari08@gmail.com")
		.selectOccupation("Government")
		.enterFname("Uma")
		.enterMname("Mageswari")
		.enterLname("Palaniappan")
		.waitPub(3000)
		.selectNationalaity("Indian")
		.enterResFlatNo("Sree sakthi Working Womens Hostel")
		.enterResStreet("Sekeran Nagar")
		.enterResArea("Perumbakkam")
		.selectCountry("India")
		.enterResMobileNo("8220015413")
		.enterResPincode("600100")
		.waitPub(5000)
		.selectResPostOffice("Medavakkam  S.O")
		.clickAddressisSameorNot()
		.waitPub(5000)
		.enterOffFlatNo("Wipro Tech")
		.enterOffStreet("Elcot Sez")
		.enteroffArea("Sozhinganallur")
		.waitPub(5000)
		.selectOffCountry("India")
		.enterOffMobileNo("8220015413")
		.enterOffPincode("600100")
		.waitPub(5000)
		.selectOffPostOffice("Medavakkam  S.O");	
		
		
	}

}
