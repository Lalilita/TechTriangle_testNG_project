package techTriangle_testNG.utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class Constants {

	public static final String filePath = System.getProperty("user.dir")
			+ "/src/test/resources/propertiesFolder/config.properties";

	public static final int explicit_wait_time = 5;

	public static final String SCREENSHOT_FILEPATH = "test-output/screenshort";

	// Login error text -- created by Lalita 06/16/2022
	public static final String usernameAndPasswordAreRequired = "Your Username and Password are required.";
	public static final String usernameIsRequired = "The Username field is required.";
	public static final String passwordIsRequired = "The Password field is required.";
	public static final String invalidLogin = "Invalid Login";

	// strength & conditioning page url
	public static final String strengthAndConUrl = "https://www.fitnessavenue.ca/zsnc/strength-conditioning";
	public static final String weightsUrl = "https://www.fitnessavenue.ca/zwe/weights";
	public static final String virginRubberDumbbellsUrl = "https://www.fitnessavenue.ca/category/DUMBBELLS2/virgin-rubber-dumbbells";
	public static final String shoppingCartUrl = "https://www.fitnessavenue.ca/shopping_cart";
	public static final String checkoutUrl = "https://www.fitnessavenue.ca/checkout";
	public static final String boxingPageUrl = "https://www.fitnessavenue.ca/zmma/boxing-mma";
	public static final String fitnessFacebookUrl = "https://www.facebook.com/fitnessavenue.ca/";
	public static final String fitnessInstagramUrl = "https://www.instagram.com/accounts/login/?next=/fitnessavenue/";

	// list
	public static final ArrayList<String> expect55lbsProductDetails = new ArrayList<>(
			Arrays.asList("55lbs Virgin Rubber Hex Dumbbell", "Part #", "DUM060", "Market Price", "$110.00 CAD",
					"Our Price", "$71.50 CAD", "$71.50 CAD /ea"));

	// Link Equipment Tab
	public static final String[] StrengthEquipmentTab = { "Benches", "Lower Body / Legs", "Squat / Power Racks",
			"Cable Attachments", "Rigs", "Weight Lifting Bars", "Cable Machines", "Upper Body", "Weights",
			"Core & Back" };
	public static final String[] FitnessAccessoriesTab = { "Aerobic Training", "Hand Grips", "Workout Mats",
			"Balance & Stability", "Jump Ropes", "Yoga & Pilates", "Chin Up Bars", "Recovery & Wellness",
			"Straps, Wraps & Support", "Exercise Balls", "Resistance / Elastic Bands", "Shaker Bottles" };

	// Input for shipping Estimate
	public static final String cityEstimate = "Sterling";
	public static final String cityEstimateIvalid = "CitySterling";
	public static final String CountryEstimate = "United States";
	public static final String CountryOutsiteUS = "Canada";
	public static final String stateEstimate = "Virginia";
	public static final String stateEstimateInvalid = "Washington";
	public static final String zipcodeEstimate = "20166";
	public static final String Invalidzipcode = "20888";
	public static final String SpecialDisplay = "AmStaff-Fitness-SpaceSmart";
	public static final String InvalidZipMessage = "FedEx shipping : Destination postal code missing or invalid.";
	public static final String ZipcodeMismatchMessage = "FedEx shipping : Destination Postal-State Mismatch.";

	// Tola
	public static final String quantityAdd = "2";
	public static final int homePageImageNum = 5;
	public static final int numberofBike = 7;
	public static final int standardwait_time = 3;

	// Kangkook

	public static final String[] expectArraySortByPartNumberAsc = {"ACC026", "MAA002", "MAA004", "MAA005", "MAA006", 
		"MMA TB055B", "MMA011B", "MMA011BLA", "MMA011R", "MMA011W", "MMA016", "MMA017"};
		
	public static final String[] expectArraySortByShortDescriptionAsc = {"108\" Hand Wraps - Black", 
			"108\" Hand Wraps - Blue", "108\" Hand Wraps - Red", "108\" Hand Wraps - White", 
			"50-100lbs Adjustable Vinyl Heavy Bag", "AmStaff Fitness 12oz Boxing Gloves", 
			"AmStaff Fitness 14oz Boxing Gloves","AmStaff Fitness 16oz Boxing Gloves",
			"AmStaff Fitness Commercial Free-Standing XL Heavy Bag", "AmStaff Fitness DF7019 Foldable Speedbag Platform",
			"AmStaff Fitness Free Standing Speed Bag","AmStaff Fitness Muay Thai Pads - Pair"};
	
	public static final String[] expectArraySortByPartPriceAsc = {"$4.99 CAD EA", "$4.99 CAD EA", 
	         "$4.99 CAD EA", "$4.99 CAD EA", "$9.99 CAD EA", "$14.99 CAD EA", "$15.99 CAD EA", 
	         "$19.99 CAD EA", "$29.99 CAD EA", "$29.99 CAD EA", "$29.99 CAD EA", "$29.99 CAD EA"};

}
