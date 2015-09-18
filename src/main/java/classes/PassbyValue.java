package classes;

/*
 * Any primitive passing are always passed by value i.e. we pass a copy of variables
 * any change/modification will not affect original copy of variables
 */
public class PassbyValue {

	public void change(int a, int b) {
		a = a + 10;
		b = b + 10;
	}

	public static void main(String[] args) {
		PassbyValue obj = new PassbyValue();
		int a = 10, b = 20;
		System.out.println("Intial values: " + a + ", " + b); // Initial values:
																// 10, 20
		obj.change(a, b); // copy passed
		System.out.println("After values: " + a + ", " + b); // After values:
																// 10, 20
	}
}
