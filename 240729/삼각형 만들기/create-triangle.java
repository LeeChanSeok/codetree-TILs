import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] p = new int[n][2];

		for (int i = 0; i < n; ++i) {
			p[i][0] = sc.nextInt();
			p[i][1] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					ans = Math.max(ans, (p[i][0]*p[j][1] + p[j][0]*p[k][1] + p[k][0]*p[i][1])
							-(p[j][0]*p[i][1] + p[k][0]*p[j][1] + p[i][0]*p[k][1]));
				}

			}

		}

		System.out.println(ans);
	}

}