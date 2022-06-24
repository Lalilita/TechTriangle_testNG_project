package techTriangle_testNG.testing;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import techTriangle_testNG.utilities.CommonMethods;


public class StrengthAndConNumberPageTest extends CommonMethods{

	WebDriver driver;

	@BeforeClass
	public void setup() {
		getDriver();
	}

	@AfterClass
	public void teardown() {
		tearDown();
	}
  
	@Test
	public void TTG_STR_001_verifyStrengthAndConditioningTab() {
		homePage.verifyStrengthAndConditioningTab();
		homePage.verifyStrengthAndConditioningTabNavigateToItsPage();
	}
	
	@Test(dependsOnMethods = "TTG_STR_001_verifyStrengthAndConditioningTab")
	public void TTG_STR_002_verifyProductGroupInStrengthAndConditioning() {
		strengthConPage.findSizeOfStrengthAndConProductGroups();
		strengthConPage.verifyStrengthAndConProductGroupsIsClickable();
	}
	
	@Test(dependsOnMethods = "TTG_STR_002_verifyProductGroupInStrengthAndConditioning")
	public void TTG_STR_003_verifyNumberPageProductDisplayed() throws InterruptedException {
		strengthConPage.goTobodyWeightGroup(); 
		strengthConPage.verifyNumberOfProductMacthWithDisplayFilter();
	}
}



