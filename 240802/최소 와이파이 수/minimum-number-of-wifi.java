import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextInt();
		}

		int ans = 0;
		int i = 0;
		while (i < n) {

			if (A[i] == 1) {
				++ans;
				i += m * 2 + 1;
			}
		}

		System.out.print(ans);
	}
}