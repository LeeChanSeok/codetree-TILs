import java.util.Arrays;
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
		k = sc.nextInt() - 1;

		arr = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		simulation();
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void simulation() {

		for (int i = 1; i < n; ++i) {
			boolean isPut = true;
			for (int j = k; j < k + m; ++j) {
				if (arr[i][j] == 1) {
					isPut = false;
					break;
				}
			}

			if (!isPut) {
				for (int j = k; j < k + m; ++j) {
					arr[i - 1][j] = 1;
				}
				return;
			}
		}

		for (int j = k; j < k + m; ++j) {
			arr[n - 1][j] = 1;

		}

	}

}