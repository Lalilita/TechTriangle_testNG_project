package techTriangle_testNG.utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class Constants {
	
	public static final String filePath = System.getProperty("user.dir") + "/src/test/resources/propertiesFolder/config.properties";

	public static final int explicit_wait_time = 10;
	
	public static final String SCREENSHOT_FILEPATH = "test-output/screenshort";
	
	//Login error text -- created by Lalita 06/16/2022
	public static final String usernameAndPasswordAreRequired = "Your Username and Password are required.";
	public static final String usernameIsRequired = "The Username field is required.";
	public static final String passwordIsRequired = "The Password field is required.";
	public static final String invalidLogin = "Invalid Login";
	
	//strength & conditioning page url   
	public static final String strengthAndConUrl = "https://www.fitnessavenue.ca/zsnc/strength-conditioning";
	public static final String weightsUrl = "https://www.fitnessavenue.ca/zwe/weights";
	public static final String virginRubberDumbbellsUrl = "https://www.fitnessavenue.ca/category/DUMBBELLS2/virgin-rubber-dumbbells";
	public static final String shoppingCartUrl = "https://www.fitnessavenue.ca/shopping_cart";
	public static final String checkoutUrl = "https://www.fitnessavenue.ca/checkout";
	
	//list 
	public static final ArrayList<String> expect55lbsProductDetails = 
			new ArrayList<>(Arrays.asList("55lbs Virgin Rubber Hex Dumbbell", "Part #", "DUM060", "Market Price", 
					"$110.00 CAD", "Our Price", "$71.50 CAD", "$71.50 CAD /ea"));
	
}	
