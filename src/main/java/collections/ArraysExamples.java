package collections;

public class ArraysExamples {

	public void oneDimArray1() {
		int[] arr; // declared array
		arr = new int[5]; // allocate physical memory with initial value as 0 in all slots
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		int res = 0;
		for (int i = 0; i < 5; i++)
			res = res + arr[i];
		System.out.println("avg:" + res / 5);
	}

	public void oneDimArray2() {
		int[] arr = { 10, 20, 30, 40, 50 }; // declared array and initialize it
		int res = 0;
		for (int i = 0; i < 5; i++)
			res = res + arr[i];
		System.out.println("avg:" + res / 5);
	}

	public void multiDim2DArray1() {
		int[][] mult = new int[3][5]; // [row][column]
		int val = 0;
		// allocate val to 2-D array
		for (int row = 0; row <= 2; row++) {
			for (int col = 0; col <= 4; col++) {
				mult[row][col] = val;
				val++;
			}
		}

		for (int row = 0; row <= 2; row++) {
			for (int col = 0; col <= 4; col++) {
				System.out.print(mult[row][col] + " ");
			}
		}
	}

	// verify o/p after running this method
	public void multiDim2DArray2() {
		int[][] mult = new int[3][]; // [row][column not defined]

		// define column now of different size
		mult[0] = new int[2];
		mult[1] = new int[5];
		mult[2] = new int[1];

		int val = 0;
		// allocate val to 2-D array
		for (int row = 0; row <= 2; row++) {
			for (int col = 0; col < mult[row].length; col++) {
				mult[row][col] = val;
				val++;
			}
		}

		for (int row = 0; row <= 2; row++) {
			for (int col = 0; col < mult[row].length; col++) {
				System.out.print(mult[row][col] + " ");
			}
		}
	}

	public void multiDim2DArray3() {
		int[][] mult = { { 1, 2, 3, 4 }, { 10, 20, 30, 40 },
				{ 100, 200, 300, 400 } }; // [3][4]

		for (int row = 0; row <= 2; row++) {
			for (int col = 0; col <= 3; col++) {
				System.out.print(mult[row][col] + " ");
			}
		}
	}

	public void multiDim3DArray3() {
		int[][][] mult = new int[3][4][5]; // [row][column][?]
		int val = 0;

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 4; col++) {
				for (int ht = 0; ht < 5; ht++) {
					mult[row][col][ht] = val;
					val++;
				}
			}
		}

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 4; col++) {
				for (int ht = 0; ht < 5; ht++) {
					System.out.print(mult[row][col][ht] + "  ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		ArraysExamples obj = new ArraysExamples();
		obj.oneDimArray1();
		obj.oneDimArray2();
		obj.multiDim2DArray1();
		obj.multiDim2DArray2();
		obj.multiDim2DArray3();
		obj.multiDim3DArray3();
	}
}

// sort
// fill
// binary search
// equals
