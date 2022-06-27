
package techTriangle_testNG.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import techTriangle_testNG.utilities.CommonMethods;

public class EbikesPageTest extends CommonMethods {
	
	@BeforeClass
	public void setup() {
		getDriver();
	}

	@AfterClass
	public void teardown() {
		tearDown();
	}
	@Test(enabled = true)
	public void VerifyProductListInsideEbikesPage() {
		ebikePage.verifyBikeImageCount();
	}
	

}
