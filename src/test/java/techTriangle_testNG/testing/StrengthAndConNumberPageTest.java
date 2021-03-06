package techTriangle_testNG.testing;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import techTriangle_testNG.utilities.CommonMethods;


public class StrengthAndConNumberPageTest extends CommonMethods{


	@BeforeClass
	public void setup() {
		getDriver();
	}

	@AfterClass
	public void teardown() {
		tearDown();
	}
  
	@Test
	public void TTG_STR_001_verifyStrengthAndConditioningTab() throws InterruptedException {
		homePage.verifyStrengthAndConditioningTab();
		homePage.verifyStrengthAndConditioningTabNavigateToItsPage();
	}
	
	@Test(dependsOnMethods = "TTG_STR_001_verifyStrengthAndConditioningTab")
	public void TTG_STR_002_verifyProductGroupInStrengthAndConditioning() throws InterruptedException { //bodyWeightGroup
		strengthConPage.findSizeOfStrengthAndConProductTypes();
		strengthConPage.verifyStrengthAndConProductTypesAreClickable();
	}
	
	@Test(dependsOnMethods = "TTG_STR_002_verifyProductGroupInStrengthAndConditioning")
	public void TTG_STR_003_verifyNumberPageProductDisplayed() throws InterruptedException {
		strengthConPage.goTobodyWeightType(); 
		strengthConPage.verifyNumberOfProductMatchWithDisplayFilter();
	}
}



