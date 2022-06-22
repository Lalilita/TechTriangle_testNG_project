package techTriangle_testNG.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class HomePageSlideTest extends CommonMethods{
	@BeforeClass
	public void SetUp() throws InterruptedException {
		BaseClass.getDriver();

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
		BaseClass.tearDown();
	}

}


