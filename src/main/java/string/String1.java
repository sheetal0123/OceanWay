package string;

/**
 * Till Java 6: String pool are stored in PermGen area
 * From Java 7: String pool are stored in main heap area
 * 
 * Why String pool concept in Java: Suppose we have 1lac name DB saved in a array list. In 1 lac lot of name surname will be
 * common. If there is no pool then we will have 1 lac object in memory.
 */
public class String1 {
	
	
	public static void main(String [] args){
	
		String s1 = "hello1"; // cached in string pool
		
		// s2 referencing same s1 object which is present in string pool
		// s2 will not create a new object like s1, it will go in string pool and check if same object already present or not
		// if found then same reference will be passed to s2
		String s2 = "hello1"; 
		System.out.println(s1 == s2); //true
		
		
		//s3 will not be stored in string pool and given a separate space in heap
		//'hello' string is not 'interned'; term used when creating string obj using 'new' keyword 
		String s3 = new String("hello");
		System.out.println(s1 == s3); //false
		
		
		//interning make sure jvm look inside string pool and refer object if its value already present in pool
		// interning helps in optimizing memory
		String s4 = new String("hello").intern();
		System.out.println(s1 == s4); //false
	
		
	}

}
