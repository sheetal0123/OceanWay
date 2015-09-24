package enums;

enum BeerTypes {
	rice, wheat, grapes // all values are implicitly public static
}

public class EnumIteration {

	public static void main(String[] args) {
		BeerTypes[] allTypes = BeerTypes.values();
		for (BeerTypes t : allTypes) {
			System.out.print(t + "	"); // rice wheat grapes
		}

		BeerTypes bt = BeerTypes.valueOf("rice");
		System.out.println();
		System.out.println(bt); // rice

	}
}
