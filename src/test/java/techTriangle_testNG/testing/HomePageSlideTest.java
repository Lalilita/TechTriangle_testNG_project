package techTriangle_testNG.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import techTriangle_testNG.utilities.CommonMethods;

public class HomePageSlideTest extends CommonMethods{
	@BeforeClass
	public void SetUp() throws InterruptedException {
		getDriver();

	}

	@Test(priority = 1)
	public void verifyArrowRightFunction() throws InterruptedException {		
		homePage.checkArrowFunction(homePage.SlideArrowRightButton);				
	}
	
	@Test(priority = 2)
	public void verifyArrowLeftFunction() throws InterruptedException {		
		homePage.checkArrowFunction(homePage.SlideArrowLeftButton);				
	}
	
	@Test(priority = 3)
	public void verifySlideClickable() throws InterruptedException {		
		homePage.validateSlideClickable();			
	}
	
	

	@AfterClass
	public void TearDown() {
		tearDown();
	}

}


