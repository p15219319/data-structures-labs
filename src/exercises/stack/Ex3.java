package exercises.stack;

import java.util.Stack;

public class Ex3 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Stack<Integer> t = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println("s = " + s + "\tt = " + t);
		t.push(s.pop());
		System.out.println("s = " + s + "\tt = " + t);
		t.push(s.pop());
		System.out.println("s = " + s + "\t\tt = " + t);
		System.out.println("The top of s is " + s.peek());
		System.out.println("The top of t is " + t.peek());
	}
}
