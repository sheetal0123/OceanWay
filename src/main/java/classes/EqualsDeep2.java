package classes;

import java.util.Arrays;

public class EqualsDeep2 {

	String firstname, lastname;
	
	public EqualsDeep2(String f, String l){
		firstname = f;
		lastname = l;
	}
	
	
	public static void main(String [] args){
		EqualsDeep2 obj1 = new EqualsDeep2("john","cobb");
		EqualsDeep2 obj2 = new EqualsDeep2("john","cobb");
		EqualsDeep2 obj3 = new EqualsDeep2("will","cobb");
		
		
		/**
		 * equals method check for objects content ++ its storage location on heap
		 * in this case content is same but location of two objects are different on heap
		 * in case of String o/p will be "SAME PERSON" because content is same and storage location is also same on heap (string pool concept)
		 */
		if(obj1.equals(obj2))
			System.out.println("SAME PERSON");
		else
			System.out.println("DIFFERENT PERSON");  // DIFFERENT PERSON
		
		//how to do this using deep
//		if(DeepEquals(obj1,obj2))
//			System.out.println("SAME PERSON");
//		else
//			System.out.println("DIFFERENT PERSON");  // DIFFERENT PERSON
//		
		

	}
}
