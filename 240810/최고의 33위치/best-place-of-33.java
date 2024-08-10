import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char[][] arr = new char[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.next().charAt(0);
			}
		}

		int ans = 0;
		for (int i = 0; i < n - 2; ++i) {
			for (int j = 0; j < n - 2; ++j) {

				int cnt = 0;
				for (int k = 0; k < 3; ++k) {
					for (int l = 0; l < 3; ++l) {
						if (arr[i + k][j + l] == '1')
							++cnt;
					}
				}

				ans = Math.max(ans, cnt);

			}
		}

		System.out.println(ans);

	}

}