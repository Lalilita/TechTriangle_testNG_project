package techTriangle_testNG.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class StrengthConditioningPage extends CommonMethods {

	public StrengthConditioningPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//div[@class='widget browse_sub_categories']/div")
	public List<WebElement> strengthAndConProductsType;

	@FindBy(xpath = "//select[@ng-model='searchCtrl.params.limit']")
	public WebElement displayDropDown;

	@FindBy(xpath = "//select[@ng-model='searchCtrl.params.limit']/option")
	public List<WebElement> displayValue; //in dropdown

	@FindBy(xpath = "//div[@class='widget browse_sub_categories']/div[1]")
	public WebElement bodyWeightTypeTab;

	@FindBy(xpath = "//div[@class='image']")
	public List<WebElement> bodyWeightProducts; //count in page

	@FindBy(xpath = "//*[@ng-repeat='page in pages track by $index' and @ng-class='{active: page.active}']")
	public List<WebElement> pageNumberDisplayed;

	// -------------- Methods -------------- //
	
	public void findSizeOfStrengthAndConProductTypes() {
		int groupSize = strengthAndConProductsType.size();
		Assert.assertEquals(Integer.parseInt(getProperty("expectedTotalProductType")), groupSize);
//		System.out.println("There are " + groupSize + " groups of products are displayed");
	}

	public void verifyStrengthAndConProductTypesAreClickable() {
		for (int i = 0; i < strengthAndConProductsType.size(); i++) {
			Assert.assertTrue(isClickable(strengthAndConProductsType.get(i), driver));
		}
//		System.out.println("Each product group tab is clickable");
	}

	public void goTobodyWeightType() {  //first typeTap
		bodyWeightTypeTab.click();
	}

	public void verifyNumberOfProductMatchWithDisplayFilter() throws InterruptedException {

		for (int i = 0; i < displayValue.size(); i++) {
			selectDropDownIndex(displayDropDown, i); // 1=12, 2=24, 3=48, 4=96
			Thread.sleep(1000); //allow complete loading all items in a page
			int filterNumber = Integer.parseInt(displayValue.get(i).getText()); // number that displayed in filter
			int productDisplayNumber = bodyWeightProducts.size(); // number of product that displayed on each page
			Assert.assertTrue(productDisplayNumber <= filterNumber);
			
			int expectedNumberPages = (Integer.parseInt(getProperty("totalProductBodyWeigth")) / filterNumber) + 1; 
			int actualNumberPages = pageNumberDisplayed.size(); // expected number of page in the bottom box
			Assert.assertEquals(actualNumberPages, expectedNumberPages);
//			System.out.println("displayNumber = " + filterNumber + " productDisplayNumber = " + productDisplayNumber
//					+ " expectedNumberPages = " + expectedNumberPages + " actualNumberPages = " + actualNumberPages);
		} //displayNumber = 12 productDisplayNumber = 12 expectedNumberPages = 4 actualNumberPages = 4
	}
}