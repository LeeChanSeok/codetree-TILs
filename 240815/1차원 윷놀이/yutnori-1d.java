import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n, m, k, ans;
	static int[] arr;
	static int[] turn;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();

		arr = new int[m + 1];
		Arrays.fill(arr, 1);
		turn = new int[n];
		for(int i = 0; i < n; ++i) {
			turn[i] = sc.nextInt();
		}
		ans = 0;
		recursive(0);

		System.out.println(ans);
	}

	private static void recursive(int idx) {

		if (idx == n) {
			int cnt = 0;
			for (int i = 0; i < 3; ++i) {
				if(arr[i] == m) ++cnt;
			}
			ans = Math.max(ans, cnt);

			return;
		}

		int move = turn[idx];
		for (int i = 1; i <= k; ++i) {
			int pos = arr[i];
			arr[i] = Math.min(pos + move, m);
			recursive(idx + 1);
			arr[i] = pos;
		}

	}

}