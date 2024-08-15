import java.util.Scanner;

public class Main {

	static int n, m, ans;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		ans = 0;
		arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}
		recursive(0, 0, 0);
		System.out.println(ans);
	}

	private static void recursive(int idx, int cnt, int xor) {

		if (cnt == m) {
			ans = Math.max(ans, xor);
			return;
		}

		for (int i = idx; i < n; ++i) {
			recursive(i + 1, cnt + 1, xor ^ arr[i]);
		}

	}

}