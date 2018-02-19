package interview;

import java.util.Scanner;

public class PalendromeTest {

	/**
	 * This work for strings including ints (read them as string)
	 */
	public void stringTest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string...");

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

	
	
	/**
	 * Only for integers
	 */
	public void intTest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		
		int n = sc.nextInt();  // 1234321
		int r, sum = 0, temp;

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

	public static void main(String[] args) {
		PalendromeTest obj = new PalendromeTest();
		// obj.stringTest();
		obj.intTest();
	}
}
