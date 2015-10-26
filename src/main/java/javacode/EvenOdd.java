package javacode;

import java.util.Scanner;

/*
 * How to find a no is even or odd w/o using % operator
 */
public class EvenOdd {

	public void basicFunc() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		if (input % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

	public void findevenodd() {
		Scanner sc = new Scanner(System.in);
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
		EvenOdd obj = new EvenOdd();
		obj.basicFunc();
		obj.findevenodd();
	}

}
