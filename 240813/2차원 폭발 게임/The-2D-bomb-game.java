import java.util.Scanner;

public class Main {

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static int n, m, k;
	static int[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt() + 1;

		arr = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		simulation();

		int cnt = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (arr[i][j] != 0)
					++cnt;
			}
		}

		System.out.println(cnt);
	}

	private static void simulation() {
		while (k-- > 0) {
			for (int i = 0; i < n; ++i) {
				while (bomb(i))
					;

			}
			arr = rotate();
			arr = down();
		}
	}

	private static int[][] rotate() {

		int[][] new_arr = new int[n][n];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				new_arr[i][j] = arr[n - j - 1][i];
			}
		}

		return new_arr;
	}

	private static boolean bomb(int col) {

		boolean isBomb = false;

		int i = n - 1;
		while (i >= 0) {
			if (arr[i][col] == 0)
				break;

			int num = arr[i][col];
			int j = getEndIdx(num, i, col);

			if (i - j + 1 >= m) {
				down(i, j, col);
				isBomb = true;
			} else {
				i = j - 1;
			}
		}

		return isBomb;
	}

	private static int[][] down() {
		int[][] new_arr = new int[n][n];

		int s = n - 1, e = 0;
		for (int j = 0; j < n; ++j) {
			int end = n - 1;
			for (int i = n - 1; i >= 0; --i) {
				if (arr[i][j] != 0)
					new_arr[end--][j] = arr[i][j];
			}
		}

		return new_arr;

	}

	private static void down(int s, int e, int col) {

		for (int i = e - 1; i >= 0; --i) {
			arr[s--][col] = arr[i][col];
		}
		for (int i = s; i >= 0; --i) {
			arr[i][col] = 0;
		}

	}

	private static int getEndIdx(int num, int s, int col) {

		for (int e = s; e >= 0; --e) {
			if (arr[e][col] != num)
				return e + 1;
		}
		return 0;
	}

}