package classes.innerclasses;

/**
 * Static Inner class ex
 * not used much in practical
 * 
 * Static inner class also called Nested class
 *
 * We will have OuterClass2.class, A.class, A$B.class	
 *
 */
public class OuterClass2 {
	
	public static void main(String [] args){
		A.B obj = new A.B();
		obj.show();
	}
}


//outer class
class A{
	
	static int rollno = 10;
	
	//nested inner class
	static class B{
		
		public void show(){
			System.out.println("I am static inner class: "+ rollno); 
			//I am static inner class: 10
		}
		
	}
	
	
}

