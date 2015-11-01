package javacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuesSet1 {

	/*
	 * A man standing in front of trees. All trees are in one line and has
	 * different heights. How many tree will be visible?
	 */
	public void treeView() {
		Integer[] treeHeights = { 5, 10, 5, 9, 12, 5 };
		// Integer[] treeHeights = { 5, 10, 5, 11 }; // 3 - working
		List<Integer> ls = new ArrayList<Integer>(Arrays.asList(treeHeights));

		int count = 1;
		int a = 0, b = 0, max = 0;
		for (int i = 0; i < ls.size(); i++) {
			if (i == ls.size() - 1)
				break;          // last loop not require as we get index out of range at b=ls.get(i+1)

			a = ls.get(i);
			b = ls.get(i + 1);
			if (b > a && b > max) {
				count++;
				max = b;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		QuesSet1 obj = new QuesSet1();
		obj.treeView();
	}
}
