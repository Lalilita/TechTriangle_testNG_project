package techTriangle_testNG.testing;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import techTriangle_testNG.utilities.CommonMethods;

public class FilterThePriceTest extends CommonMethods {

    @BeforeMethod
    public void setup() {
        getDriver();
    }

  @Test
  public void VerifyFilterPrice() throws InterruptedException {
      homePage.LoginAccount();
      homePage.VerifyOrderPrice(); 
  }


}