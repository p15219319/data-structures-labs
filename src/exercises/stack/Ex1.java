package exercises.stack;

import java.util.Stack;

public class Ex1 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		System.out.println(s);
		s.push(2);
		s.push(3);
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}
}
