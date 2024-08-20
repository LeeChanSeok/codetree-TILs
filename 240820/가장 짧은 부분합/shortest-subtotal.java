import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n + 1];
		int[] presum = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			arr[i] = sc.nextInt();
			presum[i] = presum[i - 1] + arr[i];
		}

		int ans = n;
		int l = 1, r = 1;
		while (l <= r && r <= n) {
			int sum = presum[r] - presum[l - 1];
			if (sum < m)
				++r;
			else {
				ans = Math.min(ans, r - l + 1);
				++l;
			}
		}

		System.out.println(ans);

	}

}