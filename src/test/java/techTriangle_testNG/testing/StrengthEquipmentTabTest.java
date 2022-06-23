package techTriangle_testNG.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class StrengthEquipmentTabTest extends CommonMethods{
 
	@BeforeClass
	public void SetUp() throws InterruptedException {
		getDriver();

	}
	
	@Test(priority = 1)
	public void ValidateListItem() throws InterruptedException {  
		homePage.validateListItem(Constants.StrengthEquipmentTab,homePage.StrengthEquipmentTab,homePage.ItemCountStrengthTab);
	}
	
	@Test(priority = 2)
	public void ValidateNumberItem() throws InterruptedException {  
		int CountItemonTab = homePage.CountItemonTab(homePage.ItemCountStrengthTab);
		homePage.StrengthEquipmentTab.click(); 
	    int CountItemonPage = equipPage.CountItemStrengthEquipmentonPage();
		
		//It's failed because the number of Items are not equal
		Assert.assertEquals(CountItemonPage, CountItemonTab);
	}

	@Test(priority = 3)
	public void ValidateTabLink() throws InterruptedException {       
		homePage.verifyLinkTab(Constants.StrengthEquipmentTab,homePage.StrengthEquipmentTab);	
		
	}

	@AfterClass
	public void TearDown() {
		tearDown();
	}
	
	
}
