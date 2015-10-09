package testng;

import org.testng.annotations.Test;

public class TestTimeout {

	@Test(timeOut = 5000)  // time in ms
	public void test1() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("test1");
	}

	@Test(timeOut = 1000)
	public void test2() {
		while (true)
			;
	}

}
/*
 * PASSED: test1 
 * FAILED: test2 
 * org.testng.internal.thread.ThreadTimeoutException: Method org.testng.internal.TestNGMethod.test2() didn't finish within the time-out 1000
 */