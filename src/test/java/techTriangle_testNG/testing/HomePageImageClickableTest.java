package techTriangle_testNG.testing;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import techTriangle_testNG.utilities.CommonMethods;


public class HomePageImageClickableTest extends CommonMethods{

	WebDriver driver;

	@BeforeClass
	public void setup() {
		getDriver();
	}

	@AfterClass
	public void teardown() {
		tearDown();
	}
  
	@Test (enabled = true)
	public void homePage_imageClickable() {
		homePage.verifyImagesClickable();
	}

}
