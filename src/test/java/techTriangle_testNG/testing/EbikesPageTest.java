
package techTriangle_testNG.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import techTriangle_testNG.utilities.CommonMethods;

public class EbikesPageTest extends CommonMethods {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		getDriver();
	}

	@AfterClass
	public void teardown() {
		System.out.println("browser closed");
		getDriver().close();
	}
	@Test(enabled = true)
	public void VerifyProductListInsideEbikesPage() {
		ebikePage.verifyBikeImageCount();
	}
	

}
