package javacode;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String rev = "";
		int len = str.length() - 1;

		for (int i = len; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev);
		sc.close();

		if (str.equals(rev))
			System.out.println("palendrome");
		else
			System.out.println("not a palendrome");
	}
}
