import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[][] arr = new int[n][n];
		int[][] dp = new int[n][n];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}

		}

		dp[0][n - 1] = arr[0][n - 1];
		for (int i = n - 2; i >= 0; --i) {
			dp[0][i] = dp[0][i + 1] + arr[0][i];
		}
		for (int i = 1; i < n; ++i) {
			dp[i][n - 1] = dp[i - 1][n - 1] + arr[i][n - 1];
		}

		for (int i = 1; i < n; ++i) {
			for (int j = n - 2; j >= 0; --j) {
				dp[i][j] = Math.min(dp[i - 1][j] + arr[i][j], dp[i][j + 1] + arr[i][j]);
			}

		}
		System.out.println(dp[n - 1][0]);

	}

}