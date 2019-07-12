package json.dynamicjson;

import com.fasterxml.jackson.databind.JsonNode;

public class ProductJsonNode {

	String name;
	String category;
	JsonNode details;
	
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
	public JsonNode getDetails() {
		return details;
	}
	public void setDetails(JsonNode details) {
		this.details = details;
	}
	
	
	
}
