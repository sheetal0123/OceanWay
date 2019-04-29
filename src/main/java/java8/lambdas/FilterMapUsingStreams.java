package java8.lambdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * for parallel stream, stream() will be replaced by parallelStream() method
 * 
 * refer: https://www.mkyong.com/java8/java-8-filter-a-map-examples/
 */
public class FilterMapUsingStreams {

	/**
	 * Method to filter a Map based on some condition
	 */
	public void beforeJava8() {
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "Apple");
	    map.put(2, "Ball");
	    map.put(3, "Cat");
	    map.put(4, "Carrot");
			
		Map<Integer, String> filteredMap = new HashMap<>();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if(entry.getValue().contains("Ca")){
				filteredMap.put(entry.getKey(), entry.getValue());
			}
		}
		
		System.out.println(">>> Filtered Map Before Java8: "+ filteredMap);
	}
	
	
	
	/**
	 * Java8: Method to filter a Map based on some condition
	 */
	public void createMapfromMap1() {
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "Apple");
	    map.put(2, "Ball");
	    map.put(3, "Cat");
	    map.put(4, "Carrot");
	    
	    //syntax:   newMap = map.entrySet().stream.filter(condition).collect()
	    Map<Integer, String> filteredMap = map.entrySet().stream()
	    									.filter(x -> x.getValue().contains("Ca"))
	    									.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

	    
	    System.out.println("### Filtered Map After Java8: "+ filteredMap);
		
	}
	
	
	/**
	 * Java8: Method to filter a Map based on some condition
	 * 
	 * Here we just updated Collectors.toMap parameters style
	 */
	public void createMapfromMap2() {
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "Apple");
	    map.put(2, "Ball");
	    map.put(3, "Cat");
	    map.put(4, "Carrot");
	    
	    
	    Map<Integer, String> filteredMap = map.entrySet().stream()
	    									.filter(x -> x.getValue().contains("Ca"))
	    									.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

	    
	    System.out.println("### Filtered Map After Java8: "+ filteredMap);
		
	}
	
	
	
	/**
	 * Java8: Here we fetch all the values based on some conditions and then concatenated them
	 * 
	 * filter can also be applied if required
	 */
	public void getStringFromMap() {
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "Apple");
	    map.put(2, "Ball");
	    map.put(3, "Cat");
	    map.put(4, "Carrot");
	    
	    
	    String result = map.entrySet().stream()
	    				//.filter(x -> x.getValue().contains("Ca"))
	    				.map(x->x.getValue())
	    				.collect(Collectors.joining(","));

	    
	    System.out.println("------->Fetch all values from a Map: "+result);
	}
	
	
	
	public static void main(String [] args) {
		FilterMapUsingStreams obj = new FilterMapUsingStreams();
		obj.beforeJava8();
		obj.createMapfromMap1();
		obj.createMapfromMap2();
		obj.getStringFromMap();
	}
	
	
	
}
