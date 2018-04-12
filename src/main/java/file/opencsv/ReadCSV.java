package file.opencsv;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class ReadCSV {

	/**
	 * Number of lines to be skipped can be mentioned in withSkipLines method
	 */
	public void readCSVBody() throws IOException{
		//setting up file to be read
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\file\\opencsv\\writecsv_in_one_go.txt";
		File file = new File(path);
		FileReader fr = new FileReader(file);

		CSVReader csvReader = new CSVReaderBuilder(fr).withSkipLines(1).build();
		//CSVReader csvReader = new CSVReader(fr);  //this will also work
		List<String []> ls = csvReader.readAll();
		
		//printing csv data
		for(String [] arr : ls){
			for(String str : arr){
				System.out.print(str+",");
			}
			System.out.println("");
		}
		csvReader.close();
	}
	
	

	public static void main(String [] args) throws IOException{
		ReadCSV obj = new ReadCSV();
		//obj.readCSVInOneGo();
		obj.readCSVBody();
	}
}
