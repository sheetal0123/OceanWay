package classes;

public class PlainClassWOConst {

	int x, y;

	//setter will be replaced with constructor in next eg.
	public void set(int m, int n) {
		x = m;
		y = n;
	}

	public int add() {
		return x + y;
	}

	public static void main(String[] args) {
		PlainClassWOConst obj = new PlainClassWOConst();
		obj.set(10, 20);
		System.out.println("Sum is: " + obj.add()); // Sum is: 30

		obj.set(100, 200);
		System.out.println("Sum is: " + obj.add()); // Sum is: 300
	}
}

/*
Here unnecessary we have to call setter and then initialize class variable
and then object become use-full
*/