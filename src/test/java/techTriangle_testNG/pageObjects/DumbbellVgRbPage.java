package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class DumbbellVgRbPage extends CommonMethods{

	
	public DumbbellVgRbPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[text()='60lbs Virgin Rubber Hex Dumbbell']")
	public WebElement virginRubber60lbsTextLink;
	
	@FindBy(xpath = "//a[text()='55lbs Virgin Rubber Hex Dumbbell']")
	public WebElement virginRubber55lbsTextLink;

	
	// -------------- Methods -------------- //
	
	
	public void goToVirginRubber60lbsPage() {
		scrollToElement(virginRubber60lbsTextLink);
		virginRubber60lbsTextLink.click();
	}
	
	public void goToVirginRubber55lbsPage() {
		scrollToElement(virginRubber55lbsTextLink);
		virginRubber55lbsTextLink.click();
	}

	
	
	
}	
	