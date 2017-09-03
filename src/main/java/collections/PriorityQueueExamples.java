package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * PQ: Ordered by Comparator 
 * In PQ only poll and peek method return first least element which ensure ordering
 */
public class PriorityQueueExamples {

	public void PQOrdering(){
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("5");
		pq.add("3");
		pq.add("1");
		pq.add("2");
		pq.add("4");
		pq.add("6");
		
		System.out.println("Unordered: "+pq); // Unordered: [1, 2, 3, 5, 4, 6]
		
		Iterator<String> itr=pq.iterator();
		System.out.print("Unordered Itr: ");
		while(itr.hasNext()){
			System.out.print(itr.next()+", "); // Unordered Itr: 1, 2, 3, 5, 4, 6, 
		}
		
		System.out.println("");
		System.out.print("Unordered Arrays: ");
		Object [] obj=pq.toArray();
		for(Object o: obj){
			System.out.print(o+", ");  //Unordered Arrays: 1, 2, 3, 5, 4, 6, 
		}
		
		
		//To order a PQ
		System.out.print("\nOrdered:");
		while(!pq.isEmpty()){
			System.out.print(pq.poll()+", ");   //Ordered: 1, 2, 3, 4, 5, 6, 
		}
		System.out.println("********************************************");
		
	}
	
	public void methodsOfPQ() {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // Default Constructor:
//		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(30);
		pq.add(50);
		pq.add(40);
		pq.add(20);
		System.out.println(pq);// [10, 20, 50, 40, 30]

		pq.offer(75); // add element randomly anywhere
		System.out.println(pq); // [10, 20, 50, 40, 30, 75]

		System.out.println(pq.peek()); // 10 | return head of queue and don't touch pq 
		System.out.println(pq); // [10, 20, 50, 40, 30, 75]

		System.out.println(pq.poll()); // 10 | return head and also removes head from pq
		System.out.println(pq); // [20, 50, 40, 30, 75]

		System.out.println(pq.element()); // 20 | same as peek but throw exception if pq is empty
		System.out.println(pq); // [20, 50, 40, 30, 75]

		pq.remove(); // 20 | same as poll but throw exception when queue is empty
		System.out.println(pq); // [50, 40, 30, 75]

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1000);
		ls.add(2000);

		pq.addAll(ls);
		System.out.println(pq); // [30, 40, 50, 75, 1000, 2000]

		pq.removeAll(ls);
		System.out.println(pq); // [30, 40, 50, 75]

		ls.clear(); // empty ls
		ls.add(101);
		ls.add(102);
		pq.addAll(ls);
		pq.retainAll(ls); // all element will be removed except ls
		System.out.println(pq); // [101, 102]

		System.out.println(pq.containsAll(ls)); // true
		System.out.println("********************************************");
		
//		Queue<String> q=new PriorityQueue<String>();
	}

	public void constructorsOfPQ() {
		// Constructor 2: taking initial capacity
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(10);
		System.out.println(pq1); // []

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(100);
		ls.add(200);

		// Constructor 3: taking collection
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(ls);
		System.out.println(pq2); // [100, 200]

		// Constructor 4: taking initial capacity and comparator
		PriorityQueue<Integer> pq3 = new PriorityQueue<Integer>(2,new MyCompPQ());
		pq3.add(2);
		pq3.add(8);
		pq3.add(6);
		pq3.add(4);
		pq3.add(0);
		System.out.println(pq3); // [8, 4, 6, 2, 0]

	}

	public void constructorsOfPQ2() {
		PriorityQueue<Integer> pq4 = new PriorityQueue<Integer>();
		pq4.add(1000);

		// Constructor 5: accepting PQ
		PriorityQueue<Integer> pq5 = new PriorityQueue<Integer>(pq4);
		pq5.add(2000);
		pq5.add(5000);
		pq5.add(4000);

		for (Integer a : pq5) {
			System.out.print(a + " - "); // 1000 - 2000 - 5000 - 4000 -
		}

		// Constructor 6: accepting SortedSet - need to check implementation
		 SortedSet<String> ss=new TreeSet<String>();
		 ss.add("z");
		 ss.add("a");
		 PriorityQueue<String> pq6=new PriorityQueue<String>(ss);
		 System.out.println("\n"+pq6); // [a, z]
	}

	public static void main(String[] args) {
		PriorityQueueExamples obj = new PriorityQueueExamples();
		obj.PQOrdering();
		obj.methodsOfPQ();
		obj.constructorsOfPQ();
		obj.constructorsOfPQ2();
	}
}

class MyCompPQ implements Comparator<Integer> {
	@Override
	public int compare(Integer a, Integer b) {
		int z=b.compareTo(a);
		System.out.println("<>"+b+","+a+","+z);
		
		return z;
	}
}