package interview;

import java.util.Scanner;

/*
 * How to find a no is even or odd w/o using % operator
 */
public class OddEven {

	public void findevenodd1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number...");
		
		int input = sc.nextInt();

		if (input % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

	/**
	 * Find odd even w/o using reminder operator
	 */
	public void findevenodd2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		
		int input = sc.nextInt();

		while (input >= 2) {
			input = input - 2;
		}

		if (input == 0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

	public static void main(String[] args) {
		OddEven obj = new OddEven();
		obj.findevenodd1();
		//obj.findevenodd2();
	}

}
