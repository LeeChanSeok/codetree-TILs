import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		int MAX = 1000;
		int DIV = 10007;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		long[] dp = new long[MAX + 1];
		dp[1] = 1;
		dp[2] = 3;

		for (int i = 3; i <= n; ++i) {
			dp[i] = (dp[i-1] + dp[i-2] * 2) % DIV;
		}

		System.out.println(dp[n]);

	}

}