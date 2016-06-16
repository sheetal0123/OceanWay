package testng.listners;

import java.util.Set;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

	/**
	 *	This method it to set final test result counter i.e. total test  run 
	 *  should remain 4(actual test count) even if we retry it for 10 times
	 */
	public void onFinish(ITestContext context) {
		Set<ITestResult> failedTests = context.getFailedTests().getAllResults();
		for (ITestResult temp : failedTests) {
			System.out.println("FOR LOOP");
			ITestNGMethod method = temp.getMethod();
			if (context.getFailedTests().getResults(method).size() > 1) {
				System.out.println("IF LOOP");
				failedTests.remove(temp);
			} else {
				System.out.println("ELSE LOOP");
				if (context.getPassedTests().getResults(method).size() > 0) {
					System.out.println("ELSE IF LOOP");
					failedTests.remove(temp);
				}
			}
		}
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Method generally used to take screenshot on failure
	 */
	public void onTestFailure(ITestResult result) {
		String testclassRaw = result.getTestClass().toString().trim();
		String testclass = testclassRaw.substring(32, testclassRaw.length() - 1); 
		String testname = result.getName().toString().trim();
		
		System.out.println("Screenshot for failed class and test name:  "+testclass+", "+testname);
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
