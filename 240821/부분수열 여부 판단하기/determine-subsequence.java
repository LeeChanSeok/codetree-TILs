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
			A[i] = sc.nextInt();
		}

		boolean isSub = false;
		int j = 0, i = 0;
		for (; j < m; ++j) {

			while (i < n && B[j] != A[i]) {
				++i;
			}

		}
		if (j == m)
			isSub = true;

		if (isSub)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}