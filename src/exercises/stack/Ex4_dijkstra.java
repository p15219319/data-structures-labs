package exercises.stack;

import java.util.Stack;

public class Ex4_dijkstra {

	static void printchar(char c) {
		System.out.println("'" + c + "'");
	}

	static boolean isopen(char c) {
		return c == '(';
	}

	static boolean isvar(char c) {
		return c >= 'a' && c <= 'z';
	}

	static boolean isoperator(char c) {
		return (c == '-' || c == '+' || c == '*' || c == '/');
	}

	static int prec(char c) {
		return (c == '+' || c == '-') ? 4 : 5;
	}

	public static void main(String[] args) {
		final String DEMO_EXPR = "(a+b)*(c-d)/e";
		char[] infix = (args.length > 0) ? args[0].toCharArray() : DEMO_EXPR.toCharArray();

		Stack<Character> s = new Stack<>();
		StringBuffer postfix = new StringBuffer();

		int i = 0, j = 0;
		for (char c : infix) {
			System.out.println("char = " + c + "\t postfix = " + postfix + "\t s = " + s);
			switch (c) {
			case ' ':
				break;
			case '(':
				s.push(c);
				break;
			case '+':
			case '-':
			case '*':
			case '/':
				while (!s.isEmpty() && isoperator(s.peek()) && prec(c) <= prec(s.peek())) {
					postfix.append(s.pop());
				}
				s.push(c);
				break;
			case ')':
				while (!isopen(s.peek())) {
					postfix.append(s.pop());
				}
				break;
			default:
				postfix.append(c);
			}
		}
		
		while (!s.empty()) {
			postfix.append(s.pop());
		}
		System.out.println("postfix = " + postfix);
	}
}
