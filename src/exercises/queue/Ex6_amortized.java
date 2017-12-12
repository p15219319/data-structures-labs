package exercises.queue;

import immutable.queue.amortized.*;;

public class Ex6_amortized {

	public static void main(String[] args) throws Exception {
		final int max = 50000;
		Queue<Integer> q = new Queue<>();
		System.out.println("Begin filling with " + max + " items");
		for (int i = 0; i < max; i++)
			q = q.join(i);
		System.out.println("Now let each one leave");
		for (int i = 0; i < max; i++)
			q = q.leave();
		System.out.println("Done");
	}
}
