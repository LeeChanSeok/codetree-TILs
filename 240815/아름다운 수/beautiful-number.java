import java.util.Scanner;

public class Main {

	static int n, ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		recursive(0, 0, 0);
		System.out.println(ans);
	}

	private static void recursive(int idx, int prev, int cnt) {

		if (idx == n) {
			if (prev == cnt)
				++ans;

			return;
		}

		if (prev != cnt)
			recursive(idx + 1, prev, cnt + 1);
		else {

			for (int i = 1; i <= 4; ++i) {
				recursive(idx + 1, i, 1);
			}
		}

	}

}