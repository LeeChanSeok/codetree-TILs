import java.util.Scanner;

public class Main {

	public static int n;
	public static int[] arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n];

		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; ++j) {
				if(arr[i] > arr[j]) continue;
				for (int k = j + 1; k < n; ++k) {
					if(arr[j] <= arr[k]) ++ans;
				}
			}
		}

		System.out.println(ans);
	}
}