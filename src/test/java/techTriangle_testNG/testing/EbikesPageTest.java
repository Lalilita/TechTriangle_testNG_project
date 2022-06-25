package techTriangle_testNG.testing;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import techTriangle_testNG.utilities.CommonMethods;


public class EbikesPageTest extends CommonMethods{

//	WebDriver driver;

	@BeforeClass
	public void setup() {
		getDriver();
	}

	@Test (enabled = true)
	public void VerifyProductListInsideEbikesPage() {
		ebikePage.verifyBikeImageCount();
	}
	
	@AfterClass
	public void teardown() {
		tearDown();
	}

}
