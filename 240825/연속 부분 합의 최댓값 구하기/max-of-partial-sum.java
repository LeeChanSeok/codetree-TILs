import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] A = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			A[i] = sc.nextInt();
		}

		int[] dp = new int[n + 1];

		for (int i = 1; i <= n; ++i) {
			dp[i] = Math.max(dp[i - 1] + A[i], A[i]);
		}

		int ans = dp[1];
		for (int i = 2; i <= n; ++i) {
			ans = Math.max(ans, dp[i]);
		}

		System.out.println(ans);
	}

}