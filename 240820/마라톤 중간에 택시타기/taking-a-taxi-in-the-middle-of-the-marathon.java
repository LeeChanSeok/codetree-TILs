import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static class Pair {
		int x, y;

		public Pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		Pair[] pair = new Pair[n + 1];
		for (int i = 1; i <= n; ++i) {
			pair[i] = new Pair(sc.nextInt(), sc.nextInt());
		}

		int[] L = new int[n + 1];
		int[] R = new int[n + 1];

		for (int i = 2; i <= n; ++i) {
			L[i] = L[i - 1] + calc_dist(pair[i], pair[i - 1]);
		}

		for (int i = n - 1; i > 0; --i) {
			R[i] = R[i + 1] + calc_dist(pair[i], pair[i + 1]);
		}

		long ans = Long.MAX_VALUE;
		for (int i = 2; i < n - 1; ++i) {
			ans = Math.min(ans, L[i - 1] + calc_dist(pair[i - 1], pair[i + 1]) + R[i + 1]);
		}

		System.out.println(ans);

	}

	private static int calc_dist(Pair p1, Pair p2) {
		return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
	}

}