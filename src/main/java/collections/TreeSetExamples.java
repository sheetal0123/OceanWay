package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Arrays;

/*
 * TreeSet: ordered by natural order(not insertion order) + sorted by natural order
 */
public class TreeSetExamples {

	public void basicOperations() {
		TreeSet<String> ts = new TreeSet<String>();   //Type 1: Default constructor
		ts.add("40");
		ts.add("10");
		ts.add("30");
		ts.add("50");
		ts.add("20");
		System.out.println(ts); // [10, 20, 30, 40, 50]
		System.out.println("Is set empty: " + ts.isEmpty()); // false
		System.out.println(ts.size()); // 5

		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " , "); // 10 , 20 , 30 , 40 , 50 ,
		}
	}

	public void listToTreeSet() {
		List<String> ls = new ArrayList<String>();
		ls.add("c");
		ls.add("a");
		ls.add("a");
		ls.add("b");
		System.out.println("");
		System.out.println(ls); // [c, a, a, b]

		//Type 2: Constructor accepting Collections
		TreeSet<String> ts = new TreeSet<String>(ls);  
		System.out.println(ts); // [a, b, c] | duplicate removed + sorted

	}

	public void removeDuplicateEntryFromStringArray() {
		String[] arr = { "5", "7", "2", "3", "1", "2", "3" };
		List<String> ls = Arrays.asList(arr);
		System.out.println(ls); // [5, 7, 2, 3, 1, 2, 3]

		TreeSet<String> ts = new TreeSet<String>(ls);
		System.out.println(ts); // [1, 2, 3, 5, 7]
	}

	public void getDuplicateEntryFromStringArray() {
		String[] arr = { "one", "three", "two", "five", "three", "one", "six" };
		HashSet<String> hs = new HashSet<String>();
		for (String str : arr) {
			boolean flag = hs.add(str); // duplicate entry will not be added and give false value
			if (!flag) {
				System.out.print(str + " , "); // three , one ,
			}
		}
	}

	public void constructorWithSortedSet(){
		SortedSet<String> ss=new TreeSet<String>();
		ss.add("z");
		ss.add("a");
		
		//Type 3: Constructor accepting SortedSet
		TreeSet<String> ts=new TreeSet<String>(ss);
		System.out.println("\n"+ts); //[a, z]
	}
	
	public static void main(String[] args) {
		TreeSetExamples obj = new TreeSetExamples();
		obj.basicOperations();
		obj.listToTreeSet();
		obj.removeDuplicateEntryFromStringArray();
		obj.getDuplicateEntryFromStringArray();
		obj.constructorWithSortedSet();
	}
}
