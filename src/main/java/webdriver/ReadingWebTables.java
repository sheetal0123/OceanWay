package webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadingWebTables {

	WebDriver driver;
	protected By tableLocator = By.xpath("//*[@class = 'abc']/tbody");

	public List<List<String>> getWebTablesData() {
		WebElement tableRow = driver.findElement(tableLocator);
		List<List<String>> rowsList = new ArrayList<>();

		// To find rows of table.
		List<WebElement> rows = tableRow.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			// container for cells values
			List<String> columnsValueList = new ArrayList<>();

			// To find columns's cells of that particular row.
			List<WebElement> columns = row.findElements(By.tagName("td"));

			for (WebElement cell : columns) {
				columnsValueList.add(cell.getText());
			}
			rowsList.add(columnsValueList);
		}
		return rowsList;
	}

}