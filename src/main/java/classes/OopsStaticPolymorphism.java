package classes;
/*
 * Overloading is static or compile time polymorphism
 * compiler know which overloading method to run
 * return type does not matter, only argument shd be different
 */
public class OopsStaticPolymorphism {
	public void print(String s) {
		System.out.println("First Method with only String: " + s);
	}

	public int print(int i) {
		System.out.println("Second Method with only int: " + i);
		return 10;
	}

	public void print(String s, int i) {
		System.out.println("Third Method with both: " + s + " & " + i);
	}

	public static void main(String[] args) {
		OopsStaticPolymorphism obj = new OopsStaticPolymorphism();
		obj.print("John");
		obj.print(10);
		obj.print("John", 10);
	}
}

/*
First Method with only String: John
Second Method with only int: 10
Third Method with both: John & 10
*/