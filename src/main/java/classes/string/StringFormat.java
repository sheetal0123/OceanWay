package classes.string;

public class StringFormat {

	public void set1(){
		
		System.out.println(String.format("%-3s-3","Code"));
	}
	
	
	public static void main(String[] args) {
		StringFormat obj = new StringFormat();
		obj.set1();
		
	}

}
