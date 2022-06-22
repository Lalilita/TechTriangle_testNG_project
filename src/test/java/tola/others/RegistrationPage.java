package tola.others;

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
	
	@FindBy(xpath = "//a[normalize-space()='Sign Up']")
	public WebElement signUpButton;
	
	public void signUp () {
		CommonMethods.click(signUpButton);
	}
	
	@FindBy(xpath = "(//input[@id='email'])")
	public WebElement emailAddress;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='password_confirmation']")
	public WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@id='first_name']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last_name']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@id='company']")
	public WebElement companyName;
	
	@FindBy(id = "billing_address1")
	public WebElement address;
	
	@FindBy(id = "billing_city")
	public WebElement city;
	
	@FindBy(xpath = "//select[@id='billing_country_code']")
	public WebElement country;
	
	@FindBy(xpath = "//select[@id='billing_province_state']")
	public WebElement state;
	
	@FindBy(id = "billing_postal_zip_code")
	public WebElement zipCode;
	
	@FindBy(id = "billing_phone")
	public WebElement phone;
	
	@FindBy(id = "billing_website")
	public WebElement website;
	
	@FindBy(id = "billing_same_as_shipping")
	public WebElement shipToAddress;
	
	@FindBy(xpath = "//*[@id=\"rc-anchor-container\"]/div[4]")
	public WebElement captcha;
	
	@FindBy(xpath = "//button[@name='submituser']")
	public WebElement registerButton;
	
	public void userInformation() {
		
		CommonMethods.sendText(emailAddress,BaseClass.getProperty("email"));
		CommonMethods.sendText(password, BaseClass.getProperty("password"));
		CommonMethods.sendText(confirmPassword, BaseClass.getProperty("passwordConfirm"));
		CommonMethods.sendText(firstName, BaseClass.getProperty("firstName"));
		CommonMethods.sendText(lastName, BaseClass.getProperty("lastName"));
		CommonMethods.sendText(companyName, BaseClass.getProperty("companyName"));
	}
	
	public void billToAddress() {
		
		CommonMethods.sendText(address, BaseClass.getProperty("address"));
		CommonMethods.sendText(city, BaseClass.getProperty("city"));
		CommonMethods.click(country);
		CommonMethods.selectDropDownValue(country,BaseClass.getProperty("country"));
		CommonMethods.click(state);
		CommonMethods.waitForClickability(state);
		CommonMethods.selectDropDownValue(state,BaseClass.getProperty("state"));
		CommonMethods.sendText(zipCode, BaseClass.getProperty("zipCode"));
		CommonMethods.sendText(phone, BaseClass.getProperty("phone"));
		CommonMethods.sendText(website, BaseClass.getProperty("website"));
	}
	
	public void shipToAddress() {
		CommonMethods.click(shipToAddress);
	}
	
//	public void reCaptcha() {
//		CommonMethods.click(captcha);
//		
//	}
//	
//	public void screenshotCaptcha() {
//		
//		CommonMethods.scrollToElement(captcha);
//	}
	
	public void register() {
		CommonMethods.wait(15);
		CommonMethods.click(registerButton);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}	
	