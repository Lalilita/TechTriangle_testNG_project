package techTriangle_testNG.pageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class HomePage extends CommonMethods {

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

	// Ratthanon
	@FindBy(xpath = "(//a[text()='View all'])[1]")
	public WebElement viewAllItem;

	@FindBy(xpath = "//button[@data-part-num='ACC003']")
	public WebElement AddToCartItem2;

	@FindBy(xpath = "//div[@id='cart_preview']")
	public WebElement CartItem;

	@FindBy(xpath = "//span[@class='carousel-arrow-next slick-arrow']")
	public WebElement SlideArrowRightButton;

	@FindBy(xpath = "//span[@class='carousel-arrow-prev slick-arrow']")
	public WebElement SlideArrowLeftButton;

	@FindBy(xpath = "//a[contains(@class,'slick-current')]")
	public WebElement SlidePictureCurrent;

	@FindBy(xpath = "//a[contains(@aria-describedby,'slick-slide')]")
	public List<WebElement> SlidePicture;

	@FindBy(xpath = "//div[@id='search-details']/h1")
	public WebElement TextDisplayItem;

	@FindBy(xpath = "//div[@class='widget product_short_description']/h1")
	public WebElement TextDisplayItem2;

	@FindBy(xpath = "//a[text()='Sign Up']")
	public WebElement signUp;

	@FindBy(xpath = "//a[text()='Strength Equipment']")
	public WebElement StrengthEquipmentTab;

	@FindBy(xpath = "//a[text()='Fitness Accessories']")
	public WebElement FitnessAccessiriesTab;

	@FindBy(xpath = "//div[@id='search-details']/h1")
	public WebElement ItemCatalog;

	@FindBy(xpath = "//ul[@class='nav navbar-nav ng-scope']/li[3]/ul/li/div/div/div")
	public List<WebElement> ItemCountStrengthTab;

	@FindBy(xpath = "//ul[@class='nav navbar-nav ng-scope']/li[4]/ul/li/div/div/div")
	public List<WebElement> ItemCountFinessTab;

	// Tola

	@FindBy(xpath = "//a[@href='/zkett/kettlebells']//span//img")
	public WebElement kettlebellsTab;

	@FindBy(xpath = "(//a[@title='Bowflex SelectTech 840 Adjustable Kettlebell'])[2]")
	public WebElement bowflexSelectTech840;

	@FindBy(xpath = "//div[@class='std_add_to_cart']//button[@name='add_to_cart']")
	public WebElement addToCartButton;

	@FindBy(xpath = "//div[@class='cart_qty']")
	public WebElement cartQuantity_BowflexSelectTech840;

	@FindBy(xpath = "//div[@class='short_desc']//a")
	public WebElement itemsName_BowflexSelectTech840;

	@FindBy(xpath = "//div[@class='price']")
	public WebElement unitPrice_BowflexSelectTech840;

	@FindBy(xpath = "//a[@href='https://www.fitnessavenue.ca/']//b")
	public WebElement homeButton;

	@FindBy(xpath = "//a[@href='/zdum/dumbbells']//span//img")
	public WebElement dumbbells;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[10]/div[2]/div[2]/div[4]/div[2]/div[2]/a/img")
	public WebElement bowflexSelectTech2080;

	@FindBy(xpath = "//input[@id='qty_100875']")
	public WebElement quantityInput_BowflexSelectTech2080;

	@FindBy(xpath = "(//div[@class='cart_qty'])[2]")
	public WebElement cartQuantity_BowflexSelectTech2080;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div[2]/div[1]/table/tbody/tr[2]/td[2]/div")
	public WebElement itemsName_BowflexSelectTech2080;

	@FindBy(xpath = "(//div[@class='price'])[2]")
	public WebElement unitPrice_BowflexSelectTech2080;

	@FindBy(xpath = "//div[@class='widget_content']//span[@class='total_amount']")
	public WebElement totalPrice;
	
	
	//Kangkook
	@FindBy(xpath="//*[@id=\"header\"]/div[4]/a[2]")
	public WebElement signUpBtn;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[4]/a[1]")
	public WebElement myAccountBtn;


	// -------------- Methods -------------- //
	
	//Lalita
	// LoginTest
	public void goToLogin() {
		loginBtn.click();
	}

	// LoginTest
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

	// Method Ratthanon
	public void checkArrowFunction(WebElement arrowType) throws InterruptedException {
		int count = 0;
		String ResultText = "";
		for (int i = 0; i < slidePictureNumber() + 1; i++) {
			arrowType.click();
			Thread.sleep(1000);
			if (!ResultText.contains(SlidePictureCurrent.getAttribute("href"))) {
				ResultText += SlidePictureCurrent.getAttribute("href") + " ";
				count++;
			} else {
				System.out.println("Repeate slide");
				break;
			}

		}
		Assert.assertEquals(count, SlidePicture.size());

	}

	public int slidePictureNumber() {
		return SlidePicture.size();

	}

	public void validateSlideClickable() throws InterruptedException {
		for (int i = 0; i < slidePictureNumber(); i++) {
			String url = SlidePictureCurrent.getAttribute("href").toLowerCase();
			String nameItems = "";
			System.out.println(url);
			SlidePictureCurrent.click();

			if (getDriver().getCurrentUrl().contains(Constants.SpecialDisplay)) {
				nameItems = TextDisplayItem2.getText().replace(" ", "-").toLowerCase();
				System.out.println(nameItems);
			} else {
				nameItems = TextDisplayItem.getText().replace(" ", "-").toLowerCase();
				System.out.println(nameItems);
			}

			Assert.assertTrue(url.contains(nameItems));

			getDriver().navigate().back();

			for (int j = 0; j <= i; j++) {
				SlideArrowRightButton.click();
				Thread.sleep(1000);
			}
		}

	}

	public void verifyLinkTab(String[] WebTab, WebElement typeTab) throws InterruptedException {

		for (int i = 0; i < WebTab.length; i++) {
			WebElement items = getDriver().findElement(By.xpath("//a[text()='" + WebTab[i] + "']"));
			hover(typeTab);
			items.click();

			Assert.assertEquals(removeAllNonAlphaNumeric(ItemCatalog.getText()), removeAllNonAlphaNumeric(WebTab[i]));
			Thread.sleep(1000);
			getDriver().navigate().back();

		}

	}

	public int CountItemonTab(List<WebElement> ItemCount) {
		return ItemCount.size();
	}

	public void validateListItem(String[] tab, WebElement elementtab, List<WebElement> tabLink) {
		List<String> nameList = new ArrayList<>(Arrays.asList(tab));
		hover(elementtab);

		for (int i = 0; i < tabLink.size(); i++) {
			String Itemtext = tabLink.get(i).getText();
			System.out.println(Itemtext);
			Assert.assertTrue(nameList.contains(Itemtext));
		}

	}

	public String removeAllNonAlphaNumeric(String s) {
		if (s == null) {
			return null;
		}
		return s.replaceAll("[^\\p{Alnum}]", "");
	}

	// Tola

	// Home page image clickable
	@FindBy(xpath = "//*[@id='content']/div[3]/div")
	public List<WebElement> homePageProductImages;

	public void verifyImagesClickable() {
		int imageNum = homePageProductImages.size();
		wait(Constants.standardwait_time);
		System.out.println("Number of images in home pages: " + imageNum);
		Assert.assertTrue(imageNum == Constants.homePageImageNum);
		String baseUrl = getDriver().getCurrentUrl();

		for (int i = 0; i < imageNum; i++) {
			WebElement listOfImage = homePageProductImages.get(i);
			waitForClickability(listOfImage).click();
			String newUrl = BaseClass.getDriver().getCurrentUrl();
			System.out.println("Base URL: " + baseUrl);
			System.out.println("Current URL: " + newUrl);
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
		System.out.println("Quantity :" + shoppingCartBowflexSelectTech840);
		String shoppingItemName1 = itemsName_BowflexSelectTech840.getText();
		System.out.println("Item name: " + shoppingItemName1);
		String shoppingUnitPrice1 = unitPrice_BowflexSelectTech840.getText();
		System.out.println("Unit price: " + shoppingUnitPrice1);
		String shoppingTotalPrice = totalPrice.getText();
		System.out.println("Total price " + shoppingTotalPrice);
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
		System.out.println("Quantity :" + shoppingCartQuanity2);
		String shoppingItemName2 = itemsName_BowflexSelectTech2080.getText();
		System.out.println("Item name: " + shoppingItemName2);
		String shoppingUnitPrice2 = unitPrice_BowflexSelectTech2080.getText();
		System.out.println("Unit price: " + shoppingUnitPrice2);
		String shoppingTotalPrice = totalPrice.getText();
		System.out.println("Total price " + shoppingTotalPrice);
		Assert.assertTrue(cartQuantity_BowflexSelectTech2080.isDisplayed());
		Assert.assertTrue(itemsName_BowflexSelectTech2080.isDisplayed());
		Assert.assertTrue(unitPrice_BowflexSelectTech2080.isDisplayed());
		Assert.assertTrue(totalPrice.isDisplayed());
	}

	public void verifyTotalPrice() {
		String shoppingCartQuanity1 = cartQuantity_BowflexSelectTech840.getText();
		int intQuantity1 = Integer.parseInt(shoppingCartQuanity1);

		String shoppingUnitPrice1 = unitPrice_BowflexSelectTech840.getText();
		String convertShoppingUnitPrice1 = shoppingUnitPrice1.replaceAll("[$CADUSD]*", "");
		double dUnitPrice1 = Double.parseDouble(convertShoppingUnitPrice1);
		double totalprice840 = dUnitPrice1 * intQuantity1;
		System.out.println("Total Price_840 after convert is " + totalprice840);

		String shoppingCartQuanity2 = cartQuantity_BowflexSelectTech2080.getText();
		int intQuantity2 = Integer.parseInt(shoppingCartQuanity2);

		String shoppingUnitPrice2 = unitPrice_BowflexSelectTech2080.getText();
		String convertShoppingUnitPrice2 = shoppingUnitPrice2.replaceAll("[$CADUSD]*", "");
		double dUnitPrice2 = Double.parseDouble(convertShoppingUnitPrice2);
		double totalprice2080 = dUnitPrice2 * intQuantity2;
		System.out.println("Total Price after convert is " + totalprice2080);

		double expectedTotalPrice = totalprice840 + totalprice2080;
		System.out.println("Expected total price is : " + expectedTotalPrice);

		String shoppingTotalPrice = totalPrice.getText();
		String convertShoppingTotalPrice = shoppingTotalPrice.replaceAll("[$CADUSD]*", "");
		double actualTotalPrice = Double.parseDouble(convertShoppingTotalPrice);
		System.out.println("Actual total price is: " + (actualTotalPrice));

		Assert.assertEquals(expectedTotalPrice, actualTotalPrice);
	}

}
