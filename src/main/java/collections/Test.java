package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public void test(){
		
		Integer [] a=new Integer[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println(a.length);
		
		List<Integer> ls=new ArrayList<Integer>(Arrays.asList(a));
		System.out.println(ls);
		
		
		
		
		String [] arr=new String[2];
		arr[0]="aam";
		arr[1]="mango";
		
		List<String> strList=new ArrayList<String>(Arrays.asList(arr));
		System.out.println(strList);
		
		
		String sArray[] = new String []{"Array 1", "Array 2", "Array 3"};
		  
		  //convert array to list
		  List lList = Arrays.asList(sArray);
		
		  System.out.println(lList);
	}
	
	public static void main(String [] args){
		Test obj=new Test();
		obj.test();
	}
	
}
