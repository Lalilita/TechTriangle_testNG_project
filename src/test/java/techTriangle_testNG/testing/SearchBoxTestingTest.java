package techTriangle_testNG.testing;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import techTriangle_testNG.pageObjects.SearchBoxTestingObject;
import techTriangle_testNG.utilities.CommonMethods;

public class SearchBoxTestingTest extends CommonMethods{

	SearchBoxTestingObject searchBoxTestingObject = new SearchBoxTestingObject();
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		getDriver();
	}

	@AfterMethod
	public void teardown() {
		tearDown();
	}
	
		
	@Test
	public void SBT01Test() throws InterruptedException {
		searchBoxTestingObject.SBT01();
	}
	
	@Test
	public void SBT02Test() throws InterruptedException {
		searchBoxTestingObject.SBT02();
	}
	
	@Test
	public void SBT03Test() throws InterruptedException{
		searchBoxTestingObject.SBT03();
	}
	
	@Test
	public void SBT04Test() throws InterruptedException{
		searchBoxTestingObject.SBT04();
	}
	
	@Test
	public void SBT05Test() throws InterruptedException{
		searchBoxTestingObject.SBT05();
	}
	
}