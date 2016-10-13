package collections.sort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Here we read a file and sorted according to song title
 * 
 * But we need more data along with songs title, hence we need to create Song class objects
 * 
 */

public class TestSong1 {

	List<String> ls = new ArrayList<>();

	public void getTitle(String str) {
		String[] arr = str.split(",");
		ls.add(arr[0]);
	}

	public void sortSimpleSongStrings() throws IOException {
		File classpath = new File(System.getProperty("user.dir"));
		String filepath = classpath + "/src/main/java/collections/sort/songs.txt";
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		String line = null;
		int counter = 0;
		while ((line = br.readLine()) != null) {
			if (counter != 0) {
				getTitle(line);
			}
			counter++;
		}

		System.out.println(ls);
		//[Tujhe dekha to ye jana sanam, Ye sama sama ye pyar ka, Hosh walalo ko khabar kya, Meri Wafayen Yaad Karoge]
		
		Collections.sort(ls);
		
		System.out.println(ls);
		//[Hosh walalo ko khabar kya, Meri Wafayen Yaad Karoge, Tujhe dekha to ye jana sanam, Ye sama sama ye pyar ka]
		
		br.close();
	}

	public static void main(String[] args) throws IOException {
		TestSong1 obj = new TestSong1();
		obj.sortSimpleSongStrings();

	}
}
