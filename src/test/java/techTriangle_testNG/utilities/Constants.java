package techTriangle_testNG.utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class Constants {

	public static final String filePath = System.getProperty("user.dir")
			+ "/src/test/resources/propertiesFolder/config.properties";

	public static final int explicit_wait_time = 10;

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
	public static final String eBikesPageUrl = "https://www.fitnessavenue.ca/category/EBIKES/ebikes";

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

	public static final String[] expectArraySortByPartNumberAsc = { "EBCLASSIC2B", "EBCLASSIC2W", "EBCOSMO", "EBMETROB",
			"EBMETROP1", "EBMETROP2", "EBMETROW" };
	public static final String[] expectArraySortByShortDescriptionAsc = {
			"Magnum Classic II – Low Step Folding Electric Bike - Black",
			"Magnum Classic II – Low Step Folding Electric Bike - White", "Magnum Cosmopolitan Electric Bike - Black",
			"Magnum Metro Low Step Electric Bike - Black", "Magnum Metro+ High Step Electric Bike",
			"Magnum Metro+ Low Step Electric Bike", "Magnum Metro Low Step Electric Bike - White" };
	public static final String[] expectArraySortByPartPriceAsc = { "$2,199.99 CAD EA", "$2,199.99 CAD EA", "$2,199.99 CAD EA", 
	        "$2,849.99 CAD EA", "$2,849.99 CAD EA", "$2,849.99 CAD EA", "$2,849.99 CAD EA"};


}
