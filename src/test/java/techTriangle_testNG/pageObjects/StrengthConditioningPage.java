package techTriangle_testNG.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class StrengthConditioningPage extends CommonMethods{

	
	public StrengthConditioningPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//div[@class='widget browse_sub_categories']/div")
	public List<WebElement>  strengthAndConProductGroups;
	
	@FindBy(xpath = "//select[@ng-model='searchCtrl.params.limit']")
	public WebElement displayDropDown;
	
	@FindBy(xpath = "//select[@ng-model='searchCtrl.params.limit']/option")
	public List<WebElement> displayValue;
	
	@FindBy(xpath = "//div[@class='widget browse_sub_categories']/div[1]")
	public WebElement bodyWeightGroup;
	
	@FindBy(xpath = "//div[@class='image']")
	public List<WebElement> bodyWeightProducts;
	
	@FindBy(xpath = "//*[@ng-repeat='page in pages track by $index' and @ng-class='{active: page.active}']")
	public List<WebElement> pageNumberDisplayed;
	
	
	
	// -------------- Methods -------------- //
	

	public void findSizeOfStrengthAndConProductGroups() {
		int groupSize = strengthAndConProductGroups.size();
		System.out.println("There are "+groupSize+" groups of products are displayed");
	}
	
	public void verifyStrengthAndConProductGroupsIsClickable() {
		for(int i = 0; i < strengthAndConProductGroups.size(); i++) {
			isClickable(strengthAndConProductGroups.get(i), driver); 
//			System.out.println("group"+i+" is clickable");
		}
		System.out.println("Each group is clickable");
	}
	
	public void goTobodyWeightGroup() {
		bodyWeightGroup.click();
	}
	
	public void verifyNumberOfProductMacthWithDisplayFilter() throws InterruptedException {
		
		for(int i = 0; i < displayValue.size(); i++) {
		selectDropDownIndex(displayDropDown, i); //1=12, 2=24, 3=48, 4=96
		Thread.sleep(1000);
		int displayNumber = Integer.parseInt(displayValue.get(i).getText());
		int productDisplayNumber = bodyWeightProducts.size();
		int expectedNumberPages = pageNumberDisplayed.size();          //total = 37
		int actualNumberPages = (Integer.parseInt(getProperty("totalProductInBodyWeigthGroup"))/displayNumber)+1;
		Assert.assertTrue(productDisplayNumber <= displayNumber);
		Assert.assertEquals(expectedNumberPages, actualNumberPages);
		System.out.println("displayNumber = " +  displayNumber +
				" productDisplayNumber = " + productDisplayNumber+
				" expectedNumberPages = " + expectedNumberPages+
				" actualNumberPages = " + actualNumberPages);	
		
		}
	}
}