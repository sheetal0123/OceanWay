package interviewpractice;

public class String2 {

	public void one() {

		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");

		if (s1 == s2) {
			System.out.println("1");
		}

		if (s1 == s3) {
			System.out.println("Obj");
		}else{
			System.out.println("Not obj");
		}

	}

	
	
	static String name = "mango";
	public void two(String name) {
		this.name = "orange";
		System.out.println(name);

	}
	
	
	public void three(){

		String a = "Jan";
		
		System.out.println(a);
		System.out.println(a.concat(" Feb"));
		System.out.println(a);

		
	}

	public static void main(String[] args) {
		String2 obj = new String2();
		obj.one();

		obj.two(name);
		
		obj.three();

	}

}
