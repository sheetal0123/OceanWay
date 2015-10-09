package testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
/*
 * test 2 will run at the end once all group test run finishes
 */
public class TestGroupDependency {

	@BeforeGroups("reg1")
	public void beforegroup() {
		System.out.println("Before Groups");
	}

	@Test(groups = "reg1")
	public void test1() {
		System.out.println("test 1a");
	}

	@Test(dependsOnGroups = { "reg1" })
	public void test2() {
		System.out.println("test 2a");
	}

	@Test(groups = "reg1")
	public void test3() {
		System.out.println("test 3a");
	}

	@AfterGroups("reg1")
	public void aftergroup() {
		System.out.println("After Groups");
	}

}

/*
Before Groups
test 1a
test 3a
After Groups
test 2a
*/