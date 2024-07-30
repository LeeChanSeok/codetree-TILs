import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[N + 1];
		for (int i = 1; i <= N; ++i) {
			arr[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 1; i <= N; ++i) {
			int sum = 0;

			int next = i;
			for (int j = 0; j < M; ++j) {
				sum += arr[next];
				next = arr[next];
			}
			ans = Math.max(ans, sum);
		}

		System.out.println(ans);
	}

}