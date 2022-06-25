package techTriangle_testNG.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class BoxingPage extends CommonMethods {

	public BoxingPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

//	@FindBy(xpath = " ")
//	public WebElement ;

	@FindBy(xpath = "//a[text()='Boxing/MMA']")
	public WebElement boxingTab;

	// ItemAr02
	@FindBy(xpath = "//select[@ng-model='searchCtrl.params.limit']")
	public WebElement displayDropdown;

	// ItemAr0301 ItemAr0302
	@FindBy(xpath = "//select[@ng-model='searchCtrl.params.sortBy']")
	public WebElement sortByDropdown;

	// ItemAr0303
	@FindBy(xpath = "//a[contains(@data-bind,'html: product.title')]")
	public List<WebElement> shortDescripList;

}
