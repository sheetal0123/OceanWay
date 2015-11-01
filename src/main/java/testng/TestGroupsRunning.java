package testng;

import org.testng.annotations.Test;

/*
 * We can define various group categories and in testng we can decide which group to include and exclude
 */
public class TestGroupsRunning {
	@Test(groups = { "regA" })
	public void testMethodOne() {
		System.out.println("Test method one - reg A");
	}

	@Test(groups = { "regB" })
	public void testMethodTwo() {
		System.out.println("Test method two  - reg B");
	}

	@Test(groups = { "sanityA" })
	public void testMethodThree() {
		System.out.println("Test method three - san A");
	}

	@Test(groups = { "sanityB" })
	public void testMethodFour() {
		System.out.println("Test method Four - san B");
	}
}
