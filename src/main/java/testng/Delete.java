package testng;

import java.util.ArrayList;
import java.util.List;

public class Delete {

	
	public static void main(String [] args){
		
		List<String> al1 = new ArrayList<String>();
		al1.add("1");
		al1.add("2");
		al1.add("3");
		al1.add("4");
		
		List<String> al2 = new ArrayList<String>();
		al2.add("4");
		al2.add("2");
		
		
		boolean flag = al1.containsAll(al2);
		
		System.out.println(flag);
		
		
	}
	
}
