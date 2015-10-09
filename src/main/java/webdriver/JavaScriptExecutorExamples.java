package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorExamples {

	WebDriver driver;

	public JavaScriptExecutorExamples() {
		driver = DriversRepo.getMozillaDriver();
	}

	public void generateAlertBox() {
		driver.get("http://www.bizrate.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('hello world');");
	}

	public void clickButtonAndGetTitle() {
		driver.get("http://www.bizrate.com");
		driver.findElement(By.id("searchTerm")).sendKeys("lumia");

		WebElement button = driver.findElement(By.name("SEARCH_GO"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

		String title = js.executeScript("return document.title;").toString();
		System.out.println("Title: " + title);
	}

	public void refereshWindow() {
		driver.get("http://www.bizrate.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)"); // refresh

	}

	public void verticalScroll() {
		driver.get("http://www.bizrate.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public static void main(String[] args) {
		JavaScriptExecutorExamples obj = new JavaScriptExecutorExamples();
		obj.generateAlertBox();
		obj.clickButtonAndGetTitle();
		obj.refereshWindow();
		obj.verticalScroll();
	}

}
