package collections.hash;

/**
 * As a user I want a behavior that if two reference are from same class then
 * java should give same hashcode, I want it that way
 * 
 * Then in that case we have to change default hashCode() behavior
 *
 */
public class Hashcode2 extends Object {

	
	/**
	 * We have overridded hash code
	 */
	@Override
	public int hashCode(){
		return 100;
	}
	
	public static void main(String [] args){
		Hashcode2 obj1 = new Hashcode2();
		Hashcode2 obj2 = new Hashcode2();
		
		//Now actual hashcode will not be printed
		System.out.println(obj1.hashCode());  // 100
		System.out.println(obj2.hashCode());  // 100
		
		//Java provide another way if we want to check original hashcode value
		int originalobj1 = System.identityHashCode(obj1);
		int originalobj2 = System.identityHashCode(obj2);
		System.out.println(originalobj1);  // 2018699554
		System.out.println(originalobj2);  // 1311053135
		
		
		if(!(obj1 == obj2))
			System.out.println("We are still different");   //We are still different
			
		System.out.println(obj1.equals(obj2)); //false
	}
}
