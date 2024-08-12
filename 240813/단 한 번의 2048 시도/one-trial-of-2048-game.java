import java.util.Scanner;

public class Main {

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static int n, m, end;
	static int[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 4;

		arr = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		char dir = sc.next().charAt(0);
		game(dir);

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void game(char dir) {

		int[][] tmp_arr = move(arr, dir);
		tmp_arr = sum(tmp_arr, dir);
		arr = move(tmp_arr, dir);

	}

	private static int[][] sum(int[][] arr, char dir) {

		if (dir == 'R') {

			for (int i = 0; i < n; ++i) {
				for (int j = n - 1; j > 0; --j) {
					if (arr[i][j] == arr[i][j - 1]) {
						arr[i][j] *= 2;
						arr[i][j - 1] = 0;
					}
				}
			}

		} else if (dir == 'L') {
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n - 1; ++j) {
					if (arr[i][j] == arr[i][j + 1]) {
						arr[i][j] *= 2;
						arr[i][j + 1] = 0;
					}
				}
			}
		} else if (dir == 'U') {
			for (int j = 0; j < n; ++j) {
				for (int i = 0; i < n - 1; ++i) {
					if (arr[i][j] == arr[i + 1][j]) {
						arr[i][j] *= 2;
						arr[i + 1][j] = 0;
					}
				}
			}
		} else if (dir == 'D') {
			for (int j = 0; j < n; ++j) {
				for (int i = n - 1; i > 0; --i) {
					if (arr[i][j] == arr[i - 1][j]) {
						arr[i][j] *= 2;
						arr[i - 1][j] = 0;
					}
				}
			}
		}

		return arr;

	}

	private static int[][] move(int[][] arr, char dir) {

		int[][] new_arr = new int[n][n];

		if (dir == 'R') {

			for (int i = 0; i < n; ++i) {
				int end = n - 1;
				for (int j = n - 1; j >= 0; --j) {
					if (arr[i][j] != 0)
						new_arr[i][end--] = arr[i][j];
				}
			}

		} else if (dir == 'L') {
			for (int i = 0; i < n; ++i) {
				int end = 0;
				for (int j = 0; j < n; ++j) {
					if (arr[i][j] != 0)
						new_arr[i][end++] = arr[i][j];
				}
			}
		} else if (dir == 'U') {
			for (int j = 0; j < n; ++j) {
				int end = 0;
				for (int i = 0; i < n; ++i) {
					if (arr[i][j] != 0)
						new_arr[end++][j] = arr[i][j];
				}
			}
		} else if (dir == 'D') {
			for (int j = 0; j < n; ++j) {
				int end = n - 1;
				for (int i = n - 1; i >= 0; --i) {
					if (arr[i][j] != 0)
						new_arr[end--][j] = arr[i][j];
				}
			}
		}

		return new_arr;
	}

}