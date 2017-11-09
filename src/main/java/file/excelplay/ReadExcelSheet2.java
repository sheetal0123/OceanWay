package file.excelplay;

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

public class ReadExcelSheet2 {
	
	
	HashMap<String, HashMap<String, String>> entireTestData;
	private File file;
	
	
	/**
	 * Read all data from sheet which have 'Y' flag as first column
	 * key will be counter and value will be small hashmap with title - value
	 */
	public HashMap<Integer, HashMap<String, String>> readCompleteExcelDataWithYFlag(
			String dataFile, String sheetName1) {

		HashMap<Integer, HashMap<String, String>> entireTestData;

		entireTestData = new HashMap<Integer, HashMap<String, String>>();
		HashMap<String, String> singleStoryTestData;
		List<String> strHeaders = new ArrayList<String>();
		
		file = new File(System.getProperty("user.dir") + dataFile);
		System.out.println("File to be read: " + System.getProperty("user.dir")
				+ dataFile);
		
		FileInputStream inputStream;
		HSSFWorkbook excelWB = null;
		Sheet excelSheet;
		String sheetName;

		try {
			inputStream = new FileInputStream(file);
			excelWB = new HSSFWorkbook(inputStream);
			int noOfSheet = excelWB.getNumberOfSheets();
			for (int k = 0; k < noOfSheet; k++) {
				sheetName = excelWB.getSheetName(k);
				if (sheetName.startsWith(sheetName.toUpperCase())
						|| sheetName.equalsIgnoreCase(sheetName)
						|| sheetName.startsWith(sheetName)) {

					excelSheet = excelWB.getSheet(sheetName);

					System.out.println("Sheet Name: "+excelSheet);
					
					int rowCount = excelSheet.getLastRowNum();
					Row headerRow = excelSheet.getRow(0);
					int counter = 1;

					for (int j = 0; j < headerRow.getLastCellNum(); j++) {
						strHeaders.add(j, headerRow.getCell(j)
								.getStringCellValue());
					}

					for (int i = 1; i <= rowCount; i++) {

						singleStoryTestData = new HashMap<String, String>();
						Row row = excelSheet.getRow(i);
						if (row.getCell(0).getStringCellValue()
								.equalsIgnoreCase("yes")) {
							for (int j = 1; j < row.getLastCellNum(); j++) {
								row.getCell(j).setCellType(
										Cell.CELL_TYPE_STRING);

								if (!(row.getCell(j) == null || row.getCell(j)
										.getStringCellValue().equals("")))
									singleStoryTestData
											.put(strHeaders.get(j), row
													.getCell(j)
													.getStringCellValue());
							}

							HashMap<String, String> tempMap = singleStoryTestData;
							entireTestData.put(counter, tempMap);
							counter++;

						}

					}
				}

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

				if (excelWB != null) {
					excelWB.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		return entireTestData;
	}

	
	public void printIntegerBigHaspMap(HashMap<Integer, HashMap<String, String>> hmap) {
		Map<String, String> map = new HashMap<String, String>();
		map = hmap.get(1);
		for(String key: map.keySet()){
			System.out.println(key+"="+map.get(key));
		}
	}
	
	
	public static void main(String [] args){
		ReadExcelSheet2 obj = new ReadExcelSheet2();
		String dataFile = "\\src\\main\\java\\file\\excelplay\\testdata2.xls";

		HashMap<Integer, HashMap<String, String>> bigMap = obj.readCompleteExcelDataWithYFlag(dataFile,"swift");
		obj.printIntegerBigHaspMap(bigMap);
	
	}

}
