package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups="deploy")    //this way all test under this class will come under 'deploy' group
public class TestCaseDependency {

	@Test
	public void test1() {
		System.out.println("test 1");
		Assert.assertEquals(true, false);
	}

	@Test(dependsOnMethods = { "test1" })
	public void test2() {
		System.out.println("test 2");
	}

}


/*
case 1: test1 passed
PASSED: test1
PASSED: test2

case 2: test1 failed, all dependent test will skip execution
FAILED: test1
SKIPPED: test2
*/