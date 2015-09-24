package classes;

import java.util.Scanner;

public class ScannerFindInLine {

	public static void main(String[] args) {
		String str = "My age is: 30 and gugu age is: 2.7";
		Scanner sc = new Scanner(str);
		sc.findInLine(": ");

		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				System.out.println(sc.nextDouble());
			} else {
				sc.next();
			}
		}

		sc.close();

	}
}
