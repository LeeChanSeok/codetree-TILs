import java.util.Scanner;

public class Main {

	static int[] dx = { 0, 0, 0, -1, 1 };
	static int[] dy = { 0, -1, 1, 0, 0 };

	static int t, n, m;
	static int[][] arr, new_arr, cnt;

	static int ASCII = 100;
	static int[] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		map = new int[ASCII];
		map['L'] = 1;
		map['R'] = 2;
		map['U'] = 3;
		map['D'] = 4;

		while (t-- > 0) {
			n = sc.nextInt();
			m = sc.nextInt();

			arr = new int[n][n];
			for (int i = 0; i < m; ++i) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				int d = map[sc.next().charAt(0)];

				arr[x][y] = d;
			}

			int k = 100;
			while (k-- > 0) {
				simulation();
			}

			int ans = 0;
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					if (arr[i][j] != 0)
						++ans;
				}
			}

			System.out.println(ans);

		}

	}

	private static void simulation() {

		new_arr = new int[n][n];
		cnt = new int[n][n];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				int d = arr[i][j];
				if (d != 0) {
					int nx = i + dx[d];
					int ny = j + dy[d];

					if (!inRange(nx, ny)) {
						d = change(d);
						nx = i;
						ny = j;
					}

					new_arr[nx][ny] = d;
					++cnt[nx][ny];
				}
			}
		}

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (cnt[i][j] > 1) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = new_arr[i][j];
				}
			}
		}

	}

	private static int change(int d) {

		if (d == 1)
			d = 2;
		else if (d == 2)
			d = 1;
		else if (d == 3)
			d = 4;
		else if (d == 4)
			d = 3;

		return d;
	}

	private static void print() {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}

	}

	private static boolean inRange(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return false;
		return true;
	}

}