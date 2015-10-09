package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
 * Order :  STC GM  :  BSuite BTest BClass BGroup BMethods
 * Before and AfterGroups run only one time once before a first group test and another after last group test
 * Before and After Method run before and after every @test cases. so it runs multiple times
 * TestNG has some extra feature which JUnit don't have - BeforeSuite, BeforeTest and BeforeGroup
 * 
 * nice article on testng: http://www.mkyong.com/tutorials/testng-tutorials/
 */
public class TestNGAnnotations {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}

	@BeforeGroups("reg")
	public void beforegroup() {
		System.out.println("Before Groups");
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

	@Test(groups = "reg")
	public void test2() {
		System.out.println("test 2");
	}

	@Test(groups = { "reg", "sanity" })
	public void test3() {
		System.out.println("test 3");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method");
	}

	@AfterGroups("reg")
	public void aftergroup() {
		System.out.println("After Groups");
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

/*
 * STC'M' Before Suite Before Test Before Class
 * 
 * Before Method test 1 After Method
 * 
 * Before Method test 2 After Method
 * 
 * Before Method test 3 After Method
 * 
 * After Class After Test After Suite
 */