import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N, L;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		L = sc.nextInt();
		arr = new int[N];

		for (int i = 0; i < N; ++i) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int ans = 0;
		for (int i = 0; i < N; ++i) {
			int num = arr[i];

			int cnt = 0;
			for (int j = i - 1; j >= 0; --j) {
				if (arr[j] == num - 1)
					++cnt;
			}
			cnt = Math.min(cnt, L);

			if (num <= (N - i + cnt))
				ans = num;

		}

		System.out.println(ans);
	}

}