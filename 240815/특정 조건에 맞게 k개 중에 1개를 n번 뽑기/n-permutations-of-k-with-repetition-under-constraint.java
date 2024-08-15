import java.util.Scanner;

public class Main {

	static int n, k;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		k = sc.nextInt();
		n = sc.nextInt();

		arr = new int[n + 2];
		recursive(2);

	}

	private static void recursive(int idx) {

		if (idx == n + 2) {
			for (int i = 2; i < n + 2; ++i) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			return;
		}

		for (int i = 1; i <= k; ++i) {
			arr[idx] = i;
			if(arr[idx - 2] != i || arr[idx-1] != i)
				recursive(idx + 1);
		}

	}

}