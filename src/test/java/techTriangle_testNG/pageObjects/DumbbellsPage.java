package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class DumbbellsPage extends CommonMethods{

	
	public DumbbellsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@class='widget browse_sub_categories']/div[2]")
	public WebElement virginRubberDumbbellsWidget;
	

	
	// -------------- Methods -------------- //
	
	
	public void goToVirginRubberDumbbellsPage() {
		virginRubberDumbbellsWidget.click();
	}

}	
	