import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		int ans = 0;
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < m - 2; ++j) {
				int sum = 0;
				for(int k = 0; k < 3; ++k) {
					sum += arr[i][j+k];
				}
				ans = Math.max(ans, sum);
			}
		}
		
		for(int j = 0; j < m; ++j) {
			for(int i = 0; i < n - 2; ++i) {
				int sum = 0;
				for(int k = 0; k < 3; ++k) {
					sum += arr[i+k][j];
				}
				ans = Math.max(ans, sum);
			}
		}
		
		for(int i = 0; i < n - 1; ++i) {
			int sum = 0;
			for(int j = 0; j < m - 1; ++j) {
				
				sum = arr[i][j] + arr[i][j+1] + arr[i+1][j];
				ans = Math.max(ans, sum);
				
				sum = arr[i+1][j+1] + arr[i][j+1] + arr[i+1][j];
				ans = Math.max(ans, sum);
				
				sum = arr[i][j] + arr[i][j+1] + arr[i+1][j+1];
				ans = Math.max(ans, sum);
				
				sum = arr[i][j] + arr[i+1][j+1] + arr[i+1][j];
				ans = Math.max(ans, sum);
				
				
			}
		}
		
		System.out.println(ans);

	}

}