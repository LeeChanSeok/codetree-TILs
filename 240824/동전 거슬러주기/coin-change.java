import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] coin = new int[n];
		int[] dp = new int[m + 1];
		Arrays.fill(dp, (int) 1e9);

		for (int i = 0; i < n; ++i) {
			coin[i] = sc.nextInt();
			dp[coin[i]] = 1;
		}

		for (int i = 1; i <= m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i >= coin[j]) {
					dp[i] = Math.min(dp[i], dp[i - coin[j]] + 1);
				}
			}
		}

		System.out.println(dp[m]);
	}

}