package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriversRepo {

	static WebDriver driver;

	public static WebDriver getMozillaDriver() {
		return new FirefoxDriver();
	}

	public static WebDriver getChromeDriver() {
		String current_os = System.getProperty("os.name");
		
		if(current_os.equals("Mac OS X")){
			System.setProperty("webdriver.chrome.driver", "/Users/sheetalsingh/Downloads/chromedriver");
		}else if(current_os.equals("Linux")){
			System.setProperty("webdriver.chrome.driver", "/home/xebia/Downloads/jars/chromedriver");
		}else{
			System.setProperty("webdriver.chrome.driver", "F:\\softwares\\jars\\chromedriver.exe");
		}
		
		return new ChromeDriver();
	}

	public WebDriver getIEDriver() {
		System.setProperty("webdriver.ie.driver", "F:\\softwares\\jars\\IEDriverServer.exe");
		return new InternetExplorerDriver();
	}
	
	
	public static WebDriver getSafariDriver() {
		//System.setProperty("webdriver.ie.driver", "F:\\softwares\\jars\\IEDriverServer.exe");
		return new SafariDriver();
	}

}
