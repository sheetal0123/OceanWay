package javacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuesSet2 {

	public void abc(){
	//  compiler error
//			int [] intarr = {2,4};
//			ArrayList<Integer> al2 = new ArrayList <Integer>(Arrays.asList(intarr));

		String [] str = {"2","4", "5", "9"};
		ArrayList<String> al = new ArrayList <String>(Arrays.asList(str));
		
		
		System.out.println(al);
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		QuesSet2 obj = new QuesSet2();
		obj.abc();
		
		
	}
}
