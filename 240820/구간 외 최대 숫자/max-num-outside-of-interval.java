import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			arr[i] = sc.nextInt();
		}

		int[] L = new int[n + 1];
		int[] R = new int[n + 1];

		L[1] = arr[1];
		for (int i = 2; i <= n; ++i) {
			L[i] = Math.max(L[i - 1], arr[i]);
		}

		R[n] = arr[n];
		for (int i = n - 1; i > 0; --i) {
			R[i] = Math.max(R[i + 1], arr[i]);
		}

		for (int i = 0; i < m; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			System.out.println(Math.max(L[x - 1], R[y + 1]));
		}

	}

}