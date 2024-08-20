import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		int[] arr = new int[n + 1];
		int[][] s = new int[n + 1][4];
		for (int i = 1; i <= n; ++i) {
			arr[i] = sc.nextInt();
			++s[i][arr[i]];
		}

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= 3; ++j) {
				s[i][j] += s[i - 1][j];

			}
		}

		for (int i = 0; i < m; ++i) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt();

			System.out.printf("%d %d %d\n", s[y][1] - s[x][1], s[y][2] - s[x][2], s[y][3] - s[x][3]);
		}

	}

}