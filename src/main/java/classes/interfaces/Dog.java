package classes.interfaces;


/**
 * Two classes from completely different hierarchy can be passed to same method
 * as argument or return type. 
 * So in interface we focus on role to play rather class
 * Pet is a role, pet can be anyone - machine, animal or alien (really - do they exists)
 */
abstract class Animal {
}

public class Dog extends Animal implements Pet {

	static RoboDog rd = new RoboDog();

	/**
	 * I am a polymorphic method, can take anything which is a Pet
	 */
	public void petDog(Pet p) {
		System.out.println("I can take anything which is a Pet: " + p.toString());
	}

	/**
	 * I am returning a Pet, anyone who is pet can take values from me
	 * but please cast to you type
	 */
	public Pet takePetDog(Pet p) {
		return p;
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		//Polymorphic argument type
		d.petDog(d); // Dog IS A Pet
		d.petDog(rd); // RoboDog IS A Pet

		//Polymorphic return type
		Dog newDog = (Dog) d.takePetDog(d);
		RoboDog newRoboDog = (RoboDog) d.takePetDog(rd);
		System.out.println(newDog);
		System.out.println(newRoboDog);
		
	}
}
