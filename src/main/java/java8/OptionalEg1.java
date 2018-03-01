package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Introduced to avoid Runtime NPE
 * Reduced code as no need to check for null
 * 
 */
public class OptionalEg1 {

	public void sample1() {

		// create a List
		List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 15, 10);
		
		//filter list based on condition and fetch first element
		Optional<Integer> opt = ls.stream().filter(e -> e>5).findFirst();
		
		if(opt.isPresent())
			System.out.println(opt.get());
		else{
			System.out.println("Nothing is present");
		}
	}

	public static void main(String[] args) {
		OptionalEg1 obj = new OptionalEg1();
		//obj= null;
		//obj.sample1();
		
		
		Optional<OptionalEg1> opt = Optional.ofNullable(obj);
//		Optional<OptionalEg1> opt = Optional.of(obj);
		
			

	}
}
