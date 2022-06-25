package techTriangle_testNG.pageObjects;



import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class HomePage extends CommonMethods{

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
//Add to cart testing	
	@FindBy (xpath= "//a[@href='/zkett/kettlebells']//span//img")
	public WebElement kettlebellsTab;
	
	@FindBy (xpath = "(//a[@title='Bowflex SelectTech 840 Adjustable Kettlebell'])[2]")
	public WebElement bowflexSelectTech840;
	
	@FindBy (xpath = "//div[@class='std_add_to_cart']//button[@name='add_to_cart']")    
	public WebElement addToCartButton;
	
	@FindBy (xpath = "//div[@class='cart_qty']")
	public WebElement cartQuantity_BowflexSelectTech840;
	
	@FindBy (xpath = "//div[@class='short_desc']//a")
	public WebElement itemsName_BowflexSelectTech840;
	
	@FindBy (xpath = "//div[@class='price']")
	public WebElement unitPrice_BowflexSelectTech840;
	
	@FindBy (xpath= "//a[@href='https://www.fitnessavenue.ca/']//b")
	public WebElement homeButton;
	
	@FindBy (xpath= "//a[@href='/zdum/dumbbells']//span//img")
	public WebElement dumbbells;
	
	@FindBy (xpath= "/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[10]/div[2]/div[2]/div[4]/div[2]/div[2]/a/img")
	public WebElement bowflexSelectTech2080;
	
	@FindBy (xpath= "//input[@id='qty_100875']")
	public WebElement quantityInput_BowflexSelectTech2080;
	
	@FindBy (xpath = "(//div[@class='cart_qty'])[2]")
	public WebElement cartQuantity_BowflexSelectTech2080;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[2]/div[1]/table/tbody/tr[2]/td[2]/div")
	public WebElement itemsName_BowflexSelectTech2080;
	
	@FindBy (xpath = "(//div[@class='price'])[2]")
	public WebElement unitPrice_BowflexSelectTech2080;
	
	@FindBy (xpath = "//div[@class='widget_content']//span[@class='total_amount']")
	public WebElement totalPrice;
	
//Home page image clickable
	@FindBy (xpath = "//*[@id='content']/div[3]/div")
	public List<WebElement> homePageProductImages;
	
	public void verifyImagesClickable() {
		int imageNum = homePageProductImages.size();
		wait(Constants.standardwait_time);
		System.out.println("Number of images in home pages: "+imageNum);
		Assert.assertTrue(imageNum==Constants.homePageImageNum);
		String baseUrl = getDriver().getCurrentUrl();
		
		 for(int i=0;i<imageNum;i++){
			 WebElement listOfImage = homePageProductImages.get(i);
			 waitForClickability(listOfImage).click();
			 String newUrl = BaseClass.getDriver().getCurrentUrl();
			 System.out.println("Base URL: "+ baseUrl);
			 System.out.println("Current URL: "+newUrl);
			 Assert.assertFalse(baseUrl.equals(newUrl));
			 BaseClass.getDriver().navigate().back();
		 }
	}
	
	public void homePageAddItemToCart() {
		click(kettlebellsTab);
		getJSObject();
		ScrolByPixel(600);
		wait(Constants.standardwait_time);
		click(bowflexSelectTech840);
		Assert.assertTrue(addToCartButton.isEnabled());
		click(addToCartButton);
		System.out.println("==Bowflex SelectTech 840 Adjustable Kettlebell==");
		String shoppingCartBowflexSelectTech840 = cartQuantity_BowflexSelectTech840.getText();
		System.out.println("Quantity :"+shoppingCartBowflexSelectTech840);
		String shoppingItemName1 = itemsName_BowflexSelectTech840.getText();
		System.out.println("Item name: "+shoppingItemName1);
		String shoppingUnitPrice1 = unitPrice_BowflexSelectTech840.getText();
		System.out.println("Unit price: "+shoppingUnitPrice1);
		String shoppingTotalPrice =totalPrice.getText();
		System.out.println("Total price "+shoppingTotalPrice);
		Assert.assertTrue(cartQuantity_BowflexSelectTech840.isDisplayed());
		Assert.assertTrue(itemsName_BowflexSelectTech840.isDisplayed());
		Assert.assertTrue(unitPrice_BowflexSelectTech840.isDisplayed());
		Assert.assertTrue(totalPrice.isDisplayed());
	}
	public void addMultipleItemsToCart() {
		click(homeButton);
		click(dumbbells);
		getJSObject();
		ScrolByPixel(600);
		click(bowflexSelectTech2080);
		quantityInput_BowflexSelectTech2080.clear();
		sendText(quantityInput_BowflexSelectTech2080, Constants.quantityAdd);
		click(addToCartButton);
		System.out.println("===Bowflex SelectTech 2080 Upgrade - 40 lb Add-On===");
		String shoppingCartQuanity2 = cartQuantity_BowflexSelectTech2080.getText();
		System.out.println("Quantity :"+shoppingCartQuanity2);
		String shoppingItemName2 = itemsName_BowflexSelectTech2080.getText();
		System.out.println("Item name: "+shoppingItemName2);
		String shoppingUnitPrice2 = unitPrice_BowflexSelectTech2080.getText();
		System.out.println("Unit price: "+shoppingUnitPrice2);
		String shoppingTotalPrice =totalPrice.getText();
		System.out.println("Total price "+shoppingTotalPrice);
		Assert.assertTrue(cartQuantity_BowflexSelectTech2080.isDisplayed());
		Assert.assertTrue(itemsName_BowflexSelectTech2080.isDisplayed());
		Assert.assertTrue(unitPrice_BowflexSelectTech2080.isDisplayed());
		Assert.assertTrue(totalPrice.isDisplayed());
	}
	
	public void verifyTotalPrice() {
		String shoppingCartQuanity1 = cartQuantity_BowflexSelectTech840.getText();
		int intQuantity1 = Integer.parseInt(shoppingCartQuanity1);
		
		String shoppingUnitPrice1 = unitPrice_BowflexSelectTech840.getText();
		String convertShoppingUnitPrice1= shoppingUnitPrice1.replaceAll("[$CADUSD]*", "");
		double dUnitPrice1=Double.parseDouble(convertShoppingUnitPrice1);
		double totalprice840 = dUnitPrice1 * intQuantity1;
		System.out.println("Total Price_840 after convert is " +totalprice840);

		String shoppingCartQuanity2 = cartQuantity_BowflexSelectTech2080.getText();
		int intQuantity2 = Integer.parseInt(shoppingCartQuanity2);
		
		String shoppingUnitPrice2 = unitPrice_BowflexSelectTech2080.getText();
		String convertShoppingUnitPrice2= shoppingUnitPrice2.replaceAll("[$CADUSD]*", "");
		double dUnitPrice2 = Double.parseDouble(convertShoppingUnitPrice2);
		double totalprice2080 = dUnitPrice2 * intQuantity2;
		System.out.println("Total Price after convert is " +totalprice2080);
	
		double expectedTotalPrice = totalprice840 + totalprice2080;
		System.out.println("Expected total price is : "+expectedTotalPrice);
		
		String shoppingTotalPrice =totalPrice.getText();
		String convertShoppingTotalPrice= shoppingTotalPrice.replaceAll("[$CADUSD]*", "");
		double actualTotalPrice=Double.parseDouble(convertShoppingTotalPrice);
		System.out.println("Actual total price is: "+(actualTotalPrice));
		
		Assert.assertEquals(expectedTotalPrice, actualTotalPrice);
	}
	
}	
	