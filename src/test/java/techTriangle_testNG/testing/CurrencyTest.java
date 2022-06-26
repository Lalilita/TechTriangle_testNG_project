package techTriangle_testNG.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class CurrencyTest extends CommonMethods{
	
	//WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		BaseClass.getDriver();
	}

	@AfterClass
	public void teardown() {
		System.out.println("browser closed");
	}
  
	@Test
	@Ignore
	public void TTG_CHANGE_CURRENTCY_01_verifyCanadaCurrency() throws InterruptedException {
		homePage.verifyCanadaCurrency();
	    Thread.sleep(5000);
		
	}
	@Test
	public void TTG_CHANGE_CURRENTCY_02_verifyUSACurrency() throws InterruptedException {
		homePage.verifyUSACurrency();
		Thread.sleep(5000);
	}
}
