package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{
	
public	RemoteWebDriver driver;
public String browser;	
public static Properties prop;


  public void loadObject(){
	  
	  
	  try {
		prop = new Properties();
		  
		  prop.load(new FileInputStream("D:\\Selenium Workspace\\POM_IRCTC\\src\\test\\java\\Object.properties"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  public void unloadObject(){
	  
	  prop=null;
  }
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();			
			}
			else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			driver.get(url);
			
			reportStep("pass", "Given Browser " +browser+" is launched and loaded with given URL " +url+" Successfully.");
			//\system.out.println("Given Browser " +browser+" is launched and loaded with given URL " +url+" Successfully.");
		} catch (UnreachableBrowserException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("The given browser "+browser+" is Unreachable");
			reportStep("fail", "The given browser "+browser+" is Unreachable");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.out.println("Given browser "+browser+" is stopped due to some unknown errors.");
			reportStep("Fail", "Given browser "+browser+" is stopped due to some unknown errors.");
		}catch (IllegalArgumentException e) {
			//\system.err.println("Arguments passed in setProperty Method is not valid");
			reportStep("Fail", "Arguments passed in setProperty Method is not valid");
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
			//\system.err.println("Unknown error happened while launching the browser");
			reportStep("Fail", "Unknown error happened while launching the browser");
		}	
		
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//\system.out.println("Given Element with id "+idValue+ " is found and sent with the value "+data);
			reportStep("pass", "Given Element with id "+idValue+ " is found and sent with the value "+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with id "+idValue+ " is not found in the application.");
			reportStep("fail", "Given Element with id "+idValue+ " is not found in the application.");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with id "+idValue+ " is not visible in the application.");
			reportStep("fail", "Given Element with id "+idValue+ " is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with id "+idValue+" is not interactable in the application.");
			reportStep("fail", "Given Element with id "+idValue+" is not interactable in the application.");
		}catch (StaleElementReferenceException e) {
			//\system.err.println("Given Element with id "+idValue+ " is not stable in the application.");
			reportStep("fail", "Given Element with id "+idValue+ " is not stable in the application.");
			// TODO: handle exception
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed in enterById method is not valid");
			reportStep("fail", "Arguments passed in enterById method is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser is closed due to some unknown errors");
			reportStep("fail", "Browser is closed due to some unknown errors");
		}
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//\system.out.println("Given Element with id "+nameValue+ " is found and sent with the value "+data);
			reportStep("pass", "Given Element with id "+nameValue+ " is found and sent with the value "+data);
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with name "+nameValue+ " is not found in the application.");
			reportStep("fail", "Given Element with name "+nameValue+ " is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with name "+nameValue+ " is not visible in the application.");
			reportStep("fail", "Given Element with name "+nameValue+ " is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with name "+nameValue+" is not interactable in the application.");
			reportStep("fail", "Given Element with name "+nameValue+" is not interactable in the application.");
		}catch (StaleElementReferenceException e) {
			//\system.err.println("Given Element with name "+nameValue+ " is not stable in the application.");
			// TODO: handle exception
			reportStep("fail", "Given Element with name "+nameValue+" is not interactable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed in enterByName method is not valid");
			reportStep("fail", "Arguments passed in enterByName method is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser is closed due to some unknown errors");
			reportStep("fail", "Browser is closed due to some unknown errors");
		}
				
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			reportStep("pass", "Given Element with xpath "+xpathValue+ " is passed with the value."+data);
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with xpath "+xpathValue+ " is not found in the application.");
			reportStep("fail", "Given Element with xpath "+xpathValue+ " is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with xpath "+xpathValue+ " is not visible in the application.");
			reportStep("fail", "Given Element with xpath "+xpathValue+ " is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with xpath "+xpathValue+" is not interactable in the application.");
			reportStep("fail", "Given Element with xpath "+xpathValue+" is not interactable in the application.");
		}catch (StaleElementReferenceException e) {
			//\system.err.println("Given Element with xpath "+xpathValue+ " is not stable in the application.");
			// TODO: handle exception
			reportStep("fail", "Given Element with xpath "+xpathValue+ " is not stable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed in enterByXpath method is not valid");
			reportStep("fail", "Arguments passed in enterByXpath method is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser is closed due to some unknown errors");
			reportStep("fail", "Browser is closed due to some unknown errors");
		}
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualtitle = driver.getTitle();
			if(actualtitle.equals(title)){
				//\system.out.println("Given Title "+title+" Matches with the the title "+actualtitle+" of the Application");
				reportStep("pass", "Given Title "+title+" Matches with the the title "+actualtitle+" of the Application");
			}else{
				//\system.err.println("Given Title "+title+" do not Match with the the title "+actualtitle+" of the Application");
				reportStep("fail", "Given Title "+title+" do not Match with the the title "+actualtitle+" of the Application");
			}
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with title "+title+ " is not found in the application.");
			reportStep("fail","Given Element with title "+title+ " is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with title "+title+ " is not visible in the application.");
			reportStep("fail", "Given Element with title "+title+ " is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with title "+title+" is not interactable in the application.");
			reportStep("fail", "Given Element with title "+title+" is not interactable in the application.");
		}catch (StaleElementReferenceException e) {
			//\system.err.println("Given Element with title "+title+ " is not stable in the application.");
			reportStep("fail", "Given Element with title "+title+ " is not stable in the application.");
			// TODO: handle exception
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed in verifyTitle method is not valid");
			reportStep("fail", "Arguments passed in verifyTitle method is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser is closed due to some unknown errors");
			reportStep("fail", "Browser is closed due to some unknown errors");
		}catch (Exception e) {
			// TODO: handle exception
			//\system.err.println("Unknown error happened while Verifying title");
			reportStep("fail", "Unknown error happened while Verifying title");
		}
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementById(id).getText();
			if(actualtext.equals(text))
			{
				//\system.out.println("Given Text "+text+" matches with the text in the given element with IDvalue"+id);
				reportStep("pass", "Given Text "+text+" matches with the text in the given element with IDvalue"+id);
			}else {
				//\system.err.println("Given Text "+text+" do not match with the text in the given element with IDvalue"+id);
				reportStep("fail", "Given Text "+text+" do not match with the text in the given element with IDvalue"+id);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with text "+text+ " is not found in the application.");
			reportStep("fail", "Given Element with text "+text+ " is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with text "+text+ " is not visible in the application.");
			reportStep("fail", "Given Element with text "+text+ " is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with text "+text+" is not interactable in the application.");
			reportStep("fail", "Given Element with text "+text+" is not interactable in the application.");
		}catch (StaleElementReferenceException e) {
			//\system.err.println("Given Element with text "+text+ " is not stable in the application.");
			reportStep("fail", "Given Element with text "+text+ " is not stable in the application.");
			// TODO: handle exception
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed in verifyTextById method is not valid");
			reportStep("fail", "Arguments passed in verifyTextById method is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser is closed due to some unknown errors");
			reportStep("fail", "Browser is closed due to some unknown errors");
		}catch (Exception e) {
			// TODO: handle exception
			//\system.err.println("Unknown error happened while entering values by name");
			reportStep("fail", "Unknown error happened while entering values by name");
		}
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			if (actualtext.equalsIgnoreCase(text)) {
				//\system.out.println("Given Text " +text+" matches with the text in the given element in the given xpath with the text" +xpath);
				reportStep("pass", "Given Text " +text+" matches with the text in the given element in the given xpath with the text" +xpath);
			}else {
				//\system.err.println("Given Text " +text+" do not match with the text in the given element in the given xpath with the text" +xpath);
				reportStep("fail", "Given Text " +text+" do not match with the text in the given element in the given xpath with the text" +xpath);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with text "+text+ " is not found in the application.");
			reportStep("fail", "Given Element with text "+text+ " is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with text "+text+ " is not visible in the application.");
			reportStep("fail", "Given Element with text "+text+ " is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with text "+text+" is not interactable in the application.");
			reportStep("fail", "Given Element with text "+text+" is not interactable in the application.");
		}catch (StaleElementReferenceException e) {
			//\system.err.println("Given Element with text "+text+ " is not stable in the application.");
			// TODO: handle exception
			reportStep("fail", "Given Element with text "+text+ " is not stable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed in verifyTextByXpath method is not valid");
			reportStep("fail", "Arguments passed in verifyTextByXpath method is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser is closed due to some unknown errors");
			reportStep("fail", "Browser is closed due to some unknown errors");
		}catch (Exception e) {
			// TODO: handle exception
			//\system.err.println("Unknown error happened while entering values by name");
			reportStep("fail", "Unknown error happened while entering values by name");
		}
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			if (actualtext.contains(text)) {
				//\system.out.println("Given text "+text+" is present inside the text of given element with xpath value "+xpath);
				reportStep("pass", "Given text "+text+" is present inside the text of given element with xpath value "+xpath);
			}else {
				//\system.err.println("Given text "+text+" is not present inside the text of given element with xpath value "+xpath);
				reportStep("fail", "Given text "+text+" is not present inside the text of given element with xpath value "+xpath);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with text "+text+ " is not found in the application.");
			reportStep("fail", "Given Element with text "+text+ " is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with text "+text+ " is not visible in the application.");
			reportStep("fail", "Given Element with text "+text+ " is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with text "+text+" is not interactable in the application.");
			reportStep("fail", "Given Element with text "+text+" is not interactable in the application.");
		}catch (StaleElementReferenceException e) {
			//\system.err.println("Given Element with text "+text+ " is not stable in the application.");
			reportStep("fail", "Given Element with text "+text+ " is not stable in the application.");
			// TODO: handle exception
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed in verifyTextContainsByXpath method is not valid");
			reportStep("fail", "Arguments passed in verifyTextContainsByXpath method is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser is closed due to some unknown errors");
			reportStep("fail", "Browser is closed due to some unknown errors");
		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//\system.out.println("Given element with id value "+id+" is clicked Successfully.");
			reportStep("pass", "Given element with id value "+id+" is clicked Successfully.");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given element with id value "+id+" is not found in the application.");
			reportStep("fail", "Given element with id value "+id+" is not found in the application.");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the given element with id value "+id);
			reportStep("fail", "Unable to click the given element with id value "+id);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given element with id value "+id+" is not visible in the application.");
			reportStep("fail", "Given element with id value "+id+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given element with id value "+id+" is not interactable in the application.");
			reportStep("fail", "Given element with id value "+id+" is not interactable in the application.");
		}catch (StaleElementReferenceException e) {
			//\system.err.println("Given element with id value "+id+" is not stable in the application.");
			reportStep("fail", "Given element with id value "+id+" is not stable in the application.");
			// TODO: handle exception
		}catch (InvalidElementStateException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the element with id value "+id+" which is in invalid state");
			reportStep("fail", "Unable to click the element with id value "+id+" which is in invalid state");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed in clickById method is not valid");
			reportStep("fail", "Arguments passed in clickById method is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser is closed due to some unknown errors");
			reportStep("fail", "Browser is closed due to some unknown errors");
		}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//\system.out.println("Given element with Class Name "+classVal+" is clicked Successfully.");
			reportStep("pass", "Given element with Class Name "+classVal+" is clicked Successfully.");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given element with Class Name "+classVal+" is not found in the application.");
			reportStep("fail", "Given element with Class Name "+classVal+" is not found in the application.");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the given element with Class Name "+classVal);
			reportStep("fail", "Unable to click the given element with Class Name "+classVal);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given element with Class Name "+classVal+" is not visible in the application.");
			reportStep("fail", "Given element with Class Name "+classVal+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given element with Class Name "+classVal+" is not interactable in the application.");
			reportStep("fail", "Given element with Class Name "+classVal+" is not interactable in the application.");
		}catch (StaleElementReferenceException e) {
			//\system.err.println("Given element with Class Name "+classVal+" is not stable in the application.");
			reportStep("fail", "Given element with Class Name "+classVal+" is not stable in the application.");
			// TODO: handle exception
		}catch (InvalidElementStateException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the element with Class Name "+classVal+" which is in invalid state");
			reportStep("fail", "Unable to click the element with Class Name "+classVal+" which is in invalid state");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed in clickByClassName method is not valid");
			reportStep("fail", "Arguments passed in clickByClassName method is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser is closed due to some unknown errors");
			reportStep("fail", "Browser is closed due to some unknown errors");
		}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//\system.out.println("Given element with Name "+name+" is clicked Successfully.");
			reportStep("pass", "Given element with Name "+name+" is clicked Successfully.");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given element with Name "+name+" is not found in the application.");
			reportStep("fail", "Given element with Name "+name+" is not found in the application.");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the given element with Name "+name);
			reportStep("fail", "Unable to click the given element with Name "+name);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given element with Name "+name+" is not visible in the application.");
			reportStep("fail", "Given element with Name "+name+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given element with Name "+name+" is not interactable in the application.");
			reportStep("fail", "Given element with Name "+name+" is not interactable in the application.");
		}catch (StaleElementReferenceException e) {
			//\system.err.println("Given element with Name "+name+" is not stable in the application.");
			// TODO: handle exception
			reportStep("fail", "Given element with Name "+name+" is not stable in the application.");
		}catch (InvalidElementStateException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the element with Name "+name+" which is in invalid state");
			reportStep("fail", "Unable to click the element with Name "+name+" which is in invalid state");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed in clickByName method is not valid");
			reportStep("fail", "Arguments passed in clickByName method is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser is closed due to some unknown errors");
			reportStep("fail", "Browser is closed due to some unknown errors");
		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//\system.out.println("Given element with link text "+name+" is clicked successfully.");
			reportStep("pass", "Given element with link text "+name+" is clicked successfully.");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given element with link text "+name+" is not found in the application.");
			reportStep("fail", "Given element with link text "+name+" is not found in the application.");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the element with link text "+name);
			reportStep("fail", "Unable to click the element with link text "+name);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given element with link text "+name+ "is not visible in the application");
			reportStep("fail", "Given element with link text "+name+ "is not visible in the application");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given element with link text "+name+" is not selectable in the application.");
			reportStep("fail", "Given element with link text "+name+" is not selectable in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given element with link text "+name+" is not interactable in the application.");
			reportStep("fail", "Given element with link text "+name+" is not interactable in the application.");
		}catch (InvalidElementStateException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the given element with link text "+name+" which is invalid in state.");
			reportStep("fail", "Unable to click the given element with link text "+name+" which is invalid in state.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through clickByLink method is not valid.");
			reportStep("fail", "Arguments passed through clickByLink method is not valid.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//\system.out.println("Given element with link text "+name+" is clicked successfully.");
			reportStep("pass", "Given element with link text "+name+" is clicked successfully.",false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given element with link text "+name+" is not found in the application.");
			reportStep("fail", "Given element with link text "+name+" is not found in the application.");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the element with link text "+name);
			reportStep("fail", "Unable to click the element with link text "+name);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given element with link text "+name+ "is not visible in the application");
			reportStep("fail", "Given element with link text "+name+ "is not visible in the application");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given element with link text "+name+" is not selectable in the application.");
			reportStep("fail", "Given element with link text "+name+" is not selectable in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given element with link text "+name+" is not interactable in the application.");
			reportStep("fail", "Given element with link text "+name+" is not interactable in the application.");
		}catch (InvalidElementStateException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the given element with link text "+name+" which is invalid in state.");
			reportStep("fail", "Unable to click the given element with link text "+name+" which is invalid in state.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through clickByLink method is not valid.");
			reportStep("fail","Arguments passed through clickByLink method is not valid." );
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//\system.out.println("Given element with xpath value "+xpathVal+" is clicked successfully.");
			reportStep("pass", "Given element with xpath value "+xpathVal+" is clicked successfully.");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//\system.err.println("Given element with xpath value "+xpathVal+" is not found in the application");
			reportStep("fail", "Given element with xpath value "+xpathVal+" is not found in the application");
			//e.printStackTrace();
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the element with Xpath value "+xpathVal);
			reportStep("fail", "Unable to click the element with Xpath value "+xpathVal);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given element with Xpath value "+xpathVal+" is not visible in the application.");
			reportStep("fail", "Given element with Xpath value "+xpathVal+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given element with Xpath value "+xpathVal+" is not interactable in the application.");
			reportStep("fail", "Given element with Xpath value "+xpathVal+" is not interactable in the application.");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given element with Xpath value "+xpathVal+" is not selectable in the application.");
			reportStep("fail", "Given element with Xpath value "+xpathVal+" is not selectable in the application.");
		}catch (InvalidElementStateException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the given element with Xpath Value "+xpathVal+" which is in invalid state.");
			reportStep("fail", "Unable to click the given element with Xpath Value "+xpathVal+" which is in invalid state.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through clickByXpath is not valid");
			reportStep("fail", "Arguments passed through clickByXpath is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//\system.out.println("Given element with xpath value "+xpathVal+" is clicked successfully.");
			reportStep("pass", "Given element with xpath value "+xpathVal+" is clicked successfully.",false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//\system.err.println("Given element with xpath value "+xpathVal+" is not found in the application");
			reportStep("fail", "Given element with xpath value "+xpathVal+" is not found in the application");
			//e.printStackTrace();
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the element with Xpath value "+xpathVal);
			reportStep("fail", "Unable to click the element with Xpath value "+xpathVal);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given element with Xpath value "+xpathVal+" is not visible in the application.");
			reportStep("fail", "Given element with Xpath value "+xpathVal+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given element with Xpath value "+xpathVal+" is not interactable in the application.");
			reportStep("fail", "Given element with Xpath value "+xpathVal+" is not interactable in the application.");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given element with Xpath value "+xpathVal+" is not selectable in the application.");
			reportStep("fail", "Given element with Xpath value "+xpathVal+" is not selectable in the application.");
		}catch (InvalidElementStateException e) {
			// TODO: handle exception
			//\system.err.println("Unable to click the given element with Xpath Value "+xpathVal+" which is in invalid state.");
			reportStep("fail", "Unable to click the given element with Xpath Value "+xpathVal+" which is in invalid state.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through clickByXpath is not valid");
			reportStep("fail", "Arguments passed through clickByXpath is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String idtext = "";
		try {
		    idtext = driver.findElementById(idVal).getText();
			//\system.out.println("Given element with idvalue "+idVal+" has the text as follows ' "+idtext+" '");
		    reportStep("pass", "Given element with idvalue "+idVal+" has the text as follows ' "+idtext+" '");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with Id value "+idVal+" is not found in the application.");
			reportStep("fail", "Given Element with Id value "+idVal+" is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+idVal+" is not visible in the application.");
			reportStep("fail", "Given Element with Id value "+idVal+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+idVal+" is not interactable in the application.");
			reportStep("fail", "Given Element with Id value "+idVal+" is not interactable in the application.");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+idVal+" is not selectable in the application.");
			reportStep("fail", "Given Element with Id value "+idVal+" is not selectable in the application.");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+idVal+" is not stable in the application.");
			reportStep("fail", "Given Element with Id value "+idVal+" is not stable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through getTextById method is invalid.");
			reportStep("fail", "Arguments passed through getTextById method is invalid.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
		
		return idtext;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String xpathtext = "";
		try {
			 WebElement ele = driver.findElementByXPath(xpathVal);
			 waitProperty(3000L);
			 xpathtext = ele.getText();
			//\system.out.println("Given element with xpathValue "+xpathVal+" has the text as follows ' "+xpathtext+" '");
			 reportStep("pass", "Given element with xpathValue "+xpathVal+" has the text as follows ' "+xpathtext+" '");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with Xpath value "+xpathVal+" is not found in the application.");
			reportStep("fail", "Given Element with Xpath value "+xpathVal+" is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Xpath value "+xpathVal+" is not visible in the application.");
			reportStep("fail", "Given Element with Xpath value "+xpathVal+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Xpath value "+xpathVal+" is not interactable in the application.");
			reportStep("fail", "Given Element with Xpath value "+xpathVal+" is not interactable in the application.");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Xpath value "+xpathVal+" is not selectable in the application.");
			reportStep("fail", "Given Element with Xpath value "+xpathVal+" is not selectable in the application.");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Xpath value "+xpathVal+" is not stable in the application.");
			reportStep("fail", "Given Element with Xpath value "+xpathVal+" is not stable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through getTextByXpath method is invalid.");
			reportStep("fail", "Arguments passed through getTextByXpath method is invalid.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
		
		return xpathtext;
	
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement ele = driver.findElementById(id);
			Select drop = new Select(ele);
			drop.selectByVisibleText(value);
			//\system.out.println("Element with id value "+id+" has been selected successfully with index value "+id);
			reportStep("pass", "Element with id value "+id+" has been selected successfully with index value "+id);
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with Id value "+id+" is not found in the application.");
			reportStep("fail", "Given Element with Id value "+id+" is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+id+" is not visible in the application.");
			reportStep("fail", "Given Element with Id value "+id+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+id+" is not interactable in the application.");
			reportStep("fail", "Given Element with Id value "+id+" is not interactable in the application.");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+id+" is not selectable in the application.");
			reportStep("fail", "Given Element with Id value "+id+" is not selectable in the application.");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+id+" is not stable in the application.");
			reportStep("fail", "Given Element with Id value "+id+" is not stable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through selectVisibleTextById method is invalid.");
			reportStep("fail", "Arguments passed through selectVisibleTextById method is invalid.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement ele = driver.findElementById(id);
			Select drop = new Select(ele);
			drop.selectByIndex(value);
			//\system.out.println("Element with id value "+id+" has been selected successfully with index value "+id);
			reportStep("pass", "Element with id value "+id+" has been selected successfully with index value "+id);
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with Id value "+id+" is not found in the application.");
			reportStep("fail", "Given Element with Id value "+id+" is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+id+" is not visible in the application.");
			reportStep("fail", "Given Element with Id value "+id+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+id+" is not interactable in the application.");
			reportStep("fail", "Given Element with Id value "+id+" is not interactable in the application.");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+id+" is not selectable in the application.");
			reportStep("fail", "Given Element with Id value "+id+" is not selectable in the application.");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+id+" is not stable in the application.");
			reportStep("fail", "Given Element with Id value "+id+" is not stable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through selectIndexById method is invalid.");
			reportStep("fail", "Arguments passed through selectIndexById method is invalid.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allwinid = driver.getWindowHandles();
			for (String winid : allwinid) {
				driver.switchTo().window(winid);
				break;
			}
			//\system.out.println("Control has been transferred from child window to parent window Successfully.");
			reportStep("pass", "Control has been transferred from child window to parent window Successfully.");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Target Window (Parent Window) is not found in the application.");
			reportStep("fail"," Target Window (Parent Window) is not found in the application.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has been stopped due to some unknown errors.");
			reportStep("fail", "Browser has been stopped due to some unknown errors.");
		}catch (Exception e) {
			// TODO: handle exception
			//\system.err.println("Unknown error happened while switching to parent window");
			reportStep("fail", "Unknown error happened while switching to parent window");
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			
			Set<String> allwinid = driver.getWindowHandles();
			System.out.println(allwinid);
			for (String winid : allwinid) {
				driver.switchTo().window(winid);
			}
			//\system.out.println("Control has been transferred to current window Successfully.");
			reportStep("pass", "Control has been transferred to current window Successfully.");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Target Window (Parent Window) is not found in the application.");
			reportStep("fail", "Target Window (Parent Window) is not found in the application.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has been stopped due to some unknown errors.");
			reportStep("fail", "Browser has been stopped due to some unknown errors.");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//\system.err.println("Unknown error happened while switching to parent window");
			reportStep("Fail", "Unknown error happened while switching to parent window");
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//\system.out.println("Alert present in the application has been accepted successfully.");
			reportStep("pass", "Alert present in the application has been accepted successfully.",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("No alert is present in current window of the application.");
			reportStep("fail", "No alert is present in current window of the application.");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//\system.err.println("Unable to accept the alert present in the current window.");
			reportStep("fail", "Unable to accept the alert present in the current window.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//\system.out.println("Alert present in the application has been dismissed.");
			reportStep("pass", "Alert present in the application has been dismissed.",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("No alert is present in current window of the application.");
			reportStep("fail", "No alert is present in current window of the application.");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//\system.err.println("Unable to dismiss the alert present in the current window.");
			reportStep("fail", "Unable to dismiss the alert present in the current window.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alerttext="";
		try {
			alerttext = driver.switchTo().alert().getText();
			//\system.out.println("' "+alerttext+"' is the text present in the alert.");
			reportStep("pass", "' "+alerttext+"' is the text present in the alert.",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Alert is not present in current window of the application.");
			reportStep("fail", "Alert is not present in current window of the application.");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//\system.err.println("Unable to dismiss the alert present in the current window.");
			reportStep("fail", "Unable to dismiss the alert present in the current window.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
		return alerttext;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		long number=1;
		try {
			
		number =(long) (Math.floor(Math.random()*10000000)+100000);
			File temp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Reporting/ScreenShot/"+number+".png");
			FileUtils.copyFile(temp, dest);
			//\system.out.println("Screenshot has been captured successfully.");
		}catch (ScreenshotException e) {
			// TODO: handle exception
			e.printStackTrace();
			//\system.err.println("Error has been occured while capturing screenshot.");
			//reportStep("fail", "Error has been occured while capturing screenshot.");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			e.printStackTrace();
			//\system.err.println("Browser has stopped due to some unknown errors.");
			//reportStep("fail", "Browser has stopped due to some unknown errors.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//\system.err.println("Error occured while reading or writing in file.");
			//reportStep("fail", "Error occured while reading or writing in file.");
		} catch (Exception e) {
			// TODO: handle exception
			//\system.err.println("Unknown error happened while switching to parent window");
			//reportStep("fail", "Unknown error happened while switching to parent window");
			e.printStackTrace();
		}
		
		return number;
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//\system.out.println("Active window has been closed successfully.");
			reportStep("pass", "Active window has been closed successfully.",false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//\system.out.println("Application has been closed successfully.");
			reportStep("pass", "Application has been closed successfully.",false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors");
		}		
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Some interuption has occured while waiting...");
			reportStep("fail", "Some interuption has occured while waiting...");
		}
	}

	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement ele = driver.findElementByXPath(xpath);
			Select drop = new Select(ele);
			drop.selectByVisibleText(value);
			//\system.out.println("Element with xpath value "+xpath+" has been selected successfully with index value "+xpath);
			reportStep("pass", "Element with xpath value "+xpath+" has been selected successfully with index value "+xpath);
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with xpath value "+xpath+" is not found in the application.");
			reportStep("fail", "Given Element with xpath value "+xpath+" is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with xpath value "+xpath+" is not visible in the application.");
			reportStep("fail", "Given Element with xpath value "+xpath+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with xpath value "+xpath+" is not interactable in the application.");
			reportStep("fail", "Given Element with xpath value "+xpath+" is not interactable in the application.");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with xpath value "+xpath+" is not selectable in the application.");
			reportStep("fail", "Given Element with xpath value "+xpath+" is not selectable in the application.");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with xpath value "+xpath+" is not stable in the application.");
			reportStep("fail", "Given Element with xpath value "+xpath+" is not stable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through selectVisibleTextByxpath method is invalid.");
			reportStep("fail", "Arguments passed through selectVisibleTextByxpath method is invalid.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
	}

	public void mouseHoverOverByXpath(String xpath) {
		// TODO Auto-generated method stub
		try {
			Actions action = new Actions(driver);
			WebElement ele1 = driver.findElementByXPath(xpath);
			action.moveToElement(ele1).perform();
			//system.out.println("Mouse has been hovered over to the given element with Xpath "+xpath);
			reportStep("pass", "Mouse has been hovered over to the given element with Xpath "+xpath);
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with xpath value "+xpath+" is not found in the application.");
			reportStep("fail", "Given Element with xpath value "+xpath+" is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with xpath value "+xpath+" is not visible in the application.");
			reportStep("fail", "Given Element with xpath value "+xpath+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with xpath value "+xpath+" is not interactable in the application.");
			reportStep("fail", "Given Element with xpath value "+xpath+" is not interactable in the application.");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with xpath value "+xpath+" is not selectable in the application.");
			reportStep("fail", "Given Element with xpath value "+xpath+" is not selectable in the application.");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with xpath value "+xpath+" is not stable in the application.");
			reportStep("fail", "Given Element with xpath value "+xpath+" is not stable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through selectVisibleTextByxpath method is invalid.");
			reportStep("fail", "Arguments passed through selectVisibleTextByxpath method is invalid.");
		}catch (WebDriverException e) {
			// TODO: handle exception"Given Element with xpath value "+xpath+" is not selectable in the application."
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
	}

	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement ele = driver.findElementById(xpath);
			Select drop = new Select(ele);
			drop.selectByValue("value");
			//system.out.println("Element with id value "+xpath+" has been selected successfully with index value "+value);
			reportStep("pass", "Element with id value "+xpath+" has been selected successfully with index value "+value);
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with Id value "+xpath+" is not found in the application.");
			reportStep("fail", "Given Element with Id value "+xpath+" is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println();
			reportStep("fail", "Given Element with Id value "+xpath+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+xpath+" is not interactable in the application.");
			reportStep("fail", "Given Element with Id value "+xpath+" is not interactable in the application.");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+xpath+" is not selectable in the application.");
			reportStep("fail", "Given Element with Id value "+xpath+" is not selectable in the application.");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Id value "+xpath+" is not stable in the application.");
			reportStep("fail", "Given Element with Id value "+xpath+" is not stable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through selectIndexById method is invalid.");
			reportStep("fail", "Arguments passed through selectIndexById method is invalid.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
	}

	public void selectVisibleTextByName(String Name, String Value) {
		// TODO Auto-generated method stub
		try {
			WebElement ele = driver.findElementByName(Name);
			Select drop = new Select(ele);
			drop.selectByVisibleText(Value);
			//\system.out.println("Element with Name value "+Name+" has been selected successfully with index value "+Value);
			reportStep("pass", "Element with Name value "+Name+" has been selected successfully with index value "+Value);
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with Name value "+Name+" is not found in the application.");
			reportStep("fail", "Given Element with Name value "+Name+" is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Name value "+Name+" is not visible in the application.");
			reportStep("fail", "Given Element with Name value "+Name+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Name value "+Name+" is not interactable in the application.");
			reportStep("fail", "Given Element with Name value "+Name+" is not interactable in the application.");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Name value "+Name+" is not selectable in the application.");
			reportStep("fail", "Given Element with Name value "+Name+" is not selectable in the application.");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Name value "+Name+" is not stable in the application.");
			reportStep("fail", "Given Element with Name value "+Name+" is not stable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through selectVisibleTextByName method is invalid.");
			reportStep("fail", "Arguments passed through selectVisibleTextByName method is invalid.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
	}

	/*public void compareText(String value1, String value2) {
		// TODO Auto-generated method stub
		try {
			if(value1.equals(value2))
			{
				\system.out.println(value1+" is same as "+value2);
			}else {
				\system.err.println(value1+" is not same as "+value2);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			\system.err.println("Values are not compared due to some unknown errors");
		}
	}*/

	public String getAttribute(String xpathVal,String Value) {
		// TODO Auto-generated method stub
		String xpathtext = "";
		try {
			 WebElement ele = driver.findElementByXPath(xpathVal);
			 waitProperty(3000L);
			 xpathtext = ele.getAttribute(Value);
			//\system.out.println("Given element with xpathValue "+xpathVal+" has the attribute text as follows ' "+xpathtext+" '");
			 reportStep("pass", "Given element with xpathValue "+xpathVal+" has the attribute text as follows ' "+xpathtext+" '");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with Xpath value "+xpathVal+" is not found in the application.");
			reportStep("fail", "Given Element with Xpath value "+xpathVal+" is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Xpath value "+xpathVal+" is not visible in the application.");
			reportStep("fail", "Given Element with Xpath value "+xpathVal+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Xpath value "+xpathVal+" is not interactable in the application.");
			reportStep("fail", "Given Element with Xpath value "+xpathVal+" is not interactable in the application.");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Xpath value "+xpathVal+" is not selectable in the application.");
			reportStep("fail", "Given Element with Xpath value "+xpathVal+" is not selectable in the application.");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Xpath value "+xpathVal+" is not stable in the application.");
			reportStep("fail", "Given Element with Xpath value "+xpathVal+" is not stable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through getTextByXpath method is invalid.");
			reportStep("fail", "Arguments passed through getTextByXpath method is invalid.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
		
		return xpathtext;
	}


	public void keyboradOperationByXpath(String Xpath, String action) {
		// TODO Auto-generated method stub
		try {
			if(action.equalsIgnoreCase("pagedown")){
				driver.findElementByXPath(Xpath).sendKeys(Keys.PAGE_DOWN);
			}
			else if(action.equalsIgnoreCase("enter")){
				driver.findElementByXPath(Xpath).sendKeys(Keys.ENTER);
			}
			else if(action.equalsIgnoreCase("tab")){
				driver.findElementByXPath(Xpath).sendKeys(Keys.TAB);
			}
			else if(action.equalsIgnoreCase("arrowdown")){
				driver.findElementByXPath(Xpath).sendKeys(Keys.ARROW_DOWN);
			}
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with Xpath value "+Xpath+" is not found in the application.");
			reportStep("fail", "Given Element with Xpath value "+Xpath+" is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Xpath value "+Xpath+" is not visible in the application.");
			reportStep("fail", "Given Element with Xpath value "+Xpath+" is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Xpath value "+Xpath+" is not interactable in the application.");
			reportStep("fail", "Given Element with Xpath value "+Xpath+" is not interactable in the application.");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Xpath value "+Xpath+" is not selectable in the application.");
			reportStep("fail", "Given Element with Xpath value "+Xpath+" is not selectable in the application.");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with Xpath value "+Xpath+" is not stable in the application.");
			reportStep("fail", "Given Element with Xpath value "+Xpath+" is not stable in the application.");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed through getTextByXpath method is invalid.");
			reportStep("fail", "Arguments passed through getTextByXpath method is invalid.");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser has stopped due to some unknown errors.");
			reportStep("fail", "Browser has stopped due to some unknown errors.");
		}
		
	}

	public void verifyAttributeWithTextByXpath(String xpath, String text,String Value) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementByXPath(xpath).getAttribute(Value);
			if (actualtext.equalsIgnoreCase(text)) {
				//\system.out.println("Given Text " +text+" matches with the text in the given element in the given xpath with the text" +xpath);
				reportStep("pass", "Given Text " +text+" matches with the text in the given element in the given xpath with the text" +xpath);
			}else {
				//\system.err.println("Given Text " +text+" do not match with the text in the given element in the given xpath with the text" +xpath);
				reportStep("fail", "Given Text " +text+" do not match with the text in the given element in the given xpath with the text" +xpath);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//\system.err.println("Given Element with text "+text+ " is not found in the application.");
			reportStep("fail", "Given Element with text "+text+ " is not found in the application.");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with text "+text+ " is not visible in the application.");
			reportStep("fail", "Given Element with text "+text+ " is not visible in the application.");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//\system.err.println("Given Element with text "+text+" is not interactable in the application.");
			reportStep("fail", "Given Element with text "+text+" is not interactable in the application.");
		}catch (StaleElementReferenceException e) {
			//\system.err.println("Given Element with text "+text+ " is not stable in the application.");
			reportStep("fail", "Given Element with text "+text+ " is not stable in the application.");
			// TODO: handle exception
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//\system.err.println("Arguments passed in verifyTextByXpath method is not valid");
			reportStep("fail", "Arguments passed in verifyTextByXpath method is not valid");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//\system.err.println("Browser is closed due to some unknown errors");
			reportStep("fail", "Browser is closed due to some unknown errors");
		}catch (Exception e) {
			// TODO: handle exception
			//\system.err.println("Unknown error happened while entering values by name");
			reportStep("fail", "Unknown error happened while entering values by name");
		}
		
		
	}
	
	
	}
