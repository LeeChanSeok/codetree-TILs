import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long m = sc.nextInt();

		int a = sc.nextInt();
		int b = sc.nextInt();

		int min = Integer.MAX_VALUE;
		int max = 0;

		for (int i = a; i <= b; ++i) {
			int turn = binarySearch(m, i);
			min = Math.min(min, turn);
			max = Math.max(max, turn);
		}
		System.out.println(min + " " + max);

	}

	private static int binarySearch(long r, int target) {

		int turn = 1;
		long l = 0;
		while (l <= r) {
			long mid = (l + r) / 2;

			if (mid == target) {
				return turn;
			}

			if (mid > target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
			++turn;
		}

		return -1;
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