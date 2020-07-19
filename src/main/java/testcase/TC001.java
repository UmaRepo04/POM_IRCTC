package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass(){
		
	testname="IRCTC Register"	;
	testdesc="Register into IRCTC website";
	browser ="chrome";	
	
		
	}
	
	
	@Test
	public void irctcRegister(){
		
	 new HomePage(driver, test)
	 .clickOnCovidMessage()
	 .clickOnRegister()
	 .regPageWaitProp(5000)
	 .enterUesrName("Liberty")
	 .enterPassword("Liberty$123")
	 .enterConfirmPassword("Liberty$123")
	 .selectSecurityQuestion()
	 .enterSecurityAnswer("VJS")
	 .selectPrefferedlanguage()
	 .enterFirstName("Uma")
	 .enterMiddleName("Mageswari")
	 .enterLastName("Palaniappan")
	 .selectGender()
	 .dateOfBirth("April", "1995")
	 .selectOccupation()
	 .clickMaritalStatus()
	 .enterEmail("uma04eswari08@gmail.com")
	 .enterMobile("9751364201")
	 .selectNationality("India")
	 .enterResAddr1("Sree Sakthi Working Womens Hostel")
	 .enterResAddr2("Sekaran Nagar")
	 .enterResAddr3("Perumbakkam")
	 .enterResPinCode("600100")
	 .enterResState("TamilNadu")
	 .selectResCity("Kanchipuram")
	 .selectResPostOffice("Medavakkam  S.O")
	 .enterResPhoneno("8220015413")
	 .clickSameAddress()
	 .regPageWaitProp(3000)
	 .enterOffAddr1("Wipro")
	 .enterOffAddr2("Elcot")
	 .enterOffAddr3("Sozhinganallur")
	 .enterOffPinCode("600100")
	 .regPageWaitProp(3000)
	 .enterOffState("TamilNadu")
	 .selectOffCity("Kanchipuram")
	 .selectOffPostOffice("Medavakkam  S.O")
	 .enterOffPhoneno("8220015413");
	 
		
		
		
		
		
		
		
		
		
		
	}

}
