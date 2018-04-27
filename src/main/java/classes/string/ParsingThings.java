package classes.string;

public class ParsingThings {

	public void intToString(){
		int i = Integer.parseInt("10");
		System.out.println(i);
		
		String str = Integer.toString(i);
		System.out.println(str);
	}
	

	public static void main(String[] args) {
		ParsingThings obj = new ParsingThings();
		obj.intToString();
	}

}
