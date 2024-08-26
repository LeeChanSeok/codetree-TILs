import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Integer[] A = new Integer[n];
		for (int i = 0; i < n; ++i) {
			A[i] = sc.nextInt();
		}

		Arrays.sort(A, Collections.reverseOrder());

		int ans = 0;
		for (int i = 1; i < n; ++i) {
			ans = Math.max(ans, A[i] * (i + 1));
		}

		System.out.println(ans);

	}

}