package techTriangle_testNG.pageObjects;

import org.openqa.selenium.support.PageFactory;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class NewArrivalsPage extends CommonMethods{

	
	public NewArrivalsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
//	@FindBy(xpath = " ")
//	public WebElement ;

}	
	