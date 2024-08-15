import java.util.Scanner;

public class Main {

	static int n, m, ans;
	static int[][] arr;
	static int[] res;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		ans = Integer.MAX_VALUE;
		arr = new int[n][2];
		for (int i = 0; i < n; ++i) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		res = new int[m];

		recursive(0, 0, 0);
		System.out.println(ans);
	}

	private static void recursive(int idx, int cnt, int dist) {

		if (dist >= ans)
			return;

		if (cnt == m) {
			ans = dist;
			return;
		}

		for (int i = idx; i < n; ++i) {
			int d = calc_dist(idx, i);
			recursive(i + 1, cnt + 1, Math.max(dist, d));
		}

	}

	private static int calc_dist(int idx, int target) {

		int dist = 0;
		for (int i = 0; i < idx; ++i) {
			int[] pos = arr[res[i]];

			int d = (pos[0] - arr[target][0]) * (pos[0] - arr[target][0])
					+ (pos[1] - arr[target][1]) * (pos[1] - arr[target][1]);

			dist = Math.max(dist, d);
		}

		return dist;
	}

}