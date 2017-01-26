package classes.initialization;

/*
 * static block execute once when class loads i.e. before any block and constructor
 * normal block executes when any obj get created before constructor
 */
public class InitBlock {

	static {
		System.out.println("Static Block");
	}

	
	{
		System.out.println("Normal Block");
	}

	
	public InitBlock() {
		System.out.println("Default Constructor");
	}
	


	public static void main(String[] args) {
		InitBlock obj1 = new InitBlock();
		InitBlock obj2 = new InitBlock();
	}

}

/*
Static Block

Normal Block
Default Constructor

Normal Block
Default Constructor
*/