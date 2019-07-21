package testng.dp;

import org.testng.annotations.Test;

public class MyDPTests {

	@Test(dataProvider = "intString", dataProviderClass = MyDP.class)
	public void testSimpleIntString(int i, String str) {
		System.out.println(i +" > "+ str);
	}
	
	
	@Test(dataProvider = "intStringWithIndex", dataProviderClass = MyDP.class)
	public void testSimpleIntString2(int i, String str) {
		System.out.println("Index: "+i +" > "+ str);
	}
	
	
	
	@Test(dataProvider = "intStringWithParallel", dataProviderClass = MyDP.class)
	public void testSimpleIntString3(int i, String str) {
		System.out.println("Parallel: "+i +" > "+ str);
	}
	
	
	@Test(dataProvider = "singleparam", dataProviderClass = MyDP.class)
	public void testSimpleIntString3(int i) {
		System.out.println("1D Array: "+i);
	}
	
	
}
