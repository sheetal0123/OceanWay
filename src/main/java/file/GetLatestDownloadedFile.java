package file;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import com.google.common.base.Throwables;

public class GetLatestDownloadedFile {

	
	
	public String getTheNewestFilePath(String typeOfFile) {
		try {
			String filePath = getUserDownloadPath();
			Thread.sleep(30000);
			File latestFile;
			String absolutePath = "";
			File dir = new File(filePath);
			FileFilter fileFilter = new WildcardFileFilter(typeOfFile);
			File[] files = dir.listFiles(fileFilter);

			if (files.length > 0) {
				Arrays.sort(files,LastModifiedFileComparator.LASTMODIFIED_REVERSE);
				latestFile = files[0];
				absolutePath = latestFile.getAbsolutePath();
			}
			return absolutePath;
		} catch (Exception e) {
			throw Throwables.propagate(e);
		}
	}
	
	public static String getUserDownloadPath() {
		return System.getProperty("user.home") + "\\Downloads";  
	}
	
	
	public static void main(String [] args){
		GetLatestDownloadedFile obj = new GetLatestDownloadedFile();
		String fileName = obj.getTheNewestFilePath("*.docx");
		System.out.println("Latest File downloaded in Download folder: "+fileName);
	}
	
}
