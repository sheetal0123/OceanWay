package classes.oops;

import java.util.ArrayList;

/**
 * Polymorphic Array List
 * As in previous case Compiler stop us from passing ArrayList<Dog> into ArrayList<Animal>
 * wild character will allow us to pass this and no compiler error
 * No runtime exception also if only Dog is getting passed into ArrayList<Dog>
 * 
 */
class WildAnimal{
	public void eat(){
		System.out.println("WildAnimal eating");
	}
}

class WildDog extends WildAnimal{
	public void bark(){}
}

class WildCat extends WildAnimal{
	public void meow(){}
}

public class PolymorphicWildCard {

	/**
	 * Polymorphic method for ArrayList
	 * Now it will except all subtype of  Animal type array lsit ....... back to polymorphism
	 * ArrayList<? extends WildAnimal> WildAnimal  :: means anything(?) which extends or implements WildAnimal
	 */
	public void goodWildAnimal(ArrayList<? extends WildAnimal> wa){

		for(WildAnimal a: wa){
			a.eat();
		}
		
	}
	
	// same meaning as above just different style of writing
	public <T extends WildAnimal> void goodWildAnimal2(ArrayList<T> wa){

		for(WildAnimal a: wa){
			a.eat();
		}
		
	}

		
	public static void main(String [] args){
		PolymorphicWildCard obj = new PolymorphicWildCard();
		
		//Animal array list
		ArrayList<WildAnimal> a = new ArrayList<>();
		a.add(new WildAnimal());
		a.add(new WildDog());
		a.add(new WildCat());
		obj.goodWildAnimal(a);
		

		//Dog array list
		ArrayList<WildDog> d = new ArrayList<>();
		d.add(new WildDog());
		d.add(new WildDog());
		d.add(new WildDog());
		obj.goodWildAnimal(d);  // no compiler error this time, thanks to wild card 
		
	}
	
}
