package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * this is character stream classes
 * writer is not working
 */
public class FileReaderWriter {
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		FileReader fr = new FileReader(
				"/home/xebia/workspace/OceanWay/src/main/java/file/filereader.dat");
		BufferedReader br = new BufferedReader(fr);
		
		
		FileWriter fw = new FileWriter(
				"/home/xebia/workspace/OceanWay/src/main/java/file/filewriter.dat");
		BufferedWriter bw = new BufferedWriter(fw);

		
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
			bw.write(str);
		}
		fr.close();
		fw.close();
	}
}
