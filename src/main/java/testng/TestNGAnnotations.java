package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test
	public void testcase(){
		System.out.println("Hi testng");
		Assert.assertTrue(100>50, "assertion failed");
	}
}
