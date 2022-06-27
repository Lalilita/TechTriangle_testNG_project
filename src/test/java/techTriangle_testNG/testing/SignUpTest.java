package techTriangle_testNG.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import techTriangle_testNG.utilities.CommonMethods;

public class SignUpTest extends CommonMethods{

//	1.1 Enter valid email, valid password
//	and valid Billing info
//	
//	1.2 Enter valid email and valid password
//	but invalid Billing info
//
//	2.1 Enter valid email but invalid password
//	with valid Billing info
//
//	2.2 Enter valid email but  invalid password
//	and invalid Billing info
//	
//	3.1 Enter invalid email and valid password
//	and valid Billing info
//	
//	3.2 Enter invalid email and valid password
//	but invalid Billing info
//
//	4.1 Enter invalid email and invalid password
//	and valid Billing info
//
//	4.2 Enter invalid email, invalid password
//	and also invalid Billing info

	
	@BeforeClass
	public void setup() {
		getDriver();
	}

	@AfterClass
	public void teardown() {
		tearDown();
	}
  
	@Test(priority = 1)
	public void TC101_validEmailValidPasswordValidBillingInfo() throws InterruptedException {
//		1.1 Enter valid email, valid password and valid Billing info
		regisPage.signUp_validEmail();
		regisPage.signUp_validPassword();
		regisPage.signUp_validBillingInfo();
	}
	
	@Test(priority = 2)
	public void TC102_validEmailValidPasswordInvalidBillingInfo() throws InterruptedException {
//		1.2 Enter valid email and valid password but invalid Billing info
		regisPage.signUp_validEmail();
		regisPage.signUp_validPassword();
		regisPage.signUp_InvalidBillingInfo();
	}	
	
	@Test(priority = 3)
	public void TC201_validEmailInvalidPasswordValidBillingInfo() throws InterruptedException {
//		2.1 Enter valid email but invalid password with valid Billing info
		regisPage.signUp_validEmail();
		regisPage.signUp_inValidEmail();
		regisPage.signUp_validBillingInfo();
	}
	
	@Test(priority = 4)
	public void TC202_validEmailInvalidPasswordInvalidBillingInfo() throws InterruptedException {
//		2.2 Enter valid email but invalid password and invalid Billing info
		regisPage.signUp_validEmail();
		regisPage.signUp_inValidEmail();
		regisPage.signUp_InvalidBillingInfo();
	}
	
	@Test(priority = 5)
	public void TC301_invalidEmailValidPasswordValidBillingInfo() throws InterruptedException {
//		3.1 Enter invalid email and valid password and valid Billing info
		regisPage.signUp_inValidEmail();
		regisPage.signUp_validPassword();
		regisPage.signUp_validBillingInfo();
	}	
	
	@Test(priority = 6)
	public void TC302_invalidEmailValidPasswordInvalidBillingInfo() throws InterruptedException {
//		3.2 Enter invalid email and valid password but invalid Billing info
		regisPage.signUp_inValidEmail();
		regisPage.signUp_validPassword();
		regisPage.signUp_InvalidBillingInfo();
	}
	
	@Test(priority = 7)
	public void TC401_invalidEmailInvalidPasswordValidBillingInfo() throws InterruptedException {
//		4.1 Enter invalid email and invalid password and valid Billing info
		regisPage.signUp_inValidEmail();
		regisPage.signUp_inValidEmail();
		regisPage.signUp_validBillingInfo();

	}	
	
	@Test(priority = 8)
	public void TC402_invalidEmailInvalidPasswordInvalidBillingInfo() throws InterruptedException {
//		4.2 Enter invalid email, invalid password and also invalid Billing info
		regisPage.signUp_inValidEmail();
		regisPage.signUp_inValidEmail();
		regisPage.signUp_InvalidBillingInfo();
	}
}
