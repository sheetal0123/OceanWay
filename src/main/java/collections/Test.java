package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public void test(){
		
		List<String> ls = new ArrayList<>();
		ls.add("apple");
		ls.add("Cat");
		Collections.sort(ls);
		System.out.print(ls);
		
		
		
		Collections.sort(ls, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareToIgnoreCase(o1);
			}
			
			
		});
		
		System.out.print(ls);
	}
	
	public static void main(String [] args){
		Test obj=new Test();
		obj.test();
	}
	
}
