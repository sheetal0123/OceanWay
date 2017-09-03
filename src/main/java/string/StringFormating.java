package string;

/**
 * for formating we need to use "printf" rather "println"
 */
public class StringFormating {


	public static void main(String [] args){
		
		// tab
		System.out.println("I am cop \t and i am on my duty");  // I am cop	  and i am on my duty

		// %d
		System.out.printf("Cost of one apple is %d, for dozens it will be %d",10,120);  // Cost of one apple is 10, for dozens it will be 120
		
		
		
		// %2d for right alignment , number can be anything
		System.out.println();
		for(int i=5; i <=15; i++){
			System.out.printf("%2d: student names\n", i);
		}
		/*
		 5: student names
		 6: student names
		 7: student names
		 8: student names
		 9: student names
		10: student names
		11: student names
		12: student names
		13: student names
		14: student names
		15: student names
		*/
		
		
		// %-2d for left alignment , number can be anything
		System.out.println();
		for(int i=5; i <=15; i++){
			System.out.printf("%-2d: student names\n", i);
		}
		
		/*
		5 : student names
		6 : student names
		7 : student names
		8 : student names
		9 : student names
		10: student names
		11: student names
		12: student names
		13: student names
		14: student names
		15: student names
		 */
		
		
		// %s
		System.out.println();
		System.out.printf("my name is %s and my age is %d","dod",31);  // my name is dod and my age is 31
		
		
		// %f  for floating points
		System.out.println();
		System.out.printf("Total value is %.2f",12.2261111);   // Total value is 12.23    - .2 round off value till 2 decimal places

		System.out.println();
		System.out.printf("Total cost:%10.2f Rs", 20.12567767);  // Total cost:     20.13 Rs          // right align by 10 digit
		
		System.out.println();
		System.out.printf("Total cost:%-10.2f Rs", 20.12567767);  // Total cost:20.13      Rs          // left align by 10 digit
		
	}

}
