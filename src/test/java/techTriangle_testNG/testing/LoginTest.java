package techTriangle_testNG.testing;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;


public class LoginTest extends CommonMethods{

	WebDriver driver;

	@BeforeClass
	public void setup() {
		BaseClass.getDriver();
		homePage.goToLogin();
	}

	@AfterClass
	public void teardown() {
		System.out.println("browser closed");
	}
	
    @DataProvider
    public Object[][] invalidUsernamesAndPasswords() {
        return new Object[][]{
        	new Object[]{"", ""},   //001
        	new Object[]{"", getProperty("tolaValidPassword")},	//002
        	new Object[]{getProperty("tolaValidUsername"), ""}, //003
        	new Object[]{getProperty("tolaInvalidUsername"), getProperty("tolaValidPassword")},  //004
        	new Object[]{getProperty("tolaValidUsername"), getProperty("tolaInvalidPassword")},	 //005
            new Object[]{getProperty("tolaInvalidUsername"), getProperty("tolaInvalidPassword")},//006
        };
    }
    
    @DataProvider
    public Object[][] validUsernameAndPassword() {
        return new Object[][]{
            new Object[]{getProperty("tolaValidUsername"), getProperty("tolaValidPassword")},	 //007
        };
    }
	
  
	@Test(dataProvider = "invalidUsernamesAndPasswords")
	public void TTG_LOGIN_001_to_006(String username, String password) {
		loginPage.loginToHomepage(username, password);	
		loginPage.verifyLoginFailed();
	}
	
	@Test(dataProvider = "validUsernameAndPassword")
	public void TTG_LOGIN_007(String username, String password) {
		loginPage.loginToHomepage(username, password);	
		homePage.verifyLoginSuccess();
	}

}
