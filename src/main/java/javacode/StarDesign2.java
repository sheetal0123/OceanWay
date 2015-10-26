package javacode;

public class StarDesign2 {

	
	public void typeA() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 6; k > i; k--) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}
	

//	*****
//	 ****
//	  ***
//	   **
//	    *
	
	public void typeA1() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 6-i; k++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}

//	*****
//	 ****
//	  ***
//	   **
//	    *
	
	
	
	public void typeB() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//     	 *
//	    **
//	   ***
//	  ****
//	 *****	
	
	
	public static void main(String [] args){
		StarDesign2 obj=new StarDesign2();
		obj.typeA();
		obj.typeA1();
		obj.typeB();
		
	}
}
