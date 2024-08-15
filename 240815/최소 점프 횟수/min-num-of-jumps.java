import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n, ans;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		arr = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			arr[i] = sc.nextInt();
		}
		ans = Integer.MAX_VALUE;
		recursive(1, 0);

		if (ans == Integer.MAX_VALUE)
			ans = -1;
		System.out.println(ans);
	}

	private static void recursive(int pos, int move) {
		if (move >= ans)
			return;
		if (pos >= n) {
			ans = move;
			return;
		}

		int num = arr[pos];
		for (int i = num; i > 0; --i) {
			recursive(pos + i, move + 1);
		}

	}

}