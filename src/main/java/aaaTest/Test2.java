//package aaaTest;
//
////import static io.restassured.RestAssured.given;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class Test2 {
//
//	static boolean isAllCasesPassed;
//	static boolean isCurrentCaseFailed;
//	
//	public static boolean failCaseIfAnyOneConditionFailed(){
//		
//		String [] arr = {"Arrow","Apple","Ape","Box","Aries"};
//		List<String> ls = Arrays.asList(arr);
//			
//		for(String words : ls ){
//			
//			if(words.startsWith("A") || words.startsWith("a")){
//				System.out.println("Current Passed Word: "+ words);
//			}else{
//				System.out.println("Current Failed Word: "+ words);
//				isCurrentCaseFailed= true;
//			}
//		}
//		
//		return check();
//	}
//	
//	
//	public static boolean check(){
//		if(isCurrentCaseFailed){
//			isAllCasesPassed = false;
//		}else{
//			isAllCasesPassed = true;
//		}
//		return isAllCasesPassed;
//	}
//	
//	
//	public static void main(String [] args){
//		
//		//System.out.println("Test Case(Assert True)");
//		
//		given().get("http://jsonplaceholder.typicode.com/posts/3").then().statusCode(200);
//		
////		
////		boolean value = failCaseIfAnyOneConditionFailed();
////		
////		System.out.println("Test Case(Assert True): "+ value);
//		
//	}
//	
//	
//}
