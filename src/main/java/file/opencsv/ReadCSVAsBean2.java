package file.opencsv;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * 
 * Converting CSV to Bean using Annotations in POJO(SoceityDetails) class
 * 
 */
public class ReadCSVAsBean2 {
	
	@SuppressWarnings("unchecked")
	public void readCSVAsAJavaBeanNew1() throws IOException{
		//setting up file to be read
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\file\\opencsv\\soceity_details.txt";
		
		try (
	            Reader reader = Files.newBufferedReader(Paths.get(path));
	        ) {
				@SuppressWarnings("rawtypes")
	            CsvToBean<SoceityDetails> csvToBean = new CsvToBeanBuilder(reader)
	                    .withType(SoceityDetails.class)
	                    .withIgnoreLeadingWhiteSpace(true)
	                    .build();

	            Iterator<SoceityDetails> csvUserIterator = csvToBean.iterator();

	            while (csvUserIterator.hasNext()) {
	            	SoceityDetails soceityDetails = csvUserIterator.next();
	                System.out.println("S Name : " + soceityDetails.getSoceityName());
	                System.out.println("S Age : " + soceityDetails.getSoceityAge());
	                System.out.println("S Flat Count : " + soceityDetails.getSoceityFlatCount());
	                System.out.println("S City : " + soceityDetails.getSoceityCity());
	                System.out.println("==========================");
	            }
	        }	
		
		
		
		
		
        
	}
	
	
	@SuppressWarnings("unchecked")
	public void readCSVAsAJavaBeanNew2() throws IOException{
	
		
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\file\\opencsv\\soceity_details.txt";
		Reader reader = Files.newBufferedReader(Paths.get(path));
		
		CsvToBean<SoceityDetails> csvToBean = new CsvToBeanBuilder(reader)
        .withType(SoceityDetails.class)
        .withIgnoreLeadingWhiteSpace(true)
        .build();
		
		List<SoceityDetails> csvUsers = csvToBean.parse();

	    for(SoceityDetails soceityDetails: csvUsers) {
               System.out.println("S Name : " + soceityDetails.getSoceityName());
               System.out.println("S Age : " + soceityDetails.getSoceityAge());
               System.out.println("S Flat Count : " + soceityDetails.getSoceityFlatCount());
               System.out.println("S City : " + soceityDetails.getSoceityCity());
               System.out.println("=============X=============");
	    }
	
	
	}
	
	public static void main(String [] args) throws IOException{
		
		ReadCSVAsBean2 obj = new ReadCSVAsBean2();
		//obj.readCSVAsAJavaBeanNew1();
		obj.readCSVAsAJavaBeanNew2();
		
	}

}
