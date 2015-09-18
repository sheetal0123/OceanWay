package classes;

/*
 * recursion call itself again and again, if stmt is very imp so that a one point method start returning something
 * else method enters in infinite loop
 */
public class Recursion {

	public int fact(int n) {
		System.out.println("n = " + n);
		int result;

		if (n == 1)
			return 1;
		
		result = fact(n - 1) * n;
		System.out.println("------");
		return result;
	}

	public static void main(String[] args) {
		Recursion obj = new Recursion();
		System.out.println("Factorial is: "+obj.fact(4));
	}
}

/*
n = 4
n = 3
n = 2
n = 1
------
------
------
Factorial is: 24




*/