package techTriangle_testNG.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import techTriangle_testNG.pageObjects.HomePageSignUpObject;
import techTriangle_testNG.utilities.CommonMethods;

public class HomePageSignUpTest extends CommonMethods{

	
	HomePageSignUpObject homePageSignUpObject = new HomePageSignUpObject();
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		getDriver();
	}

	@AfterMethod
	public void teardown() {
		tearDown();
	}
  
	
	@Test
	public void invalidEmailTest() {
		homePageSignUpObject.invalidEmail();
	}
	
	@Test
	public void invalidEmailInvalidBillingInfoTest() {
		homePageSignUpObject.invalidEmailInvalidBillingInfo();
	}
	
	@Test
	public void invalidEmailInvalidPasswordTest() {
		homePageSignUpObject.invalidEmailInvalidPassword();
	}
	
	@Test
	public void invalidEmailInvalidPasswordInvalidBillingInfoTest() {
		homePageSignUpObject.invalidEmailInvalidPasswordInvalidBillingInfo();
	}
	
	
	
	
}	
	
	