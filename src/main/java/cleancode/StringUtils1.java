package cleancode;


/**
 * Rule 1: A utility class should always have a private constructor, so that no object can be created in class.
 *	
 * Rule 2: A utility class should not have any class level variables, all variables should be local to methods
 *  
 * @author Sheetal_Singh
 */
public class StringUtils1 {

	String str="";  //class level variable

	public String sayHelloWorld(String s1) {
		str = str + s1;
		return str;
	}

	public String concatenate(String s1, String s2) {
		str = s1 + s2;
		return str;
	}
	
	
	
	
	

}
