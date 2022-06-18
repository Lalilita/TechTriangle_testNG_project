package techTriangle_testNG.testing;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;


public class Test_RegistrationPage extends CommonMethods{

	WebDriver driver;

	@BeforeClass
	public void setup() {
		BaseClass.getDriver();
	}

	@AfterClass
	public void teardown() {
//		BaseClass.getDriver().close();
	}
  
	@Test
	public void test() {
		regisPage.signUp();
		regisPage.userInformation();
		regisPage.billToAddress();
		regisPage.shipToAddress();
		regisPage.screenshotCaptcha();
		regisPage.register();
		
	}

}
