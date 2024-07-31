import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];

		for (int i = 0; i < N; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 1; i <= 10000; ++i) {

			boolean isMinX = true;

			int x = i;
			for (int j = 0; j < N; ++j) {
				x *= 2;
				if (x < a[j] || x > b[j]) {
					isMinX = false;
					break;
				}
			}

			if (isMinX) {
				ans = i;
				break;
			}
		}

		System.out.println(ans);
	}

}