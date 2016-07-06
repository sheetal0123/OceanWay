package string;

/**
 * Why Strings are immutable
 */
public class String2 {
	
	
	public static void main(String [] args){

		//What if strings are mutable
		String s1 = "world"; // cached in string pool
		String s2 = "world"; // s2 points to same object already present in pool
		 
		s1.toUpperCase();  // s1 value updated with upper case, hence object in heap becomes upper case
						   // now as s2 also points to same object, s2 also become upper case, which break further code
						   // to avoid this situation strings are made immutable
	
		
		
		//Strings hashcode are also cached
		String s3 = "I am a very long string"; 
		//suppose we have a very long string, now jvm has to calculate its hashcode everytime when this is getting used
		//as string are immutable i.e. cannot change, so jvm cached their hashcode so whenever same string get used no need to 
		// calculate hashcode again which save lot of time and improves performance
	
		
	}

}
