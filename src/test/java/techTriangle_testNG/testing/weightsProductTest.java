package techTriangle_testNG.testing;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;


public class weightsProductTest extends CommonMethods{

	WebDriver driver;

	@BeforeClass
	public void setup() {
		BaseClass.getDriver();
	}

	@AfterClass
	public void teardown() {
		System.out.println("browser closed");
	}
  
	@Test
	public void TTG_WPP_001_verifyWeightsTab() {
		weightsPage.verifyWeightsTab();
	}
	
	@Test(dependsOnMethods = "TTG_WPP_001_verifyWeightsTab")
	public void TTG_WPP_002_verifyAddOutOfStockProduct() {
		weightsPage.verifyNotAbleToAddOutOfStockProductToCart();
	}

	@Test(dependsOnMethods = "TTG_WPP_002_verifyAddOutOfStockProduct")
	public void TTG_WPP_003_verifyAddAvalibleProduct() {
		BaseClass.driver.navigate().back();
		dumbbellVgRbPage.goToVirginRubber55lbsPage();
		dumbbell55VgRbPagePage.verifyProductDetailsAreDisplayed();
		dumbbell55VgRbPagePage.verifyAddToCartBtnDisplayAndClickable();
	}
	
	@Test(dependsOnMethods = "TTG_WPP_003_verifyAddAvalibleProduct")
	public void TTG_WPP_004_verifyShoppingProcess() throws InterruptedException {
		dumbbell55VgRbPagePage.addItemTocartAndGoToShoppingCartPage();
		cartPage.updateQty(getProperty("firstQty"));
		Thread.sleep(1000);
		cartPage.updateQty(getProperty("secondQty"));
		cartPage.goToCheckOutProcess();
		checkPage.previewCart();
		cartPage.verifyClearBtn();
	}
	
	
	
	

	


	
	
	
	
	
	
	
	
}
