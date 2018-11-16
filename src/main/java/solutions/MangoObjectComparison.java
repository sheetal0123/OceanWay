package solutions;


/**
 * Problem Stmt: we want to compare two objects
 * 
 * Sol 1: we can override equals method and compare two objects data one by one
 * Sol 2: we can create two diff hashmap and then compare two maps
 * 
 * Here we try sol 1
 * 
 */
public class MangoObjectComparison {

	public MangoClass getObjectOne(){
		MangoClass mango = new MangoClass();
		mango.setId(1);
		mango.setName("alpha");
		mango.setColor("golden");
		mango.setTaste("wow");
		return mango;
	}
	
	public MangoClass getObjectTwo(){
		MangoClass mango = new MangoClass();
		mango.setId(1);
		mango.setName("alpha");
		mango.setColor("golden");
		mango.setTaste("wow");
		return mango;
	}
	
	public boolean compareTwoObjectsOfSameClass(){
		MangoClass oneExpected = getObjectOne();
		MangoClass twoActual = getObjectTwo();
		
		if (!oneExpected.equals(twoActual)) {
			System.out.println("Mismatch Data from Expected"+ oneExpected);
			System.out.println("Mismatch Data from Actual"+ twoActual);
			//throw new RuntimeException("Objects are not same....");
            return false;
        }else{
        	return true;
        }
	}
	
	
	public static void main(String[] args) {
		MangoObjectComparison m = new MangoObjectComparison();
		m.compareTwoObjectsOfSameClass();
	}

}
