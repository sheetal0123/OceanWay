package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
 * code: not reading property file error coming
 * http://www.mkyong.com/unittest/testng-tutorial-6-parameterized-test/
 */
public class TestParameter {

	Properties prop;
	
	@Test
	@Parameters({ "dbconfig", "poolsize" })
	public void test1(String dbc, String ps) {
		System.out.println("DB Config: " + dbc);
		System.out.println("Pool Size: " + ps);

		String path="/home/xebia/workspace/OceanWay/src/main/java/testng/"+dbc;
		prop = new Properties();
		try {
			prop.load(new FileInputStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String username = prop.getProperty("user");
		String password = prop.getProperty("password");

		System.out.println("username : " + username);
		System.out.println("password : " + password);

	}
}

/*
 * DB Config: parameter.properties 
 * Pool Size: 10
 */