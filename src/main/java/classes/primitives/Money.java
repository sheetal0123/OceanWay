package classes.primitives;

import java.math.BigDecimal;

/**
 * For Money related calculations never use Double or Float, always go for BigDecimal, int and long
 * @author Sheetal_Singh, May 2018
 *
 */
public class Money {

	public void wrongCalculation() {
		System.out.println(1.03-0.42); //0.6100000000000001
		System.out.println(1 - 0.99);  //0.010000000000000009
		System.out.println(1 - 0.90);  //0.09999999999999998
	}
	
	/**
	 * How many candy can be bought with 1 rupees given one candy costs 10 paise
	 */
	public void itemBought1() {
		double walletBalance = 1.00;
		double candyPrice = 0.10;
		int candyCount = 0;
		//double balance = 0;
		
		while(walletBalance >= candyPrice) {
			walletBalance = walletBalance - candyPrice;
			//System.out.println(walletBalance);
			candyCount++;
		}
		
		System.out.println("Candy Count:"+ candyCount);
		System.out.println("Wallet Balance:"+ walletBalance);
	}
	
	
	/**
	 * How many candy can be bought with 1 rupees given one candy costs 10 paise
	 * 
	 * Somehow this is also showing wrong ans
	 */
	public void itemBought2() {
		BigDecimal walletBalance = new BigDecimal(1.00);
		BigDecimal candyPrice = new BigDecimal(0.10);
		int candyCount = 0;

//		Effective Java Item 48 Page 218		
//		for(BigDecimal price = candyPrice; walletBalance.compareTo(price)>=0; price = price.add(candyPrice)) {
//			candyCount++;
//			walletBalance = walletBalance.subtract(price);
//			System.out.println(">>"+walletBalance);
//		}
		
		for(BigDecimal price = candyPrice; walletBalance.compareTo(price)>=0; price = candyPrice) {
			candyCount++;
			walletBalance = walletBalance.subtract(price);
			//System.out.println(">>"+walletBalance);
		}
		
		System.out.println("Candy Count:"+ candyCount);
		System.out.println("Wallet Balance:"+ walletBalance);
	}
	
	public static void main(String[] args) {
		Money obj = new Money();
		//obj.wrongCalculation();
		//obj.itemBought1();
		obj.itemBought2();
	}

}
