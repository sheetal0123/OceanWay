package classes.initialization;

/**
 * Non static block is called as "Non static instance initialization" block
 * called before constructor
 * called multiple time when object get created
 *
 */
public class NonStaticBlock {

	public NonStaticBlock(){
		System.out.println("I am constructor \n");
	}

	
	//Block
	{
		System.out.println("I am non static block");
	}
	
	
	
	public static void main(String [] args){
		
		new NonStaticBlock();
		new NonStaticBlock();
		
	}
}


//I am non static block
//I am constructor 
//
//I am non static block
//I am constructor 

