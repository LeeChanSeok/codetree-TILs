import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int MAX_N = 1000;
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int max = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}

		int ans = 0;
		for (int k = 1; k < max; ++k) {
			int cnt = 0;

			boolean isGroup = false;
			for (int i = 0; i < n; ++i) {
				if (arr[i] > k) {
					if (!isGroup) {
						++cnt;
						isGroup = true;
					}
				} else
					isGroup = false;
			}

			ans = Math.max(ans, cnt);
		}

		System.out.println(ans);
	}
}