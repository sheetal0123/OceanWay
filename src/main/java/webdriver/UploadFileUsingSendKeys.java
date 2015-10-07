package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 html code: <input type="file" name="img">
 file can be uploaded using three ways: sendKeys, AutoIT and Robot framework
 */
public class UploadFileUsingSendKeys {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {
		driver = DriversRepo.getMozillaDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		// driver.quit(); // closes all opened browser instances
	}

	@Test
	public void testUpload() throws InterruptedException {
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		driver.findElement(By.name("img")).sendKeys(
				"/home/xebia/Documents/qa/selenium/webdriver.txt");
		System.out.println("Title:" + driver.getTitle());
	}

}