package interviewpractice;

/**
 *  Overloading cannot be done by changing return type
 *  parameter has to be changed
 *
 */
public class Overloading {

	
//	public void abc(){
//		System.out.println("I am void");
//	}
	
	public int abc(){
		System.out.println("I am int");
		return 10;
	}

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.abc();
	}
}
