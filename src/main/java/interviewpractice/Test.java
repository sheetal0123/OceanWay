package interviewpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test {

	
	public static void main(String[] args) {
		
		//new Job();
		
		
		String s="Hi";
		
		
	}
}



class Job implements Runnable{

	Thread t;
	
	public Job(){
		t= new Thread(this, "hi");
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("New Thread started"+ t.getName());
	}
	
}