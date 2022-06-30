package techTriangle_testNG.testing;



import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.ArrayList;
import techTriangle_testNG.utilities.CommonMethods;


public class WeightsProductTest extends CommonMethods{

	@BeforeClass
	public void setup() {
		getDriver();
	}

	@AfterClass
	public void teardown() {
		tearDown();
	}
  
	@Test
	public void TTG_WPP_001_verifyWeightsTab() throws InterruptedException {
		homePage.verifyWeightsTab();
	}
	
	@Test(dependsOnMethods = "TTG_WPP_001_verifyWeightsTab")
	public void TTG_WPP_002_verifyAddOutOfStockProduct() throws InterruptedException {
		dumbbell60VgRbPage.verifyNotAbleToAddOutOfStockProductToCart();
	}

	@Test(dependsOnMethods = "TTG_WPP_002_verifyAddOutOfStockProduct")
	public void TTG_WPP_003_verifyAddAvalibleProduct() throws InterruptedException {
		driver.navigate().back();
		dumbbellVgRbPage.goToVirginRubber55lbsPage();
		dumbbell55VgRbPage.verifyProductDetailsAreDisplayed();
		dumbbell55VgRbPage.verifyAddToCartBtnDisplayAndClickable();
	}
	
	@Test(dependsOnMethods = "TTG_WPP_003_verifyAddAvalibleProduct")
	public void TTG_WPP_004_verifyShoppingProcess() throws InterruptedException {
		dumbbell55VgRbPage.addItemTocartAndGoToShoppingCartPage();
		cartPage.verifyUpdateQty(getProperty("firstQty"));
		Thread.sleep(1000);
		cartPage.verifyUpdateQty(getProperty("secondQty"));
		ArrayList<String> cartList = cartPage.getListOfAddedProduct();
		cartPage.goToCheckOutProcess();
		checkPage.enterBillingInfo();
		checkPage.verifyReviewOrderEqualsToCartOrder(cartList, checkPage.getListOfReviewOrder());
		checkPage.verifyPlaceOrederBtnIsClickable();
	}
	
	@Test(dependsOnMethods = "TTG_WPP_004_verifyShoppingProcess")
	public void TTG_WPP_005_verifyAbleToClearAllItemWithClearBtn() throws InterruptedException {
		checkPage.previewCart();
		cartPage.verifyClearBtn();
	}
	
	
}