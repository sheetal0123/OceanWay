package interview;

public class ReverseEachWordInAString {

	static void reverseEachWordOfString(String inputString) {

		String[] arrWords = inputString.split(" ");
		String reverseString = "";

		for (int i = 0; i < arrWords.length; i++) {
			String word = arrWords[i];
			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}

			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(inputString);
		System.out.println(reverseString);
	}

	public static void main(String[] args) {
		reverseEachWordOfString("Java Concept Of The Day");
	}
}
