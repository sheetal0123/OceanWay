package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class xebia_TreeProblem {

	// Problem 1: Tree calculator (No sorting required)
	//
	// Background:
	// A person is standing in front of a queue of trees in a straight line. The
	// trees are of different heights.
	// Given an array of integers where each integer represent the height of the
	// tree in the same order.
	//
	// Write a program to return an array of integer representing the height of
	// the trees the person standing in-front would be able to see.

	public void treeView() {
		Integer[] treeHeights = { 5, 10, 5, 9, 12, 5, 14, 15, 1 };
		List<Integer> ls = new ArrayList<Integer>(Arrays.asList(treeHeights));

		int count = 1;
		int tree1 = 0, tree2 = 0, maxTree = 0;
		for (int i = 0; i < ls.size(); i++) {
			if (i == ls.size() - 1)
				break; // last loop not require as we get index out of range at
						// b=ls.get(i+1)

			tree1 = ls.get(i);
			tree2 = ls.get(i + 1);
			if (tree2 > tree1 && tree2 > maxTree) {
				count++;
				maxTree = tree2;
			}
		}
		System.out.println(count);
	}

	public void treeView2() {
		int[] t = { 5, 10, 5, 9, 12, 5, 14, 15, 1 };

		int max = 0;
		int count = 0;

		for (int i = 0; i < t.length; i++) {

			if (t[i] > max) {
				count++;
				max = t[i];
			}

		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		xebia_TreeProblem obj = new xebia_TreeProblem();
		obj.treeView();
		obj.treeView2();
	}
}
