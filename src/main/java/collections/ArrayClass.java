package collections;

import java.lang.reflect.Array;

/*
 * This is java.lang.reflect.Array Class which is rarely used in Java
 * We normally used java.util.Arrays class from Collection framework for array related function
 */
public class ArrayClass {

	public void abc(){
		int[] arr = (int[]) Array.newInstance(int.class, 3);
		Array.set(arr, 0, 10);
		Array.set(arr, 1, 20);
		Array.set(arr, 2, 30);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(Array.get(arr, i));
		}
	}
	
	public static void main(String [] args){
		ArrayClass obj=new ArrayClass();
		obj.abc();
	}
}
