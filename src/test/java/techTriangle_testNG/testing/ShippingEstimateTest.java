package techTriangle_testNG.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class ShippingEstimateTest extends CommonMethods{
	
	@BeforeClass
	  public void SetUp() throws InterruptedException {
		  BaseClass.getDriver();
		  homePage.viewAllItem.click();
		  homePage.AddToCartItem2.click();
		  homePage.CartItem.click();	  
	  }
	  

	  @DataProvider(name="ShipmentDataprovider")
		public Object[][] dpMethod() {
			return new Object[][] {{ "", Constants.cityEstimate, Constants.CountryEstimate, Constants.stateEstimate}, {"", "", Constants.CountryEstimate, Constants.stateEstimate}, { "", "", "", ""}};
		} 
		
		@Test(priority = 1)
		public void VerifyCartShipmentWithValidInfo() throws InterruptedException {
			cartPage.AddValidInformation();
			AssertJUnit.assertTrue(cartPage.ButtonEstimate.isEnabled());
			cartPage.VadidateShippingEstimate();
		}	
		
		@Test(dataProvider = "ShipmentDataprovider", priority = 2)
		public void VerifyLogin(String zipcode, String city, String country, String region) throws InterruptedException {
			cartPage.ClearData(country,region);
			cartPage.InputPostalCode.sendKeys(zipcode);
			cartPage.InputCity.sendKeys(city);
	        AssertJUnit.assertFalse(cartPage.ButtonEstimate.isEnabled());
			Thread.sleep(3000);
		}

	  @AfterClass
	  public void TearDown() {
		  BaseClass.tearDown();
	  }
}

