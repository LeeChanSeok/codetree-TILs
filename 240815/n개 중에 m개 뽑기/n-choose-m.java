import java.util.Scanner;

public class Main {

	static int n, m, k;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[m];
		recursive(0, 0);

	}

	private static void recursive(int idx, int flag) {

		if (idx == m) {
			for (int i = 0; i < m; ++i) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			return;
		}

		int prev = (idx == 0)? 0 : arr[idx-1];
		for (int i = prev + 1; i <= n; ++i) {
			if ((flag & (1 << i)) != 0)
				continue;
			arr[idx] = i;
			recursive(idx + 1, flag | (1 << i));
		}

	}

}