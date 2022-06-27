package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class FooterPage extends CommonMethods {
	
	public FooterPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//img[@src='/application/glue/themes/fitness/images/facebook.png']")
	public WebElement fBBtn;

	@FindBy(xpath = "//img[@src='/application/glue/themes/fitness/images/instgram.png']")
	public WebElement instBtn;

//	@FindBy(xpath = "//div[@class='l9j0dhe7 buofh1pr j83agx80 bp9cbjyn']")
//	public WebElement fBPage;
//
//	@FindBy(xpath = "//img[@alt='Instagram']")
//	public WebElement instPage;

	@FindBy(xpath = "//a[@class='ng-binding ng-isolate-scope btn'][normalize-space()='Contact Us']")
	public WebElement contactUsBtn;

	@FindBy(xpath = "//h1[normalize-space()='Contact Us']")
	public WebElement contactUsPage;

	// methods

	public void verifyContactUs() {
		contactUsBtn.click();
		Assert.assertTrue(contactUsPage.isDisplayed());
		System.out.println("contactUsPage shown");
	}

	public void verifyFB() throws InterruptedException {
		fBBtn.click();
		switchToChildWindow();
//		Assert.assertTrue(fBPage.isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(), Constants.fitnessFacebookUrl);
		System.out.println("FB page shown");
	}

	public void verifyInstgrm() throws InterruptedException {
		instBtn.click();
		switchToChildWindow();
//		Assert.assertTrue(instPage.isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(), Constants.fitnessInstagramUrl);
		System.out.println("instragram shown");
	}

}
