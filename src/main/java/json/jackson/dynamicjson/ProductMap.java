package json.jackson.dynamicjson;

import java.util.Map;
import java.util.Objects;

public class ProductMap {

	String name;
	String category;
	Map<String, Objects> details;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Map<String, Objects> getDetails() {
		return details;
	}
	public void setDetails(Map<String, Objects> details) {
		this.details = details;
	}
	
	
	
}
