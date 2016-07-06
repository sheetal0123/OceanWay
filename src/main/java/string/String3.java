package string;

/**
 * Memory Leak in substring method in Java 6
 * this issue has been fixed in Java 7
 */
public class String3 {
	
	
	public static void main(String [] args){

		//In Java 6, S2 substring value 'rain' refer main S1 only
		//Now if we want to delete S1 we cannot do so as S2 is using S1 internally, GC will not remove S1. This cause memory leak 
		String s1 = "train"; 
		String s2 = s1.substring(1, 5);
		System.out.println(s2);   // rain
		
	}

}
