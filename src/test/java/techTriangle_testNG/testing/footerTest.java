package techTriangle_testNG.testing;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import techTriangle_testNG.utilities.CommonMethods;


public class FooterTest extends CommonMethods{

	@BeforeMethod
	public void setup() {
		getDriver();
	}

	@AfterMethod
	public void teardown() {
		tearDown();
	}
  
	@Test
	public void TTG_FOOTER_001_contactUs() throws InterruptedException {
		footerPage.verifyContactUs();
	}
	@Test
	public void TTG_FOOTER_002_FBVerify() throws InterruptedException {
		footerPage.verifyFB();
	}
	@Test
	public void TTG_FOOTER_003_InstgramVerify() throws InterruptedException {
		footerPage.verifyInstgrm();
	}
	

	
	
	
	

}
