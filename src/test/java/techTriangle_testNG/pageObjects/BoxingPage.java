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

//	@FindBy(xpath = " ")
//	public WebElement ;

	@FindBy(xpath = "//a[text()='Boxing/MMA']")
	public WebElement boxingTab;

	// ItemAr02
	@FindBy(xpath = "//select[@ng-model='searchCtrl.params.limit']")
	public WebElement displayDropdown;

	// ItemAr0301 ItemAr0302
//	@FindBy(xpath = "//select[@ng-model='searchCtrl.params.sortBy']")
//	public WebElement sortByDropdown;

	// ItemAr0303
	@FindBy(xpath = "//a[contains(@data-bind,'html: product.title')]")
	public List<WebElement> shortDescripList;

	
	
	//-----------
	@FindBy (xpath = "//*[@class='browse_header']")
	public WebElement ebikesHeader; 
	
	@FindBy (xpath = "//select[@ng-model='searchCtrl.params.sortBy']")
	public WebElement sortByDropdown; //index 1 = part number(Asc), 2= short description (Asc), 3= Price (Asc)
	
	@FindBy (xpath = "//a[contains (@data-bind, 'html: product.title')]")
	public List <WebElement> eBikeItems; 
	
	@FindBy (xpath = "//div[@class='widget product_part_num content']")
	public WebElement partNumber; 
	
	@FindBy (xpath = "//a[@target='_self'][2]")
	public WebElement eBikesLinkBack; 
	
	@FindBy (xpath = "//div[@class='widget product_preview search']")
	public List <WebElement> itemList; 
	
	@FindBy (xpath = "//span[@class='regular_price']")
	public List <WebElement> itemsPrice; 
	
	
	public void verifyEBikesTabIsEnableAndNavigateToEBikesPage() {
		Assert.assertTrue(homePage.ebikesTap.isDisplayed());
		Assert.assertTrue(homePage.ebikesTap.isEnabled());
		homePage.ebikesTap.click();
		Assert.assertEquals(Constants.eBikesPageUrl, driver.getCurrentUrl()); //compare expectedURL with Actual navigated URL 
		Assert.assertTrue(ebikesHeader.isDisplayed()); //check if eBikes header is displayed on page
	}	
		
	public void verifySortByPartNumberAsc() throws InterruptedException {
		
		String[] eBikesArray = new String[eBikeItems.size()]; //create new string to keep each item's part number
		selectDropDownValue(sortByDropdown, "string:part_number_asc"); //select drop down "sort by part number"
		for(int i = 0; i < eBikeItems.size(); i++ ) {   //loop for keep  each item's part number into array
			eBikeItems.get(i).click();
			eBikesArray[i] = partNumber.getText(); 
			eBikesLinkBack.click();
		}
		//compare actual kept array with sorted array from Constants class
		Assert.assertEquals(eBikesArray, Constants.expectArraySortByPartNumberAsc); 
	}
	
	public void verifySortByShortDescriptionAsc() throws InterruptedException {
		
		String[] eBikesArray = new String[eBikeItems.size()];  //create new string to keep each item's Description
		selectDropDownValue(sortByDropdown, "string:short_description_asc");
		for(int i = 0; i < eBikeItems.size(); i++ ) {   //loop for keep  each item's Description into array
			eBikesArray[i] = eBikeItems.get(i).getText();
		}
		//compare actual kept array with sorted array from Constants class
		Assert.assertEquals(eBikesArray, Constants.expectArraySortByShortDescriptionAsc); 
	}
	
	public void verifySortByPriceAsc() throws InterruptedException {
		String[] eBikesArray = new String[eBikeItems.size()];
		selectDropDownValue(sortByDropdown, "Price (Asc)");
		ScrolByPixel(600);
		for(int i = 0; i < eBikeItems.size(); i++ ) {
			 eBikesArray[i] = itemsPrice.get(i).getText();
		}
//		System.out.println(Arrays.toString(eBikesArray));
//		Arrays.sort(eBikesArray);
//		System.out.println(Arrays.toString(eBikesArray));
		Assert.assertEquals(eBikesArray, Constants.expectArraySortByPartPriceAsc);
	}
	
	
}
