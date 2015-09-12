package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListToString {

	public void manualWayArrayToArrayList() {
		String[] arr = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" }; // simple array of strings
		ArrayList<String> al = new ArrayList<String>();

		int len = arr.length;
		for (int i = 0; i < len; i++) {
			al.add(arr[i]);
		}

		for (String str : al)
			System.out.print(str + "-"); // Sun-Mon-Tue-Wed-Thu-Fri-Sat-
	}

	
	public void usingAsListForArrayToArrayList() {
		String[] arr = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" }; 
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));   
//		List<String> ls=Arrays.asList(arr);
		System.out.println();
		for (String str : al)
			System.out.print(str + "-"); // Sun-Mon-Tue-Wed-Thu-Fri-Sat-
	}

	public void usingAddAllForArrayToArrayList() {
		String[] arr = { "1", "4", "3", "5", "2", "7", "6" };
		ArrayList<String> al = new ArrayList<String>();
		System.out.println();

		Collections.addAll(al, arr); // converting string array into string array list
		Collections.sort(al); // sorting Array List
		al.set(2, "Update"); // set method update value with new one; add method insert new value
		int index = al.indexOf("Update");
		System.out.println("Index is: " + index); // Index is: 2

		for (String str : al)
			System.out.print(str + "-"); // 1-2-Update-4-5-6-7-

		// some more func
		al.add("5"); // list will looks like: 1-2-Update-4-5-6-7-5-
		System.out.println();
		System.out.println(al.contains("4") + " && " + al.lastIndexOf("5")); // true && 7
	}

	public void manualWayArrayListToArray() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		int len = al.size();

		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = al.get(i);
		}

		System.out.println();
		for (int a : arr)
			System.out.print(a + "-"); // 10-20-30-
	}

	public void usingToArrayForArrayListToArray() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("100");
		al.add("200");
		al.add("300");
		int len = al.size();

		String[] arr = new String[len];

		arr=al.toArray(arr);
		System.out.println();
		for (String str : arr)
			System.out.print(str + "-"); // 100-200-300-
	}

	public static void main(String[] args) {
		ArrayListToString obj = new ArrayListToString();
		// array to array list
		obj.manualWayArrayToArrayList();
		obj.usingAsListForArrayToArrayList();
		obj.usingAddAllForArrayToArrayList();

		// array list to array
		obj.manualWayArrayListToArray();
		obj.usingToArrayForArrayListToArray();
	}
}
