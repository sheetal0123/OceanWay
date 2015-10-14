package webdriver;

import org.openqa.selenium.WebDriver;

public class Test {

	
	
	// @org.testng.annotations.Test
	// public void abc(){
	// System.out.println("testng");
	// }
	//

	public static void main(String[] args) {
//		WebDriver driver=DriversRepo.getMozillaDriver();
		WebDriver driver=DriversRepo.getChromeDriver();
		driver.get("http://www.bizrate.com");
		System.out.println(driver.getTitle());
		
		
//		System.out.println(">"+System.getProperty("os.name"));
	}
}
