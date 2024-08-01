import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static class Data implements Comparable<Data> {
		int t, v, p;

		public Data(int t, int v, int p) {
			super();
			this.t = t;
			this.v = v;
			this.p = p;
		}

		@Override
		public int compareTo(Data o) {
			if (this.t == o.t) {
				if (o.p == this.p)
					return o.v - this.v;
				return o.p - this.p;
			}
			return this.t - o.t;
		}
		
	}

	static int X;
	static PriorityQueue<Data> q;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		X = sc.nextInt();

		q = new PriorityQueue<>();

		q.offer(new Data(1, 1, 1));
		int ans = solution();
		System.out.println(ans);
	}

	private static int solution() {

		while (!q.isEmpty()) {
			Data cur = q.poll();

			int t = cur.t;
			int v = cur.v;
			int p = cur.p;

			if (p > X)
				continue;
			if (p == X) {
				if (v == 1)
					return t;
				continue;
			}

			int nv = v + 1;
			q.offer(new Data(t + 1, nv, p + nv));

			nv = v;
			q.offer(new Data(t + 1, nv, p + nv));

			nv = v - 1;
			if (nv != 0)
				q.offer(new Data(t + 1, nv, p + nv));
		}

		return -1;
	}

}