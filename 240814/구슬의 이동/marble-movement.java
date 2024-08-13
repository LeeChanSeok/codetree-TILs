import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static class Marble implements Comparable<Marble> {
		int id, r, c, d, v;

		public Marble(int id, int r, int c, int d, int v) {
			super();
			this.id = id;
			this.r = r;
			this.c = c;
			this.d = d;
			this.v = v;
		}

		@Override
		public int compareTo(Marble o) {
			if (this.v == o.v)
				return o.id - this.id;
			return o.v - this.v;
		}


	}

	static int[] dx = { -1, 0, 0, 1 };
	static int[] dy = { 0, 1, -1, 0 };

	static int n, m, t, k;
	static ArrayList<Marble>[][] list;
	static ArrayList<Marble> marbles;

	static int ASCII = 130;
	static int[] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		t = sc.nextInt();
		k = sc.nextInt();

		map = new int[ASCII];
		map['L'] = 2;
		map['R'] = 1;
		map['U'] = 0;
		map['D'] = 3;

		marbles = new ArrayList<>();

		for (int i = 1; i <= m; ++i) {
			int r = sc.nextInt() - 1;
			int c = sc.nextInt() - 1;
			int d = map[sc.next().charAt(0)];
			int v = sc.nextInt();

			marbles.add(new Marble(i, r, c, d, v));
		}

		while (t-- > 0) {
			simulation();
		}

		System.out.println(marbles.size());

	}

	private static void simulation() {

		list = new ArrayList[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				list[i][j] = new ArrayList<>();
			}
		}

		for (Marble marble : marbles) {
			move(marble);
			list[marble.r][marble.c].add(marble);
		}

		ArrayList<Marble> templist = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				int size = list[i][j].size();
				Collections.sort(list[i][j]);
				for (int l = 0; l < Math.min(size, k); ++l) {
					templist.add(list[i][j].get(l));
				}

			}
		}

		marbles = templist;

	}

	private static void move(Marble marble) {

		int r = marble.r;
		int c = marble.c;
		int d = marble.d;
		int v = marble.v;

		int i = 0;
		while (i < v) {

			r += dx[d];
			c += dy[d];

			if (!inRange(r, c)) {
				r -= dx[d];
				c -= dy[d];

				d = 3 - d;
				r += dx[d];
				c += dy[d];
			}
			++i;
		}

		marble.r = r;
		marble.c = c;
		marble.d = d;
	}

	private static boolean inRange(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return false;
		return true;
	}

}