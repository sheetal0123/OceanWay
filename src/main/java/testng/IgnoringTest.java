package testng;

import org.testng.annotations.Test;

public class IgnoringTest {

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test(enabled = true)
	public void test2() {
		System.out.println("test2");
	}

	@Test(enabled = false)
	public void test3() {
		System.out.println("test3: will not print");
	}

}

/*
PASSED: test1
PASSED: test2
*/