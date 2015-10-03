package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}

	@Test
	public void test1() {
		System.out.println("test 1");
	}

	@Test
	public void test2() {
		System.out.println("test 2");
	}

	@Test
	public void test3() {
		System.out.println("test 3");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}

}

/*   STC'M' 
Before Suite
Before Test
Before Class

Before Method
test 1
After Method

Before Method
test 2
After Method

Before Method
test 3
After Method

After Class
After Test
After Suite
*/