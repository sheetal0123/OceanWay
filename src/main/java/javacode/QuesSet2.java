package javacode;

import java.util.Scanner;

public class QuesSet2 {

	public static void main(String[] args) {

		int[] treesHieght = { 4, 10, 5, 21, 1 };

		// int[] treesHieght = {4,3,7,9,1};
		// int[] treesHieght = new int[5];

		int[] resultArray = new int[treesHieght.length];

		/*
		 * Scanner sc = new Scanner(System.in); int heightToEvaluate=-1;
		 * System.out.println(
		 * "Enter the value of Height with in {51,2,10,3,41,21,15,47}"); for(int
		 * jj=0;jj<5;jj++){ System.out.println("Enter the next value of Height."
		 * ); heightToEvaluate = sc.nextInt(); treesHieght[jj] =
		 * heightToEvaluate; }
		 */

		for (int jj = 0; jj < treesHieght.length; jj++) {
			System.out.println("values are: " + treesHieght[jj]);
		}

		int enteredHeight = treesHieght[0];
		resultArray[0] = treesHieght[0];

		for (int ii = 0; ii < treesHieght.length; ii++) {
			for (int jj = ii + 1; jj < treesHieght.length; jj++) {
				System.out.println(treesHieght[ii]);
				System.out.println(treesHieght[jj]);

				if (treesHieght[ii] < treesHieght[jj]) {
					// && resultArray[jj-1]!=0
					/*
					 * temp = treesHieght[ii]; treesHieght[ii] =
					 * treesHieght[jj]; treesHieght[jj] = temp;
					 */
					System.out.println(resultArray[jj - 1]);
					if (treesHieght[jj] > resultArray[jj - 1]) {
						resultArray[ii + 1] = treesHieght[jj];
						treesHieght[ii] = resultArray[ii + 1];
						ii++;
					}
				}
			}
		}

		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		for (int kk = 0; kk < resultArray.length; kk++) {
			if (resultArray[kk] != 0) {
				System.out.println("new array : " + resultArray[kk]);
			}
		}
	}
}
