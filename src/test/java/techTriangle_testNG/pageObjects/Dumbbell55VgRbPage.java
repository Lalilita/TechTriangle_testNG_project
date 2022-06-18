package techTriangle_testNG.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class Dumbbell55VgRbPage extends CommonMethods{

	
	public Dumbbell55VgRbPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//p[text()='Out of Stock']")
	public WebElement outOfStockText;
	
	@FindBy(xpath = "//div[@itemprop='name']//h1")
	public WebElement productHeader;
	
	@FindBy(xpath = "//div[@class='part_num_label']")
	public WebElement partNumberHead;
	
	@FindBy(xpath = "//div[@class='widget product_part_num content']")
	public WebElement productPartNumber;
	
	@FindBy(xpath = "//div[@class='list_price_label']")
	public WebElement marketPriceHead;
	
	@FindBy(xpath = "//div[@class='list_price_content']")
	public WebElement productMarketPrice;
	
	@FindBy(xpath = "//div[@class='our_price_label']")
	public WebElement ourPriceHead;
	
	@FindBy(xpath = "//div[@class='our_price_content']")
	public WebElement productOurPrice;
	
	@FindBy(xpath = "//*[@id='content']/div/div[7]//span[3]")
	public WebElement discountPrice;
	
	@FindBy(xpath = "//div[@class='std_add_to_cart']//button")
	public WebElement addToCartBtn;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	public WebElement cartCheckoutBtn;


	
	// -------------- Methods -------------- //
	
	
	
	public void verifyProductDetailsAreDisplayed(){
		ArrayList<String> actual55lbsProductDetails = new ArrayList<>();
		List<WebElement> productDetails= new ArrayList<>();
		productDetails.add(productHeader);
		productDetails.add(partNumberHead);
		productDetails.add(productPartNumber);
		productDetails.add(marketPriceHead);
		productDetails.add(productMarketPrice);
		productDetails.add(ourPriceHead);
		productDetails.add(productOurPrice);
		productDetails.add(discountPrice);
		for(WebElement el : productDetails) {
			Assert.assertTrue(el.isDisplayed());
			actual55lbsProductDetails.add(el.getText());
		}	
			Assert.assertEquals(actual55lbsProductDetails, Constants.expect55lbsProductDetails);
//			System.out.println(Constants.expect55lbsProductDetails.toString());
//			System.out.println(actual55lbsProductDetails.toString());
		
	}
	
	public void verifyAddToCartBtnDisplayAndClickable() {
		Assert.assertTrue(addToCartBtn.isDisplayed());
		isClickable(addToCartBtn, driver);
		System.out.println("Add to cart button is displayed and enable to click");
	}
	
	public void addItemTocartAndGoToShoppingCartPage() {
		addToCartBtn.click();
		cartCheckoutBtn.click();
		Assert.assertEquals(Constants.shoppingCartUrl, driver.getCurrentUrl());
	}
	
}	
	