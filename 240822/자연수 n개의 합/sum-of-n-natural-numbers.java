import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long s = sc.nextLong();
		long ans = binarySearch(s);
		System.out.println(ans);

	}

	private static long getSum(long i) {

		return i * (i + 1) / 2;
	}

	private static long binarySearch(long s) {

		long l = 1, r = (long) 1e9;
		long res = 0;
		while (l <= r) {
			long mid = (l + r) / 2;

			long sum = getSum(mid);

			if (sum <= s) {
				res = Math.max(res, mid);
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}

		return res;
	}

}