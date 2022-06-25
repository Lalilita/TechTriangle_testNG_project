package techTriangle_testNG.utilities;

import techTriangle_testNG.pageObjects.AccessoriesPage;
import techTriangle_testNG.pageObjects.BoxingPage;
import techTriangle_testNG.pageObjects.CardioPage;
import techTriangle_testNG.pageObjects.CheckoutPage;
import techTriangle_testNG.pageObjects.Dumbbell55VgRbPage;
import techTriangle_testNG.pageObjects.Dumbbell60VgRbPage;
import techTriangle_testNG.pageObjects.DumbbellsPage;
import techTriangle_testNG.pageObjects.EbikesPage;
import techTriangle_testNG.pageObjects.HomePage;
import techTriangle_testNG.pageObjects.LoginPage;
import techTriangle_testNG.pageObjects.NewArrivalsPage;
import techTriangle_testNG.pageObjects.RegistrationPage;
import techTriangle_testNG.pageObjects.ShoppingCartPage;
import techTriangle_testNG.pageObjects.StrengthConditioningPage;
import techTriangle_testNG.pageObjects.StrengthEquipPage;
import techTriangle_testNG.pageObjects.DumbbellVgRbPage;
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
	public static DumbbellsPage dumbbellsPage;
	public static DumbbellVgRbPage dumbbellVgRbPage;
	public static Dumbbell60VgRbPage dumbbell60VgRbPagePage;
	public static Dumbbell55VgRbPage dumbbell55VgRbPagePage;
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
		dumbbellsPage = new DumbbellsPage();
		dumbbellVgRbPage = new DumbbellVgRbPage();
		dumbbell60VgRbPagePage = new Dumbbell60VgRbPage();
		dumbbell55VgRbPagePage = new Dumbbell55VgRbPage();
		boxingPage = new BoxingPage();  
		arrivalPage = new NewArrivalsPage(); 
	}
	
}
	
