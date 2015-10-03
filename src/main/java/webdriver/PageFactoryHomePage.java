package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * Page Factory is a concept of Page Object Model where WebElements are dynamically initialize 
 * id and name are default i.e. no need to use @FindBy tag, we can use them directly if we wish
 */
public class PageFactoryHomePage {
	WebDriver driver;
	WebElement searchTerm;

	@FindBy(name = "SEARCH_GO")
	WebElement searchButton;
	// WebElement SEARCH_GO; | this can also be used

	public PageFactoryHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchForKeyword(String keyword) {
		searchTerm.clear();
		searchTerm.sendKeys(keyword);
		searchButton.click();
	}
}
