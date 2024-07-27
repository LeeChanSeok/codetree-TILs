import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int S = sc.nextInt();
		int[] arr = new int[n];

		int total = 0;
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; ++j) {
				ans = Math.min(ans, Math.abs( S - (total - arr[i] - arr[j])));
			}
		}

		System.out.println(ans);
	}
}