import java.util.Scanner;

public class Main {

	static int n, ans;
	static int[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		arr = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		recursive(0, 0, 0, Integer.MAX_VALUE);
		System.out.println(ans);

	}

	private static void recursive(int idx, int rflag, int cflag, int min) {

		if (ans >= min)
			return;

		if (idx == n) {
			ans = min;
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if ((rflag & (1 << i)) != 0)
				continue;
			for (int j = 0; j < arr.length; j++) {
				if ((cflag & (1 << j)) != 0)
					continue;

				recursive(idx + 1, rflag | (1 << i), cflag | (1 << j), Math.min(min, arr[i][j]));
			}
		}
	}

}