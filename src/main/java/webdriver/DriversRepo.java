package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriversRepo {

	static WebDriver driver;

	public static WebDriver getMozillaDriver() {
		return new FirefoxDriver();
	}

	public static WebDriver getChromeDriver() {
		if (System.getProperty("os.name").contains("Linux")) {
			System.setProperty("webdriver.chrome.driver",
					"/home/xebia/Downloads/jars/chromedriver");
			return new ChromeDriver();
		}
		System.setProperty("webdriver.chrome.driver",
				"F:\\softwares\\jars\\chromedriver.exe");
		return new ChromeDriver();
	}

	public WebDriver getIEDriver() {
		System.setProperty("webdriver.ie.driver",
				"F:\\softwares\\jars\\IEDriverServer.exe");
		return new InternetExplorerDriver();
	}

}
