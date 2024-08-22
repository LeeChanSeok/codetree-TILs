import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] A = new int[n];
		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < m; ++i) {
			System.out.println(binarySearch(A, sc.nextInt()));
		}

	}

	private static int binarySearch(int[] arr, int target) {

		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;

			if (arr[mid] == target)
				return mid + 1;

			if (arr[mid] > target)
				r = mid - 1;
			else
				l = mid + 1;
		}

		return -1;
	}

}