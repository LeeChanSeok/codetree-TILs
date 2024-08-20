import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MOD = 7;

		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		int[] preSum = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			arr[i] = sc.nextInt();
			preSum[i] = (preSum[i - 1] + arr[i]) % MOD;
		}

		TreeSet<Integer>[] set = new TreeSet[MOD];
		for (int i = 0; i < MOD; ++i) {
			set[i] = new TreeSet<>();
		}

		for (int i = 1; i <= n; ++i) {
			preSum[i] %= MOD;
			set[preSum[i]].add(i);
		}

		long ans = 0;
		for (int i = 0; i < MOD; ++i) {
			if (set[i].size() >= 2) {
				int a = set[i].first();
				int b = set[i].last();

				ans = Math.max(ans, b - a);
			}
		}

		System.out.println(ans);

	}

}