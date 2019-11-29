package cleancode;

/**
 * Rule: Method should have ideally 4-5 lines
 *         extra code should be extracted to new meaningful method name Alt Shift M
 *         Also important method should have bare minimum lines
 * 
 * @author Sheetal_Singh
 */
public class BigMethods {

	public static void longMethod() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
		int a1 = 15;
		int b1 = 25;
		int c1 = a1+b1;
		System.out.println(c1);
		
		int a2 = 20;
		int b2 = 30;
		int c2 = a2+b2;
		System.out.println(c2);
		
		int a3 = 40;
		int b3= 50;
		int c3 = a3+b3;
		System.out.println(c3);
		
		int a4 = 70;
		int b4 = 80;
		int c4 = a4+b4;
		System.out.println(c4);
		
	}
	
	public static void main(String[] args) {
			longMethod();
	}

}
