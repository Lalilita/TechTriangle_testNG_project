package techTriangle_testNG.testing;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import techTriangle_testNG.utilities.CommonMethods;


public class footerTest extends CommonMethods{

	WebDriver driver;

	@BeforeClass
	public void setup() {
		getDriver();
	}

	@AfterClass
	public void teardown() {
		tearDown();
	}
  
	@Test
	public void TTG_FOOTER_001_FBVerify() {
		footerPage.verifyFB();
	}
	@Test
	public void TTG_FOOTER_002_InstgramVerify() {
		footerPage.verifyInstgrm();
	}
	
	@Test
	public void TTG_FOOTER_003_contactUs() {
		footerPage.verifyContactUs();
	}
	
	
	
	

}
