import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static class Pair implements Comparable<Pair> {
		int x, y, d;

		public Pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
			this.d = x + y;
		}

		@Override
		public int compareTo(Pair o) {
			if (this.d == o.d) {
				if (this.x == o.x)
					return this.y - o.y;
				return this.x - o.x;
			}
			return this.d - o.d;
		}

	}

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		PriorityQueue<Pair> pq = new PriorityQueue<>();

		for (int i = 0; i < n; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			pq.offer(new Pair(x, y));
		}

		for (int i = 0; i < m; ++i) {
			Pair p = pq.poll();
			p.x += 2;
			p.y += 2;
			p.d += 4;

			pq.offer(p);
		}

		System.out.println(pq.peek().x + " " + pq.peek().y);

	}

}