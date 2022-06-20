package techTriangle_testNG.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageSignUp {


	
//	1.1 Enter valid email, valid password
//	and valid Billing info
//	
//	1.2 Enter valid email and valid password
//	but invalid Billing info
//
//	2.1 Enter valid email but invalid password
//	with valid Billing info
//
//	2.2 Enter valid email but  invalid password
//	and invalid Billing info
//	
//	3.1 Enter invalid email and valid password
//	and valid Billing info
//	
//	3.2 Enter invalid email and valid password
//	but invalid Billing info
//
//	4.1 Enter invalid email and invalid password
//	and valid Billing info
//
//	4.2 Enter invalid email, invalid password
//	and also invalid Billing info

	
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

//	1.1 Enter valid email, valid password
//	and valid Billing info
	// already success, can not use same email again fitnessavenueTC@gmail.com
	@Ignore
	@Test
	public void _0101SignUp() {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/a[2]")).click();
		//*[@id="header"]/div[4]/a[2]
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("fitnessavenueTC@gmail.com");
		//*[@id="email"]
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("fitnessavenue");
		//*[@id="password"]
		
		driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("fitnessavenue");
		//*[@id="password_confirmation"]
		
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("firstName");
		//*[@id="first_name"]
		
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("lastName");
		//*[@id="last_name"]
						
		driver.findElement(By.xpath("//*[@id=\"billing_address1\"]")).sendKeys("address");
		//*[@id="billing_address1"]
		
		driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("address");
		//*[@id="billing_city"]
		
		driver.findElement(By.xpath("//*[@id=\"billing_country_code\"]")).sendKeys("United");
		//*[@id="billing_country_code"]
				
//		driver.findElement(By.xpath("//*[@id=\"billing_province_state\"]")).submit();
		//*[@id="billing_province_state"]
		
		driver.findElement(By.xpath("//*[@id=\"billing_postal_zip_code\"]")).sendKeys("12345");
		//*[@id="billing_postal_zip_code"]
		
		driver.findElement(By.xpath("//*[@id=\"billing_phone\"]")).sendKeys("1");
		//*[@id="billing_phone"]
		
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
		//*[@id="recaptcha-anchor"]/div[1]
		
		driver.findElement(By.xpath("//*[@id=\"NewCustomer\"]/div[6]/button")).click();
		//*[@id="NewCustomer"]/div[6]/button
		
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/a[1]")).isDisplayed());
				//*[@id="header"]/div[4]/a[1]
	}
	
	
//	2.1 Enter valid email but invalid password
//	with valid Billing info
	// there is no invalid password - whatever I put it, it was accepted 
	// password "1" accepted, id "fitnessavenueTCT@gmail.com"
	// also "*" accepted
	@Ignore
	@Test
	public void _0201invalidPassword() {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/a[2]")).click();
		//*[@id="header"]/div[4]/a[2]
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("fitnessavenueTCT@gmail.com");
		//*[@id="email"]
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1");
		//*[@id="password"]
		
		driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("1");
		//*[@id="password_confirmation"]
		
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("firstName");
		//*[@id="first_name"]
		
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("lastName");
		//*[@id="last_name"]
						
		driver.findElement(By.xpath("//*[@id=\"billing_address1\"]")).sendKeys("address");
		//*[@id="billing_address1"]
		
		driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("address");
		//*[@id="billing_city"]
		
		driver.findElement(By.xpath("//*[@id=\"billing_country_code\"]")).sendKeys("United");
		//*[@id="billing_country_code"]
				
//		driver.findElement(By.xpath("//*[@id=\"billing_province_state\"]")).submit();
		//*[@id="billing_province_state"]
		
		driver.findElement(By.xpath("//*[@id=\"billing_postal_zip_code\"]")).sendKeys("12345");
		//*[@id="billing_postal_zip_code"]
		
		driver.findElement(By.xpath("//*[@id=\"billing_phone\"]")).sendKeys("1");
		//*[@id="billing_phone"]
		
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
		//*[@id="recaptcha-anchor"]/div[1]
		
		driver.findElement(By.xpath("//*[@id=\"NewCustomer\"]/div[6]/button")).click();
		//*[@id="NewCustomer"]/div[6]/button
		
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/a[1]")).isDisplayed());
				//*[@id="header"]/div[4]/a[1]
	}
	
//	3.1 Enter invalid email and valid password
//	and valid Billing info
	
	@Test
	public void _0301invalidEmail() {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/a[2]")).click();
		//*[@id="header"]/div[4]/a[2]
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("fitnessavenueTCTC");
		//*[@id="email"]
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NewCustomer\"]/div[1]/div/table/tbody/tr[2]/td[2]/label")).isDisplayed());
		//*[@id="NewCustomer"]/div[1]/div/table/tbody/tr[2]/td[2]/label
	}
	
//	3.2 Enter invalid email and valid password
//	but invalid Billing info
	
	@Test
	public void _0302invalidEmailInvalidBillingInfo() {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/a[2]")).click();
		//*[@id="header"]/div[4]/a[2]
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("fitnessavenueTCTC");
		//*[@id="email"]
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).click();

		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NewCustomer\"]/div[1]/div/table/tbody/tr[2]/td[2]/label")).isDisplayed());
		//*[@id="NewCustomer"]/div[1]/div/table/tbody/tr[2]/td[2]/label
	}
	
//	4.1 Enter invalid email and invalid password
//	and valid Billing info
	// There is no invalid password
	@Test
	public void _0401invalidEmailInvalidPassword() {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/a[2]")).click();
		//*[@id="header"]/div[4]/a[2]
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("fitnessavenueTCTC");
		//*[@id="email"]
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).click();

		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NewCustomer\"]/div[1]/div/table/tbody/tr[2]/td[2]/label")).isDisplayed());
		//*[@id="NewCustomer"]/div[1]/div/table/tbody/tr[2]/td[2]/label
	}
	
//	4.2 Enter invalid email, invalid password
//	and also invalid Billing info
	
	@Test
	public void _0402invalidEmailInvalidPasswordInvalidBillingInfo() {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/a[2]")).click();
		//*[@id="header"]/div[4]/a[2]
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("fitnessavenueTCTC");
		//*[@id="email"]
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).click();

		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"NewCustomer\"]/div[1]/div/table/tbody/tr[2]/td[2]/label")).isDisplayed());
		//*[@id="NewCustomer"]/div[1]/div/table/tbody/tr[2]/td[2]/label
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
			
	}
	

}
	
////	1. Registration-Sign-in
//	@Ignore
//	@Test
//	public void _01signIn() {
//		
//		driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys("abc053120221@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("Abc12!?$");
//		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
//		
//		Assert.assertTrue(driver.findElement(By.xpath("/html/body")).isDisplayed());
//	}
//
////	2. Registration with invalid Email-id
//	@Test
//	public void _02invalidEmailId() throws InterruptedException {
//		
//		driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys("abc05312022");
//		driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("Abc12!?$");
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
//		
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='woocommerce-error']/li"))));
//		
//		String errorMessage = driver.findElement(By.xpath("//*[@class='woocommerce-error']/li")).getText();
//		String expectedErrorMessage = "Error: Please provide a valid email address.";
//		Assert.assertTrue(errorMessage.equals(expectedErrorMessage));
//		
//	}
////	3. Registration with empty Email-id
//	@Test
//	public void _03emptyEmailId() throws InterruptedException {
//		
//		driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
////		driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys("abc05312022@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("Abc12!?$");
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
//				
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='woocommerce-error']/li"))));
//				
//		String errorMessage = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li")).getText();
//		String expectedErrorMessage = "Error: Please provide a valid email address.";
//		Assert.assertTrue(errorMessage.equals(expectedErrorMessage));
//	}
//	
////	4. Registration with empty password
//	
//	@Test
//	public void _04emptyPassword() {
//		
//		driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys("abc053120222@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
//		
//		String errorMessage = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li")).getText();
//		String expectedErrorMessage = "Error: Please enter an account password.";
//		Assert.assertTrue(errorMessage.equals(expectedErrorMessage));
//		
//	}  
//	
////	5. Registration with empty Email-id & password
//	
//	@Test
//	public void _05emptyEmailIdEmptyPassword() {
//		
//		driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
//		
//		String errorMessage = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li")).getText();
//		String expectedErrorMessage = "Error: Please provide a valid email address.";
//		Assert.assertTrue(errorMessage.equals(expectedErrorMessage));
//		
//	}
	
	
//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//			
//	}
//	
//
//}


//MY ACCOUNT - REGISTRATION
//1. Registration-Sign-in / abc053120221@gmail.com / Abc12!?$
//2. Registration with invalid Email-id / abc05312022 / Abc12!?$
//3. Registration with empty Email-id / empty / Abc12!?$
//4. Registration with empty password / abc053120222@gmail.com / empty
//5. Registration with empty Email-id & password / empty / empty