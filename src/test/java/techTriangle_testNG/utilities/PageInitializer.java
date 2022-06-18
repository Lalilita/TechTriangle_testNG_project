package techTriangle_testNG.utilities;

import techTriangle_testNG.pageObjects.AccessoriesPage;
import techTriangle_testNG.pageObjects.BoxingPage;
import techTriangle_testNG.pageObjects.CardioPage;
import techTriangle_testNG.pageObjects.CheckoutPage;
import techTriangle_testNG.pageObjects.EbikesPage;
import techTriangle_testNG.pageObjects.HomePage;
import techTriangle_testNG.pageObjects.LoginPage;
import techTriangle_testNG.pageObjects.NewArrivalsPage;
import techTriangle_testNG.pageObjects.RegistrationPage;
import techTriangle_testNG.pageObjects.ShoppingCartPage;
import techTriangle_testNG.pageObjects.StrengthConditioningPage;
import techTriangle_testNG.pageObjects.StrengthEquipPage;
import techTriangle_testNG.pageObjects.WeightsPage;

public class PageInitializer extends BaseClass {

	public static HomePage homePage;
	public static LoginPage loginPage;
	public static RegistrationPage regisPage;
	public static ShoppingCartPage cartPage;
	public static CheckoutPage checkPage;
	public static EbikesPage ebikePage;
	public static CardioPage cardioPage;
	public static StrengthEquipPage equipPage;
	public static AccessoriesPage accessoriesPage;
	public static StrengthConditioningPage strengthConPage;
	public static WeightsPage weightsPage;
	public static BoxingPage boxingPage;
	public static NewArrivalsPage arrivalPage;
	
	
	public static void initialize() {
		homePage = new HomePage(); 
		loginPage = new LoginPage();  
		regisPage = new RegistrationPage(); 
		cartPage = new ShoppingCartPage();  
		checkPage = new CheckoutPage();  
		ebikePage = new EbikesPage();  
		cardioPage = new CardioPage();  
		equipPage = new StrengthEquipPage();  
		accessoriesPage = new AccessoriesPage();  
		strengthConPage = new StrengthConditioningPage();  
		weightsPage = new WeightsPage();  
		boxingPage = new BoxingPage();  
		arrivalPage = new NewArrivalsPage(); 
	}
	
}
	
