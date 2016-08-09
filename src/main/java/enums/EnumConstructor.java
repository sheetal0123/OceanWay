package enums;

enum Mango {
	//enum objects with some parameters, parameters can be any
	Alphanzo(2000), Malda(200), Safeda(50), Langda(80);

	int price;

	//enum constructor as per objects arguments
	Mango(int p) {
		price = p;
	}

	public int getPrice() {
		return price;
	}
}

public class EnumConstructor {
	public static void main(String[] args) {
		int p = Mango.Safeda.getPrice();
		System.out.println("Safeda price: " + p); // Safeda price: 50

		for (Mango m : Mango.values()) {
			System.out.println(m + " : " + m.getPrice() );
		}
				
	}
}

/*
Alphanzo : 2000
Malda : 200
Safeda : 50
Langda : 80
*/