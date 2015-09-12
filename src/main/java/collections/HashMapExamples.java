package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * HashMap - unique key only, one null key allowed, multiple null value allowed, unsorted + unordered
 */
public class HashMapExamples {

	public void methodsOfHashMap(){
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("1", "One");
		hm.put("2", "Two");
		hm.put("3", "Three");
		hm.put("4", null);
		hm.put("5", null);
		hm.put(null, "Joe"); // previous duplicate will be removed		
		hm.put(null, null);  
		
		hm.remove("3");
		System.out.println(hm.containsKey("1"));     //true
		System.out.println(hm.containsValue("One")); //true
		
		HashMap<String,String> hm2=new HashMap<String,String>();
		hm2.put("A", "Apple");
		hm2.put("B", "Boy");
		
		hm.putAll(hm2);
		
		Set<String> set=hm.keySet();
		for(String key:set){
			System.out.print(key+":"+hm.get(key)+"  "); // null:null  3:Three  2:Two  1:One  5:null  4:null 
		}
		
		System.out.println("");
		for(Map.Entry<String,String> map:hm.entrySet()){
			System.out.print(map.getKey()+":"+map.getValue()+"  "); // null:null  3:Three  2:Two  1:One  5:null  4:null  
		}
		
		System.out.println("");
		Set<Entry<String, String>> entires = hm.entrySet();
		for(Entry<String,String> ent:entires){
			System.out.print(ent.getKey()+":"+ent.getValue()+"  "); // null:null  3:Three  2:Two  1:One  5:null  4:null 
		}
		
	}
	
	public static void main(String [] args){
		HashMapExamples obj=new HashMapExamples();
		obj.methodsOfHashMap();
	}
}
