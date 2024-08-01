import java.util.Scanner;

public class Main {
	public static final int INT_MAX = Integer.MAX_VALUE;

	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; ++i) {
			A[i] = sc.next().charAt(0) - 'A';
		}

		int ans = 0;
		for (int i = 0; i < n; ++i) {

			int j = i;
			for (; j < n; ++j) {
				if (A[j] == i)
					break;
			}

			ans += j - i;

			for (int k = j; k > i; --k) {
				A[k] = A[k - 1];
			}
			A[i] = i;

		}

		System.out.print(ans);
	}
}