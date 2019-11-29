package cleancode;

public class StringUtilsTest {

	public static void utils1() {
		StringUtils1 obj1 = new StringUtils1();

		// reverse below stmt
		String result = obj1.sayHelloWorld("Hello World");
		String concat = obj1.concatenate("One", "-Two ");

		System.out.println(result);
		System.out.println(concat);
	}

	
	
	public static void utils2() {
		//StringUtils2 obj1 = new StringUtils2();
		String result = StringUtils2.sayHelloWorld("Hello World");
		String concat = StringUtils2.concatenate("One", "-Two ");
		
		System.out.println(result);
		System.out.println(concat);
	}
	
	
	
	public static void main(String[] args) {
		utils1();
		//utils2();
	}

}
