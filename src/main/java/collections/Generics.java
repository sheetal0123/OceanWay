package collections;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * collection can store only references to objects, not primitives
 */
public class Generics {

	public void preGenericCode() {
		ArrayList al = new ArrayList(); // want to create Integer array list
		al.add(10); // what compiler see it: al.add(new Integer(10))
		al.add(20);
//		al.add("oops"); // added string by mistake - will get run time exception

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			int i = (Integer) itr.next(); // casting required
			System.out.print(i+" ");  //10 20
		}
		System.out.println("");
	}

	public void genericCode() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10); // what compiler see it: al.add(new Integer(10))
		al.add(20);
		// al.add("oops"); // compiler error

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			int i = itr.next(); // casting required
			System.out.print(i+" "); //10 20
		}
	}

	public static void main(String[] args) {
		Generics obj = new Generics();
		obj.preGenericCode();
		obj.genericCode();

	}
}
