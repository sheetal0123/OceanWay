package webdriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * AutoIT: 3rd party tool used to handle Window specific UI
 */
public class UploadFileUsingAutoIT {
	WebDriver driver;
	DriversRepo repo;

	@BeforeTest
	public void setup() throws Exception {
		repo = new DriversRepo();
		driver = repo.getMozillaDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void uploadTest() throws IOException, InterruptedException {
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("img")).click();
		Runtime.getRuntime().exec("F:\\softwares\\autoit\\autoit_upload.exe");
		System.out.println("Title:" + driver.getTitle());
	}

	@Test
	public void downloadFile() throws IOException, InterruptedException {
		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Download Text File")).click();
		Runtime.getRuntime().exec("F:\\softwares\\autoit\\autoit_download.exe");
		System.out.println("Title:" + driver.getTitle());
	}
}