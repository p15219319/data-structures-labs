package exercises.list;

import immutable.list.List;

public class Ex1 {

	public static void main(String[] args) throws Exception {
		List<String> xs = new List<>();
		List<String> ys, zs;

		xs = xs.cons("a").cons("b").cons("c");
		System.out.println(xs);
		ys = xs.append(xs);
		System.out.println(ys);
		zs = ys.map(x -> x.toUpperCase());
		System.out.println(zs);
	}
}
