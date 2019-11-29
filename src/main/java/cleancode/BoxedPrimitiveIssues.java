package cleancode;

import java.util.Comparator;

/**
 * Rule: Always use primitive over Boxed primitive like Integer, Long, Boolean
 * Note: In collections we have to use Boxed primitive as collection don't support primitive
 * 
 * @author Sheetal_Singh
 */
public class BoxedPrimitiveIssues {

	public static void boxedPrimitive() {

		Comparator<Integer> naturalOrder = new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a < b ? -1 : (a == b ? 0 : 1);
			}
		};

		System.out.println(naturalOrder.compare(20, 10)); // 1 Correct
		System.out.println(naturalOrder.compare(100, 100)); // 0 Correct
		System.out.println(naturalOrder.compare(30, 40)); // -1 Correct
		System.out.println(
				"What about this; It should be Zero??  " + naturalOrder.compare(new Integer(100), new Integer(100))); // ??
	}

	
	
	
	
	
	
	
	
	
	
	public static void boxedPrimitiveUpdatedCode() {

		Comparator<Integer> naturalOrder = new Comparator<Integer>() {
			@Override
			public int compare(Integer a1, Integer b1) {
				
				// Auto Unboxing : Integer to int convertion
				int a = a1;
				int b = b1;
				
				return a < b ? -1 : (a == b ? 0 : 1);
			}
		};

		System.out.println("What about this?  "+naturalOrder.compare(new Integer(100), new Integer(100)));
	}

	public static void main(String[] args) {
		boxedPrimitive();
		//boxedPrimitiveUpdatedCode();
	}

}
