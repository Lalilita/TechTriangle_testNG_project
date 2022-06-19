package techTriangle_testNG.testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class FooterFacebookTest extends CommonMethods{
	
	@BeforeClass
	  public void SetUp() {
		  BaseClass.getDriver();
	  }
		
		@Test
		@Ignore
		public void VerifyFaceBookLink() throws InterruptedException {

			homePage.FaceBookButton.click();
			//System.out.println("HomePage -- " + driver.getTitle());

			Set<String> ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			String homePage = it.next();
			String newTab = it.next();

			BaseClass.getDriver().switchTo().window(newTab);
			Thread.sleep(3000);
			//System.out.println("NewTab -- " + driver.getCurrentUrl());

			Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("facebook.com") && BaseClass.getDriver().getCurrentUrl().contains("fitnessavenue"));

		}
		
		@Test
		public void test() throws InterruptedException {

			homePage.signUp.click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();
			homePage.ReCapcha.click();
			
		}
		
		
		
	  
	  @AfterClass
	  public void TearDown() {
		  //BaseClass.tearDown();
	  }
	

}
