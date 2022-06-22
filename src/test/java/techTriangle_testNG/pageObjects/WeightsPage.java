package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class WeightsPage extends CommonMethods{

	
	public WeightsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@class='widget browse_sub_categories']/div[1]")
	public WebElement dumbbellsWidget;

	
	// -------------- Methods -------------- //
	
	public void verifyWeightsTab() {
		homePage.weightsTab.isDisplayed();
		Assert.assertTrue(homePage.weightsTab.isDisplayed());
		System.out.println("Weights product tab is displayed in the home page");
		Assert.assertTrue(isClickable(homePage.weightsTab, driver));
		System.out.println("Weights product tab is enable to be clicked");
		homePage.goToWeightsPage();
		Assert.assertEquals(Constants.weightsUrl, driver.getCurrentUrl());
		System.out.println("Weights product tab is navigated to Weights product pages");	
	}
	
	public void verifyNotAbleToAddOutOfStockProductToCart() {
		scrollToElement(dumbbellsWidget);
		dumbbellsWidget.click();
		dumbbellsPage.goToVirginRubberDumbbellsPage();
		dumbbellVgRbPage.goToVirginRubber60lbsPage();
		Assert.assertFalse(dumbbell60VgRbPagePage.addToCartBtn.isDisplayed());
		System.out.println("Add to cart button is not displayed");	
		Assert.assertTrue(dumbbell60VgRbPagePage.outOfStockText.isDisplayed());
		System.out.println("Out of Stock  is displayed");	
	}

}	
	