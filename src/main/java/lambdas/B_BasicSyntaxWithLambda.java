package lambdas;

/**
 *  If an interface need multiple lines to implement then we have to use { } after ->
 *  
 *  return is mandatory in multiline case
 *  
 */
public class B_BasicSyntaxWithLambda {

	public static void main(String[] args) {
		CloudyLambda obj = (int i) -> {
			int sum = i + 20;
			return sum;
		};

		System.out.println("Sum: " + obj.multiline(20));
	}
}

interface CloudyLambda {
	public int multiline(int i);
}
