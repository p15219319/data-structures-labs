package exercises.stack;

import java.util.Stack;

public class Ex2 {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		System.out.println(s);
		s.push("one");
		System.out.println(s);
		s.push("two");
		s.push("three");
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}
}
