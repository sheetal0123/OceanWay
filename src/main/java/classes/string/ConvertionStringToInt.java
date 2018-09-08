package classes.string;

public class ConvertionStringToInt {

	public void stringToInt() {
		String str = "10";
		int i = Integer.parseInt(str);
		int j = 20;
		int sum = i + j;
		System.out.println("sum: "+sum);
	}

	public void intToStringUsingToString() {
		int i = 100;
		String str = Integer.toString(i);
		System.out.println(str+" runs");
	}
	
	/**
	 * using valueOf() we can get String value from any primitive/object type
	 */
	public void intToStringUsingValueOf() {
		int i = 200;
		String str = String.valueOf(i);
		System.out.println(str+" runs");
	}

	public void diffBtTwoMethod() {
		String str = null;
		System.out.println(String.valueOf(str)); // print null
		System.out.println(str.toString());// NullPointerException
	}

	public static void main(String[] args) {
		ConvertionStringToInt obj = new ConvertionStringToInt();
		obj.stringToInt();
		
		obj.intToStringUsingToString();
		obj.intToStringUsingValueOf();
		
		obj.diffBtTwoMethod();
	}

}
