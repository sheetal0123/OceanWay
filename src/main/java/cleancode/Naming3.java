package cleancode;

/**
 * Method name should convey the clear message 
 * @author Sheetal_Singh
 */
public class Naming3 {

	
	public static void calculateTaxAsPer(int age) {
		if(age >= 80) {
			System.out.println("Super Sr Citizen");
		}else if(age >= 60) {
			System.out.println("Sr Citizen");
		}else {
			System.out.println("Citizen");
		}
	}
	
	public static void main(String[] args) {
		calculateTaxAsPer(100);
	}

}
