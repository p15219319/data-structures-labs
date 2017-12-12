package exercises.list;

import immutable.list.List;

public class Ex2 {

	public static void main(String[] args) throws Exception {
		List<Integer> xs = new List<>();
		List<Integer> ys, zs, ps;
		for (int i = 20; i >= 0; i--) {
			xs = xs.cons(i);
		}
		ys = xs.filter(x -> x % 2 == 1);
		zs = xs.filter(x -> x % 2 == 0);
		ps = xs.filter(x -> x % 5 == 2).map(x -> x * 2);
		System.out.println(xs);
		System.out.println(ys);
		System.out.println(zs);
		System.out.println(ps);
	}

}
