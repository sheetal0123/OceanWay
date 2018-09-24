package solutions.readingexcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import file.excelplay.ReadExcelGenericNew;

public class ExecuteCode {

	/**
	 * This method will read complete excel in one go and load respective pojos with all the excel data 
	 * 
	 * it will return a single java object which contains all the excel data in terms of java pojos object
	 * 
	 */
	public static List<ExcelPojo> fetchExcelDataAndCreateJavaObject(String dataFilePath, String sheetName) throws IOException{
		//read complete excel in one go
		String file = System.getProperty("user.dir") + dataFilePath;
		Map<String, Map<String,String>> bigmap = ReadExcelGenericNew.readCompleteExcelSheetData(file, sheetName, 0, 0);
		System.out.println("BIG HashMap: "+bigmap);
		
		List<ExcelPojo> bigListOfAllScenariosInExcel = new ArrayList<>();

		for(int i = 1 ; i <= bigmap.size() ; i++){
			
			String tcid = "TC" + i;
			Map<String, String> smallmap = bigmap.get(tcid);  //map contains one complete test case row e.g. TC1
			System.out.println(tcid+" # "+smallmap);
			
			String scenarioRaw= smallmap.get("Scenario Descriptions");
			String [] scenarioListRaw = scenarioRaw.split(">");
			
			List<KeyValuePojo> scenarioList = new ArrayList<>();
			
			for(int j=0 ; j < scenarioListRaw.length ;j++ ){
				String keyvaluepair = scenarioListRaw[j];
				String [] keyval = keyvaluepair.split(":");
				
				KeyValuePojo keyValuePojo = new KeyValuePojo();
				keyValuePojo.setKey(keyval[0].trim());
				keyValuePojo.setValue(keyval[1].trim());

				scenarioList.add(keyValuePojo);
			}
			//after for loop get finished 'scenarioList' will get populated with small k1:v1 > k2:v2 etc lists of specific TC1
			
			ExcelPojo excelPojo = new ExcelPojo();
			excelPojo.setScenarioId(tcid);
			excelPojo.setListKeyValuePojo(scenarioList);
			//excelPojo contains TC1 and its respective all data in POJO form
			
			bigListOfAllScenariosInExcel.add(excelPojo);
		}
		
		return bigListOfAllScenariosInExcel;
	}
	
	
	
	
	public static void executeOnUIOneByOne(List<ExcelPojo> bigJavaObj){
		System.out.println("***************************************  UI PART BEGINS  ************************************************");
		
		for(int i = 0 ; i < bigJavaObj.size() ; i ++){
			ExcelPojo excelPojo = bigJavaObj.get(i);
			
			System.out.println("-------------Scenario ID ---------------- "+excelPojo.getScenarioId());
			
			for(int j=0;j<excelPojo.getListKeyValuePojo().size() ; j++){
				
				System.out.print("Key"+(j+1)+"#"+excelPojo.getListKeyValuePojo().get(j).getKey().trim());
				System.out.print("  &&  Value"+(j+1)+"#"+excelPojo.getListKeyValuePojo().get(j).getValue().trim());
				System.out.println("");
			}
			System.out.println("");
		}
	}

	
	
	public static void main(String[] args) throws IOException {
		String dataFilePath = "\\src\\main\\java\\solutions\\readingexcel\\Scenarios.xls";
		String sheetName = "ScenarioList";
		List<ExcelPojo> allExcelScenariosInJavaObj =  fetchExcelDataAndCreateJavaObject(dataFilePath, sheetName);
		executeOnUIOneByOne(allExcelScenariosInJavaObj);
	}
}