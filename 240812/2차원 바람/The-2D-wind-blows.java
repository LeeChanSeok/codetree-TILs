import java.util.Scanner;

public class Main {

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	static int n, m, q;
	static int[][] arr, new_arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		q = sc.nextInt();

		arr = new int[n][m];
        new_arr = new int[n][m];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		while (q-- > 0) {
			int r1 = sc.nextInt() - 1;
			int c1 = sc.nextInt() - 1;
			int r2 = sc.nextInt() - 1;
			int c2 = sc.nextInt() - 1;

			shift(r1, c1, r2, c2);
			avg(r1, c1, r2, c2);
		}

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void avg(int r1, int c1, int r2, int c2) {

		for (int i = r1; i <= r2; ++i) {
			for (int j = c1; j <= c2; ++j) {
				int sum = arr[i][j];
				int cnt = 1;
				for (int d = 0; d < 4; ++d) {
					int nx = i + dx[d];
					int ny = j + dy[d];
					if (nx < 0 || nx >= n || ny < 0 || ny >= m)
						continue;
					sum += arr[nx][ny];
					++cnt;
				}
				new_arr[i][j] = sum / cnt;
			}
		}

		for (int i = r1; i <= r2; ++i) {
			for (int j = c1; j <= c2; ++j) {
				arr[i][j] = new_arr[i][j];
			}
		}
	}

	private static void shift(int r1, int c1, int r2, int c2) {

		int tmp = arr[r1][c1];
		int move = (r2 - r1) * 2 + (c2 - c1) * 2;

		int x = r1, y = c1;
		int d = 0;
		while (move-- > 0) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			if (nx < r1 || nx > r2 || ny < c1 || ny > c2) {
				++d;
				nx = x + dx[d];
				ny = y + dy[d];
			}

			arr[x][y] = arr[nx][ny];
			x = nx;
			y = ny;

		}
		arr[r1][c1 + 1] = tmp;

	}

	private static void move(int r, int d) {

		if (d == 0) {
			int tmp = arr[r][0];
			for (int i = 0; i < m - 1; ++i) {
				arr[r][i] = arr[r][i + 1];
			}
			arr[r][m - 1] = tmp;
		} else {
			int tmp = arr[r][m - 1];
			for (int i = m - 1; i > 0; --i) {
				arr[r][i] = arr[r][i - 1];
			}
			arr[r][0] = tmp;
		}

	}

}