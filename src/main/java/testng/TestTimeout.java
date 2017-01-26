package testng;

import org.testng.annotations.Test;

public class TestTimeout {

	/**
	 * This method will fail as we expect it to finished in 5 sec but test took 10sec
	 */
	@Test(timeOut = 5000)  
	public void test1() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("test1");
	}

	@Test(timeOut = 5000)
	public void test2() throws InterruptedException  {
		Thread.sleep(1000);
		System.out.println("test2");
	}

}
/*
 * PASSED: test1 
 * FAILED: test2 
 * org.testng.internal.thread.ThreadTimeoutException: Method org.testng.internal.TestNGMethod.test2() didn't finish within the time-out 1000
 */