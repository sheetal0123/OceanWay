package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * Here we will compare List<HashMaps> and HashMap<HashMaps> with some common key
 * Condition is List<HM> should present in HM<HM>. So List<HM> shd be smaller or equal to other Map.
 * We are assuming List<HM> is expected Map and actual Map is much bigger
 * 
 * 
 * This method has issue which need to be fixed
 * If key changes still case passed
 */
public class HashMapCompare3 {

	static final Logger logger = LoggerFactory.getLogger(HashMapCompare3.class);
	
	//create and return List of HM i.e expected small 
	public static List<HashMap<String, String>> getListOfHashMap(){
		List<HashMap<String, String>> listOfHashMap = new ArrayList<>();
		
		//one
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("ID", "101");
		map1.put("Name", "Apple");
		map1.put("Color", "Red");
		listOfHashMap.add(map1);
		
		//two
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("ID", "102");
		map2.put("Name", "Mango");
		map2.put("Color", "Yellow");
		listOfHashMap.add(map2);
		
		//three
		HashMap<String, String> map3 = new HashMap<>();
		map3.put("ID", "103");
		map3.put("Name", "Banana");
		map3.put("Color", "Green");
		listOfHashMap.add(map3);

		return listOfHashMap;
	}
	

	//create and return HM of HM i.e actual bigger map
	public static Map<Integer, HashMap<String, String>> getHashMapOfHashMap(){
		Map<Integer, HashMap<String, String>> mapOfHashMap = new HashMap<>();
		
		//one
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("ID", "101");
		map1.put("Name", "Apple");
		map1.put("Color", "Red");
		mapOfHashMap.put(1, map1);
				
		//two
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("ID", "102");
		map2.put("Name", "Mango");
		map2.put("Color", "Yellow");
		mapOfHashMap.put(2, map2);
				
		//three
		HashMap<String, String> map3 = new HashMap<>();
		map3.put("ID", "103");
		map3.put("Name", "Banana");
		map3.put("Color", "Green");
		mapOfHashMap.put(3, map3);	
		
		//four
		HashMap<String, String> map4 = new HashMap<>();
		map4.put("ID", "104");
		map4.put("Name", "Guava");
		map4.put("Color", "Light Green");
		mapOfHashMap.put(4, map4);	
		
		return mapOfHashMap;
	}
	
	
	public boolean compare(List<HashMap<String, String>> listOfHashMap,Map<Integer, HashMap<String, String>> mapOfHashMap, String keyToCompare){


		boolean verifyFlag = false;
		int verifyCount = 0;
		HashMap<String, String> smallHashMapActual;
		HashMap<String, String> smallHashMapExpected;
		try {
			for (int i = 0; i < listOfHashMap.size(); i++) {

				smallHashMapExpected = listOfHashMap.get(i);
				logger.info("Key Value To be compared: "+ smallHashMapExpected.get(keyToCompare));
				for (int j = 1; j <= mapOfHashMap.size(); j++) {
					//smallHashMapActual = new HashMap<>();
					smallHashMapActual = mapOfHashMap.get(j);
					String strLogger = ">>>>>  " + keyToCompare + " : " + smallHashMapActual.get(keyToCompare);
					logger.info(strLogger);
					if (smallHashMapExpected.get(keyToCompare).equalsIgnoreCase(
							smallHashMapActual.get(keyToCompare))) {
						verifyFlag = verifySingleDataRow(smallHashMapExpected,smallHashMapActual);
						break;
					}
				}

				String output;
				if (!verifyFlag) {
					verifyCount = 1;
					output = "failed for : " + keyToCompare + " :  "+ smallHashMapExpected.get(keyToCompare);
					logger.info(output);
				}

				output = "verify Report Final Count : " + verifyCount;
				logger.info(output);
			}
		} catch (Exception e) {
			logger.error("Exception >>  " + e	+ e.getMessage());

		}
		return verifyCount == 0 ? true : false;
		
		
	}
	
	
	public boolean verifySingleDataRow(Map<?, ?> expected, Map<?, ?> actual) {

		@SuppressWarnings("rawtypes")
		Set entrySet = expected.entrySet();
		int flag = 0;
		String stringLogger;
		try {
			for (@SuppressWarnings("rawtypes")
			Iterator iterator = entrySet.iterator(); iterator.hasNext();) {
				
				@SuppressWarnings("rawtypes")
				Map.Entry entry = (Map.Entry) iterator.next();
				Object key = entry.getKey();
				stringLogger = "key>> : " + key.toString();
				logger.info(stringLogger);
				
				Object value = entry.getValue();
				stringLogger = "value>> : " + value.toString();
				logger.info(stringLogger);
				
				Object actualValue = actual.get(key);
				stringLogger = "Actual Value : " + actualValue.toString();
				logger.info(stringLogger);

				if (!value.equals(actualValue)) {
					String output;
					output = value + " " + actualValue + " Maps do NOT match for key : " + key + " Expected : " + value + ", actualValue : " + actualValue;
					logger.info(output);
					flag = 1;
				} else {
					String output = value + " " + actualValue + " Maps match for key:" + key + ", expected:" + value + " Actual:" + actualValue;
					logger.info(output);
				}
			}
		} catch (Exception e) {
			logger.error("Exception ::: " + e	+ e.getMessage());
		}

		return flag == 0 ? true : false;
	}
	
	public static void main(String[] args) {
		HashMapCompare3 obj = new HashMapCompare3();
		boolean flag = obj.compare(getListOfHashMap(), getHashMapOfHashMap(),"ID");
		System.out.println("Final Result: "+flag);
	}

}
