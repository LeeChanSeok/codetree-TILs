import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] A = new int[n + 1];

		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextInt();
		}

		int ans = 0;

		for (int i = 1; i < n; ++i) {
			if (A[i - 1] == 0) {
				++ans;
				A[i - 1] ^= 1;
				A[i] ^= 1;
				A[i + 1] ^= 1;
			}
		}

		if (A[n - 1] == 0)
			ans = -1;

		System.out.println(ans);

	}

}