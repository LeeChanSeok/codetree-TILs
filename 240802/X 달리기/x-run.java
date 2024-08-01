import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static class Data {
		int v, p;

		public Data(int v, int p) {
			super();
			this.v = v;
			this.p = p;
		}

	}

	static int X;
	static Queue<Data> q;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		X = sc.nextInt();

		q = new LinkedList<>();

		q.offer(new Data(1, 1));
		int ans = solution();
		System.out.println(ans);
	}

	private static int solution() {

		int t = 1;
		while (!q.isEmpty()) {
			int size = q.size();

			while (size-- > 0) {
				Data cur = q.poll();

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
				q.offer(new Data(nv, p + nv));

				nv = v;
				q.offer(new Data(nv, p + nv));

				nv = v - 1;
				if (nv != 0)
					q.offer(new Data(nv, p + nv));
			}

			++t;
		}

		return t;
	}

}