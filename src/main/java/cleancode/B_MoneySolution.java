package cleancode;

import java.math.BigDecimal;

/**
 * Rule: For Money related calculations never use Double or Float, always go for
 * BigDecimal, int and long
 * 
 * @author Sheetal_Singh
 */
public class B_MoneySolution {

	public static void subtractionSolution() {
		System.out.println("Difference Solution:");
		BigDecimal i = BigDecimal.valueOf(1.03);
		BigDecimal j = BigDecimal.valueOf(0.42);
		System.out.println("Correct Answer: " + i.subtract(j));
	}

	public static void CandySolution() {
		System.out.println("\n\nCandy Solution:");
		BigDecimal walletBalance = BigDecimal.valueOf(1.00);
		BigDecimal candyPrice = BigDecimal.valueOf(0.10);
		int candyCount = 0;

		while (walletBalance.compareTo(candyPrice) >= 0) {
			walletBalance = walletBalance.subtract(candyPrice);
			candyCount++;
		}

		System.out.println("Candy Count:" + candyCount);
		System.out.println("Wallet Balance:" + walletBalance);

	}

	public static void main(String[] args) {
		subtractionSolution();
		CandySolution();
	}

}
