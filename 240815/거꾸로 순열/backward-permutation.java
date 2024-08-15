import java.util.Scanner;

public class Main {

	static int n;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		arr = new int[n];
		recursive(0, 0);

	}

	private static void recursive(int idx, int flag) {

		if (idx == n) {
			for (int i = 0; i < n; ++i) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			return;
		}

		for (int i = n; i > 0; --i) {
			if ((flag & (1 << i)) != 0)
				continue;
			arr[idx] = i;
			recursive(idx + 1, flag | (1 << i));
		}

	}

}