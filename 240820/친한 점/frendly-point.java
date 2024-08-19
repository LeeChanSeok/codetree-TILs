import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static class Point implements Comparable<Point> {
		int x, y;

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			if (this.x == o.x)
				return this.y - o.y;
			return this.x - o.x;
		}

	}

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		TreeSet<Point> set = new TreeSet<>();

		for (int i = 0; i < n; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			set.add(new Point(x, y));
		}

		for (int i = 0; i < m; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			Point pnt = new Point(x, y);
			if (set.ceiling(pnt) == null)
				System.out.println("-1 -1");
			else {
				pnt = set.ceiling(pnt);
				System.out.println(pnt.x + " " + pnt.y);
			}

		}

	}

}