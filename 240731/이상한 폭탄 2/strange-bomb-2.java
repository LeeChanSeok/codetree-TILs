import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int K, N;
	static int[] A;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();

		A = new int[N];

		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < N - 1; ++i) {

			for (int j = i + 1; j < N && j <= i + K; ++j) {
				if (A[i] == A[j]) {
					ans = Math.max(ans, A[i]);
				}

			}

		}

		if (ans == 0)
			ans = -1;
		System.out.println(ans);
	}
}