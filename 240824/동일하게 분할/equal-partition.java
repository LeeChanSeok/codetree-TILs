import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = 0;

		int[] A = new int[n];
		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextInt();
			m += A[i];
		}

		m /= 2;
		int[] dp = new int[m + 1];
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

		if (dp[m] == (int) 1e9)
			System.out.println("No");
		else
			System.out.println("Yes");
	}

}