import java.util.Scanner;

public class Main {

	static int n, m, size;
	static int arr[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		int ans = Integer.MIN_VALUE;
		for (int i1 = 0; i1 < n; ++i1) {
			for (int j1 = 0; j1 < m; ++j1) {
				for (int i2 = i1; i2 < n; ++i2) {
					for (int j2 = j1; j2 < m; ++j2) {
						ans = Math.max(ans, getSum(i1, j1, i2, j2));
					}
				}

			}
		}

		if (ans == Integer.MIN_VALUE)
			ans = -1;
		System.out.println(ans);

	}

	private static int getSum(int i1, int j1, int i2, int j2) {

		int sum = 0;
		for (int i = i1; i <= i2; ++i) {
			for (int j = j1; j <= j2; ++j) {
				if (arr[i][j] < 0)
					return Integer.MIN_VALUE;
			}
		}
		return (i2 - i1 + 1) * (j2 - j1 + 1);
	}

}