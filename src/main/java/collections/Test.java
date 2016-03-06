package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public void test(){
		
		
		TreeMap<String, String> tm =new TreeMap<String, String>();
		tm.put("1", "One");
		tm.put("4", "Four");
		tm.put("3", "three");
		tm.descendingMap();
		
		System.out.println(tm+"   "+tm.comparator());
		
		
		
	}
	
	public static void main(String [] args){
		Test obj=new Test();
		obj.test();
	}
	
}
