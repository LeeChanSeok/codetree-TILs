import java.util.Scanner;

public class Main {

	static int MAX = 100;
	static int N;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		arr = new int[N];

		for (int i = 0; i < N; ++i) {
			arr[i] = sc.nextInt();
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i <= 83; ++i) {
			int l = i;
			int r = i + 17;
			int score = 0;
			for (int j = 0; j < N; ++j) {
				if (l <= arr[j] && arr[j] <= r)
					continue;

				score += Math.min(Math.pow(arr[j] - r, 2), Math.pow(arr[j] - l, 2));
			}			
			ans = Math.min(ans, score);
		}

		System.out.println(ans);

	}

}