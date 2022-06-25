package techTriangle_testNG.pageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;
import techTriangle_testNG.utilities.Constants;

public class HomePage extends CommonMethods{

	
	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[text()='Login']")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//a[text()='Logout']")
	public WebElement logoutBtn;
	
	@FindBy(xpath = "//a[text()='Strength & Conditioning']")
	public WebElement strengthAndConTab;
	
	@FindBy(xpath = "//a[@class='ng-binding ng-isolate-scope btn' and text()='Weights']")
	public WebElement weightsTab;
	
	// Ratthanon
	@FindBy(xpath = "(//a[text()='View all'])[1]")
    public WebElement viewAllItem;

    @FindBy(xpath = "//button[@data-part-num='ACC003']")
    public WebElement AddToCartItem2;
    
    @FindBy(xpath = "//div[@id='cart_preview']")
    public WebElement CartItem;
    
    @FindBy(xpath = "//span[@class='carousel-arrow-next slick-arrow']")
    public WebElement SlideArrowRightButton; 
    
    @FindBy(xpath = "//span[@class='carousel-arrow-prev slick-arrow']")
    public WebElement SlideArrowLeftButton; 
    
    
    @FindBy(xpath = "//a[contains(@class,'slick-current')]")
    public WebElement SlidePictureCurrent; 
    
    @FindBy(xpath = "//a[contains(@aria-describedby,'slick-slide')]")
    public List<WebElement> SlidePicture; 
    
    @FindBy(xpath = "//div[@id='search-details']/h1")
    public WebElement TextDisplayItem; 
    
    @FindBy(xpath = "//div[@class='widget product_short_description']/h1")
    public WebElement TextDisplayItem2;
    
    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement signUp;
    
    @FindBy(xpath = "//a[text()='Strength Equipment']")
	 public WebElement StrengthEquipmentTab;
    
    @FindBy(xpath = "//a[text()='Fitness Accessories']")
	 public WebElement FitnessAccessiriesTab;
	 
	 @FindBy(xpath = "//div[@id='search-details']/h1")
	 public WebElement ItemCatalog;
	 
	 @FindBy(xpath = "//ul[@class='nav navbar-nav ng-scope']/li[3]/ul/li/div/div/div")
	 public List<WebElement> ItemCountStrengthTab;
	 
	 @FindBy(xpath = "//ul[@class='nav navbar-nav ng-scope']/li[4]/ul/li/div/div/div")
	 public List<WebElement> ItemCountFinessTab;
	 
	
	// -------------- Methods -------------- //
	// LoginTest
	public void goToLogin() {
		loginBtn.click();
	}
	// LoginTest
	public void verifyLoginSuccess() {
		Assert.assertTrue(logoutBtn.isDisplayed());
		Assert.assertTrue(logoutBtn.isEnabled());
		System.out.println("Successfully Login! Logout button is display and enable");
	}
	
	public void verifyStrengthAndConditioningTab() {
		Assert.assertTrue(strengthAndConTab.isDisplayed());
		System.out.println("Strength & Conditioning Tab is displayed");
		Assert.assertTrue(strengthAndConTab.isEnabled());
		System.out.println("Strength & Conditioning Tab is Enable");
	}
	
	public void verifyStrengthAndConditioningTabNavigateToItsPage() {
		strengthAndConTab.click();
		Assert.assertEquals(driver.getCurrentUrl(), Constants.strengthAndConUrl);
		System.out.println("Page is navigated to Strength & Conditioning product pages");
		
	}
	
	public void goToStrengthAndConPage() {
		strengthAndConTab.click();
	}
	
	public void goToWeightsPage() {
		weightsTab.click();
	}
	
	//Method Ratthanon
	public void checkArrowFunction(WebElement arrowType) throws InterruptedException {
		int count = 0;
		String ResultText = "";
		for (int i = 0; i < slidePictureNumber() + 1; i++) {
			arrowType.click();
			Thread.sleep(1000);
			if (!ResultText.contains(SlidePictureCurrent.getAttribute("href"))) {
				ResultText += SlidePictureCurrent.getAttribute("href") + " ";
				count++;
			} else {
				System.out.println("Repeate slide");
				break;
			}

		}
		Assert.assertEquals(count, SlidePicture.size());

	}
    

	public int slidePictureNumber() {
		return SlidePicture.size();

	}
	
	public void validateSlideClickable() throws InterruptedException {
		for (int i = 0; i < slidePictureNumber(); i++) {
			String url =  SlidePictureCurrent.getAttribute("href").toLowerCase();
			String nameItems = "";
			System.out.println(url);
			SlidePictureCurrent.click();
		
			if(BaseClass.getDriver().getCurrentUrl().contains(Constants.SpecialDisplay)) {
				nameItems = TextDisplayItem2.getText().replace(" ","-").toLowerCase();
				System.out.println(nameItems);
			}else {
				nameItems = TextDisplayItem.getText().replace(" ","-").toLowerCase();
				System.out.println(nameItems);
			}
			
			Assert.assertTrue(url.contains(nameItems));
			
			BaseClass.getDriver().navigate().back();
			
			for(int j=0;j<=i;j++) {
			SlideArrowRightButton.click();
			Thread.sleep(1000);
			}
		}
		
	}
	
	public void verifyLinkTab(String[] WebTab,WebElement typeTab) throws InterruptedException {		    
		 
	    for(int i=0;i<WebTab.length;i++) {
	    	WebElement items = BaseClass.getDriver().findElement(By.xpath("//a[text()='"+WebTab[i]+"']"));
	    	CommonMethods.hover(typeTab);
			items.click();	
			
			//int qty = Integer.parseInt((NumItemFound.getText().split(" "))[0]);
			Assert.assertEquals(removeAllNonAlphaNumeric(ItemCatalog.getText()), removeAllNonAlphaNumeric(WebTab[i]));
			Thread.sleep(1000);
			BaseClass.getDriver().navigate().back();
	    	
	    }

 }
	
	public int CountItemonTab(List<WebElement> ItemCount) {	        
	      return  ItemCount.size(); 
	}
	

	public void validateListItem(String[] tab,WebElement elementtab, List<WebElement> tabLink) {
		List<String> nameList = new ArrayList<>(Arrays.asList(tab));
		Actions action = new Actions(BaseClass.getDriver());
		 action.moveToElement(elementtab).perform();
	        
	        for(int i = 0; i<tabLink.size(); i++) {
	            String Itemtext = tabLink.get(i).getText();
	            System.out.println(Itemtext);
	            Assert.assertTrue(nameList.contains(Itemtext));
	        }		
		
	}
	
	public String removeAllNonAlphaNumeric(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceAll("[^\\p{Alnum}]", "");
    }
	

	
}	
	