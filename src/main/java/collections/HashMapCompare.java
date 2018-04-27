package collections;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import classes.date.CalendarEg;

public class HashMapCompare {

	static Logger logger = LoggerFactory.getLogger(HashMapCompare.class);
	
	/**
	 * Requirement: 
	 * all values of map1 should present in map2
	 * map2 is bigger map than map1
	 */
	public boolean compareMap1PresentIntoMap2() {

		Map<String, String> map1 = new HashMap<>();
		map1.put("A", "Apple");
		map1.put("C", "Cat");
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("A", "Apple");
		map2.put("B", "Boy");
		map2.put("C", "Cat");
		
		boolean flag = true;
		int failCount = 0;

		if (map1.size() != map2.size()) {
			logger.info("Size of map1 is :{}",map1.size());
			logger.info("Size of map2 is :{}",map2.size());
			logger.error("Size of both map's is NOT equal");
		}

		// verify if ALL Key's of map 1 are present in map2
		for (String key : map1.keySet()) {
			try {
				if (!map2.containsKey(key)) {
					logger.error("Key missing in map2:{}", key);
					flag = false;
					failCount++;
				} else {// As key is present now we will compare values of both
						// HahMaps
					if (map1.get(key).equals(map2.get(key))) {
						flag = true;
					} else {
						logger.error("For Key :{}", key);
						logger.error("Value of map 1 is: {}", map1.get(key));
						logger.error("Which is not Equal value in map2 :{}",
								map2.get(key));
						flag = false;
						failCount++;
					}
				}
			} catch (NullPointerException e) {
				logger.error("NullPointerException  " + e + e.getMessage());
				logger.error("map2 does not contain a value present in map1");
			}
		}
		if (failCount > 0) {
			logger.error("Unmatched counter (Key and values) {} ", failCount);
			flag = false;
		}
		return flag;
	}
	
	
	
	
	
	
	public static void main(String [] args){
		HashMapCompare obj = new HashMapCompare();
		boolean flag = obj.compareMap1PresentIntoMap2();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> "+flag);
		
	}
	
	
}
