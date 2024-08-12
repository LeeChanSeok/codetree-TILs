import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static int n, r, c, num;
	static int[][] original, arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		original = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				original[i][j] = sc.nextInt();

			}
		}
		arr = new int[n][n];

		int ans = 0;
		for (r = 0; r < n; ++r) {
			for (c = 0; c < n; ++c) {

				copyOfArray(original, arr);

				num = arr[r][c];

				arr[r][c] = 0;

				for (int d = 0; d < 4; ++d) {
					int x = r;
					int y = c;
					for (int i = 1; i < num; ++i) {
						x += dx[d];
						y += dy[d];
						if (x < 0 || x >= n || y < 0 || y >= n)
							break;

						arr[x][y] = 0;
					}
				}

				down();
				int cnt = getPair();
				ans = Math.max(ans, cnt);
			}
		}
		System.out.println(ans);

	}

	private static int getPair() {

		int cnt = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n - 1; ++j) {
				if (arr[i][j] == arr[i][j + 1] && arr[i][j] != 0)
					++cnt;
			}
		}

		for (int i = 0; i < n - 1; ++i) {
			for (int j = 0; j < n; ++j) {
				if (arr[i][j] == arr[i + 1][j] && arr[i][j] != 0)
					++cnt;
			}
		}

		return cnt;
	}

	private static void copyOfArray(int[][] arr, int[][] new_arr) {
		for (int i = 0; i < n; ++i) {
			new_arr[i] = Arrays.copyOf(arr[i], n);
		}

	}

	private static void down() {

		for (int j = Math.max(0, c - num + 1); j <= Math.min(n - 1, c + num - 1); ++j) {
			if (j == c)
				continue;
			for (int i = r; i > 0; --i) {
				arr[i][j] = arr[i - 1][j];
			}
			arr[0][j] = 0;
		}

		for (int i = Math.min(n - 1, r + num - 1), j = r - num; j >= 0; --j, --i) {
			arr[i][c] = arr[j][c];
			arr[j][c] = 0;
		}

	}

}