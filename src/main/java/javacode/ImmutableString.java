package javacode;

/*
 * How to prove that String are immutable
 */
public class ImmutableString {
	public static void main(String[] args) {
		String a = "KAAVYA";
		String b = a.replace("K", "BH");

		System.out.println(a); // KAAVYA
		System.out.println(b); // BHAAVYA

	}

}
