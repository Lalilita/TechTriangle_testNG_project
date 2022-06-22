package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class test2 extends CommonMethods{

	
	public test2() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement emailInput;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement passwordInput;
	
	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//span[@class='error']")
	public WebElement errorText;

	
	
	// -------------- Methods -------------- //
	
	public void loginToHomepage(String username, String password) {
		sendText(emailInput, username);
		sendText(passwordInput, password);
		loginBtn.click();
	}
	
	public String getErrorText() {
		String text = errorText.getText();
		return text;
	}
	
	public void verifyLoginFailed() {
		Assert.assertTrue(errorText.isDisplayed());
		System.out.println(getErrorText());
	}
	

}	
	