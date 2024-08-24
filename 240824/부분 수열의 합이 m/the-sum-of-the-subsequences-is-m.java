import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] A = new int[n];
		int[] dp = new int[m + 1];

		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextInt();
		}
		Arrays.fill(dp, (int) 1e9);
		dp[0] = 0;

		for (int i = 0; i < n; ++i) {
			for (int j = m; j >= 0; --j) {
				if (j >= A[i]) {
					if (dp[j - A[i]] == (int) 1e9)
						continue;
					dp[j] = Math.min(dp[j], dp[j - A[i]] + 1);

				}
			}
		}

		int ans = dp[m];
		if (ans == (int) 1e9)
			ans = -1;
		System.out.println(ans);
	}

}