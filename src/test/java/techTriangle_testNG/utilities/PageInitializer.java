package techTriangle_testNG.utilities;

import techTriangle_testNG.pageObjects.HomePage;

public class PageInitializer extends BaseClass {

	public static HomePage homePage;
	
	public static void initialize() {
		homePage = new HomePage();
	}
	
}
	
