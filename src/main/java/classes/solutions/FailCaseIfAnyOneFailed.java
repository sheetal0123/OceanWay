package classes.solutions;

import java.util.Arrays;
import java.util.List;

/*
 * Problem statement:  Final test case should get failed if any one value in an Array is wrong
 * 
 * Solution: We need to maintain two boolean and then this prob can be solved as follows
 * 
 */
public class FailCaseIfAnyOneFailed {
	
	static boolean isAllCasesPassed;
	static boolean isCurrentCaseFailed;
	
	public static boolean failCaseIfAnyOneConditionFailed(){
		
		//Expected Cond: Array should contains words starting with 'A'
		String [] arr = {"Arrow","Apple","Ape","baBox","Aries"};
		List<String> ls = Arrays.asList(arr);
			
		for(String words : ls ){
			
			if(words.startsWith("A") || words.startsWith("a")){
				System.out.println("Current Passed Word: "+ words);
			}else{
				System.out.println("Current Failed Word: "+ words);
				isCurrentCaseFailed= true;
			}
		}
		
		return conditionCheck();
	}
	
	
	public static boolean conditionCheck(){
		if(isCurrentCaseFailed){
			isAllCasesPassed = false;
		}else{
			isAllCasesPassed = true;
		}
		return isAllCasesPassed;
	}
	
	
	public static void main(String [] args){
		boolean value = failCaseIfAnyOneConditionFailed();
		
		System.out.println("Test Case(Assert True): "+ value);
		
	}
	
}
