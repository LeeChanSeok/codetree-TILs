import java.util.Scanner;

public class Main {

	static int n;
	static int arr[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		arr = new int[n][n];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		int r = sc.nextInt() - 1;
		int c = sc.nextInt() - 1;
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int dir = sc.nextInt();

		shift(r, c, m1, m2, m3, m4, dir);

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void shift(int r, int c, int m1, int m2, int m3, int m4, int dir) {

		if (dir == 0) {
			int tmp = arr[r][c];

			for (int i = 0; i < m4; ++i) {
				arr[r][c] = arr[r - 1][c - 1];
				--r;
				--c;
			}

			for (int i = 0; i < m3; ++i) {
				arr[r][c] = arr[r - 1][c + 1];
				--r;
				++c;
			}

			for (int i = 0; i < m2; ++i) {
				arr[r][c] = arr[r + 1][c + 1];
				++r;
				++c;
			}

			for (int i = 0; i < m1; ++i) {
				arr[r][c] = arr[r + 1][c - 1];
				++r;
				--c;
			}

			arr[r - 1][c + 1] = tmp;
		} else {
			int tmp = arr[r][c];

			for (int i = 0; i < m1; ++i) {
				arr[r][c] = arr[r - 1][c + 1];
				--r;
				++c;
			}

			for (int i = 0; i < m2; ++i) {
				arr[r][c] = arr[r - 1][c - 1];
				--r;
				--c;
			}

			for (int i = 0; i < m3; ++i) {
				arr[r][c] = arr[r + 1][c - 1];
				++r;
				--c;
			}

			for (int i = 0; i < m4; ++i) {
				arr[r][c] = arr[r + 1][c + 1];
				++r;
				++c;
			}

			arr[r - 1][c - 1] = tmp;

		}

	}

}