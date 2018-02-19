package classes.string;

/**
 */
public class StringConversion {

	public static void main(String[] args) {
		// convert string to int types
		// type 1
		String str1 = "10";
		int i = Integer.parseInt(str1);
		System.out.println(i + 20); // 30

		// type 2
		String strA = "10";
		int j = Integer.valueOf(strA);
		System.out.println(j + 20); // 30

		// convert int to string
		// type 1
		int m = 100;
		String ms = Integer.toString(m);
		System.out.println(ms); // 100

		// type 2
		int n = 100;
		String ns = String.valueOf(n);
		System.out.println(ns);

		// convert string to boolean and vice versa
		boolean b = true;
		String s2 = Boolean.toString(b);
		System.out.println(s2); // true

		String str2 = "true";
		boolean bool = Boolean.parseBoolean(str2);
		System.out.println(bool); // true

	}

}
