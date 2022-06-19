package techTriangle_testNG.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class ShoppingCartPage extends CommonMethods{

	
	public ShoppingCartPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
//	@FindBy(xpath = " ")
//	public WebElement ;
	
	 @FindBy(xpath = "//input[@id='shipping-estimates-postal-code']")
	    public WebElement InputPostalCode;
	  
	  @FindBy(xpath = "//input[@id='shipping-estimates-city']")
	    public WebElement InputCity;
	  
	  @FindBy(xpath = "(//select[@class='form-control ng-pristine ng-untouched ng-valid'])[1]")
	    public WebElement CountrySelect;
	  
	  @FindBy(xpath = "(//select[@class='form-control ng-valid ng-dirty ng-valid-parse ng-touched'])[1]")
	    public WebElement CountryNoselect;
	  
	  @FindBy(xpath = "//select[@class='form-control ng-pristine ng-untouched ng-valid']")
	    public WebElement RegionSelect;
	  
	  @FindBy(xpath = "(//select[@class='form-control ng-valid ng-dirty ng-valid-parse ng-touched'])[2]")
	    public WebElement RegionNoSelect;
	  
	  @FindBy(xpath = "//button[@id='shipping-estimates-submit']")
	    public WebElement ButtonEstimate;
	  
	  @FindBy(xpath = "(//table[@class='table table-striped table-hover small']/tbody/tr)[1]/td[1]")
	    public WebElement ShippingService;
	  
	  @FindBy(xpath = "(//table[@class='table table-striped table-hover small']/tbody/tr)[1]/td[2]")
	    public WebElement ShippingPrice;
	  
	
	
	   
	  
	  public void AddValidInformation() throws InterruptedException {
		  
		  InputPostalCode.sendKeys(Constants.zipcodeEstimate);
		  InputCity.sendKeys(Constants.cityEstimate);
		  CommonMethods.selectDropDownValue(CountrySelect,Constants.CountryEstimate);
		  Thread.sleep(2000);
		  CommonMethods.selectDropDownValue(RegionSelect,Constants.stateEstimate);	  		  
	  }
	  
	  public void VadidateShippingEstimate() {
		  ButtonEstimate.click();
		  double ProductPrice = Double.parseDouble(ShippingPrice.getText().substring(1));		  
		  System.out.println(ShippingService.getText());
		  System.out.println(ProductPrice);
		  
	  }
		
		
		public void ClearData(String country, String region) {
			InputPostalCode.clear();
			InputCity.clear();
			if(region.equals("")) {
			CommonMethods.selectDropDownValue(CountryNoselect,Constants.CountryOutsiteUS);
			}
			//selectElement.deselectAll();
		}
		


}	
	