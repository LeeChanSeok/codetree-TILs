import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] A = new int[n];
		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextInt();
		}

		int[] B = new int[m];
		for (int i = 0; i < m; ++i) {
			B[i] = sc.nextInt();
		}

		boolean isSub = false;
		if (isSub(A, B))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	private static boolean isSub(int[] A, int[] B) {

		int n = A.length;
		int m = B.length;

		int i = 0;
		for (int j = 0; j < m; ++j) {

			while (i < n && B[j] != A[i]) {
				++i;
			}

			if (i == n)
				return false;
			else
				++i;

		}

		return true;
	}

}