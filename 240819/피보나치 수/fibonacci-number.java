import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		int MAX = 45;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] dp = new int[MAX + 1];
		dp[1] = dp[2] = 1;

		for (int i = 3; i <= n; ++i) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		System.out.println(dp[n]);

	}

}