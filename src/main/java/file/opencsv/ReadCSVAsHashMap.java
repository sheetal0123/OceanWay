package file.opencsv;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.opencsv.CSVReader;

public class ReadCSVAsHashMap {


	public HashMap<String, HashMap<String, String>> readTestData(File file) throws IOException{
		FileReader fr = new FileReader(file);

		//CSVReader csvReader = new CSVReaderBuilder(fr).withSkipLines(1).build();
		CSVReader csvReader = new CSVReader(fr);
		List<String []> completeCSVDataList = csvReader.readAll();
		csvReader.close();
		
		HashMap<String, HashMap<String, String>> bigHashMap = new HashMap<>();
		
		String [] headers = completeCSVDataList.get(0);
		List<String> headerList = Arrays.asList(headers);
		
		for (int i = 1; i < completeCSVDataList.size(); i++) {			
			List<String> bodyList = Arrays.asList(completeCSVDataList.get(i));
			
			HashMap<String, String> smallHashMap = new HashMap<>();
			for (int k = 0; k < headerList.size(); k++) {
				
				smallHashMap.put(headerList.get(k), bodyList.get(k));
			}
			bigHashMap.put(bodyList.get(0), smallHashMap);							
		}
		return bigHashMap;	
	}

	
	public void printBigHashMap(File file) throws IOException{
		HashMap<String, HashMap<String, String>> bigHashMap = readTestData(file);
		Set<String> set = bigHashMap.keySet();
		
		for(String key : set){
			System.out.print(key+"   ");
			System.out.println(bigHashMap.get(key));
		}
		
	}

	public static void main(String [] args) throws IOException{
		ReadCSVAsHashMap obj = new ReadCSVAsHashMap();
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\file\\opencsv\\writecsv_in_one_go.txt";
		File file = new File(path);
		
		obj.printBigHashMap(file);
	}
}
