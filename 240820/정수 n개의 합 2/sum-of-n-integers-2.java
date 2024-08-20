import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();

		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			arr[i] = sc.nextInt();
		}

		int[] sum = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			sum[i] = arr[i] + sum[i - 1];
		}

		int max = 0;
		for (int i = k; i <= n; ++i) {
			max = Math.max(max, sum[i] - sum[i - k]);
		}

		System.out.println(max);

	}

}