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
			int num = sc.nextInt();
			int up = upperBound(A, num);
			int down = lowerBound(A, num);
			
			int cnt = up - down;
			
			System.out.println(cnt);
		}

	}

	private static int lowerBound(int[] arr, int target) {
		int l = 0, r = arr.length - 1;
		int res = arr.length;

		while (l <= r) {
			int mid = (l + r) / 2;

			if (arr[mid] >= target) {
				r = mid - 1;
				res = Math.min(mid, res);
			} else
				l = mid + 1;
		}

		return res;
	}

	private static int upperBound(int[] arr, int target) {

		int l = 0, r = arr.length - 1;
		int res = arr.length;

		while (l <= r) {
			int mid = (l + r) / 2;

			if (arr[mid] > target) {
				r = mid - 1;
				res = Math.min(mid, res);
			} else
				l = mid + 1;
		}

		return res;
	}

}