package testng;

import org.testng.annotations.Test;
/*
 * same test can be run multiple time and total time etc can be checked
 */
public class Loadtesting {

	@Test(invocationCount = 5)
	public void test1() {
		System.out.println("Hi - " + Thread.currentThread().getId());
	}

	@Test(invocationCount = 10, threadPoolSize = 3)
	public void test2() {
		System.out.println("multithreading - "
				+ Thread.currentThread().getId());
	}
}

/*

test1 output
Hi - 1
Hi - 1
Hi - 1
Hi - 1
Hi - 1

test2 output
multithreading - 9
multithreading k- 11
multithreading - 10
multithreading - 11
multithreading - 10
multithreading - 9
multithreading - 11
multithreading - 9
multithreading - 10
multithreading - 9

*/