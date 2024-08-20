import java.util.Scanner;

public class Main {

	static int n, m, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] used = new int[100001];
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}

		int ans = 0;
		int j = -1;
		for (int i = 0; i < n; ++i) {

			while (j + 1 < n && used[arr[j + 1]] == 0) {				
				used[arr[++j]] = 1;
				ans = Math.max(ans, j - i + 1);
			}

			--used[arr[i]];

		}

		System.out.println(ans);

	}

}