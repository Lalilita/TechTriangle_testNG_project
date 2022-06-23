package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class HomePage extends CommonMethods{

	
	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[text()='Login']")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//a[text()='Logout']")
	public WebElement logoutBtn;
	
	@FindBy(xpath = "//a[text()='Strength & Conditioning']")
	public WebElement strengthAndConTab;
	
	@FindBy(xpath = "//a[@class='ng-binding ng-isolate-scope btn' and text()='Weights']")
	public WebElement weightsTab;

	
	// -------------- Methods -------------- //
	
	public void goToLogin() {
		loginBtn.click();
	}

	public void verifyLoginSuccess() {
		Assert.assertTrue(logoutBtn.isDisplayed());
		Assert.assertTrue(logoutBtn.isEnabled());
		System.out.println("Successfully Login! Logout button is display and enable");
	}
	
	public void verifyStrengthAndConditioningTab() {
		Assert.assertTrue(strengthAndConTab.isDisplayed());
		System.out.println("Strength & Conditioning Tab is displayed");
		Assert.assertTrue(strengthAndConTab.isEnabled());
		System.out.println("Strength & Conditioning Tab is Enable");
	}
	
	public void verifyStrengthAndConditioningTabNavigateToItsPage() {
		strengthAndConTab.click();
		Assert.assertEquals(driver.getCurrentUrl(), Constants.strengthAndConUrl);
		System.out.println("Page is navigated to Strength & Conditioning product pages");
		
	}
	
	public void goToStrengthAndConPage() {
		strengthAndConTab.click();
	}
	
	public void goToWeightsPage() {
		weightsTab.click();
	}
	

	
}	
	