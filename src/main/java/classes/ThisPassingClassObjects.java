package classes;

/*
 * this can also be used to pass the objects
 */

public class ThisPassingClassObjects {
	
	public static void main(String [] args){
		
		Apple a = new Apple();
		a = a.getInstance("green");
		System.out.println("Apple Color: "+a.getFruit());  // Apple Color: green

	}
}


class Apple{
	
	String fruit;
	
	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fr) {
		fruit = fr;
	}

	public Apple getInstance(String color){
		setFruit(color);
		return this;    // return Apple object reference who access abc()
	}
	
}

