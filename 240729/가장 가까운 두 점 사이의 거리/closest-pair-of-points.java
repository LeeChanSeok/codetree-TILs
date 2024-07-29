import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] point = new int[n][2];

		for (int i = 0; i < n; ++i) {
			point[i][0] = sc.nextInt();
			point[i][1] = sc.nextInt();
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {

			for (int j = i + 1; j < n; j++) {
				ans = Math.min(ans, (point[i][0] - point[j][0]) * (point[i][0] - point[j][0])
						+ (point[i][1] - point[j][1]) * (point[i][1] - point[j][1]));

			}

		}

		System.out.println(ans);
	}

}