package classes.oops;

import java.util.ArrayList;
import java.util.List;

/**
 * Polymorphic Array List
 * Unlike Arrays, here Compiler stop us to use polymorphism	
 * So in case of Array List
 * ArrayList<Animal> and ArrayList<Dog> are different
 * 
 * Lets see how to solve this problem using Wild Card in next example
 */
class BigAnimal{
	public void eat(){
		System.out.println("BigAnimal eating");
	}
}

class BigDog extends BigAnimal{
	public void bark(){}
	
	@Override
	public void eat(){
		System.out.println("BigDog eating");
	}
}

class BigCat extends BigAnimal{
	public void meow(){}
	
	@Override
	public void eat(){
		System.out.println("BigCat eating");
	}
}

public class PolymorphicArrayLists {

	/**
	 * Polymorphic method for ArrayList
	 * It will except only Animal type, no Dog type, no Cat type array list .... no polymorphism
	 */
	public void goodBigAnimal(List<BigAnimal> list){
		
		//list.add(new BigCat()); //added a cat to the list 
		
		for(BigAnimal a: list){
			a.eat();
		}
		
	}
	
	
	public static void main(String [] args){
		PolymorphicArrayLists obj = new PolymorphicArrayLists();
		
		//Animal array list - can contains any animal and its sub type
		List<BigAnimal> ls1 = new ArrayList<>();
		ls1.add(new BigAnimal());
		ls1.add(new BigDog());
		ls1.add(new BigCat());
		//obj.goodBigAnimal(ls1);
		

		//Dog array list - can contains only dog type
		List<BigDog> ls2 = new ArrayList<>();
		ls2.add(new BigDog());
		ls2.add(new BigDog());
		ls2.add(new BigDog());
		//obj.goodBigAnimal(ls2);  // compiler error 
		
		//java stopped developer at compiler time else we may get runtime exception if someone added "list.add(new BigCat())" in method (line 46)
	}
	
}
