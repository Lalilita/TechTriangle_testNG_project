package techTriangle_testNG.pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import techTriangle_testNG.utilities.BaseClass;

public class SearchBoxTestingObject {


	
	WebDriver driver;
	WebDriverWait wait;

	
	public SearchBoxTestingObject() {
	PageFactory.initElements(BaseClass.getDriver(), this);
}

	@FindBy(xpath="//*[@id=\"header\"]/div[4]/a[2]")
	public WebElement signUpBtn;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	public WebElement email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	public WebElement password;
	
	@FindBy(xpath="//*[@id=\"NewCustomer\"]/div[1]/div/table/tbody/tr[2]/td[2]/label")
	public WebElement newCustomer;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/form/input[1]")
	public WebElement searchBox1;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/form/input[2]")
	public WebElement searchBox2;
	
	@FindBy(xpath="//*[@id=\"search-header-text\"]")
	public WebElement searchHeaderText;
	
	@FindBy(xpath="//*[@id=\"search-button\"]")
	public WebElement searchButton;
	
	@FindBy(xpath="//*[@id=\"searchApp\"]/form/div/div[2]/input")
	public WebElement searchApp;
		
//-------- Methods --------------
	
	public void SBT01() throws InterruptedException {
		searchBox1.sendKeys("a");
		Thread.sleep(3000);
		searchBox2.click();
		Thread.sleep(3000);
		Assert.assertTrue(searchHeaderText.isDisplayed());
	}
	
	

	public void SBT02() throws InterruptedException {
		searchBox1.sendKeys("a");
		Thread.sleep(3000);
		searchBox2.click();
		Thread.sleep(3000);
		Assert.assertTrue(searchButton.isDisplayed());
	}
	
	public void SBT03() throws InterruptedException {
		searchBox1.sendKeys("a");
		Thread.sleep(3000);
		searchBox2.click();
		Thread.sleep(3000);
		Assert.assertTrue(searchApp.isDisplayed());
	}	

	public void SBT04() throws InterruptedException {
		searchBox1.sendKeys("dumbel");
		Thread.sleep(3000);
		searchBox2.click();
		Thread.sleep(3000);
		Assert.assertTrue(searchApp.isDisplayed());
	}
	
	public void SBT05() throws InterruptedException {
		searchBox1.sendKeys("kettlebells");
		Thread.sleep(3000);
		searchBox2.click();
		Thread.sleep(3000);
		Assert.assertTrue(searchApp.isDisplayed());
	}


	

}