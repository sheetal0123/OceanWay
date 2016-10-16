package classes.oops;

import java.util.ArrayList;

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
}

class BigCat extends BigAnimal{
	public void meow(){}
}

public class PolymorphicArrayLists {

	/**
	 * Polymorphic method for ArrayList
	 * It will except only Animal type, no Dog type, no Cat type array list .... no polymorphism
	 */
	public void goodBigAnimal(ArrayList<BigAnimal> BigAnimal){
		
		for(BigAnimal a: BigAnimal){
			a.eat();
		}
		
	}
	
	
	public static void main(String [] args){
		PolymorphicArrayLists obj = new PolymorphicArrayLists();
		
		//Animal array list
		ArrayList<BigAnimal> a = new ArrayList<>();
		a.add(new BigAnimal());
		a.add(new BigDog());
		a.add(new BigCat());
		obj.goodBigAnimal(a);
		

		//Dog array list
		ArrayList<BigDog> d = new ArrayList<>();
		d.add(new BigDog());
		d.add(new BigDog());
		d.add(new BigDog());
		//obj.goodBigAnimal(d);  // compiler error
	
//		We get compiler error because as in case of Arrays example
//		In goodBigAnimal methods we could have used
//		BigAnimal.add(new BigCat());
//		And we would have get Runtime exception		
		
	}
	
}
