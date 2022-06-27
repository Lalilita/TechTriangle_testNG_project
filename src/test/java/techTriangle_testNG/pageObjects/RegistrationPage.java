package techTriangle_testNG.pageObjects;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class RegistrationPage extends CommonMethods{

	
	public RegistrationPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	//Kangkook
	@FindBy(xpath="//*[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='NewCustomer']/div[1]/div/table/tbody/tr[2]/td[2]/label")
	public WebElement emailErrorText;
	
	@FindBy(xpath="//*[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='password_confirmation']")
	public WebElement passwordConfirmation;
	
//	@FindBy(xpath="//label[@for='password_confirmation']")
//	public WebElement passwordConfirmErrorText;   //doesn't use because there is no error message for invalid password
	
	@FindBy(xpath="//*[@id='first_name']")
	public WebElement firstName;
	
	@FindBy(xpath="//*[@id='last_name']")
	public WebElement lastName;
	
	@FindBy(xpath="//*[@id='billing_address1']")
	public WebElement address1;
	
	@FindBy(xpath="//*[@id='billing_city']")
	public WebElement city;
	
	@FindBy(xpath="//*[@id='billing_country_code']")
	public WebElement countryDropdown;
	
	@FindBy(xpath="//*[@id='billing_province_state']")
	public WebElement stateDropdown;
	
	@FindBy(xpath="//*[@id='billing_postal_zip_code']")
	public WebElement zipcode;
	
	@FindBy(xpath="//*[@id='billing_phone']")
	public WebElement phone;
	
	@FindBy(xpath="//*[@id='recaptcha-anchor']/div[1]")
	public WebElement reCaptcha;
	
	@FindBy(xpath="//*[@id='NewCustomer']/div[6]/button")
	public WebElement registerButton;

	
//	-------------- Methods ---------------
	
	//Kangkook method
	
	public String generateEmailAddress() throws InterruptedException {
        Random rd = new Random();
        int randomNum = rd.nextInt(10000);
        return randomNum + "abc@mail.com";
    }
	
	public void signUp_validEmail() throws InterruptedException {
		homePage.signUpBtn.click();
		email.sendKeys(generateEmailAddress());
		Thread.sleep(1000);
	}	
	
	public void signUp_inValidEmail() throws InterruptedException {
		homePage.signUpBtn.click();
		email.sendKeys("fitnessavenueTCTC");
		password.click();
		Thread.sleep(1000);
		Assert.assertTrue(emailErrorText.isDisplayed());
	}
	
	public void signUp_validPassword() throws InterruptedException {
		password.sendKeys("fitnessavenue");
		passwordConfirmation.sendKeys("fitnessavenue");
		Thread.sleep(1000);
	}	

	public void signUp_inValidPassword() throws InterruptedException {
		password.sendKeys("1");
		passwordConfirmation.sendKeys("1");
		Thread.sleep(1000);
	}
	
	public void signUp_InvalidBillingInfo() throws InterruptedException {
		firstName.sendKeys("f");
		lastName.sendKeys("l");
		address1.sendKeys("a");
		city.sendKeys("c");
		selectDropDownValue(countryDropdown,"USA");
		selectDropDownValue(stateDropdown,"CA");
		zipcode.sendKeys("1");
		phone.sendKeys("1");
		registerButton.click();   
		Assert.assertTrue(homePage.myAccountBtn.isDisplayed());
	}
	
	public void signUp_validBillingInfo() throws InterruptedException {
		firstName.sendKeys("firstName");
		lastName.sendKeys("lastName");
		address1.sendKeys("address");
		city.sendKeys("city");
		selectDropDownValue(countryDropdown,"USA");
		selectDropDownValue(stateDropdown,"CA");
		zipcode.sendKeys("12345");
		phone.sendKeys("1");
		registerButton.click();
		Assert.assertTrue(homePage.myAccountBtn.isDisplayed());
	}
}	
	