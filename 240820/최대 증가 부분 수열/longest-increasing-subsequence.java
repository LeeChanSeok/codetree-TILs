import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] arr = new int[n];
		int[] dp = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.fill(dp, 1);
		for (int i = 1; i < n; ++i) {
			int num = arr[i];
            
			for (int j = i - 1; j >= 0; --j) {
				if (arr[j] < num) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}

		}

		int ans = 0;
		for (int i = 0; i < n; ++i) {
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);

	}

}