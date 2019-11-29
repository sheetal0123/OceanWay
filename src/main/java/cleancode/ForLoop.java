package cleancode;

/**
 * Rule: Try to use for-each loop over normal for loop and iterator to iterate an array or collection.
 * 
 * Adv:
 * 1. Less error prone, easy to understand
 * 2. advance for loop uses iterator internally
 * 3. Better performance than old loop
 * 
 * @author Sheetal_Singh
 */
public class ForLoop {

	public void normalLoop() {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <=3 ; j++) {
				System.out.println(i + "" + j);
			}
		}
	}

	public void forEachLoop() {
		int[] arr1 = { 0, 1, 2, 3 };
		int[] arr2 = { 0, 1, 2, 3 };

		for (int i : arr1) {
			for (int j : arr2) {
				System.out.println(i + "" + j);
			}
		}

	}

	public static void main(String[] args) {
		ForLoop forLoop = new ForLoop();
		forLoop.normalLoop();
		System.out.println("");
		forLoop.forEachLoop();
	}

}
