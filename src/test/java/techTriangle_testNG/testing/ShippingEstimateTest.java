package techTriangle_testNG.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class ShippingEstimateTest extends CommonMethods {

	@BeforeClass
	public void SetUp() throws InterruptedException {
		getDriver();
		homePage.viewAllItem.click();
		homePage.AddToCartItem2.click();
		homePage.CartItem.click();
		cartPage.AddValidInformation();
	}

	@DataProvider(name = "ShipmentDataprovider")
	public Object[][] dpMethod() {

		return new Object[][] {
				{ Constants.Invalidzipcode, Constants.cityEstimate, Constants.CountryEstimate, Constants.stateEstimate,
						"true", Constants.InvalidZipMessage },
				{ Constants.zipcodeEstimate, Constants.cityEstimate, Constants.CountryEstimate,
						Constants.stateEstimateInvalid, "true", Constants.ZipcodeMismatchMessage },
				{ "", Constants.cityEstimate, Constants.CountryEstimate, Constants.stateEstimate, "false", "" },
				{ "", "", Constants.CountryEstimate, Constants.stateEstimate, "false", "" },
				{ "", "", "", "", "false", "" }

		};
	}

	@Test(priority = 1)
	public void VerifyCartShipmentWithValidInfo() throws InterruptedException {
		AssertJUnit.assertTrue(cartPage.ButtonEstimate.isEnabled());
		cartPage.VadidateShippingEstimate();
	}

	@Test(dataProvider = "ShipmentDataprovider", priority = 2)
	public void VerifyLogin(String zipcode, String city, String country, String region, String result, String message)
			throws InterruptedException {

		boolean clickable = Boolean.parseBoolean(result);
		cartPage.AddInvalidInformation(region, zipcode, city, country);

		AssertJUnit.assertTrue(cartPage.ButtonEstimate.isEnabled() == clickable);

		if (clickable == true) {
			cartPage.ButtonEstimate.click();
			AssertJUnit.assertTrue(cartPage.ShippingErrorMessage.getText().contains(message));
		}

		Thread.sleep(2000);
	}

	@AfterClass
	public void TearDown() {
		tearDown();
	}
}
