package webdriver.image_comparsion;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeWebElementScreenshot {

	
WebDriver driver = null;
	
	WebDriver getDriver(){
		if(driver == null){
			//driver = new FirefoxDriver();
			driver = new ChromeDriver();
		}
			
		return driver;
	}
	
	public void openPage(String url){
		getDriver().get(url);
	}
	
	
	/**
	 * This method will take specific element screenshot and return same
	 * 
	 * For future comparison output of this method will be sent to compare method 
	 */
	public BufferedImage takeWebElementScreenshot(WebElement webelement, String screenshot_path) {
		try {
			File screenshotFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			BufferedImage completePageImage = ImageIO.read(screenshotFile);

			//fetch element dimensions
			Point point = webelement.getLocation();
			int eleWidth = webelement.getSize().getWidth();
			int eleHeight = webelement.getSize().getHeight();
	
			BufferedImage weblementScreenshot= completePageImage.getSubimage(point.getX(), point.getY(),eleWidth, eleHeight);
			ImageIO.write(weblementScreenshot, "png", screenshotFile);
	
			//copy screenshot to given file path
			File screenshotLocation = new File(screenshot_path);
			FileUtils.copyFile(screenshotFile, screenshotLocation);

			return weblementScreenshot;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		TakeWebElementScreenshot obj = new TakeWebElementScreenshot();
		obj.openPage("https://en.wikipedia.org/wiki/Buddhism");
		
		WebElement webelement = obj.getDriver().findElement(By.xpath("//body"));
		String result_path = ".\\src\\main\\java\\webdriver\\image_comparsion\\element_screenshot.png";
		obj.takeWebElementScreenshot(webelement, result_path);
		System.out.println("Done");
	}

}
