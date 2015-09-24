package collections;

import java.util.Stack;

/*
 * Stack is subclass of Vector. FILO or LIFO  |_|
 */
public class StackExamples {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		System.out.println(stk); // [10, 20, 30]

		int peek = stk.peek();
		System.out.println(stk + " | " + peek);// [10, 20, 30] | 30

		int pop = stk.pop();
		System.out.println(stk + " | " + pop);// [10, 20] | 30

		stk.pop();
		stk.pop();
		// stk.pop(); // EmptyStackException
	}
}
