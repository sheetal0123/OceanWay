package cleancode;

public class BooleanAsParameter1 {

	public static double calculatePrice(double c, double margin, boolean flag) {
		double cost = c;
		double price = cost + margin;

		// give 10 percent discount if true
		if (flag) {
			price = price * 0.90;
		} else {
			// no change
		}
		return price;
	}

	public static void main(String[] args) {
		double sellingPrice1 = calculatePrice(100, 50, true); // give discount of 10 percent
		System.out.println("SP = " + sellingPrice1);

		double sellingPrice2 = calculatePrice(100, 50, false); // don't give any discount
		System.out.println("SP = " + sellingPrice2);
	}
}
