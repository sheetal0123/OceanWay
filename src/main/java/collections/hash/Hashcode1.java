package collections.hash;

/**
 * Hashcode is an integer referring to an object
 * Object.java parent class has default behaviour that every new object on heap will have different hashcode 
 *	
 */
public class Hashcode1 extends Object {
	
	
	public void printHashcode(){
		Hashcode1 obj1 = new Hashcode1();
		Hashcode1 obj2 = new Hashcode1();
		
		
		//hashcode
		System.out.println(obj1.hashCode()); //2018699554
		System.out.println(obj2.hashCode()); //1311053135

		if(!(obj1 == obj2))
			System.out.println("References, points to different location on heap hence they are not same");

		/**
		 * false, as they have diff hashcode
		 * equals() checks hashcode first then check the object
		 * this case failed in first filter only
		 */
		System.out.println(obj1.equals(obj2)); //false
		
	}
	
		
	
	public static void main(String args[]){
		Hashcode1 obj = new Hashcode1();
		obj.printHashcode();
	
	}
	
}


