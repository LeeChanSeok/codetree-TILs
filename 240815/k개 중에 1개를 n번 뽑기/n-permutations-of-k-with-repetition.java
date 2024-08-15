import java.util.Scanner;

public class Main {

	static int n, k;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		k = sc.nextInt();
		n = sc.nextInt();

		arr = new int[n];
		recursive(0);

	}

	private static void recursive(int idx) {

		if (idx == n) {
			for (int i = 0; i < n; ++i) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			return;
		}

		for (int i = 1; i <= k; ++i) {
			arr[idx] = i;
			recursive(idx + 1);
		}

	}

}