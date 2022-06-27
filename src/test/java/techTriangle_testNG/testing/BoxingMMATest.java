package techTriangle_testNG.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import techTriangle_testNG.utilities.CommonMethods;

public class BoxingMMATest extends CommonMethods{


	@BeforeClass
	public void setup() {
		getDriver();
	}

	@Test (priority=1)
	public void AR_01_VerifyEBikesTab() {
		boxingPage.verifyEBikesTabIsEnableAndNavigateToEBikesPage();
	}
	
	@Test (priority=2)
	public void AR_02_VerifySortByPartNumber() throws InterruptedException {
		boxingPage.verifySortByPartNumberAsc();
	}
	
	@Test (priority=3)
	public void AR_03_VerifySortByDescription() throws InterruptedException {
		boxingPage.verifySortByShortDescriptionAsc();
	}

	@Test (priority=4)
	public void AR_04_VerifySortByPrice() throws InterruptedException {
		boxingPage.verifySortByPriceAsc();
	}
	
	@AfterClass
	public void teardown() {
		tearDown();
	}

}
