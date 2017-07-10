package collections;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * LHM is ordered(by insertion) + not sorted
 * Its again a Map interface class and don't implement Iterable interface hence can't use List iteration methods
 */
public class LinkedHashMapExamples {

	public void methodsOfLinkedHashMap() {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("2", "B");
		lhm.put("1", "A");
		lhm.put("3", "C");
		lhm.put("4", "D");
		lhm.put(null, null);
		lhm.put("5", null);
		lhm.put("lastkey", "lastvalue");
		
		
		//to fetch last entered value and update with new value
		Object arr = lhm.entrySet().toArray()[lhm.size() -1];
		String s = arr.toString();
		String lastKey = s.split("=")[0];
		System.out.println(lastKey);
		System.out.println(lhm.get(lastKey));
		lhm.put(lastKey, "FAIL");
		
		
		System.out.println(lhm.size()); // 6
		System.out.println(lhm.containsKey("2")); // true
		System.out.println(lhm.containsValue("B")); // true
		lhm.remove("4");
		System.out.println(lhm); // {2=B, 1=A, 3=C, null=null, 5=null}

		Set<String> set = lhm.keySet();
		for (String key : set) {
			System.out.print(key + ":" + lhm.get(key) + "  "); // 2:B  1:A  3:C  null:null  5:null 
		}
		
		
	}

	public static void main(String[] args) {
		LinkedHashMapExamples obj = new LinkedHashMapExamples();
		obj.methodsOfLinkedHashMap();
	}

}
