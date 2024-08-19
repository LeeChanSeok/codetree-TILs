import java.util.Arrays;
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

		dp[0][0] = arr[0][0];
		for (int i = 1; i < n; ++i) {
			dp[0][i] = Math.max(dp[0][i - 1], arr[0][i]);
			dp[i][0] = Math.max(dp[i - 1][0], arr[0][i]);
		}

		for (int i = 1; i < n; ++i) {
			for (int j = 1; j < n; ++j) {
				int min = Math.min(dp[i - 1][j], dp[i][j - 1]);
				dp[i][j] = Math.max(min, arr[i][j]);
			}

		}
		System.out.println(dp[n - 1][n - 1]);

	}

}