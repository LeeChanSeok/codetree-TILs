import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		int MAX = 1000;
		int DIV = 10007;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		long[] dp = new long[MAX + 1];
		dp[2] = dp[3] = 1;

		for (int i = 4; i <= n; ++i) {
			dp[i] = (dp[i - 2] + dp[i - 3]) % DIV;
		}

		System.out.println(dp[n]);

	}

}