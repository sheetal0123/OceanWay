package javacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Overloading cannot be done by changing return type
 *
 */
public class QuesSet3 {

	
//	public void abc(){
//		System.out.println("I am void");
//	}
	
	public int abc(){
		System.out.println("I am int");
		return 10;
	}

	public static void main(String[] args) {
		QuesSet3 obj = new QuesSet3();
		obj.abc();
	}
}
