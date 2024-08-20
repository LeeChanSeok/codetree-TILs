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

		int ans = Integer.MAX_VALUE;

		int j = -1;
		int cnt = 0;
		for (int i = 0; i < n; ++i) {

			while (j + 1 < n && cnt < m) {
				if (A[++j] == 1)
					++cnt;
			}
			if(cnt >= m)
				ans = Math.min(ans, j - i + 1);

			if (A[i] == 1)
				--cnt;

		}
		if(ans == Integer.MAX_VALUE) ans = -1;
		System.out.println(ans);
	}

}