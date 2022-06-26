package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class CurrencyCovertion extends CommonMethods{
	public CurrencyCovertion() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath = "//img[@alt='Currency USD']")
	public WebElement CurrencyBtn;
	
	
	
	// methods
	public void currencyOption () {
		CurrencyBtn.click();

	//	String ExpectedText = “Currency USD”;
	    Assert.assertEquals(false, null);
	}
	
}
