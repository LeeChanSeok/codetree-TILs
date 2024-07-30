import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] A = new int[N][3];
		for (int i = 0; i < N; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			A[i][0] = a;
			A[i][1] = b;
			A[i][2] = c;
		}

		int ans = 0;
		boolean[] cup;
		for (int i = 1; i <= 3; ++i) {
			cup = new boolean[4];
			cup[i] = true;

			int score = 0;
			for (int j = 0; j < N; ++j) {
				int a = A[j][0];
				int b = A[j][1];
				int c = A[j][2];

				boolean tmp = cup[a];
				cup[a] = cup[b];
				cup[b] = tmp;

				if (cup[c])
					++score;

			}
			ans = Math.max(ans, score);
		}

		System.out.println(ans);
	}

}