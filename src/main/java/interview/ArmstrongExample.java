package interview;

import java.util.Scanner;

/**
 * 153 = 1^3 + 5^3 + 3^3 
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4
 */
class ArmstrongExample {

	public void armstrongCheckHardCode() {
		int sum = 0, r, temp;
		int num = 153;
		temp = num;
		int len = 3;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = (int) (sum + Math.pow(r, len));
		}

		if (temp == sum)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
	}

	

	public void armstrongCheck() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		int len = str.length();

		int sum = 0;
		int temp = num;

		while (num > 0) {
			int r = num % 10;
			num = num / 10;
			sum = (int) (sum + Math.pow(r, len));
		}

		if (temp == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong No");
		}

	}

	public static void main(String[] args) {
		ArmstrongExample obj = new ArmstrongExample();
		obj.armstrongCheck();
		obj.armstrongCheckHardCode();
		
	}
}
