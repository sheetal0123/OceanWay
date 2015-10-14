package testng;

import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * depending upon test method name we can provide different data
 */
public class TestDataProvider2 {

	@Test(dataProvider = "dataProvider")
	public void test1(int number, int expected) {
		Assert.assertEquals(number, expected);
	}

	@Test(dataProvider = "dataProvider")
	public void test2(String email, String expected) {
		Assert.assertEquals(email, expected);
	}

	@DataProvider(name = "dataProvider")
	public Object[][] provideData(Method method) {

		Object[][] result = null;

		if (method.getName().equals("test1")) {
			result = new Object[][] { { 1, 1 }, { 200, 200 } };
		} else if (method.getName().equals("test2")) {
			result = new Object[][] { { "test@gmail.com", "test@gmail.com" },
					{ "test@yahoo.com", "test@yahoo.com" } };
		}

		return result;

	}
}

/*
PASSED: test1(1, 1)
PASSED: test1(200, 200)
PASSED: test2("test@gmail.com", "test@gmail.com")
PASSED: test2("test@yahoo.com", "test@yahoo.com")

*/