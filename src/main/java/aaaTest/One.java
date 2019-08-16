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





/**

#notes:

Q: How can we create list as  synchronised? 
A: List<type> synList = Collections.synchronizedList(listObj); listObj can be AL or LL


#AL
List<String> arrayList = new ArrayList<String>();   | Default Constructor with no arg get called with default capacity of 10 
List<String> arrayList = new ArrayList<String>(30);  single arg const get called and empty al get created with given value
List<String> arrayList = new ArrayList<String>(new LinkedList());  ArrayList(Collection<? extends E> c)  const get called and size depend upon given collection size	


How AL grow dynamically?
Once size reach new AL get created which is 1.5x times than original i.e. 10 increased to 15
Complete new space get allocated with increased space : a big disadv
AL stored in consecutive memory location


#LL
LL is implemented using Double LL i.e. every node has ref of previous and next node
LL element as not in consecutive memory locations
Easy to add/remove element in between List
LL has two constructor default and which takes collections

# AL vs LL
AL can define initial size but LL dont have any initial size; although by passing collections size can be defined
AL is fast if working with given n nos of element
LL can also be iterated in rev order using descendingIterator(), AL can't

Adding a element: AL is fast, as LL has to traverse
Adding element in first position : LL is fast, as AL need to shift every element
Fetching element value: list.get(i) :  AL is fast
Removing an element: LL is better

Most of the time we are using add(element) and get(element) in day to day life; and both these operation as fast in AL.
Hence AL is preferred than LL.






# HS
HS uses HM internally



# Tree Map
TM based on Red Black Tree Algo
Key of TM shd have been Comparable i.e. if its a class like Employee then we need to implement Comparable




**/

