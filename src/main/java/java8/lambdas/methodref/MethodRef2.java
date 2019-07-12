package java8.lambdas.methodref;

interface Parser{
	String parse(String s);
}


class StringParser{
	public static String convert(String str) {
		if(str.length() <= 3)
			return str.toUpperCase();
		else
			return str;
	}
}





class MyPrinter{
	public void print(String str, Parser parser) {
		str = parser.parse(str);
		System.out.println(str);
	}
}

public class MethodRef2 {
	public static void main(String[] args) {
		String inputString = "abc";
		MyPrinter myprinter = new MyPrinter();
		myprinter.print(inputString, s -> StringParser.convert(inputString));  	// using lambadas
		myprinter.print(inputString, StringParser::convert);  					// using method ref
		
	}
}
