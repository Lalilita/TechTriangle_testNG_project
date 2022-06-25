package techTriangle_testNG.utilities;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;


public class ListenersTestNG extends CommonMethods implements ITestListener, IReporter {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Strarted "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess Method "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure Method "+result.getName());
		takeScreenshot("testFailure_sceenshot");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart ");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish ");
	}

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// Iterate over every suite assigned for execution
		for(ISuite suite : suites) {
			
			String suiteName = suite.getName();
			Map<String, ISuiteResult> suiteResults = suite.getResults();
			for(ISuiteResult sr : suiteResults.values()) {
				ITestContext tc = sr.getTestContext();
				System.out.println(
						"Passed tests for suite '" + suiteName+"' is:" + tc.getPassedTests().getAllResults().size());
				System.out.println(
						"Failed tests for suite '" + suiteName+"' is:" + tc.getFailedTests().getAllResults().size());
				System.out.println(
						"Skipped tests for suite '" + suiteName+"' is:" + tc.getSkippedTests().getAllResults().size());
			
			}
			
		}
		
	}
	
	

}
