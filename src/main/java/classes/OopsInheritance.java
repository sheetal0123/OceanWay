package classes;
/*
 * oops concept: inheritance
 */

class Box {

	private int l, b, h;

	Box(int length, int breadth, int height) {
		l = length;
		b = breadth;
		h = height;
	}

	public int getVolume() {
		return l * b * h;
	}
}

class BoxWeight extends Box {
	int wt;

	BoxWeight(int l, int b, int h, int w) {
		super(l, b, h);
		wt = w;
	}

	public int getWeight() {
		return wt;
	}
}

public class OopsInheritance {

	public static void main(String[] args) {
		BoxWeight bw = new BoxWeight(10, 10, 10, 200);
		System.out.println("Volume is: " + bw.getVolume());  //Volume is: 1000
		System.out.println("Weight is: " + bw.getWeight());  //Weight is: 200
	}
}