package org.h2k.retailmenot.tests;

import org.h2k.retailmenot.pages.DealsPage;
import org.h2k.retailmenot.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenMRSTests {


	//	    Manual TEstcase:
	//		1. Launch the Application url.
	//		2. Login to the app.
	//		3. Navigate to FindPAtient record.
	//		4. Enter the patient name and click on search.
	//		5. Identify the details by clicking ont he patient.
	//		6. Verify the details of the patient getting displayed.

	WebDriver driver ;

	@Parameters({"browserType"})
	@BeforeClass
	public void invokeBrowser(String browserType)
	{
		if(browserType.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserType.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}

	}
	@Test
	public void verifyDealCount()
	{
		 	HomePage hPage = new HomePage(driver);
			hPage.openApp( );
			hPage.navigateToPage("New Year Deals");
			
			DealsPage dealsPage = new DealsPage(driver);
			int actual = dealsPage.retrieveDealCount("Great Deals on Home And Garden");
		 
			int expected = 8;
			
			Assert.assertEquals(actual, expected);
	}
	
	 
	 
}
