package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class Dumbbell60VgRbPage extends CommonMethods{

	
	public Dumbbell60VgRbPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//p[text()='Out of Stock']")
	public WebElement outOfStockText;
	
	@FindBy(xpath = "//button[@value='Add to cart']")
	public WebElement addToCartBtn;
	

	public void verifyNotAbleToAddOutOfStockProductToCart() {
		weightsPage.goToDumbbellsPage();
		dumbbellsPage.goToVirginRubberDumbbellsPage();
		dumbbellVgRbPage.goToVirginRubber60lbsPage();
		Assert.assertFalse(dumbbell60VgRbPage.addToCartBtn.isDisplayed());
		System.out.println("Add to cart button is not displayed");	
		Assert.assertTrue(dumbbell60VgRbPage.outOfStockText.isDisplayed());
		System.out.println("Out of Stock  is displayed");	
	}
	
	
}	
	