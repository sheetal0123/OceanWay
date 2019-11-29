package cleancode;

public class BooleanAsParameter2 {

	public static double calculatePriceWithDiscout(double cost, double margin) {
		return (cost + margin) * 0.90;
	}

	public static double calculatePriceWithoutDiscout(double cost, double margin) {
		return cost + margin;
	}

	public static void main(String[] args) {
		double sellingPrice1 = calculatePriceWithDiscout(100, 50);
		System.out.println("SP = " + sellingPrice1);

		double sellingPrice2 = calculatePriceWithoutDiscout(100, 50);
		System.out.println("SP = " + sellingPrice2);
	}
}
