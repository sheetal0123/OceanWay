package classes;

/*
 * static block execute once when class loads i.e. before any block and constructor
 * normal block executes when any obj get created before constructor
 */
public class InitBlock {

	static {
		System.out.println("Static Block");
	}

	{
		System.out.println("Block");
	}

	public InitBlock() {
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		InitBlock obj1 = new InitBlock();
		InitBlock obj2 = new InitBlock();
		InitBlock obj3 = new InitBlock();
	}

}

/*
Static Block

Block
Default Constructor

Block
Default Constructor

Block
Default Constructor
*/