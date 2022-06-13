package techTriangle_testNG.pageObjects;

import org.openqa.selenium.support.PageFactory;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class CardioPage extends CommonMethods{

	
	public CardioPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
//	@FindBy(xpath = " ")
//	public WebElement ;

}	
	