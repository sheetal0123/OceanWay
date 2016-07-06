package string;

/**
 * String : Immutable
 * StringBuffer : Mutable + Synchronized
 * StringBuilder : Mutable + Unsyncronized
 * 
 * + : plus sign is actually using StringBuilder behind the scene, good to use for large strings
 * concat: good to use for small string e.g. add two strings
 */
public class String4 {
	
	
	public static void main(String [] args){
		
		//Following two stmt are same
		String s1 = "My age is "+ 31+ Boolean.valueOf(true); // My age is 31true
		StringBuilder sb = new StringBuilder("My age is ").append(31).append(Boolean.valueOf(true));
		System.out.println(sb);  // My age is 31true 
		
		//concat method : can only join two strings not int or boolean as in case of String Builder
		String s2 = "ab";
		String s3 = "cd";
		
		System.out.println(s2.concat(s3));  // abcd
		//System.out.println(s2.concat(50));   compiler error
	}

}
