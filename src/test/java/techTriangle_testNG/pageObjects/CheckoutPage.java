package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class CheckoutPage extends CommonMethods{

	
	public CheckoutPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//div[@id='cart_preview']")
	public WebElement itemLink;
	
	@FindBy(xpath = "//form[@id='checkout-form']")
	public WebElement checkoutForm;

	
	// -------------- Methods -------------- //
	
	public void previewCart() {
		itemLink.click();
	}
	

}	
	