package collections;

import java.util.ArrayList;

public class ArrayListToArrayConversion {

	// Not to be used
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
			System.out.print(a + ", "); // 10, 20, 30, 
	}
	
	
	

	public void convertingArrayListToArrays() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("100");
		al.add("200");
		al.add("300");
		int len = al.size(); // 3

		//String[] arr = new String[1]; //This also been handled by conversion i.e. Array is small
		String[] arr = new String[10];

		arr=al.toArray(arr);
		
		System.out.println();
		for (String str : arr)
			System.out.print(str + ", "); // 100, 200, 300, null, null, null, null, null, null,
	}

	
	public static void main(String [] args){
		ArrayListToArrayConversion obj=new ArrayListToArrayConversion();
		obj.manualWayArrayListToArray();
		obj.convertingArrayListToArrays();
	}
	
	
}
