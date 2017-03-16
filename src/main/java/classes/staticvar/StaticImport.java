package classes.staticvar;

//import collections.ArrayClass;
import static collections.ArrayClass.*;



/**
 * note: we import something when that class is not present in current package
 * In normal import statement we need to use class name to access member
 * In case of static import we can use member w/o using class name
 */
public class StaticImport {

	public static void main(String [] args){
		
//		ArrayClass.testimportmethod();
//		System.out.println(ArrayClass.testimport);
		testimportmethod();
		System.out.println(testimport);
			
	}
	
}
