import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long m = sc.nextLong();

		long a = sc.nextLong();
		long b = sc.nextLong();

		long min = Long.MAX_VALUE;
		long max = 0;

		for (long i = a; i <= b; ++i) {
			long turn = binarySearch(m, i);
			min = Math.min(min, turn);
			max = Math.max(max, turn);
		}
		System.out.println(min + " " + max);

	}

	private static long binarySearch(long m, long target) {

		long turn = 1;
		long l = 1, r = m;
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