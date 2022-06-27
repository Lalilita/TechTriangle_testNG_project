package techTriangle_testNG.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class BoxingPage extends CommonMethods {

	public BoxingPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}


	@FindBy(xpath = "//*[@class='browse_header']")
	public WebElement boxingHeader;

	@FindBy(xpath = "//select[@ng-model='searchCtrl.params.sortBy']")
	public WebElement sortByDropdown; 

	@FindBy(xpath = "//a[contains (@data-bind, 'html: product.title')]")
	public List<WebElement> boxingItems;

	@FindBy(xpath = "//div[@class='widget product_part_num content']")
	public WebElement partNumber;

	@FindBy(xpath = "//a[text()='Back']")
	public WebElement backToBoxingPageLink;

	@FindBy(xpath = "//div[@class='widget product_preview search']")
	public List<WebElement> itemList;

	@FindBy(xpath = "//span[@class='regular_price' or @class='discount_price']")
	public List<WebElement> itemPrice;
	
	

	public void verifyEBikesTabIsEnableAndNavigateToEBikesPage() {
		Assert.assertTrue(homePage.boxingTap.isDisplayed());
		Assert.assertTrue(homePage.boxingTap.isEnabled());
		homePage.boxingTap.click();
		Assert.assertEquals(Constants.boxingPageUrl, driver.getCurrentUrl()); // compare expectedURL with Actual
																				// navigated URL
		Assert.assertTrue(boxingHeader.isDisplayed()); // check if eBikes header is displayed on page
	}	

	public void verifySortByPartNumberAsc() throws InterruptedException {
		homePage.boxingTap.click();
		String[] boxingArray = new String[boxingItems.size()]; // create new string to keep each item's part number
		selectDropDownValue(sortByDropdown, "Part Number (Asc)"); // select drop down "sort by part number"
		Thread.sleep(2000);
		for (int i = 0; i < boxingItems.size(); i++) { // loop for keep each item's part number into array
			scrollToElement(boxingItems.get(i));
			boxingItems.get(i).click();
			boxingArray[i] = partNumber.getText();
			backToBoxingPageLink.click();
		}
		// compare actual kept array with sorted array from Constants class
		Assert.assertEquals(boxingArray, Constants.expectArraySortByPartNumberAsc);
	}

	public void verifySortByShortDescriptionAsc() throws InterruptedException {
		homePage.boxingTap.click();
		String[] boxingArray = new String[boxingItems.size()]; // create new string to keep each item's Description
		selectDropDownValue(sortByDropdown, "Short Description (Asc)");
		Thread.sleep(2000);
		for (int i = 0; i < boxingItems.size(); i++) { // loop for keep each item's Description into array
			boxingArray[i] = boxingItems.get(i).getText();
		}
		// compare actual kept array with sorted array from Constants class
		Assert.assertEquals(boxingArray, Constants.expectArraySortByShortDescriptionAsc);
	}

	public void verifySortByPriceAsc() throws InterruptedException {
		homePage.boxingTap.click();
		String[] boxingArray = new String[boxingItems.size()];
		selectDropDownValue(sortByDropdown, "Price (Asc)");
		Thread.sleep(2000);
		ScrolByPixel(600);
		for (int i = 0; i < itemPrice.size(); i++) {
			boxingArray[i] = itemPrice.get(i).getText();
		}
//			System.out.println(Arrays.toString(eBikesArray));
//			Arrays.sort(eBikesArray);
//			System.out.println(Arrays.toString(eBikesArray));
		Assert.assertEquals(boxingArray, Constants.expectArraySortByPartPriceAsc);
	}

}
