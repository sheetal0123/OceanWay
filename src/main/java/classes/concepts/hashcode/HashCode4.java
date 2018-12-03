package classes.concepts.hashcode;

import java.util.*; 

class Geek{ 
	String name; 
	int id; 
 
	Geek(String name, int id){	 
     	this.name = name; 
     	this.id = id; 
	} 
 
	@Override
	public boolean equals(Object obj){ 
		System.out.println("Inside Equals ======");
     	// if both the object references are referring to the same object. 
		if(this == obj) 
			return true; 
     
		if(obj == null || obj.getClass()!= this.getClass()) 
			return false; 
     
		Geek geek = (Geek) obj; 
		return (geek.name.equals(this.name)  && geek.id == this.id); 
	} 
 
	@Override
	public int hashCode(){ 
		System.out.println("Inside HashCode #####");
		return 10;
	} 
} 


public class HashCode4{ 	
	
	/**
	 * In this case a LinkedList will be created internally at bucket id 10 i.e. hashcode
	 * LL format:     |g1|CSE|->| ---  |g2|IT|->|   
	 */
	public static void test1(){
		Geek g1 = new Geek("aditya", 1); 
		Geek g2 = new Geek("aditya", 2); 
	 
		Map<Geek, String> map = new HashMap<Geek, String>(); 
		map.put(g1, "CSE"); 
		map.put(g2, "IT"); 
	 
		System.out.println("\nMap Size:"+map.size());
		
		System.out.println("\nFor loop abt to start...");
		
		for(Geek key : map.keySet()) 
			System.out.println("for loop: "+map.get(key).toString());
	}
	
	/**
	 * In this case when map.put(g2,"IT") get called then
	 * g2 hashcode() will be called, it will return 10 i.e. same as g1, then
	 * g1.equals(g2) i.e. oldkey.equals(newkey) will be called internally which will return true and g2 will replace g1
	 */
	public static void test2(){
		Geek g1 = new Geek("aditya", 1); 
		Geek g2 = new Geek("aditya", 1); 
	 
		Map<Geek, String> map = new HashMap<Geek, String>(); 
		map.put(g1, "CSE"); 
		map.put(g2, "IT"); 
	 
		System.out.println("\nMap Size:"+map.size());
		
		System.out.println("\nFor loop abt to start...");
		
		for(Geek key : map.keySet()) 
			System.out.println("for loop: "+map.get(key).toString());
	}
	
	public static void main(String[] args){ 
    	test1();
    	System.out.println("\n\n***********************************************\n\n");
    	test2();
 
	} 
} 
