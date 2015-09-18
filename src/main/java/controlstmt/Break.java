package controlstmt;

public class Break {

	public void breakForLoop() {
		for (int i = 0; i < 100; i++) {
			System.out.print(i + "	");   //0	1	2	3	4	5
			if (i == 5) {
				break;
			}
		}
	}

	
	public void breakWhileLoop() {
		int i = 0;
		System.out.println("");
		while (i < 100) {
			System.out.print(i + "	");  //0	1	2	3	4	5
			if (i == 5) {
				break;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Break obj = new Break();
		obj.breakForLoop();
		obj.breakWhileLoop();
	}
}
