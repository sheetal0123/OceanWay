package aaaTest;

import java.math.RoundingMode;
import java.text.DecimalFormat;

//name updated
public class TestClass {
	

	public String getHalfAmount(String amt)
	{
		int intAmt = Integer.parseInt(amt);
		double decimalAmt = intAmt * 0.01;
		double halfAmount = decimalAmt * 0.5;
		DecimalFormat decFormat = new DecimalFormat("###.##");
		decFormat.setMaximumFractionDigits(2);
		decFormat.setMinimumFractionDigits(2);
		decFormat.setRoundingMode(RoundingMode.DOWN);
		String str = decFormat.format(halfAmount).replace(".", "");
		return prefixPadding(str, "-", 12);
	}
	
	
	public String prefixPadding(String cnt, String pad, int len)
	{		
		String strCount = cnt;
		try {
			 while (strCount.length() < len)
				 strCount = pad + strCount;
			return strCount;
		} catch (Exception e) {
			e.printStackTrace();
		}
		  return null;
	}
	
    public static void main(String [] args){
    	TestClass obj = new TestClass();
    	
    	//String str = obj.getHalfAmount("400.60");
    	//System.out.println(str);
		
    	System.out.println(String.format("%-145s", "*"));
    	System.out.println(String.format("%-1s", "6         5"));
    	
    	
    }

}
