import java.util.Scanner;

public class Main {

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static int n, m, end;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n+1];
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}
		end = n;

		while (true) {
			if (!down())
				break;
		}

		System.out.println(end);
		for (int i = 0; i < end; ++i) {
			System.out.println(arr[i]);
		}
	}

	private static boolean down() {

		boolean isDown = false;

		int i = 0;
		while (i < end) {
			int cnt = 0;
			int j = i;
			while (j <= end) {
				if (arr[i] == arr[j]) {
					++cnt;
					++j;
				} else {
					if (cnt >= m) {
						isDown = true;
						for (int k = i; k < j; ++k) {
							arr[k] = 0;
						}
					}
					cnt = 0;
					i = j;
				}
			}

		}

		int endOfArray = 0;
		int[] new_arr = new int[n + 1];
		for (i = 0; i < end; ++i) {
			if (arr[i] != 0)
				new_arr[endOfArray++] = arr[i];
		}

		for (i = 0; i < n; ++i) {
			arr[i] = new_arr[i];
		}

		end = endOfArray;

		return isDown;
	}

}