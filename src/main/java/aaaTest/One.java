package aaaTest;

import java.math.BigInteger;

public class One {

	public static void main(String[] args) {
		System.out.println("One");
		
		String orig ="002000010000";
		long orig1 = Integer.parseInt(orig);
		
		
			
		String samt ="000000001000";
		int samt1 = Integer.parseInt(samt);

		String stax ="000000000100";
		int stax1 = Integer.parseInt(stax);

		String saddtax ="000000000010";
		int saddtax1 = Integer.parseInt(saddtax);

		
		long total = orig1+samt1+stax1+saddtax1;
		
//		000000010000  orig
//		D000000001000  sur amt
//		000000000100    ser tax
//		000000000010    add tax
		
		
		
		System.out.println(String.format("%012d",total));
		
		
		BigInteger big1 = new BigInteger("000000010000");
		BigInteger big2 = new BigInteger("000000010000");
		BigInteger big3 = new BigInteger("000000010000");
		
		BigInteger sum = big1.add(big2).add(big3);
		
		System.out.println("Big Sum: "+String.format("%012d",sum));
		
		
		
		//System.out.println("D120000001009".substring(1));
		
	}

}
