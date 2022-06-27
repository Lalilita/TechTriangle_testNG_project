package techTriangle_testNG.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class CurrencyTest extends CommonMethods{
	
	
	@BeforeMethod
	public void setup() {
		BaseClass.getDriver();
	}

	@AfterClass
	public void teardown() {
		System.out.println("browser closed");
	}
  

	@Test
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
