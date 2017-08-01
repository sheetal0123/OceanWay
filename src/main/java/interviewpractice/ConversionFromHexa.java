package interviewpractice;

import java.util.Scanner;

public class ConversionFromHexa {

	public void hexaToOthers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hexa:");

		String hexa = sc.nextLine();
		int dec = Integer.parseInt(hexa, 16);
		System.out.println("Decimal: " + dec);
		System.out.println("Binary: " + Integer.toBinaryString(dec));
		System.out.println("Octa: " + Integer.toOctalString(dec));
	}

	public static void main(String[] args) {
		ConversionFromHexa obj = new ConversionFromHexa();
		obj.hexaToOthers();
	}
}

//Enter Hexa: a
//Decimal: 10
//Binary: 1010
//Octa: 12
