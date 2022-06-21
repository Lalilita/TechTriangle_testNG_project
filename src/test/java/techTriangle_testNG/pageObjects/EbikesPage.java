package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class EbikesPage extends CommonMethods{

	
	public EbikesPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//a[@ng-href='https://www.fitnessavenue.ca/category/EBIKES/ebikes']")
	public WebElement ebikesTap;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[8]/div[2]/div[2]/div[2]")
	public WebElement hover;
	
	@FindBy(xpath = "//div[@class='view-larger-image']//a[@title='Magnum Classic II – Low Step Folding Electric Bike - Black']")
	public WebElement EnlargeBikeImage;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/div[1]/a[2]")
	public WebElement forwardArrow;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div[1]/span[1]")
	public WebElement bikeName;
	
	@FindBy (xpath = "/html/body/div[3]/div[2]/div/div[2]/a")
	public WebElement closeTab;
	
	public void verifyBikeImageCount() {
		
		CommonMethods.click(ebikesTap);
		Assert.assertTrue(ebikesTap.isEnabled());
		CommonMethods.jsClick(EnlargeBikeImage);
		CommonMethods.wait(Constants.standardwait_time);
		String expectedBikeName = bikeName.getText();
		System.out.println(expectedBikeName);
		Assert.assertTrue(expectedBikeName.contains("Bike"));
		
		for (int i = 1; i<Constants.numberofBike; i++) {
			
			CommonMethods.wait(Constants.standardwait_time);
			forwardArrow.click();
			expectedBikeName = bikeName.getText();
			System.out.println(expectedBikeName);
			Assert.assertTrue(expectedBikeName.contains("Bike"));
		}
		CommonMethods.click(closeTab);
	}

}	
	