package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonSort {

	public static void printAll(List<Person> ls) {
		for (Person p : ls) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) {

		List<Person> ls = Arrays.asList(
				new Person("john", "michael", 30),
				new Person("kate", "win", 32),
				new Person("albert", "clark", 32),
				new Person("late", "commer", 32)
				);

	
		//Sort by last name
//		Collections.sort(ls, new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getLastname().compareTo(o2.getLastname());
//			}
//		});
		
	
		// sort by last name using lambdas
		Collections.sort(ls, (o1, o2) -> o1.getLastname().compareTo(o2.getLastname()));

		// print list
		printAll(ls);

	}

}
