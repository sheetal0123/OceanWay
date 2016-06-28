package collections.hash;

/**
 * Hashcode is an integer referring to an object
 * 
 *
 */
public class Hashcode1 {

	public void printHashcode(){
		Hashcode1 obj1 = new Hashcode1();
		Hashcode1 obj2 = new Hashcode1();
		
		System.out.println(obj1.equals(obj2)); // false, as they have diff hashcode
		
		
		System.out.println(obj1); //collections.hash.Hashcode1@7852e922
		System.out.println(obj1.hashCode()); //2018699554
		System.out.println(obj2.hashCode()); //1311053135
	}
	
		
	
	public static void main(String args[]){
		Hashcode1 obj = new Hashcode1();
		obj.printHashcode();
	
	}
	
}


