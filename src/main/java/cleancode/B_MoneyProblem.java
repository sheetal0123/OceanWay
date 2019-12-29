package cleancode;

public class B_MoneyProblem {

	public static void subtractionProblem() {
		System.out.println("Difference Problem: ");
		System.out.println(1.03 - 0.42);
		System.out.println(1 - 0.99);
		System.out.println(1 - 0.90);
	}

	/**
	 * Question: How many candy can be bought with Rs 1. 
	 * Given one candy costs 10 Paise
	 */
	public static void CandyProblem() {
		System.out.println("\n\nCandy Problem:");
		double walletBalance = 1.00;
		double candyPrice = 0.10;
		int candyCount = 0;

		while (walletBalance >= candyPrice) {
			walletBalance = walletBalance - candyPrice;
			candyCount++;
		}

		System.out.println("Candy Count:" + candyCount);
		System.out.println("Wallet Balance:" + walletBalance); // Wallet still have some money
	}

	public static void main(String[] args) {
		subtractionProblem();
		CandyProblem();
	}

}
