package techTriangle_testNG.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class ShoppingCartPage extends CommonMethods {

	public ShoppingCartPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//div[@class='widget product_part_num content']")
	public WebElement productPartNumber; 

	@FindBy(xpath = "//div[@class='widget product_short_description']//a")
	public WebElement productName;

	@FindBy(xpath = "//input[@class='qty']")
	public WebElement qtyBox;

	@FindBy(xpath = "//td[@title='Item Price']")
	public WebElement itemPrice;

	@FindBy(xpath = "//td[@title='Total']")
	public WebElement total;

	@FindBy(xpath = "//tr[@class='subtotal-row']/td[2]")
	public WebElement subtotal;

	@FindBy(xpath = "//button[@id='update-cart']")
	public WebElement updateBtn;

	@FindBy(xpath = "//button[@value='Clear']")
	public WebElement clearBtn;

	@FindBy(xpath = "//button[@value='Checkout']")
	public WebElement checkoutBtn;

	@FindBy(xpath = "//div[@class='empty']")
	public WebElement noItemHeader;

	@FindBy(xpath = "//button[@value='Continue Shopping']")
	public WebElement continueShoppingLink;
	
	//Ratthanon
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
    
    @FindBy(xpath = "//td[@ng-bind='rate.translated_name + rate.translated_speed']")
    public List<WebElement> ShippingProviders;
    
    @FindBy(xpath = "//div[@id='shipping-estimates-errors']/ul/li/span")
    public WebElement ShippingErrorMessage;
    
  

	// -------------- Methods -------------- //

	public double getDoubleFromPrice(WebElement el) {
		String str = el.getText().substring(1);
		str = str.substring(0, str.length() - 4);
		double num = Double.parseDouble(str);
		return num;
	}

	public void verifyUpdateQty(String number) {
		qtyBox.sendKeys(Keys.BACK_SPACE);
		qtyBox.sendKeys(Keys.BACK_SPACE);
		sendText(qtyBox, number);
		updateBtn.click();
		int qty = Integer.parseInt(number);
		double itemprice = getDoubleFromPrice(itemPrice);
		double actualTotalprice = getDoubleFromPrice(total);
		double actualTsubtotalprice = getDoubleFromPrice(subtotal);
		double expectTotal = qty * itemprice;
		Assert.assertEquals(expectTotal, actualTotalprice);
		Assert.assertEquals(actualTotalprice, actualTsubtotalprice);
//		System.out.println(itemprice + " x " + qty + " = " + actualTotalprice);
//		System.out.println("Total and Subtotal update and display as multiply by updated Qty");
	}

	public void goToCheckOutProcess() {
		checkoutBtn.click();
		Assert.assertEquals(Constants.checkoutUrl, driver.getCurrentUrl());
		Assert.assertTrue(checkPage.checkoutForm.isDisplayed());
//		System.out.println("Checkout button navigate to Checkout Page");
	}

	public ArrayList<String> getListOfAddedProduct() {
		ArrayList<String> addedProductList = new ArrayList<>();
		addedProductList.add(productPartNumber.getText());
		addedProductList.add(productName.getText());
		addedProductList.add(qtyBox.getAttribute("value"));
		addedProductList.add(itemPrice.getText());
		addedProductList.add(total.getText());
		addedProductList.add(subtotal.getText());
		return addedProductList;
	}
	
	public void verifyClearBtn() {
		clearBtn.click();
		aceptAlert();
		Assert.assertTrue(noItemHeader.isDisplayed());
		Assert.assertTrue(continueShoppingLink.isDisplayed());
		System.out.println("All Product in cart is cleared");
	}
	
	// Ratthanon
		public void AddValidInformation() throws InterruptedException {

			InputPostalCode.sendKeys(Constants.zipcodeEstimate);
			InputCity.sendKeys(Constants.cityEstimate);
			selectDropDownValue(CountrySelect, Constants.CountryEstimate);
			Thread.sleep(2000);
			selectDropDownValue(RegionSelect, Constants.stateEstimate);
		}

		public void VadidateShippingEstimate() {
			ButtonEstimate.click();
			double ProductPrice = Double.parseDouble(ShippingPrice.getText().substring(1));
			System.out.println(ShippingService.getText());
			System.out.println(ProductPrice);
					
			List<String>ShippingProviderList = new ArrayList<>();
			
			int i = 0;
			for(WebElement p : ShippingProviders) {
				ShippingProviderList.add(p.getText());
				System.out.println(ShippingProviderList.get(i));
				i++;
			}
		   
			Assert.assertTrue(ShippingService.isDisplayed() && ProductPrice > 0 && ShippingProviderList.size()>=1);

		}
		
		public void AddInvalidInformation(String region,String zipcode,String city,String country) {
			ClearData(region);
			InputPostalCode.sendKeys(zipcode);
			InputCity.sendKeys(city);
			if(country != "") {
				selectDropDownValue(cartPage.RegionNoSelect, region);
			}
			
		}

		public void ClearData(String region) {
			InputPostalCode.clear();
			InputCity.clear();
			if (region.equals("")) {
				selectDropDownValue(CountryNoselect, Constants.CountryOutsiteUS);
			}
			
		}
		

}
