package techTriangle_testNG.pageObjects;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class CheckoutPage extends CommonMethods {

	public CheckoutPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//div[@id='cart_preview']")
	public WebElement itemLink;

	@FindBy(xpath = "//form[@id='checkout-form']")
	public WebElement checkoutForm;

	@FindBy(xpath = "//input[@name='billing_company']")
	public WebElement companyInput;

	@FindBy(xpath = "//input[@name='billing_fname']")
	public WebElement fNameInput;

	@FindBy(xpath = "//input[@name='billing_lname']")
	public WebElement lNameInput;

	@FindBy(xpath = "//input[@name='billing_line_1']")
	public WebElement address1Input;

	@FindBy(xpath = "//input[@name='billing_line_2']")
	public WebElement address2Input;

	@FindBy(xpath = "//select[@name='billing_country']")
	public WebElement countryDropdown;

	@FindBy(xpath = "//select[@name='billing_country_division']")
	public WebElement stateDropdown;

	@FindBy(xpath = "//input[@name='billing_city']")
	public WebElement cityInput;

	@FindBy(xpath = "//input[@name='billing_postal_code']")
	public WebElement zipCodeInput;

	@FindBy(xpath = "//input[@name='billing_phone']")
	public WebElement phoneInput;

	@FindBy(xpath = "//input[@name='billing_email']")
	public WebElement emailInput;

	@FindBy(xpath = "//td[@class='vtop'][1]")
	public WebElement productPart;

	@FindBy(xpath = "//td[@class='vtop']//tr[1]/td")
	public WebElement productName;

	@FindBy(xpath = "//td[@class='align_center vtop']")
	public WebElement productQty;

	@FindBy(xpath = "//td[@class='align_right vtop price']")
	public WebElement itemPrice;

	@FindBy(xpath = "//td[@class='align_right vtop total']")
	public WebElement itemTotal;

	@FindBy(xpath = "//span[@class='subtotal-value']")
	public WebElement subTotalChckout;

	@FindBy(xpath = "//button[@id='checkout-button']")
	public WebElement placeOrderBtn;

	// -------------- Methods -------------- //

	public void previewCart() {
		itemLink.click();
	}

	public void enterBillingInfo() throws InterruptedException {
		sendText(companyInput, getProperty("company"));
		sendText(fNameInput, getProperty("fName"));
		sendText(lNameInput, getProperty("lName"));
		sendText(address1Input, getProperty("address1"));
		sendText(address2Input, getProperty("address2"));
		selectDropDownValue(countryDropdown, getProperty("country"));
		Thread.sleep(1000);
		selectDropDownValue(stateDropdown, getProperty("state"));
		sendText(cityInput, getProperty("city"));
		sendText(zipCodeInput, getProperty("zip"));
		sendText(phoneInput, getProperty("phone"));
		sendText(emailInput, getProperty("email"));
	}

	public ArrayList<String> getListOfReviewOrder() {
		ArrayList<String> reviewOrderList = new ArrayList<>();
		reviewOrderList.add(productPart.getText());
		reviewOrderList.add(productName.getText());
		reviewOrderList.add(productQty.getText());
		reviewOrderList.add(itemPrice.getText());
		reviewOrderList.add(itemTotal.getText());
		reviewOrderList.add(subTotalChckout.getText());
		return reviewOrderList;
	}

	public void verifyReviewOrderEqualsToCartOrder(ArrayList<String> cartList, ArrayList<String> reviewOrderList) {
		scrollToElement(productPart);
		System.out.println(cartList);
		System.out.println(reviewOrderList);
		Assert.assertEquals(cartList, reviewOrderList);
		System.out.println("Cart order and Checkout order are matched");
	}

	public void verifyPlaceOrederBtnIsEnable() {
		Assert.assertTrue(isClickable(placeOrderBtn, driver));
		System.out.println("Place order button is clickable");
	}

}
