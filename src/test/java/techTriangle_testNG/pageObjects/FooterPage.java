package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class FooterPage extends CommonMethods {
	public FooterPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//img[@src='/application/glue/themes/fitness/images/facebook.png']")
	public WebElement fBBtn;

	@FindBy(xpath = "//img[@src='/application/glue/themes/fitness/images/instgram.png']")
	public WebElement instBtn;
	
	@FindBy(xpath = "//a[@aria-label='Facebook']//*[name()='svg']//*[name()='path' and contains(@class,'p361ku9c')]")
	public WebElement fBPage;
	
	@FindBy(xpath = "//img[@alt='Instagram']")
	public WebElement instPage;
	
	@FindBy(xpath = "//a[@class='ng-binding ng-isolate-scope btn'][normalize-space()='Contact Us']")
	public WebElement contactUsBtn;
	
	@FindBy(xpath = "//h1[normalize-space()='Contact Us']")
	public WebElement contactUsPage;
	

	// methods

	
public void verifyFB() {
	fBBtn.click();
	Assert.assertTrue(fBPage.isDisplayed());
	System.out.println("FB page shown");
	}
public void verifyInstgrm() {
	instBtn.click();
	Assert.assertTrue(instPage.isDisplayed());
	System.out.println("instragram shown");
}

public void verifyContactUs() {
	contactUsBtn.click();
	Assert.assertTrue(contactUsPage.isDisplayed());
	System.out.println("contactUsPage shown");
}


	
	
	
	
}
