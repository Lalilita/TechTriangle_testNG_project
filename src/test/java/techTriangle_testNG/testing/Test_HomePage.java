package techTriangle_testNG.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class Test_HomePage extends CommonMethods {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		getDriver();
	}

	@AfterClass
	public void teardown() {
		System.out.println("browser closed");
		getDriver().close();
	}
	
	@Test (priority = 1)
	public void homePage_imageClickable() {
		homePage.verifyImagesClickable();
	}
  
	@Test(priority = 2)
	public void homePage_AddItemToCart() {
		homePage.homePageAddItemToCart();
		homePage.addMultipleItemsToCart();
		homePage.verifyTotalPrice();
	}
	
}
