package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class Dumbbell60VgRbPage extends CommonMethods{

	
	public Dumbbell60VgRbPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//p[text()='Out of Stock']")
	public WebElement outOfStockText;
	
	@FindBy(xpath = "//button[@value='Add to cart']")
	public WebElement addToCartBtn;
	

	
	
	
}	
	