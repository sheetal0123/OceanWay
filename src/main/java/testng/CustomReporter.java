package testng;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;
/*	
public class CustomReporter implements IReporter {

	@Override
	public void generateReport(List xmlSuites, List suites,
			String outputDirectory) {
		// Iterating over each suite included in the test
		for (ISuite suite : suites) {
			String suiteName = suite.getName();
			Map suiteResults = suite.getResults();
			for (ISuiteResult sr : suiteResults.values()) {
				ITestContext tc = sr.getTestContext();
				System.out.println("Passed tests for suite '" + suiteName
						+ "' is:" + tc.getPassedTests().getAllResults().size());
				System.out.println("Failed tests for suite '" + suiteName
						+ "' is:" + tc.getFailedTests().getAllResults().size());
				System.out
						.println("Skipped tests for suite '" + suiteName
								+ "' is:"
								+ tc.getSkippedTests().getAllResults().size());
			}
		}
	}


}
*/