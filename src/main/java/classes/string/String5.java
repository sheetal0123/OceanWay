package classes.string;

/**
 * String equals good practices
 * string which cannot be null should be used first
 */
public class String5 {

	private static String someOperation() {
		//return null;
		return "wow";
	}

	public static void main(String [] args){
		
		String s1 = "wow";
		String s2 = someOperation();

		
		// string which cannot be null should be used first 
		if(s1.equals(s2)){
			System.out.println("Operation sucessfull");
		}else{
			System.out.println("Operation failed");
		}
		
		
		//here we will get null pointer exception
		if(s2.equals(s1)){
			System.out.println("Operation sucessfull");
		}else{
			System.out.println("Operation failed");
		}

		
		/**
		 * Password should always be stored in char array rather string
		 * as String are put in string pool and if hacker get access to string pool then it can be easily
		 * recovered and string from string pool are not easily garbage collected.
		 * 
		 * use char array and once password used set it to null so that it can be garbage collected
		 */
		
		char [] arr = new char[]{'p','a','s','s','w','o','r','d'};
		System.out.println(arr);
		
		
	}

}
