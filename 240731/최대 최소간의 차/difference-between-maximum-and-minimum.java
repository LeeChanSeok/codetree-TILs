import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N, K;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int MAX = 10000;
		N = sc.nextInt();
		K = sc.nextInt();
		arr = new int[MAX + 1];

		int l = Integer.MAX_VALUE;
		int r = 0;
		for (int i = 0; i < N; ++i) {
			int num = sc.nextInt();
			++arr[num];
			l = Math.min(l, num);
			r = Math.max(r, num);
		}

		int ans = 0;
		while(r - l > K) {
			if(arr[l] < arr[r]) {
				arr[l + 1] += arr[l];
				ans += arr[l];
				arr[l++] = 0;
			} else {
				arr[r - 1] += arr[r];
				ans += arr[r];
				arr[r--] = 0;
			}
		}
		System.out.println(ans);
	}

}