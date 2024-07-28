import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int MAX_R = 100;
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int H = sc.nextInt();		
		int T = sc.nextInt();
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; ++i) {
			arr[i] = sc.nextInt();
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i <= N - T; i++) {
			int v = 0;
			for (int j = 0; j < T; ++j) {
				v += Math.abs(H - arr[i + j]);
			}
			ans = Math.min(ans, v);
		}

		System.out.println(ans);
	}
}