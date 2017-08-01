package interviewpractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {

	public void countWordsInAString1() {
		String str = "Today is Holdiay Day";
		int len = str.split(" ").length;
		System.out.println("Word Count: " + len);
	}

	// without using any formula
	public void countWordsInAString2() {
		String str = "  Today is  Fun   Day    ";
		str = str.trim();
		char[] ch = str.toCharArray();

		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (ch[i]==' ' && !(ch[i+1]==' ')) {
				count++;
			}
		}
		System.out.println("Words count: "+ count);
	}

	public void countWordsInAFile() throws IOException {
		FileReader fr = new FileReader("D:\\epam-qa\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		int count = 0;
		while (str != null) {
			String[] parts = str.split(" ");
			for (String w : parts) {
				count++;
			}
			str = br.readLine();
		}
		System.out.println("Word Count: " + count);
	}

	public void countParticularWordInAFile(String textToFind) throws IOException {
		FileReader fr = new FileReader("D:\\epam-qa\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		int count = 0;

		while (str != null) {
			String[] parts = str.split(" ");
			for (String w : parts) {
				if (w.equalsIgnoreCase(textToFind))
					count++;
			}
			str = br.readLine();
		}
		System.out.println("'" + textToFind + "' word count: " + count);
	}

	public void countAllWordOccurencesInFile() throws IOException {
		Map<String, Integer> map = new HashMap<String, Integer>();

		FileReader fr = new FileReader("D:\\epam-qa\\test.txt");
		BufferedReader br = new BufferedReader(fr);

		String str;
		while ((str = br.readLine()) != null) {
			String[] arr = str.split(" ");
			for (String word : arr) {
				map.put(word, map.containsKey(word) ? map.get(word) + 1 : 1);
			}
		}

		Set<String> set = map.keySet();
		for (String k : set) {
			System.out.println(k + "	" + map.get(k));
		}

	}

	public static void main(String[] args) throws IOException {
		WordCount wc = new WordCount();
		// wc.countWordsInAString1();
		wc.countWordsInAString2();
		// wc.countWordsInAFile();
		// wc.countParticularWordInAFile("world");
		// wc.countAllWordOccurencesInFile();
	}

}
