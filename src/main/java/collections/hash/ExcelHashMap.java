package collections.hash;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelHashMap {

	HashMap<String, HashMap<String, String>> entireTestData;
	private File file;
	private String dataFile = "\\src\\main\\java\\collections\\hash\\testdata.xls";

	
	
/**
	{
	1={student_id=1, last_name=sharma, middle_name=pink, first_name=sara},
	2={student_id=2, last_name=ladka, middle_name=badmash, first_name=gondu},
	3={student_id=3, last_name=baby, middle_name=yellow, first_name=gugu}, 
	4={student_id=4, last_name=toddler, middle_name=badmash, first_name=chiku}, 
	5={student_id=5, last_name=rani, middle_name=catty, first_name=mato}
	}
**/

	/**
	 * Method will accept sheet name to be read and return all details in
	 * HashMap
	 */
	public HashMap<String, HashMap<String, String>> readTestData(
			String strSheetName) {

		entireTestData = new HashMap<String, HashMap<String, String>>();
		HashMap<String, String> singleStoryTestData;
		List<String> strHeaders = new ArrayList<String>();
		file = new File(System.getProperty("user.dir") + dataFile);
		System.out.println("File to be read: " + System.getProperty("user.dir")
				+ dataFile);

		FileInputStream inputStream;
		HSSFWorkbook excelWB = null;
		Sheet excelSheet;

		try {
			inputStream = new FileInputStream(file);
			excelWB = new HSSFWorkbook(inputStream);
			excelSheet = excelWB.getSheet(strSheetName);
			System.out.println("Sheet Name to be read: "
					+ excelSheet.getSheetName());

			int rowCount = excelSheet.getLastRowNum();
			Row headerRow = excelSheet.getRow(0);

			for (int j = 0; j < headerRow.getLastCellNum(); j++) {
				strHeaders.add(j, headerRow.getCell(j).getStringCellValue());
			}

			for (int i = 1; i <= rowCount; i++) {
				singleStoryTestData = new HashMap<String, String>();
				Row row = excelSheet.getRow(i);
				for (int j = 0; j < row.getLastCellNum(); j++) {
					row.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
					if (!(row.getCell(j) == null || row.getCell(j)
							.getStringCellValue().equals("")))
						singleStoryTestData.put(strHeaders.get(j),
								row.getCell(j).getStringCellValue());
				}

				HashMap<String, String> tempMap = singleStoryTestData;
				entireTestData
						.put(row.getCell(0).getStringCellValue(), tempMap);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (excelWB != null)
					excelWB.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Excel sheet has been read and stored into a HashMap");
		return entireTestData;
	}
	
	
	
//	{student_id=1, last_name=sharma, middle_name=pink, first_name=sara}
	public void printExcel(HashMap<String, HashMap<String, String>> hmap) {
		Map<String, String> map = new HashMap<String, String>();
		map = hmap.get("1");
		for(String key: map.keySet()){
			System.out.println(key+"="+map.get(key));
		}
	}


	public static void main(String[] args) {
		ExcelHashMap obj = new ExcelHashMap();
		HashMap<String, HashMap<String, String>> map = obj.readTestData("students_list");
		obj.printExcel(map);
		
	}
}
