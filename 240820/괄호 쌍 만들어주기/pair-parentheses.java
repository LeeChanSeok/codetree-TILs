import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int len = str.length();

		int[] open = new int[len];
		int[] close = new int[len];

		for (int i = 1; i < len; ++i) {
			open[i] = open[i - 1];
			if (str.charAt(i) == '(' && str.charAt(i - 1) == '(') {
				open[i] += 1;
			}
		}

		for (int i = len - 2; i >= 0; --i) {
			close[i] = close[i + 1];
			if (str.charAt(i) == ')' && str.charAt(i + 1) == ')') {
				close[i] += 1;
			}
		}

		long ans = 0;
		int prev = 0;
		for (int i = 0; i < len; ++i) {
			if (open[i] != prev) {
				ans += close[i];
				prev = open[i];
			}
		}

		System.out.println(ans);

	}

}