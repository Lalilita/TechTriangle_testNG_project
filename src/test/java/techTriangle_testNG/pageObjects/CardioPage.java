package techTriangle_testNG.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class CardioPage extends CommonMethods{

	
	public CardioPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//a[@ng-href='https://www.fitnessavenue.ca/category/ZCAR/cardio']")
	public WebElement cardioTab;
	@FindBy( xpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div")
	public List <WebElement> cardioPageProducts;
	
	
	
	public void numberOfProductInsideCardioPage() {
		CommonMethods.click(cardioTab);
		
	}
	
	
	
		
	
	

}	
	