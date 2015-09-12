package etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGMavenClass {

	WebDriver driver;
	DriversRepo drivers;
	
	@BeforeTest
	public void setUp() {
//		driver = new FirefoxDriver();
		drivers=new DriversRepo();
		driver=drivers.getMozillaDriver();
//		driver=drivers.getChromeDriver();
//		driver=drivers.getIEDriver();
	}

	@AfterTest
	public void tearDown(){
//		driver.quit();
	}
	
//	@Test
	public void test1() {
		driver.navigate().to("https://xebia.com/");
		Assert.assertTrue(driver.getTitle().startsWith("Xebia"),
				"Wrong Title");
	}

//	@Test
	public void test2() {
		System.out.println("TestNG-Maven test 2");
		Assert.assertTrue(10 > 2, "Test2 Failed");
	}
	
	@Test
	public void test3(){
		driver.get("http://ngux.baltimoresun.stage.tribdev.com/qa/automation/outfit15A/250/");
//		nguxbeta   |  nguxtr!b
		
		driver.switchTo().frame("google_ads_iframe_/4011/trb.baltimoresun/test/cube_1");
		driver.findElement(By.cssSelector("div#google_image_div>a>img[height=\"250\"]")).click();
		
	}

}
