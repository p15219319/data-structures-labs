package exercises.queue;

import immutable.queue.amortized.Queue;

public class Ex4_amortized {

	public static void main(String[] args) throws Exception {
		Queue<Integer> q = new Queue<>();
		System.out.println("q = " + q);
		q = q.join(1);
		System.out.println("q = " + q);
		q = q.join(2);
		System.out.println("q = " + q);
		q = q.join(3);
		System.out.println("q = " + q);
		q = q.join(4);
		System.out.println("q = " + q);
		q = q.leave();
		System.out.println("q = " + q);
		q = q.leave();
		System.out.println("q = " + q);
		q = q.join(5);
		System.out.println("q = " + q);
		q = q.join(6);
		System.out.println("q = " + q);
		System.out.println("q = " + q);
		q = q.leave();
		System.out.println("q = " + q);
		q = q.leave();
		System.out.println("q = " + q);
		q = q.leave();
		System.out.println("q = " + q);
		q = q.leave();
	}
}
