package testng.dp.factory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class MyDPFactory {
	
	@Factory(dataProvider = "factoryDP")
	public Object[] getTestClasses(String s) {
		Object[] obj = new Object[2];
		obj[0] = new Test1(s);
		obj[1] = new Test2();
		return obj;
	}
	
	
	
	@DataProvider
	public Object[] factoryDP() {
		return new Object[] {"Apple", "Ball", "Cat"};
	}
	
}
