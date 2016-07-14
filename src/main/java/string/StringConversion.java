package string;

/**
 */
public class StringConversion {


	public static void main(String [] args){
		//convert string to primitive types
		String str1 = "10";
		int i= Integer.parseInt(str1);
		System.out.println(i+20); //30
		
		String str2 = "true";
		boolean bool = Boolean.parseBoolean(str2);
		System.out.println(bool); //true
		//Note: use parseLong, parseBoolean, parseDouble	

		
		//convert primitive to string using toString
		int a = 100;
		String s1 = Integer.toString(a);
		System.out.println(s1); // 100
		
		boolean b = true;
		String s2 = Boolean.toString(b);
		System.out.println(s2); //true
		
	}

}
