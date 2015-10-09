package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider1 {

	@DataProvider(name = "inputset")
	public Object[][] provideData() {
		return new Object[][] { { 10, 20 }, { 100, 150 }, { 200, 210 } };
	}

	@Test(dataProvider = "inputset")
	public void test(int number, int expected) {
		Assert.assertEquals(number + 10, expected);
	}

}

/*
PASSED: test(10, 20)
PASSED: test(200, 210)
FAILED: test(100, 150)
*/