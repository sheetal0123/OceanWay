package classes.interfaces;

/**
 * How can we check if an Interface is present in class hierarchy
 * i.e. if some super class etc has already implemented it
 *
 *	Class implementing an Interface pass IS-A test d
 */

interface unknowninterface {
 //some methods
}

class InstanceOfCheck implements unknowninterface {

	public static void main(String[] args) {
		InstanceOfCheck obj = new InstanceOfCheck();
		
		if(obj instanceof unknowninterface){
			System.out.println("******* Interface is present somewhere in inheritance tree ********");
		}
	}
}
