package interviewpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuesSet1 {

	/*
	 * A man standing in front of trees. All trees are in one line and has
	 * different heights. How many tree will be visible?
	 */
	public void treeView() {
		Integer[] treeHeights = { 5, 10, 5, 9, 12, 5, 14, 15 };
		List<Integer> ls = new ArrayList<Integer>(Arrays.asList(treeHeights));

		int count = 1;
		int tree1 = 0, tree2 = 0, maxTree = 0;
		for (int i = 0; i < ls.size(); i++) {
			if (i == ls.size() - 1)
				break;          // last loop not require as we get index out of range at b=ls.get(i+1)

			tree1 = ls.get(i);
			tree2 = ls.get(i + 1);
			if (tree2 > tree1 && tree2 > maxTree) {
				count++;
				maxTree = tree2;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		QuesSet1 obj = new QuesSet1();
		obj.treeView();
	}
}
