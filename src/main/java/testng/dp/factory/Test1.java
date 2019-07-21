package testng.dp.factory;

import org.testng.annotations.Test;

public class Test1 {
	String str;
	public Test1(String s) {
		str = s;
	}
	
	@Test
	public void abc() {
		System.out.println("Test1 (Factory with data provider):  " + str);
	}

}
