package techTriangle_testNG.testing;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import techTriangle_testNG.utilities.CommonMethods;

public class SearchBoxTestingTest extends CommonMethods{

	
	
	@BeforeClass
	public void setup() {
		getDriver();
	}

	@AfterClass
	public void teardown() {
		tearDown();
	}
	
		
	@Test
	public void SBT01Test() throws InterruptedException {
		searchPage.SBT01();
	}
	
	@Test
	public void SBT02Test() throws InterruptedException {
		searchPage.SBT02();
	}
	
	@Test
	public void SBT03Test() throws InterruptedException{
		searchPage.SBT03();
	}
	
	@Test
	public void SBT04Test() throws InterruptedException{
		searchPage.SBT04();
	}
	
	@Test
	public void SBT05Test() throws InterruptedException{
		searchPage.SBT05();
	}
	
}