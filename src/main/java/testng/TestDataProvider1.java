package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Run this class independently
 * One is generating data other is consuming it
 */
public class TestDataProvider1 {

	
	/**
	 * This is generating data i.e. providing data to any test which ask for it
	 */
	@DataProvider(name = "inputset")
	public Object[][] provideData() {
		return new Object[][] { { 10, 20 }, { 100, 110 }, { 200, 210 } };
	}

	
	/**
	 * This test is consuming data from data provider
	 */
	@Test(dataProvider = "inputset")
	public void test(int number, int expected) {
		Assert.assertEquals(number + 10, expected);
	}

}

