package collections;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExamples {

	public void methodsOfLinkedHashMap() {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("2", "B");
		lhm.put("1", "A");
		lhm.put("3", "C");
		lhm.put("4", "D");
		lhm.put(null, null);
		lhm.put("5", null);
		
		System.out.println(lhm.size()); // 4
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
