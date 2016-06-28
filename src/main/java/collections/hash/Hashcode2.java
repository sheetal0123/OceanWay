package collections.hash;

public class Hashcode2 {

	int age;
	
	public Hashcode2(int a){
	  this.age = a;	 
	}
	
	
	/**
	 * We have over ridded hash code and now returning age
	 */
	@Override
	public int hashCode(){
		return age;
	}
	
	public static void main(String [] args){
		Hashcode2 obj1 = new Hashcode2(31);
		Hashcode2 obj2 = new Hashcode2(31);
		
		//Now actuall hashcode will not be printed
		System.out.println(obj1.hashCode());  // 31
		System.out.println(obj2.hashCode());  // 31
		
		//Java provide another way if we want to check original hashcode value
		int originalHashCode = System.identityHashCode(obj2);
		System.out.println(originalHashCode); //2018699554
			
		
	}
}
