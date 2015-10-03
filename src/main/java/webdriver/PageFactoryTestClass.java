package webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageFactoryTestClass {

	WebDriver driver;
	DriversRepo repo;
	PageFactoryHomePage homepage;
	PageFactoryPricePage pricepage;

	@BeforeClass
	public void setup() {
		repo = new DriversRepo();
//		driver = repo.getMozillaDriver();
//		driver = repo.getChromeDriver();
		driver = repo.getIEDriver();
		homepage = new PageFactoryHomePage(driver);
		pricepage = new PageFactoryPricePage(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.quit(); // closes all opened browser instances
		// driver.close(); //close only current opened brower instance
	}

	@Test
	public void verifyPriceFilter() {
		driver.get("http://www.bizrate.com");
		homepage.searchForKeyword("dell");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		pricepage.applyPriceFilter("100", "200");
		String url = pricepage.getUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("maxPrice--200__minPrice--100"), "price filter not applied");
	}

}
