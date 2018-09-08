package classes.date;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * 
 *	http://tutorials.jenkov.com/java-internationalization/decimalformat.html *
 */
public class DecimalFormatting {

	public String numberFormattingAsPerDecimal(String num, int decposition)
	{
		double d = Double.parseDouble(num);
		DecimalFormat decimalFormatter = new DecimalFormat("#,##.##");
		decimalFormatter.setRoundingMode(RoundingMode.DOWN);
		decimalFormatter.setMaximumFractionDigits(decposition);
		decimalFormatter.setMinimumFractionDigits(decposition);
		return decimalFormatter.format(d);
	}
	
	
	public static void main(String[] args) {
		DecimalFormatting obj = new DecimalFormatting();
		String updated = obj.numberFormattingAsPerDecimal("87867.5099", 3);
		System.out.println(">>"+updated);

	}

}
