package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageFactoryPricePage {
	WebDriver driver;

	@FindBy(xpath = ".//*[@id='minPriceBox']")
	WebElement minPrice;

	@FindBy(xpath = ".//*[@id='maxPriceBox']")
	WebElement maxPrice;

	@FindBy(id = "update-go-button")
	WebElement priceButton;

	public PageFactoryPricePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void applyPriceFilter(String min, String max) {
		minPrice.clear();
		minPrice.sendKeys(min);
		maxPrice.clear();
		maxPrice.sendKeys(max);
		priceButton.click();
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

}
