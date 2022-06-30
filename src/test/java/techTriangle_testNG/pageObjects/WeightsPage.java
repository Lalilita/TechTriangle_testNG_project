package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class WeightsPage extends CommonMethods{

	
	public WeightsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@class='widget browse_sub_categories']/div[1]")
	public WebElement dumbbellsWidget;

	
	

	public void goToDumbbellsPage() {
		scrollToElement(weightsPage.dumbbellsWidget);
		weightsPage.dumbbellsWidget.click();
	}	

}	
	