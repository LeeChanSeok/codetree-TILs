import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];

		for (int i = 0; i < M; ++i) {
			int ta = sc.nextInt();
			int tb = sc.nextInt();
			if (ta > tb) {
				int tmp = ta;
				ta = tb;
				tb = tmp;
			}

			a[i] = ta;
			b[i] = tb;
		}

		int ans = 0;
		for (int i = 1; i <= N; ++i) {
			for (int j = 1; j <= N; ++j) {

				int cnt = 0;
				for (int k = 0; k < M; ++k) {
					if (a[k] == i && b[k] == j)
						++cnt;
				}
				ans = Math.max(ans, cnt);
			}

		}

		System.out.println(ans);
	}

}