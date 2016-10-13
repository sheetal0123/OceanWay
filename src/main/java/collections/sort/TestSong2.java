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

public class TestSong2 {

	List<Song> ls = new ArrayList<>();

	public void getSongDetails(String str) {
		String[] arr = str.split(",");
		
		Song song = new Song(arr[0], arr[1], arr[2]);
		ls.add(song); // added song object which has all details it in
		
	}

	public void sortSongObjects() throws IOException {
		File classpath = new File(System.getProperty("user.dir"));
		String filepath = classpath + "/src/main/java/collections/sort/songs.txt";
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		String line = null;
		int counter = 0;
		while ((line = br.readLine()) != null) {
			if (counter != 0) {
				getSongDetails(line);
			}
			counter++;
		}

		System.out.println(ls); // Not sorted
		//[Tujhe dekha to ye jana sanam, Ye sama sama ye pyar ka, Hosh walalo ko khabar kya, Meri Wafayen Yaad Karoge]
		
		
		/**
		 * Unlike previous case here sort method will not work as Song IS NOT A Comparator
		 * If we check Set API it state :    static <T extends Comparable<? super T>> void sort(List<T> ls)
		 * means <T> should pass IS A for Comparable
		 * solution: Song implements Comparable
		 */
		
		Collections.sort(ls);
		
		System.out.println(ls);
		//[Hosh walalo ko khabar kya, Meri Wafayen Yaad Karoge, Tujhe dekha to ye jana sanam, Ye sama sama ye pyar ka]

		br.close();
	}

	public static void main(String[] args) throws IOException {
		TestSong2 obj = new TestSong2();
		obj.sortSongObjects();

	}
}
