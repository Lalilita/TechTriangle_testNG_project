package techTriangle_testNG.testing;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchBoxTesting {

//	SBT01 Search box is displayed
//	SBT02 Search button is displayed
//	SBT03 Verify cursor is defualtly in search box
//	SBT04 verify search is accept input
//	SBT05 Check the search box functionality


	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.fitnessavenue.ca/");
        
//        https://www.fitnessavenue.ca/
        
        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
			
	}
	
		
	@Test
	public void SBT01() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/form/input[1]")).sendKeys("a");
		//*[@id="header"]/div[2]/form/input[1]

		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/form/input[2]")).click();
		//*[@id="header"]/div[2]/form/input[2]
		
		Thread.sleep(3000);

		
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"search-header-text\"]")).isDisplayed());
				//*[@id="search-header-text"]
	}
	
	
	@Test
	public void SBT02() {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/form/input[1]")).sendKeys("a");
		//*[@id="header"]/div[2]/form/input[1]

		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/form/input[2]")).click();
		//*[@id="header"]/div[2]/form/input[2]
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"search-button\"]")).isDisplayed());
		//*[@id="search-button"]
		//*[@id="searchApp"]/form/div/div[2]/input
		
	}
	
	@Test
	public void SBT03() {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/form/input[1]")).sendKeys("a");
		//*[@id="header"]/div[2]/form/input[1]

		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/form/input[2]")).click();
		//*[@id="header"]/div[2]/form/input[2]
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"searchApp\"]/form/div/div[2]/input")).isDisplayed());
		
		//*[@id="searchApp"]/form/div/div[2]/input
		
	}
	
	@Test
	public void SBT04() {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/form/input[1]")).sendKeys("dumbel");
		//*[@id="header"]/div[2]/form/input[1]

		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/form/input[2]")).click();
		//*[@id="header"]/div[2]/form/input[2]
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"searchApp\"]/form/div/div[2]/input")).isDisplayed());
		
		//*[@id="searchApp"]/form/div/div[2]/input
		//*[@id="searchApp"]/form/div/div[2]/input
		
	}
	
	@Test
	public void SBT05() {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/form/input[1]")).sendKeys("kettlebells");
		//*[@id="header"]/div[2]/form/input[1]

		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/form/input[2]")).click();
		//*[@id="header"]/div[2]/form/input[2]
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"searchApp\"]/fieldset/legend")).isDisplayed());
		//*[@id="searchApp"]/fieldset/legend
		
	}
	

}