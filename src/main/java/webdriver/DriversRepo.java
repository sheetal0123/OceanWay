package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DriversRepo {

	WebDriver driver;
	
	public WebDriver getMozillaDriver(){
		return new FirefoxDriver();
	}
	
	public WebDriver getChromeDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sheetalsingh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();   //chrome driver version= 2.16
		return driver;
	}
	
	public WebDriver getIEDriver(){
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sheetalsingh\\Downloads\\IEDriverServer_x64_2.46.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		return driver;
	}
	
	
	
}
