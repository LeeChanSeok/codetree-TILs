import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
	int u, d;

	public Edge(int u, int d) {
		super();
		this.u = u;
		this.d = d;
	}

	@Override
	public int compareTo(Edge o) {
		return this.d - o.d;
	}

};

public class Main {

	public static List<Edge>[] graph;
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

			dist[x][y] = Math.min(dist[x][y], z);
		}

		for (int k = 1; k <= n; k++)
			for (int i = 1; i <= n; i++)
				for (int j = 1; j <= n; j++)
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (dist[i][j] == (int) 1e9)
					System.out.print(-1 + " ");
				else
					System.out.print(dist[i][j] + " ");
			}
			System.out.println();
		}
	}
}