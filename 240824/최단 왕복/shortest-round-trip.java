import java.util.Scanner;

public class Main {

	public static int[][] dist;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		dist = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				dist[i][j] = (int) 1e9;
			}
			dist[i][i] = 0;
		}

		for (int i = 1; i <= m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			dist[x][y] = z;
		}

		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}

		int min = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				min = Math.min(min, dist[i][j] + dist[j][i]);
			}
		}
		System.out.println(min);
	}
}