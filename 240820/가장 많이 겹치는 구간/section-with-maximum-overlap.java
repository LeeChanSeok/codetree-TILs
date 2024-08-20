import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	static class Pair implements Comparable<Pair> {
		int x, v;

		public Pair(int x, int v) {
			super();
			this.x = x;
			this.v = v;
		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
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
			list.add(new Pair(x, +1));
			list.add(new Pair(y, -1));
		}

		Collections.sort(list);

		int ans = 0;
		int cnt = 0;
		for (Pair pair : list) {

			cnt += pair.v;
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}

}