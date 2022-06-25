package techTriangle_testNG.testing;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import techTriangle_testNG.utilities.CommonMethods;


public class HomePageAddItemTest extends CommonMethods{

	WebDriver driver;

	@BeforeClass
	public void setup() {
		getDriver();
	}

	@AfterClass
	public void teardown() {
		tearDown();
	}
  
	@Test (enabled = true)
	public void homePage_AddItemToCart() {
		homePage.homePageAddItemToCart();
		homePage.addMultipleItemsToCart();
		homePage.verifyTotalPrice();
	}

}
