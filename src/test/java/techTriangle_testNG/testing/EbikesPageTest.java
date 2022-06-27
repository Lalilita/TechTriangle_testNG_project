package techTriangle_testNG.testing;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import techTriangle_testNG.utilities.CommonMethods;


public class EbikesPageTest extends CommonMethods{


	@BeforeClass
	public void setup() {
		getDriver();
	}

	@Test 
	public void EB_01_VerifyEBikesTab() {
		ebikePage.verifyEBikesTabIsEnableAndNavigateToEBikesPage();
	}
	
	@Test 
	public void EB_02_VerifySortByPartNumber() throws InterruptedException {
		ebikePage.verifySortByPartNumberAsc();
	}
	
	@Test 
	public void EB_03_VerifySortByDescription() throws InterruptedException {
		ebikePage.verifySortByShortDescriptionAsc();
	}

	@Test 
	public void EB_04_VerifySortByPrice() throws InterruptedException {
		ebikePage.verifySortByPriceAsc();
	}
	
	@AfterClass
	public void teardown() {
		tearDown();
	}

}
