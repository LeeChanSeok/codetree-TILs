import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();

		int[][] arr = new int[n + 1][n + 1];
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		int[][] s = new int[n + 1][n + 1];
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				s[i][j] = arr[i][j] + s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1];

			}
		}

		int max = 0;
		for (int i = k; i <= n; ++i) {
			for (int j = k; j <= n; ++j) {
				int sum = s[i][j] - s[i - k][j] - s[i][j - k] + s[i - k][j - k];
				max = Math.max(max, sum);

			}
		}

		System.out.println(max);

	}

}