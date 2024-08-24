import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] A = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			A[i] = sc.nextInt();
		}

		int[][] dp = new int[n + 1][3];

		for (int i = 1; i <= n; ++i) {

			// 1칸
			for (int j = 1; j <= 2; ++j) {
				dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + A[i]);
			}

			// 2칸
			if (i >= 2) {
				for (int j = 0; j <= 2; ++j) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 2][j] + A[i]);
				}
			}

		}

		int max = 0;
		for (int j = 0; j <= 2; ++j) {
			max = Math.max(max, dp[n][j]);
		}
		System.out.println(max);

	}

}