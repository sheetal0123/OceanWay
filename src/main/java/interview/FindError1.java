package interview;

public class FindError1 {

	//compiler error: method cannot be toString() as its an reserved word
	public static String toString1() {
		return "Hi";
	}
	
	public static void main(String[] args) {
		
		System.out.println(toString1());
	}

}
