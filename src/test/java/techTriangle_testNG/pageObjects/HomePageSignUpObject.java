package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class HomePageSignUpObject extends CommonMethods {

		public HomePageSignUpObject() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

		@FindBy(xpath="//*[@id=\"header\"]/div[4]/a[2]")
		public WebElement signUpBtn;
		
		@FindBy(xpath="//*[@id=\"email\"]")
		public WebElement email;
		
		@FindBy(xpath="//*[@id=\"password\"]")
		public WebElement password;
		
		@FindBy(xpath="//*[@id=\"NewCustomer\"]/div[1]/div/table/tbody/tr[2]/td[2]/label")
		public WebElement newCustomer;
		
//		-------------- Methods ---------------
		
		public void invalidEmail() {
			signUpBtn.click();
			email.sendKeys("fitnessavenueTCTC");
			password.click();
			Assert.assertTrue(newCustomer.isDisplayed());
		}	
		
	
		public void invalidEmailInvalidBillingInfo() {
			signUpBtn.click();
			email.sendKeys("fitnessavenueTCTC");
			password.click();
			Assert.assertTrue(newCustomer.isDisplayed());
		}
		
	
		public void invalidEmailInvalidPassword() {
			signUpBtn.click();
			email.sendKeys("fitnessavenueTCTC");
			password.click();
			Assert.assertTrue(newCustomer.isDisplayed());
		}
		
	
		public void invalidEmailInvalidPasswordInvalidBillingInfo() {
			signUpBtn.click();
			email.sendKeys("fitnessavenueTCTC");
			password.click();
			Assert.assertTrue(newCustomer.isDisplayed());
		}
	

}
	
