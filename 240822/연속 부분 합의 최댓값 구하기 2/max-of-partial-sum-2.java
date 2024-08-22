import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
			ans = Math.max(ans, arr[i]);
		}

		int sum = 0;
		int j = -1;
		for (int i = 0; i < n; ++i) {

			while (sum >= 0 && j + 1 < n) {
				sum += arr[++j];
				ans = Math.max(ans, sum);
			}

			sum -= arr[i];

		}
		System.out.println(ans);

	}

}