import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[][] arr = new int[n + 1][n + 1];
		int[][] dp = new int[n + 1][n + 1];
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				arr[i][j] = sc.nextInt();
			}

		}

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				dp[i][j] = Math.max(dp[i-1][j] + arr[i][j], dp[i][j-1] + arr[i][j]);
			}

		}
		System.out.println(dp[n][n]);

	}

}