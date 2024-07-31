import java.util.Scanner;

public class Main {

	static int N, M;
	static int[] arr;
	static int ans;
	static boolean[] used;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N + 1];
		used = new boolean[N + 1];

		ans = Integer.MAX_VALUE;
		for (int i = 1; i <= N; ++i) {
			arr[i] = sc.nextInt();
		}
		recursive(0, 0, 0);
		System.out.println(ans);
	}

	private static void recursive(int idx, int max, int level) {

		if(max >= ans) return;
		
		if (level == M - 1) {
			int sum = 0;
			for(int i = idx + 1; i <= N; ++i) sum += arr[i];
			max = Math.max(max, sum);
			ans = Math.min(ans, max);
			return;
		}

		int sum = 0;
		for (int i = idx + 1; i <= N; ++i) {
			sum += arr[i];
			recursive(i, Math.max(max, sum), level + 1);
		}
	}

}