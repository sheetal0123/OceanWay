package solutions.obj_comparision;


/**
 * Problem Stmt: we want to compare two objects of same class (Mango) or Diff classes (Mango and Orange)
 * 
 * Sol 1: we can override equals method and compare two objects data one by one
 * Sol 2: we can create two diff hashmap and then compare two maps
 * 
 * Here we try sol 1
 * 
 */
public class TestCompareObjUsingEquals {

	//expected
	public MangoClass getObjectOne(){
		MangoClass mango = new MangoClass();
		mango.setId(1);
		mango.setName("alpha");
		mango.setColor("golden");
		mango.setTaste("wow");
		return mango;
	}
	
	//actual 1
	public MangoClass getObjectTwo(){
		MangoClass mango = new MangoClass();
		mango.setId(1);
		mango.setName("alpha");
		mango.setColor("golden");
		mango.setTaste("wow");
		return mango;
	}
	
	
	/**
	 * If Actual object is of diff class i.e. OrangeClass But data is almost same and common data need to verify
	 * Then fetch data from OrangeClass and update domain of Mango and then compare using current solution
	 */
	public MangoClass getObjectTwoFromDiffClass(){
		//object from some diff class
		OrangeClass orange = new OrangeClass();
		orange.setId("1");
		orange.setName("alpha");
		orange.setColor("golden");
		orange.setTaste("wow");
		orange.setState("maha"); //extra, not to be compared
		
		//convert orange to mango so that equals can be used
		MangoClass mango = new MangoClass();
		mango.setId(Integer.valueOf(orange.getId())); // convert string to int
		mango.setName(orange.getName());
		mango.setColor(orange.getColor());
		mango.setTaste(orange.getTaste());
		return mango;
	}
	
	
	
	public boolean compareTwoObjectsOfSameClass(){
		MangoClass oneExpected = getObjectOne();
		//MangoClass twoActual = getObjectTwo();
		MangoClass twoActual = getObjectTwoFromDiffClass();
		
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
		TestCompareObjUsingEquals m = new TestCompareObjUsingEquals();
		boolean flag = m.compareTwoObjectsOfSameClass();
		System.out.println("Are object same: "+ flag);
	}

}
