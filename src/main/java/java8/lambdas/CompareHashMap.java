package java8.lambdas;

import java.util.HashMap;
import java.util.Map;

public class CompareHashMap {

	public static void compareUsingEquals(Map<String, String> map1, Map<String, String> map2) {
		boolean bool = map1.equals(map2);
		System.out.println("Using Equals: " + bool);
	}

	public static void compareUsingJava8(Map<String, String> map1, Map<String, String> map2) {
		boolean allMatch = map1.entrySet().stream().allMatch(en -> en.getValue().equals(map2.get(en.getKey())));
		System.out.println("AllMatch: " + allMatch);

		boolean anyMatch = map1.entrySet().stream().anyMatch(en -> en.getValue().equals(map2.get(en.getKey())));
		System.out.println("Any Match: " + anyMatch);

		boolean noneMatch = map1.entrySet().stream().noneMatch(en -> en.getValue().equals(map2.get(en.getKey())));
		System.out.println("None Match: " + noneMatch);
	}

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("A", "Apple");
		map1.put("B", "Ball");
		map1.put("C", "Cat");

		Map<String, String> map2 = new HashMap<>();
		map2.put("A", "Apple");
		map2.put("B", "Ball");
		map2.put("C", "Cat");

		compareUsingEquals(map1, map2);
		compareUsingJava8(map1, map2);
	}

}
