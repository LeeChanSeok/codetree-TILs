import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static class Pair implements Comparable<Pair> {
		int x, v, idx;

		public Pair(int x, int v, int idx) {
			super();
			this.x = x;
			this.v = v;
			this.idx = idx;
		}

		@Override
		public int compareTo(Pair o) {
			if(this.x == o.x) return o.v - this.v;
			return this.x - o.x;
		}

	}

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		ArrayList<Pair> list = new ArrayList<>();

		for (int i = 1; i <= n; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list.add(new Pair(x, +1, i));
			list.add(new Pair(y, -1, i));
		}

		Collections.sort(list);

		HashSet<Integer> set = new HashSet<>();
		int ans = 0;
		int cnt = 0;
		for (Pair pair : list) {

			if (pair.v == 1) {
				set.add(pair.idx);
				ans = Math.max(ans, set.size());

			} else {
				set.remove(pair.idx);
			}

		}
		System.out.println(ans);
	}

}