package solutions.readingexcel;

import java.util.List;


/**
 * We are trying to read excel and convert it into logical Pojo classes
 * Later will play with java objects
 *
 */
public class ExcelPojo {

	String scenarioId;
	List<KeyValuePojo> listKeyValuePojo;  // scenario1 > scenario2 
	
	public String getScenarioId() {
		return scenarioId;
	}
	public void setScenarioId(String scenarioId) {
		this.scenarioId = scenarioId;
	}
	public List<KeyValuePojo> getListKeyValuePojo() {
		return listKeyValuePojo;
	}
	public void setListKeyValuePojo(List<KeyValuePojo> listObj) {
		this.listKeyValuePojo = listObj;
	}
	

}
