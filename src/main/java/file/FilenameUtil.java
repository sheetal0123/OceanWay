package file;

import org.apache.commons.io.FilenameUtils;

/**
 * This appache library is very useful in handling file path on diff OS
 * Code will run irrespective of Mac, Win or Linux
 */
public class FilenameUtil {

	
	public void getFileNameFromPath(){
		String absolutePath1 = "C:/Users/Documents/myworkspace/OceanWay/src/main/java/file/one.dat";
		String absolutePath2 = "C:\\Users\\Documents\\myworkspace\\OceanWay\\src\\main\\java\\file\\two.txt";
		
		//This method will fetch Filename by removing path
		String one = FilenameUtils.getName(absolutePath1);
		String two = FilenameUtils.getName(absolutePath2);
		System.out.println("File1:	"+one);
		System.out.println("File2:	"+two);

		//Get extension
		String oneExt = FilenameUtils.getExtension(absolutePath1);
		System.out.println("File1 Ext:	"+oneExt);
	}
	
	public static void main(String[] args) {
		FilenameUtil obj = new FilenameUtil();
		obj.getFileNameFromPath();
	}

}
