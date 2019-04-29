package java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Lambadas with lists
 * 
 * https://www.mkyong.com/java8/java-8-streams-filter-examples/
 * 
 * 
 *  Initial list -> convert to stream(seq/parallel) -> filter using some condition -> collect result using Collectors class    
 */
public class FilterListUsingStream {

	public void beforeJava8() {
		List<String> ls = Arrays.asList("agra","bollywood","chennai","delhi","egypt");
		List<String> filteredList = new ArrayList<>();
		
		for(String str : ls) {
			if(str.length() < 6)
				filteredList.add(str);
		}
		System.out.println(">>> Filtered List Before Java8: "+ filteredList);
	}
	
	
	/**
	 * Get all names who's length is less than 6
	 * 
	 * Collectors is a class in java's util pkg
	 */
	public void filterListWithStreams() {
		List<String> ls = Arrays.asList("agra","bollywood","chennai","delhi","egypt");
		List<String> filteredList = ls.stream()
									.filter(x -> x.length() < 6 )
									.collect(Collectors.toList());	
		
		System.out.println(">>> Filtered List After Java8: "+ filteredList);
	}
	
	
	
	
	
	/**
	 * Usage of findAny() & else
	 */
	public void filterObjectListUsingStream() {
		List<Person> ls = new ArrayList<Person>();	
		ls.add(new Person("Sachin", "Tendulkar", 25));
		ls.add(new Person("Adam", "Gilchrist", 35));
		ls.add(new Person("Bryan", "Lara", 24));
		ls.add(new Person("Edson", "Pele", 35));
		ls.add(new Person("Saurav", "Ganguly", 20));
		System.out.println("\n************************************************");
		System.out.println("Complete Team: "+ls);

		
		
		//Before Java 8
		List<Person> youngerBatch = new ArrayList<Person>();
		for(Person p: ls) {
			if(25 >= p.getAge())
				youngerBatch.add(p);
		}
		System.out.println("### Younger Batch before Java 8: "+youngerBatch);
		
		
		
		/**
		 * With Java8 : fetch list of filtered Objects based on condition 
		 */
		List<Person> newYoungerBatch = ls.stream()
										.filter(x ->  25 >= x.getAge())
										.collect(Collectors.toList());
		System.out.println("### Younger Batch after Java 8: "+newYoungerBatch);
		System.out.println("************************************************\n");	
		
		
		
		
		
		
		
		/**
		 *  Java8: To get specific whole object out of complete list
		 *  
		 *  here we expect filter will give only one value else the first one will print in case multiple results come 
		 */
		Person sachin1 = ls.stream()
				.filter(x -> x.getFirstname().equalsIgnoreCase("sachin"))
				.findAny()
				.orElse(null);
		
		System.out.println(">>> Get Specific Full Object: " + sachin1);
		
		

		
		
		/**
		 * Java8: To get specific object's value i.e. a single String/int will be returned
		 * 
		 * map(return value) : this method decide what to return
		 */
		String sachin2 = ls.stream()
						.filter(x -> x.getFirstname().startsWith("Sachin"))
						.map(Person::getLastname)
						.findAny()
						.orElse("");

		System.out.println(">>> Get Specific Full Objects's value: "+ sachin2);
		
	
		
		

		
		
		/**
		 * Java8: To get specific object with curly braces usage
		 *  
		 * Curly used when code is more than one row
		 * Here we return boolean, but in actual we get object of Person 
		 */
		Person gill = ls.stream()
						.filter(x ->  {
							if(x.getFirstname().equalsIgnoreCase("adam")) {
								return true;
							}
							return false;
						})
						.findAny()
						.orElse(null);
				
		System.out.println("\n\nGet Specific Full Object using {} : " + gill);
				

		
		
		
		/**
		 * Java8 : to get list of object's value 
		 */
		List<String> allLastName = ls.stream()
								.map(Person::getLastname)
								.collect(Collectors.toList());
								
		System.out.println("Fetching all values only from objects list: "+ allLastName);
	}
	
	
	
	
	public static void main(String [] args) {
		FilterListUsingStream obj = new FilterListUsingStream();
		obj.beforeJava8();
		obj.filterListWithStreams();
		obj.filterObjectListUsingStream();
	}
}
