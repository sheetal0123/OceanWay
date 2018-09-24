package classes.string;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * for formating we need to use "printf" rather "println"
 */
public class StringFormating {

	private static final Logger logger = LoggerFactory
			.getLogger(StringFormating.class);
	
	public void formatUsingArguments(){
		//str
		System.out.println(String.format("Hello my name is %s and my age is %s","John", "33"));
		
		//integer
		System.out.printf("Cost of one apple is %d, for dozens it will be %d",10,120);
	}
	
	public void convertStringToGivenDecimalPlaces(String amt, int position) {
		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(position);
		String str = df.format(Float.parseFloat(amt)).trim();
		logger.info("String with given decimal places >>"+ str);
    }
	
	
	public void convertStringToGivenDecimalPlaces2(String amt, int position) {
		double d = Double.parseDouble(amt);
		DecimalFormat decimalFormatter = new DecimalFormat("###.##");
		decimalFormatter.setRoundingMode(RoundingMode.DOWN);
		decimalFormatter.setMaximumFractionDigits(position);
		decimalFormatter.setMinimumFractionDigits(position);
	
		String str = decimalFormatter.format(d);
		System.out.println("String with given decimal places >>"+ str);
    }
	

	public void otherFormatings(){
		// tab
		System.out.println("I am cop \t and i am on my duty");  // I am cop	  and i am on my duty

		
		// %2d for right alignment , number can be anything
		System.out.println();
		for(int i=5; i <=15; i++){
			System.out.printf("%2d: student names\n", i);
		}
		
		
		// %-2d for left alignment , number can be anything
		System.out.println();
		for(int i=5; i <=15; i++){
			System.out.printf("%-2d: student names\n", i);
		}
	
		// %f  for floating points
		//.2 round off value till 2 decimal places
		System.out.println();
		System.out.printf("Total value is %.2f",12.2261111);   // Total value is 12.23

		// right align by 10 digit
		System.out.println("");
		System.out.printf("Total cost:%10.2f Rs", 20.12567767);  // Total cost:     20.13 Rs          
		
		// left align by 10 digit
		System.out.println();
		System.out.printf("Total cost:%-10.2f Rs", 20.12567767);  // Total cost:20.13      Rs          
		
	}

	public static void main(String [] args){
		StringFormating obj = new StringFormating();
		//obj.formatUsingArguments();
		obj.convertStringToGivenDecimalPlaces("100.50634", 4);
		obj.convertStringToGivenDecimalPlaces2("89.956",5);
		//obj.otherFormatings();
	}

}
