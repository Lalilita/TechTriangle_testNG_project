package techTriangle_testNG.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techTriangle_testNG.utilities.BaseClass;
import techTriangle_testNG.utilities.CommonMethods;

public class AccessoriesPage extends CommonMethods{

	
	public AccessoriesPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
//	@FindBy(xpath = " ")
//	public WebElement ;
	
	@FindBy(xpath = "//div[@class='widget browse_sub_categories']/div")
	 public List<WebElement> ItemAccessoriesCountPage;
	 
	 public int CountItemFitnessAccessoriesPage() {
		 
	        
	        for(int j = 0; j<ItemAccessoriesCountPage.size(); j++) {
	            String text2 = ItemAccessoriesCountPage.get(j).getText();
	            System.out.println(text2);
	        }
		 
		 return ItemAccessoriesCountPage.size();
	 }

}	
	