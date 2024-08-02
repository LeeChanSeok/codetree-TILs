import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] X = new int[n];
		int[] Y = new int[n];

		for (int i = 0; i < n; ++i) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; ++i) {
			int minX = Integer.MAX_VALUE, maxY = 0;
			for (int j = 0; j < n; ++j) {
				if (i == j)
					continue;

				minX = Math.min(minX, X[j]);
				maxY = Math.max(maxY, Y[j]);
			}
			
			ans = Math.min(ans, maxY - minX);
		}

		System.out.println(ans);

	}
}