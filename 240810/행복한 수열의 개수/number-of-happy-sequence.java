import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		int ans = 0;
		for (int i = 0; i < n; ++i) {
			int prev = -1;
			int j = 0;
			int cnt = 0;
			while(j < n) {
				if(arr[i][j] != prev) {
					prev = arr[i][j];
					cnt = 1;
				} else {
					++cnt;
					if(cnt == m) {
						++ans;
						break;
					}
				}
				++j;
			}
		}

		for (int j = 0; j < n; ++j) {
			int prev = -1;
			int i = 0;
			int cnt = 0;
			while(i < n) {
				if(arr[i][j] != prev) {
					prev = arr[i][j];
					cnt = 1;
				} else {
					++cnt;
					if(cnt == m) {
						++ans;
						break;
					}
				}
				++i;
			}
		}

		System.out.println(ans);

	}

}