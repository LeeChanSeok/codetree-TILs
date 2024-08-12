import java.util.Scanner;

public class Main {

	static int n, t;
	static int arr[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		t = sc.nextInt() % (2 * n);

		arr = new int[2][n];

		for (int i = 0; i < n; ++i) {
			arr[0][i] = sc.nextInt();
		}
		for (int i = 0; i < n; ++i) {
			arr[1][n - 1 - i] = sc.nextInt();
		}

		while (t-- > 0) {
			int tmp1 = arr[0][n - 1];
			int tmp2 = arr[1][0];

			for (int i = n - 1; i > 0; --i) {
				arr[0][i] = arr[0][i - 1];
			}
			for (int i = 0; i < n - 1; ++i) {
				arr[1][i] = arr[1][i + 1];
			}

			arr[0][0] = tmp2;
			arr[1][n - 1] = tmp1;
		}

		for (int i = 0; i < n; ++i) {
			System.out.print(arr[0][i] + " ");
		}
		System.out.println();
		for (int i = n - 1; i >= 0; --i) {
			System.out.print(arr[1][i] + " ");
		}
	}

}