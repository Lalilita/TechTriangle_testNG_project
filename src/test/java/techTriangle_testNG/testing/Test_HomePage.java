package techTriangle_testNG.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class Test_HomePage extends CommonMethods {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		BaseClass.getDriver();
	}

	@AfterClass
	public void teardown() {
		System.out.println("browser closed");
	}
  
	@Test(enabled = true)
	public void addItemToCart() {
		
		homePage.homePageAddItemToCart();
		homePage.addMultipleItemsToCart();
		
		
	}
	

}
