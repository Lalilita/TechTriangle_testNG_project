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
	
//	@FindBy(xpath = " ")
//	public WebElement ;
	@FindBy(xpath = "//div[@class='social-media']/ul/li[1]")
    public WebElement FaceBookButton;
    
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
    
    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    public WebElement ReCapcha;
    
    @FindBy(xpath = "//a[text()='Strength Equipment']")
	 public WebElement StrengthEquipmentTab;
	 
	 @FindBy(xpath = "//div[@id='search-details']/h1")
	 public WebElement ItemCatalog;
	 
	 @FindBy(xpath = "//ul[@class='nav navbar-nav ng-scope']/li[3]/ul/li/div/div/div")
	 public List<WebElement> ItemCount;
    
    

    
  
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
	
	public void verifyLinkTab() throws InterruptedException {		    
		 
	    for(int i=0;i<Constants.StrengthEquipmentTab.length;i++) {
	    	
	    	WebElement items = BaseClass.getDriver().findElement(By.xpath("//a[text()='"+Constants.StrengthEquipmentTab[i]+"']"));
	    	Actions action = new Actions(BaseClass.getDriver());
			action.moveToElement(StrengthEquipmentTab).perform();
			items.click();				
			Assert.assertEquals(ItemCatalog.getText(), Constants.StrengthEquipmentTab[i]);
			Thread.sleep(1000);
			BaseClass.getDriver().navigate().back();
	    	
	    }

 }
	
	public int CountItemonTab() {	        
	      return  ItemCount.size(); 
	}
	

	public void validateListItem() {
		List<String> nameList = new ArrayList<>(Arrays.asList(Constants.StrengthEquipmentTab));
		Actions action = new Actions(BaseClass.getDriver());
		 action.moveToElement(StrengthEquipmentTab).perform();
	        
	        for(int i = 0; i<ItemCount.size(); i++) {
	            String Itemtext = ItemCount.get(i).getText();
	            System.out.println(Itemtext);
	            Assert.assertTrue(nameList.contains(Itemtext));
	        }		
		
	}
	
	
	
	
  
	

}	
	