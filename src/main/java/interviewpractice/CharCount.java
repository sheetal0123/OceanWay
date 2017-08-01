package interviewpractice;

import java.util.HashMap;
import java.util.Scanner;

public class CharCount {

	public void charOccurenceInAString1() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();

		char c = 'a';
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == c)
				count++;
		}
		System.out.println("Occurences: " + count);
	}

	// without using loops
	public void charOccurenceInAString2() {
		String str = "I am not using any loops";
		int length1 = str.length();

		str = str.replaceAll("a", "");
		int length2 = str.length();

		System.out.println("Occurences: " + (length1 - length2));
	}

	public void characterCountInString() {
		String inputString = "hello world";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] arr = inputString.toCharArray();

		// checking each char of strArray
		for (char key : arr) {

			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		CharCount obj = new CharCount();
		// obj.charOccurenceInAString1();
		// obj.charOccurenceInAString2();
		obj.characterCountInString();
	}

}
